Ext.define('CT.view.Left', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.left',
    requires: ['Ext.toolbar.*', 'Ext.tree.*', 'Ext.data.*', 'Ext.tip.*', 'Ext.Action', 'Ext.menu.*'],
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
        	//左键点击
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
                		text: '编辑项目',
                		handler: function(widget, event) {
                            alert(1);
                        }
                	}, {
                		text: '删除项目',
                		handler: function(widget, event) {
                            alert(2);
                        }
                	}]
                });
                menu1.showAt(e.getXY());
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
        },
        rightmenu: function(){
        	
        },
        leftmenu: function(){
        	
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
