Ext.define('CT.view.Viewport', {
    extend: 'Ext.container.Viewport',

    requires: [
        'CT.view.Viewer',
        'CT.view.Left',
        'CT.view.Right',
        'Ext.layout.container.Border'
    ],

    layout: 'border',

    items: [{
        region: 'center',
        xtype: 'viewer'
    }, {
        region: 'west',
        width: 225,
        xtype: 'left'
    }, {
        region: 'east',
        width: 225,
        xtype: 'right'
    }]
});
