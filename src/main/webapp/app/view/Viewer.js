Ext.define('CT.view.Viewer', {
    extend: 'Ext.tab.Panel',
    alias: 'widget.viewer',
    deferredRender: false,
    activeTab: 0,     // first tab initially active
    items: [{
        contentEl: 'center1',
        title: 'Close Me',
        closable: true,
        autoScroll: true
    }, {
        contentEl: 'center2',
        title: 'Center Panel',
        autoScroll: true
    }],
    initComponent: function() {
    	
        
        this.callParent(arguments);
    }
});