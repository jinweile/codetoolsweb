Ext.define('CT.view.Left', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.left',
    requires: ['Ext.toolbar.*', 
		       'Ext.tree.*', 
		       'Ext.data.*', 
		       'Ext.tip.*', 
		       'Ext.Action', 
		       'Ext.menu.*', 
		       'Ext.window.MessageBox',
		       'CT.view.project.Edit',
		       'CT.model.Project',
		       'CT.view.template.Edit',
		       'CT.model.Template',
		       'CT.view.center.Edit',
		       'CT.model.ConstInfo',
		       'CT.model.Db',
		       'CT.view.db.Edit',
		       'CT.view.right.Edit'],
    //views: ['project.Edit'],
    title: '主菜单',
    collapsible: true,
    animCollapse: true,
    margins: '5 0 5 5',
    layout: 'accordion',
    items: [{
    	title: '模板项目设置',
        iconCls: 'settings',
        xtype: 'treepanel',
        listeners: {
        	//左键点击,双击:itemdblclick
        	'itemclick': function(view, record, items, index, e){
        		//加载模板内容
        		//alert(record.getId());
        		var treearray = record.getId().split("/");
        		var tid = treearray.length > 2 ?  treearray[2] : 0;
        		var id = "center_edit_" + record.raw.id;
        		var title = record.parentNode.raw.text;
        		title += " : " + record.raw.text; 
                var leaf = record.get('leaf');
                if (leaf) {
                	var tab = Ext.getCmp(id);
                	if(tab){
                		tab.show();
                	} else {
                		//ajax加载模板内容
                		var Template = Ext.ModelManager.getModel('CT.model.Template');
    					Template.load(tid, {
    					    success: function(template) {
        	                	var tabs = Ext.ComponentQuery.query('viewport viewer');
        	                	tab = Ext.widget('centeredit',{id: id,title: title});
        	                	tab.down('form').loadRecord(template);
        	                	tabs[0].add(tab).show();
    					    }
    					});
                	}
                }
                
                //加载模板使用的变量信息列表
                var rightid = "right_id";
                var right = Ext.ComponentQuery.query('viewport right')[0];
                var tc = Ext.ComponentQuery.query('#right_id');
                if(tc.length > 0) {
                	right.remove(tc[0]);
                }
            	tc = Ext.widget('rightedit',{id: rightid,title: title});
                right.add(tc).show();
        	},
        	//右键菜单
        	'itemcontextmenu': function(menutree, record, items, index, e){
        		e.stopEvent();
        		var obj = this;
        		treearray = record.getId().split("/");
        		var pid = treearray.length > 1 ?  treearray[1] : 0;
        		var tid = treearray.length > 2 ?  treearray[2] : 0;
        		//root
        		var menu1 = Ext.create('Ext.menu.Menu', {
        			items: [{
        				text: '新增项目',
        				iconCls: 'add',
        				handler: function(widget, event) {
        					var project = Ext.create('CT.model.Project', {
        						tpId: 0
        					});
        					var view = Ext.widget('projectedit');
        			        view.down('form').loadRecord(project);
        		        }
        			}]
        		});
        		//project
        		var menu2 = Ext.create('Ext.menu.Menu', {
        			items: [{
        				text: '编辑项目',
        				iconCls: 'settings',
        				handler: function(widget, event) {
        					var Project = Ext.ModelManager.getModel('CT.model.Project');
        					Project.load(pid, {
        					    success: function(project) {
                					var view = Ext.widget('projectedit');
                			        view.down('form').loadRecord(project);
                			        //Ext.getBody().mask();
        					    }
        					});
        		        }
        			}, {
        				text: '删除项目',
        				iconCls: 'del',
        				handler: function(widget, event) {
        					var txt = record.raw.text;
        					Ext.MessageBox.confirm('Confirm', 
        							'确定删除&nbsp;&nbsp;<font color="red">' + txt + '</font>&nbsp;&nbsp;?', 
        							function(button){
        						if(button != "yes") return;
        						Ext.Ajax.request({
        						    url: 'projectdel.json',
        						    method: 'POST',
        						    params: { tpId: pid },
        						    success: function(response){
        						    	//var tree = Ext.ComponentQuery.query('viewport left treepanel');
        						    	//tree[0].store.reload();
        						    	obj.store.load();
        						    }
        						});
        					});
        		        }
        			}, {
        				text: '新增模板',
        				iconCls: 'add',
        				handler: function(widget, event) {
        					var template = Ext.create('CT.model.Template', {
        						tiId: 0,
        						tpId: parseInt(pid)
        					});
        					var view = Ext.widget('templateedit');
        			        view.down('form').loadRecord(template);
        		        }
        			}]
        		});
        		//template
        		var menu3 = Ext.create('Ext.menu.Menu', {
        			items: [{
        				text: '编辑模板',
        				iconCls: 'settings',
        				handler: function(widget, event) {
        					var Template = Ext.ModelManager.getModel('CT.model.Template');
        					Template.load(tid, {
        					    success: function(template) {
                					var view = Ext.widget('templateedit');
                			        view.down('form').loadRecord(template);
        					    }
        					});
        		        }
        			}, {
        				text: '删除模板',
        				iconCls: 'del',
        				handler: function(widget, event) {
        					var txt = record.raw.text;
        					Ext.MessageBox.confirm('Confirm', 
        							'确定删除&nbsp;&nbsp;<font color="red">' + txt + '</font>&nbsp;&nbsp;?', 
        							function(button){
        						if(button != "yes") return;
        						Ext.Ajax.request({
        						    url: 'templatedel.json',
        						    method: 'POST',
        						    params: { tiId: tid },
        						    success: function(response){
        						    	//var tree = Ext.ComponentQuery.query('viewport left treepanel');
        						    	//tree[0].store.reload();
        						    	obj.store.load();
        						    }
        						});
        					});
        		        }
        			}]
        		});
        		var ids = record.getId().split('/');
        		switch(ids.length){
	        		case 1:
	        			menu1.showAt(e.getXY());
	        			break;
	        		case 2:
	        			menu2.showAt(e.getXY());
	        			break;
	        		case 3:
	        			menu3.showAt(e.getXY());
	        			break;
        		}
                
                return false;
        	}
        },
        store: {
        	//ajax加载目录树
        	proxy: {
	            type: 'ajax',
	            url: 'projecttree.json'
	        },
	        root: {
	            text: '所有项目',
	            id: 'src',
	            expanded: true
	        },
        }
	}, {
		id: 'dbgrid',
		title: '数据库信息设置',
        iconCls: 'info',
        xtype: 'grid',
        listeners: {
        	'itemdblclick': function(view, record, items, index, e){
        		var rows = Ext.ComponentQuery.query('viewport left #dbgrid')[0].getSelectionModel().getSelection();
            	if(rows.length == 0) return;
            	var diId = rows[0].get('diId');
				var Db = Ext.ModelManager.getModel('CT.model.Db');
				Db.load(diId, {
				    success: function(db) {
    					var view = Ext.widget('dbedit');
    			        view.down('form').loadRecord(db);
				    }
				});
        	}
        },
        tbar: [{
        	text: '新增',
            iconCls: 'add',
            handler: function(widget, event){
				var db = Ext.create('CT.model.Db', {
					diId: 0
				});
				var view = Ext.widget('dbedit');
		        view.down('form').loadRecord(db);
            }
     	}, '-', {
        	text: '删除',
            iconCls: 'del',
            handler: function(widget, event){
            	var rows = Ext.ComponentQuery.query('viewport left #dbgrid')[0].getSelectionModel().getSelection();
            	if(rows.length == 0) return;
            	var diId = rows[0].get('diId');
				Ext.MessageBox.confirm('Confirm', 
						'确定删除吗?', 
						function(button){
					if(button != "yes") return;
					Ext.Ajax.request({
					    url: 'dbdel.json',
					    method: 'POST',
					    params: { diId: diId },
					    success: function(response){
					    	var grid = Ext.ComponentQuery.query('viewport left #dbgrid');
					    	grid[0].store.load();
					    }
					});
				});
            }
	     }],
	    store:{
	    	autoLoad: true,
	    	fields:['diId', 'diName', 'diClassname', 'diLinks', 'diTablesql', 'diColsql'],
	        proxy: { 
	        	type: 'ajax',
	        	url: 'dblist.json',
	            reader: {
		            type: 'json',
		            root: 'items'
	            }
	        }
	    },
	    columns: [
	              { dataIndex: 'diId', width: 18 },
	              { header: '数据库名',  dataIndex: 'diName', hidden: false },
	              { header: '数据库类名', dataIndex: 'diClassname', hidden: false },
	              { header: '连接字符串', dataIndex: 'diLinks', hidden: true },
	              { header: '表sql', dataIndex: 'diTablesql', hidden: true },
	              { header: '列sql', dataIndex: 'diColsql', hidden: true }
	    ]
	}, {
		id: 'constgrid',
		title: '系统变量设置',
        iconCls: 'nav',
        xtype: 'grid',
        tbar: [{
	        	text: '新增',
	            iconCls: 'add',
	            handler: function(widget, event){
	            	var record = Ext.create('CT.model.ConstInfo', {
						coiId: 0,
						coiName: '',
						coiCode: ''
					});
	            	var grid = Ext.ComponentQuery.query('viewport left #constgrid');
	            	grid[0].store.add(record);
	            }
         	}, '-', {
	        	text: '删除',
	            iconCls: 'del',
	            handler: function(widget, event){
	            	var rows = Ext.ComponentQuery.query('viewport left #constgrid')[0].getSelectionModel().getSelection();
	            	if(rows.length == 0) return;
	            	var coiId = rows[0].get('coiId');
					Ext.MessageBox.confirm('Confirm', 
							'确定删除吗?', 
							function(button){
						if(button != "yes") return;
						Ext.Ajax.request({
						    url: 'constinfodel.json',
						    method: 'POST',
						    params: { coiId: coiId },
						    success: function(response){
						    	var grid = Ext.ComponentQuery.query('viewport left #constgrid');
						    	grid[0].store.load();
						    }
						});
					});
	            }
         }],
        store:{
        	autoLoad: true,
        	fields:['coiId', 'coiName', 'coiCode'],
            proxy: { 
            	type: 'ajax',
            	url: 'constlist.json',
                reader: {
		            type: 'json',
		            root: 'items'
	            }
            }
        },
        columns: [
                  { dataIndex: 'coiId', width: 18 },
                  { header: '变量名',  dataIndex: 'coiName', editor: {allowBlank: false} },
                  { header: '变量代码', dataIndex: 'coiCode', flex: 1, editor: {allowBlank: false} }
        ],
        plugins: [
			Ext.create('Ext.grid.plugin.CellEditing', {
			    clicksToEdit : 1,
			    listeners : {
                    'edit' : function(editor,ctx){
                    	if(ctx.originalValue == ctx.value) return;
                        Ext.Ajax.request({
						    url: 'constinfoedit.json',
						    method: 'POST',
						    params: { coiId: ctx.record.data.coiId,coiName:ctx.record.data.coiName,coiCode:ctx.record.data.coiCode },
						    success: function(response){
						    	var grid = Ext.ComponentQuery.query('viewport left #constgrid');
						    	grid[0].store.load();
						    }
						});
                    }
                }
			})
        ]
	}],
    initComponent: function() {
        this.callParent(arguments);
    }
});
