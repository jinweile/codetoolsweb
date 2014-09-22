Ext.define('CT.view.Viewer', {
    extend: 'Ext.tab.Panel',
    alias: 'widget.viewer',
    requires: [],
    activeItem: 0,
    margins: '5 0 5 5',
    cls: 'preview',
    deferredRender: false,
    activeTab: 0,     // first tab initially active
    items: [{
        title: '使用说明',
        autoScroll: true,
        html: '欢迎使用代码生成工具，本系统正在开发中！'
    }],
    initComponent: function() {
    	
        
        this.callParent(arguments);
    }
});