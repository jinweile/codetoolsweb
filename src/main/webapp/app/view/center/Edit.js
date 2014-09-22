/**
 * 
 */
Ext.define('CT.view.center.Edit', {
	extend : 'Ext.panel.Panel',
	alias : 'widget.centeredit',
	layout : 'fit',
	region : 'center', // a center region is ALWAYS required for border
	deferredRender : false,
	activeTab : 0, // first tab initially active
	closable : true,
	items : [ {
		xtype : 'form',
		items : [ {
			xtype : 'hidden',
			name : 'tiId'
		}, {
			xtype : 'textarea',
			layout : 'fit',
			name : 'tiContent',
			padding : '5 5 5 5',
			width : '98%',
			height : 830, 
			anchor : '100%' 
		} ]
	} ],
	buttons : [ {
		text : '保存',
		action : 'save',
		handler : this.edit
	}, {
		text : '重设',
		scope : this,
		handler : function(button) {
			var panel = button.up('panel');
			var form = panel.down('form').getForm();
			form.reset();
		}
	} ],
	edit : function(button){
		
	}
})