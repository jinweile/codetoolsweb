/**
 * 
 */
Ext.define('CT.view.center.Edit', {
	extend: 'Ext.panel.Panel',
	alias: 'widget.centeredit',
	layout: 'fit',
	region : 'center', // a center region is ALWAYS required for border layout
	//deferredRender : false,
	//activeTab : 0, // first tab initially active
	closable: true,
	items : [{
		xtype : 'form',
		items : [ {
			xtype : 'hidden',
			name : 'tiId'
		}, {
			xtype : 'textarea',
			name : 'tiContent',
			//padding : '5 100 5 5',
			width : '100%',
			height : 898,
			//fieldLabel : '输出信息'
		} ]
	} ]
})