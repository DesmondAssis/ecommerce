<%@ page contentType="text/html; charset=UTF-8"%>

 <script Language="JavaScript">
 function deleteOrder(date) {
  if(confirm("确定要删除吗？")){
    window.location="orderAction.do?action=2&number="+date;
	}
  }
 </script>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>电子商城的后台</title>
</head>
 <link href="css/css.css" rel="stylesheet" type="text/css">

<body>
<jsp:include page="bg-up.jsp" flush="true"/>
<table width="788" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td width="170"  valign="top"><jsp:include page="bg-left.jsp" flush="true" /></td>
    <td width="618" align="center" valign="top" bgcolor="#FFFFFF" colspan="2">
	
<br>
<table width="610" height="25" border="0" cellpadding="0" cellspacing="0" background="image/bg_02.jpg">
          <tr>
            <td><div align="center"><strong>查看管理员的详细情况</strong></div></td>
          </tr>
        </table>
        <br>

 <table width="71%" height="130"  border="1" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="#CCCCCC">
          <tr>

            <td width="%50"><div align="center">管理员账号</div></td>
            <td width="%50" bgcolor="#FFFFFF"><div align="center">11</div></td>
          </tr>
          <tr>
            <td width="%50"><div align="center">管理员密码</div></td>
            <td width="%50" bgcolor="#FFFFFF"><div align="center">111</div></td>
          </tr>
          <tr>
            <td width="%50" ><div align="center">管理员权限</div></td>
            <td width="%50" bgcolor="#FFFFFF"><div align="center"><input name=""></</div></td>
          </tr>
                   
      </table>
      <br/>
       <div align="center"><a href="bg-modifySuccess.jsp">修改权限</a></div>
</table>



<jsp:include page="bg-down.jsp" flush="true" />

</body>
</html>
