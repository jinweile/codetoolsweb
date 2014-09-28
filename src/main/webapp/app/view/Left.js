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
		       'CT.view.center.Edit'],
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
		title: '数据库信息设置',
        html: '<p>Some info in here.</p>',
        iconCls: 'info'
	}, {
		title: '系统变量设置',
        iconCls: 'nav',
        xtype: 'grid',
        store:{
        	fields:['name', 'code'],
            data:{'items':[
                           { 'name': 'daoimp包名',  "code":"$daoimppackage" },
                           { 'name': 'serviceimp包名',  "code":"$serviceimppackage" },
                           { 'name': 'daointf包名',  "code":"$daointfpackage" },
                           { 'name': 'serviceintf包名',  "code":"$serviceintfpackage" },
                           { 'name': 'model包名', "code":"$modelpackage" }
                       ]},
            proxy: { type: 'memory',
                         reader: {
	                         type: 'json',
	                         root: 'items'}
                       }
        },
        columns: [
	          { header: '变量名',  dataIndex: 'name' },
	          { header: '变量代码', dataIndex: 'code', flex: 1 }
        ]
	}],
    initComponent: function() {
        this.callParent(arguments);
    }
});
