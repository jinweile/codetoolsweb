Ext.define('CT.view.Left', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.left',
    requires: ['Ext.toolbar.Toolbar', 'Ext.tree.*', 'Ext.data.*', 'Ext.tip.*'],
    title: '主菜单',
    collapsible: true,
    animCollapse: true,
    margins: '5 0 5 5',
    layout: 'accordion',
    items: [{
    	title: '模板项目设置',
        iconCls: 'settings',
        xtype: 'treepanel',
        store: {
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
