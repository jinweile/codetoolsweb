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
			xtype : 'hidden',
			name : 'tpId'
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
		action: 'save',
		handler : function(button) {
			var form = button.up('panel').down("form"), 
			values = form.getValues();
			Ext.Ajax.request({
				url : 'template.json',
				method : 'POST',
				params : values,
				success : function(response) {
					Ext.Msg.alert("提示", "保存成功！");
				}
			});
		}
	}, {
		text : '重设',
		scope : this,
		handler : function(button) {
			var panel = button.up('panel');
			var form = panel.down('form').getForm();
			form.reset();
		}
	} ]
})