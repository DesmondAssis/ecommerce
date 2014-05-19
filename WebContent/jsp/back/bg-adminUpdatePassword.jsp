<%@ page contentType="text/html; charset=UTF-8"%>

 <script Language="JavaScript">
 function deleteOrder(date) {
  if(confirm("确定要删除吗？")){
    window.location="orderAction.do?action=2&number="+date;
	}
  }
 </script>
 <script language="javascript">
function checkEmpty(form){
for(i=0;i<form.length;i++){
if(form.elements[i].value==""){
alert("表单信息不能为空");
return false;
}
}
if(document.form.selectPassword.value!=document.form.old.value){
window.alert("您输入原来的密码不正确，请重新输入");
return false;
}
if(document.form.password.value!=document.form.passwordNext.value){
window.alert("您两次输入的密码不一致，请重新输入");
return false;
}

return true;
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
    <td width="618" align="center" valign="top" bgcolor="#FFFFFF">
<br>
<form name="form" method="post" action="bg-modifySuccess.jsp" onSubmit="return checkEmpty(form)">
       <table width="60%"  border="1" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="#CCCCCC">
          <tr>
          <!-- 使用隐藏域存储  原来的密码 -->
          <input name="selectPassword" type="hidden"  value="11">
            <td width="29%" height="30"><div align="center">原密码</div></td>
            <td width="71%" bgcolor="#FFFFFF">&nbsp;
            <input name="old" type="password" size="30"></td>
          </tr>
          <tr>
            <td height="30"><div align="center">新密码</div></td>
            <td bgcolor="#FFFFFF">&nbsp;
            <input name="password" type="password" size="30"></td>
          </tr>
          <tr>
            <td height="30"><div align="center">再次输入新密码</div></td>
            <td bgcolor="#FFFFFF">&nbsp;
            <input name="passwordNext" type="password" size="30"></td>
          </tr>
        </table>
        <p>
        <input type="image" class="input1"  src="image/save.jpg" width="51" height="20">
&nbsp;&nbsp;
      <a href="#" onClick="javascript:form.reset()"><img src="image/clear.gif"></a>
&nbsp;&nbsp;
      <a href="#" onClick="javasrcipt:history.go(-1)"><img src="image/back.gif"></a>	
        </p>
</form>
</table>


<jsp:include page="bg-down.jsp" flush="true" />

</body>
</html>
