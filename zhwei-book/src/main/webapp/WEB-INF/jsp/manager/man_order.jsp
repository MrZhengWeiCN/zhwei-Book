<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
    <head>
        <%-- the header --%>
        <%@ include file="/WEB-INF/jsp/header.jsp" %>

        <title>订单管理</title>
    </head>
    <body>
        <%-- the navbar --%>
        <%@ include file="/WEB-INF/jsp/navbar.jsp" %>

        <div id="ib_man_order_content_div">
            <%@ include file="/WEB-INF/jsp/manager/man_order_content.jsp" %>
        </div>

        <%-- the javascript --%>
        <script type="text/javascript">
            function fnChangeFinish(data, code, request) {
                if (code == "success") {
                    $("#ib_man_order_content_div").html(data);
                }
            }

            function onBtnChangeClick(data) {
                var ajaxUrl = "manOrderChange";
 				window.confirm("确定对此订单进行此操作？");
                jQuery.ajax({
                    type: "POST",
                    url: ajaxUrl,
                    data: data,
                    dataType: "json",
                    contentType: "application/x-www-form-urlencoded; charset=utf-8",
                    success: function(data){
                    	if(data.status==200){
                    		alert("订单已经处理！");
                    		window.location.reload();
                    	}else{
                    		alert(data.msg);
                    	}
                    }
                });
            }
        </script>

    </body>
</html>