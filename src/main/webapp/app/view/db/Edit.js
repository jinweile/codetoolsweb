/**
 * 数据库新增编辑
 */
Ext.define('CT.view.db.Edit', {
    extend: 'Ext.window.Window',
    alias : 'widget.dbedit',
    title : '数据库编辑',
    layout: 'fit',
    autoShow: true,
    padding: '5 5 5 5',
    initComponent: function() {
        this.items = [{
                xtype: 'form',
                items: [{
	                    xtype: 'hidden',
	                    name : 'diId'
	                }, {
	                    xtype: 'textfield',
	                    name : 'diName',
	                    padding: '5 5 5 5',
	                    width: 600,
	                    fieldLabel: '数据库名称'
	                }, {
	                    xtype: 'textfield',
	                    name : 'diClassname',
	                    padding: '5 5 5 5',
	                    width: 600,
	                    fieldLabel: '数据库类名'
	                }, {
	                    xtype: 'textarea',
	                    name : 'diLinks',
	                    padding: '5 5 5 5',
	                    width: 600,
	                    height: 120,
	                    fieldLabel: '连接字符串'
	                }, {
	                    xtype: 'textarea',
	                    name : 'diTablesql',
	                    padding: '5 5 5 5',
	                    width: 600,
	                    height: 120,
	                    fieldLabel: '表sql'
	                }, {
	                    xtype: 'textarea',
	                    name : 'diColsql',
	                    padding: '5 5 5 5',
	                    width: 600,
	                    height: 120,
	                    fieldLabel: '列sql'
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
                }
        }];

        this.callParent(arguments);
    },
	edit: function(button){
		var win = button.up('window'),
        form = win.down('form'),
        values = form.getValues();
		Ext.Ajax.request({
		    url: 'dbedit.json',
		    method: 'POST',
		    params: values,
		    success: function(response){
		    	win.close();
		    	var grid = Ext.ComponentQuery.query('viewport left #dbgrid');
		    	grid[0].store.load();
		    }
		});
	}

});