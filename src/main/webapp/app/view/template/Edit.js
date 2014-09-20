/**
 * 项目新增编辑
 */
Ext.define('CT.view.template.Edit', {
    extend: 'Ext.window.Window',
    alias : 'widget.templateedit',
    title : '模板编辑',
    layout: 'fit',
    autoShow: true,
    padding: '5 5 5 5',
    initComponent: function() {
        this.items = [{
                xtype: 'form',
                items: [{
	                    xtype: 'hidden',
	                    name : 'tiId'
	                },{
	                    xtype: 'hidden',
	                    name : 'tpId'
	                }, {
	                    xtype: 'textfield',
	                    name : 'tiName',
	                    padding: '5 5 5 5',
	                    width: 600,
	                    fieldLabel: '项目名称'
	                }]
        }];

        this.buttons = [{
                text: '保存',
                action: 'save',
                handler: this.edit
            }, {
                text: '取消',
                scope: this,
                handler: function(){
                	this.close();
                	//Ext.getBody().unmask();
                }
        }];

        this.callParent(arguments);
    },
	edit: function(button){
		var win = button.up('window'),
        form = win.down('form'),
        record = form.getRecord(),
        values = form.getValues();
		record.set(values);
		Ext.Ajax.request({
		    url: 'template.json',
		    method: 'POST',
		    params: values,
		    success: function(response){
		    	win.close();
		    	var tree = Ext.ComponentQuery.query('viewport left treepanel');
		    	tree[0].store.load();
		    }
		});
	}

});