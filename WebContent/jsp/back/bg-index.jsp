<%@ page contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 
<html>
<head>
<base href="<%=basePath%>">
<link href="../../css/css.css" rel="stylesheet" type="text/css">
<script Language="JavaScript">
 function deleteOrder(date) {
  if(confirm("确定要删除吗？")){
    window.location="orderAction.do?action=2&number="+date;
	}
  }
 </script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>电子商城的后台</title>
</head>

 

<body>
<jsp:include page="bg-up.jsp" flush="true"/>
<table width="788" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td width="170"  valign="top"><jsp:include page="bg-left.jsp" flush="true" /></td>
    <td width="618" align="center" valign="top" bgcolor="#FFFFFF">
	操作部分
<br>

</table>


<jsp:include page="bg-down.jsp" flush="true" />

</body>
</html>
