Ext.define('CT.view.Viewer', {
    extend: 'Ext.tab.Panel',
    alias: 'widget.viewer',
    requires: [],
    activeItem: 0,
    margins: '5 5 5 5',
    cls: 'preview',
    initComponent: function() {
        this.items = [{

        }];
        
        this.callParent(arguments);
    }
});