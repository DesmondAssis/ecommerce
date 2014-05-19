<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html"  prefix="html"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html:html>

<head>
<base href="<%=basePath%>">

<link href="../../css/css.css" rel="stylesheet" type="text/css">
 <script language="javascript">
 function checkEmpty(){
 if(document.form.account.value==""){
  window.alert("请输入管理员账号")
   document.form.account.focus();
   return false;
 }
 if(document.form.password.value==""){
 window.alert("请输入管理员密码")
 document.form.password.focus();
 return false;
 }
 return true;
 } 
 
 </script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登录</title>
<style type="text/css">
<!--
body {
	background-color: #f0f0f0;
}
-->
</style>
</head>
 
<body> 

<table width="900" height="700" border="0" align="center" cellpadding="0" cellspacing="0" background="image/bg2.jpg">
<tr>
<td>
    <table  border="0" vlign="buttom" align="center">
      <tr> 
        <html:form action="/adminAction.do?method=login" onsubmit="return checkEmpty()">
        <td ><font color="#9A6634"><strong>用户名：</strong></font> </td>
        <td ><html:text property="userName" size="15"/><br></td>
        <td >&nbsp;<font color="#9A6634"><strong>密码：</strong></font> </td>
        <td ><html:password property="pwd" size="15"/></td>
        <td ><div align="right">
        <html:submit >登陆</html:submit>
        </div></td>
        </html:form>
        </tr>
        <tr>
        <td height="30" colspan="5" align="center"><div align="center"><a href="../index.jsp">返回</a></div></td>
      </tr>
    </table>
</td>
</tr>
</table>

</body>
</html:html>
