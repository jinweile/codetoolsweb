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
		       'CT.model.Template'],
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
                var leaf = record.get('leaf');
                if (leaf) {
                    
                }
        	},
        	//右键菜单
        	'itemcontextmenu': function(menutree, record, items, index, e){
        		e.stopEvent();
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
        						    	var tree = Ext.ComponentQuery.query('viewport left treepanel');
        						    	tree[0].store.reload();
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
        					Template.load(pid,tid, {
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
        						    	var tree = Ext.ComponentQuery.query('viewport left treepanel');
        						    	tree[0].store.reload();
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
        html: '<p>Some settings in here.</p>',
        iconCls: 'nav'
	}],
    initComponent: function() {
        this.callParent(arguments);
    }
});
