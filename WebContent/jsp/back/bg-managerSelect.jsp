<%@ page contentType="text/html; charset=UTF-8"%>
 <script Language="JavaScript">
 function deleteManager(date) {
  if(confirm("确定要删除吗？")){
    window.location="bg-deleteAdminSuccess.jsp";
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
            <td><div align="center"><strong>管理员信息的查询</strong></div></td>
          </tr>
        </table>
        <br>
	 <table width="100%"  border="0" cellspacing="0" cellpadding="0">
            <tr>
          
          <td width="100%">	<div align="center"><a href="bg-managerInsert.jsp">添加管理员</a>&nbsp;&nbsp;&nbsp;&nbsp;</div>
	     </td>
	     
      
        <tr>
      </table>
      <br/>
	    <table width="100%"  border="1" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="#CCCCCC">    
	    <tr>
          <td width="20%" height="25"><div align="center">数据编号</div></td>
          <td width="20%"><div align="center">管理员用户名</div></td>
          <td width="20%"><div align="center">管理员姓名</div></td>
          <td width="44%"><div align="center">操作</div></td>
        </tr>

        <tr bgcolor="#FFFFFF">
          <td height="30"><div align="center">41</div></td>
          <td><div align="center">ggg</div></td>
          <td><div align="center">44</div></td>
          <td><div align="center">
          
          <a href="bg-selectAdmin.jsp">查看</a>
          &nbsp;&nbsp;&nbsp;
        
         <a href="bg-selectAdmin.jsp">修改权限</a>
          &nbsp;&nbsp;&nbsp;
         <a href="javascript:deleteManager('44')">删除</a>
          </div></td>
        </tr>
  
      </table><br>
	   <table width="100%"  border="0" align="center" cellpadding="0" cellspacing="0">
   <tr align="center">
    <td width="20%">共为10页</td>
			<td width="20%">共有100条记录</td>
            <td width="20%">当前为第2页</td>
    <td width="20%"><a href="#">上一页</a></td>
            <td width="20%"><a href="#">下一页</a></td>
   </tr>
 </table>  
 		
</table>		
<jsp:include page="bg-down.jsp" flush="true" />
</body>
</html>
