Ext.define('CT.view.Left', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.left',
    requires: ['Ext.toolbar.*', 'Ext.tree.*', 'Ext.data.*', 'Ext.tip.*', 'Ext.Action', 'Ext.menu.*', 'CT.view.project.Edit'],
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
        		var menu1 = Ext.create('Ext.menu.Menu', {
        			items: [{
        				text: '新增项目',
        				iconCls: 'add',
        				handler: function(widget, event) {
        					alert(record.getId());
        		        }
        			}]
        		});
        		var menu2 = Ext.create('Ext.menu.Menu', {
        			items: [{
        				text: '编辑项目',
        				iconCls: 'settings',
        				handler: function(widget, event) {
        					var view = Ext.widget('projectedit');
        			        view.down('form').loadRecord(record);
        			        Ext.getBody().mask();
        		        }
        			}, {
        				text: '删除项目',
        				iconCls: 'del',
        				handler: function(widget, event) {
        					var view = Ext.widget('projectedit');
        			        view.down('form').loadRecord(record);
        		        }
        			}, {
        				text: '新增模板',
        				iconCls: 'add',
        				handler: function(widget, event) {
        					var view = Ext.widget('projectedit');
        			        view.down('form').loadRecord(record);
        		        }
        			}]
        		});
        		var menu3 = Ext.create('Ext.menu.Menu', {
        			items: [{
        				text: '编辑模板',
        				iconCls: 'settings',
        				handler: function(widget, event) {
        					alert(record.getId());
        		        }
        			}, {
        				text: '删除模板',
        				iconCls: 'del',
        				handler: function(widget, event) {
        					alert(record.getId());
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
