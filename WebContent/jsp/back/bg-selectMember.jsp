<%@ page contentType="text/html; charset=UTF-8"%>
 <script Language="JavaScript">
 function deleteManager(date) {
  if(confirm("确定要删除吗？")){
    window.location="../back/bg-deleteAdminSuccess.jsp";
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
    <td width="618" align="center" valign="top" bgcolor="#FFFFFF"> <br>
	
        <table width="610" height="25" border="0" cellpadding="0" cellspacing="0" background="image/bg_02.jpg">
          <tr>
            <td><div align="center"><strong>会员信息的查询</strong></div></td>
          </tr>
        </table>
        <br>
				 
	    <table width="100%"  border="1" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="#CCCCCC">

	    <tr>
          <td width="14%" height="25"><div align="center">编号</div></td>
          <td width="14%"><div align="center">会员账号</div></td>
          <td width="14%"><div align="center">会员姓名</div></td>
           <td width="14%"><div align="center">会员年龄</div></td>

    <td width="38%"><div align="center">操作</div></td>
        </tr>
        <tr bgcolor="#FFFFFF">
          <td height="30"><div align="center">111</div></td>
          <td><div align="center">555</div></td>
          <td><div align="center">444</div></td>
          <td><div align="center">333岁</div></td>
        <td><div align="center">

		 <a href="bg-selectContent.jsp">详细信息</a>&nbsp;&nbsp;&nbsp;&nbsp;

		 <a href="javascript:deleteManager('44')">删除</a>

		  </div></td>
        </tr>
  
      </table><br>
	   <table width="100%"  border="0" align="center" cellpadding="0" cellspacing="0">
   <tr align="center">
    <td width="17%">共为ddd页</td>
			<td width="22%">共有ttt条记录</td>
            <td width="26%">当前为第tttt页</td>
    <td width="19%"><a href="#">上一页</a></td>
            <td width="16%"><a href="#">下一页</a></td>



   </tr>
 </table>
		
	</table>	
<jsp:include page="bg-down.jsp" flush="true" />




</body>
</html>
