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
        width: 250,
        xtype: 'right'
    }, {
        region: 'north',
        height: 32,
        xtype: 'component',
        html: '<p>代码生成工具</p>',
    }]
});
