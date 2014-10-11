/**
 * 模板常量关联
 */
Ext.define('CT.view.right.Edit', {
    extend: 'Ext.grid.Panel',
    alias : 'widget.rightedit',
    initComponent: function(){
    	var grid = this;
    	this.selModel = Ext.create('Ext.selection.CheckboxModel',{
    		//mode: 'MULTI',
    		checkOnly: true,//只能通过checkbox选中行
        	listeners:{
    	    	select: function(model, selected, index, eOpts){
    	    		if(index < 0) return;
    	    		//ajax提交数据
    	    		var tc = Ext.ComponentQuery.query('#right_id')[0];
					Ext.Ajax.request({
					    url: 'tempconst_add.json',
					    method: 'POST',
					    params: { coiId: selected.data.coiId, tiId: tc.templateid },
					    success: function(response){}
					});
    	    	},
    	    	deselect: function(model, selected, index, eOpts){
    	    		if(index < 0) return;
    	    		//ajax提交数据
    	    		var tc = Ext.ComponentQuery.query('#right_id')[0];
    	    		Ext.Ajax.request({
					    url: 'tempconst_del.json',
					    method: 'POST',
					    params: { coiId: selected.data.coiId, tiId: tc.templateid },
					    success: function(response){}
					});
    	    	}
        	}
        });
    	this.store = {
        	autoLoad: true,
        	fields:[ 'coiId', 'coiName', 'coiCode','ischecked' ],
            proxy: { 
            	type: 'ajax',
            	url: 'constlist_right.json?tiId=' + grid.templateid,
                reader: {
    	            type: 'json',
    	            root: 'items'
                }
            },
            listeners: {
            	load: function(store){
            		var index = 0; 
            		store.each(function(record){
            			if(record.data.ischecked)
            				grid.selModel.select(index,true,true);
            			index++;
            		});
            	}
            }
        };
        this.columns = [
                  { dataIndex: 'coiId', width: 18 },
                  { header: '变量名',  dataIndex: 'coiName', hidden: false },
                  { header: '变量代码', dataIndex: 'coiCode', hidden: false },
                  { header: '是否选择', dataIndex: 'ischecked', hidden: true },
        ];
    	
    	this.callParent(arguments);
    }
});