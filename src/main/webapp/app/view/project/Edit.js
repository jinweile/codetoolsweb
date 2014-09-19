/**
 * 项目新增编辑
 */
Ext.define('CT.view.project.Edit', {
    extend: 'Ext.window.Window',
    alias : 'widget.projectedit',
    title : '项目编辑',
    layout: 'fit',
    autoShow: true,
    padding: '5 5 5 5',
    initComponent: function() {
        this.items = [{
                xtype: 'form',
                items: [{
	                    xtype: 'hidden',
	                    name : 'tpId'
	                },{
	                    xtype: 'textfield',
	                    name : 'tpName',
	                    padding: '5 5 5 5',
	                    width: 600,
	                    fieldLabel: '项目名称'
	                }, {
	                    xtype: 'textarea',
	                    name : 'tpRemark',
	                    padding: '5 5 5 5',
	                    width: 600,
	                    height: 120,
	                    fieldLabel: '项目说明'
	                }, {
	                    xtype: 'textarea',
	                    name : 'tpOutinfo',
	                    padding: '5 5 5 5',
	                    width: 600,
	                    height: 300,
	                    fieldLabel: '输出信息'
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
		    url: 'project.json',
		    method: 'POST',
		    params: values,
		    success: function(response){
		    	win.close();
		    	var tree = Ext.ComponentQuery.query('viewport left treepanel');
		    	tree[0].store.reload();
		    }
		});
		/*record.save({
		    success: function() {
		    	win.close();
		    	var tree = Ext.ComponentQuery.query('viewport left treepanel');
		    	tree.reload();
		    }
		});*/
	}

});