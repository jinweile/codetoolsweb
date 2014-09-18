Ext.define('CT.view.Left', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.left',

    requires: ['Ext.toolbar.Toolbar'],

    title: '主菜单',
    collapsible: true,
    animCollapse: true,
    margins: '5 0 5 5',
    layout: 'fit',

    initComponent: function() {

        this.callParent(arguments);
    }
});
