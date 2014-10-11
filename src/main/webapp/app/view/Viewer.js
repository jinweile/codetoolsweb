Ext.define('CT.view.Viewer', {
	extend : 'Ext.tab.Panel',
	alias : 'widget.viewer',
	requires : [],
	activeItem : 0,
	margins : '5 0 5 5',
	cls : 'preview',
	deferredRender : false,
	activeTab : 0, // first tab initially active
	items : [ {
		title : '使用说明',
		autoScroll : true,
		html : '欢迎使用代码生成工具，本系统正在开发中！'
	} ],
	initComponent : function() {
		this.callParent(arguments);
	},
	listeners : {
		tabchange : function(tp, p) {
			//Ext.Msg.alert("提示", p.id);
            //中间与右边设置联动
            var rightid = "right_id";
            var right = Ext.ComponentQuery.query('viewport right')[0];
            var tc = Ext.ComponentQuery.query('#right_id');
            if(tc.length > 0) {
            	right.remove(tc[0]);
            }
            var treearray = p.id.split("/");
            if(treearray.length > 2){
	    		var tid = treearray.length > 2 ?  treearray[2] : 0;
	        	tc = Ext.widget('rightedit',{id: rightid,title: p.title,templateid: tid});
	            right.add(tc).show();
            }
		}
	}
});