/**
 * 
 */
Ext.define('CT.model.Db', {
    extend: 'Ext.data.Model',
    fields: [
        {name: 'diId',  type: 'int', convert: null},
        {name: 'diName',   type: 'string'},
        {name: 'diClassname', type: 'string'},
        {name: 'diLinks', type: 'string'},
        {name: 'diTablesql', type: 'string'},
        {name: 'diColsql', type: 'string'},
    ],
    proxy: {
        type: 'rest',
        url : 'db.json'
    }
});