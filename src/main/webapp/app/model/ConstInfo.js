/**
 * 
 */
Ext.define('CT.model.ConstInfo', {
    extend: 'Ext.data.Model',
    fields: [
        {name: 'coiId',  type: 'int', convert: null},
        {name: 'coiName',   type: 'string'},
        {name: 'coiCode', type: 'string'}
    ]
});