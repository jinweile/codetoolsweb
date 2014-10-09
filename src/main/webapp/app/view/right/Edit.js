/**
 * 模板常量关联
 */
Ext.define('CT.view.right.Edit', {
    extend: 'Ext.grid.Panel',
    alias : 'widget.rightedit',
    store:{
    	autoLoad: true,
    	fields:[ 'diId', 'diName', 'diClassname', 'diLinks', 'diTablesql', 'diColsql' ],
        proxy: { 
        	type: 'ajax',
        	url: 'dblist.json',
            reader: {
	            type: 'json',
	            root: 'items'
            }
        }
    },
    columns: [
              { dataIndex: 'diId', width: 18 },
              { header: '数据库名',  dataIndex: 'diName', hidden: false },
              { header: '数据库类名', dataIndex: 'diClassname', hidden: false },
              { header: '连接字符串', dataIndex: 'diLinks', hidden: true },
              { header: '表sql', dataIndex: 'diTablesql', hidden: true },
              { header: '列sql', dataIndex: 'diColsql', hidden: true }
    ]
});