/**
 * 
 */
Ext.define('CT.model.Project', {
    extend: 'Ext.data.Model',
    fields: [
        {name: 'tpId',  type: 'int', convert: null},
        {name: 'tpName',   type: 'string'},
        {name: 'tpRemark', type: 'string'},
        {name: 'tpOutinfo', type: 'string'}
    ],
    proxy: {
        type: 'rest',
        url : 'project.json'
    }
});