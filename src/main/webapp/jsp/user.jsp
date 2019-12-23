<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
// function testN(){
// 	$.ajax({
// 		type:"post",
// 		url:"index",
// 		dataType:"json",
// 		success: function(data){
			
// 			},
// 		});
// }; 

function deleteOne(id){
	window.location.href="<%=path%>/user/deleteOne?id="+id;
}

</script>
</head>
<body>
${user.id}<br>
${user.name}<br>
${user.sex}<br>
${user.age}<br>
<a href="javascript:deleteOne('${user.id}')">删除</a>
<img alt="" src="<%=path%>/img/1.jpg">
</body>
</html>