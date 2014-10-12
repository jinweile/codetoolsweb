Ext.define('CT.view.Right', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.right',
    requires: ['Ext.toolbar.Toolbar'],
    title: '模板-系统变量关联',
    collapsible: true,
    animCollapse: true,
    margins: '5 0 5 5',
    layout: 'fit',
    initComponent: function() {

        this.callParent(arguments);
    }
});
