/**
 * 
 */
Ext.define('CT.model.Template', {
    extend: 'Ext.data.Model',
    fields: [
        {name: 'tiId',  type: 'int', convert: null},
        {name: 'tpId',  type: 'int', convert: null},
        {name: 'tiName',   type: 'string'}
    ],
    proxy: {
        type: 'rest',
        url : 'template.json'
    }
});