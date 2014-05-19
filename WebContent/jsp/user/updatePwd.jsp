<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<html:html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>电子商城</title>
</head>
<link href="css/css.css" rel="stylesheet" type="text/css"> 
<body background="image/bg1.jpg">
<jsp:include page="fg-top.jsp" flush="true"/>
<table width="766" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td width="207" valign="top" bgcolor="#F5F5F5">
    <!--左侧01-->
    <jsp:include page="fg-left-success.jsp" flush="true"/></td>
    <td width="559" valign="top" bgcolor="#FFFFFF">
    <!--右侧01-->		
    <div align="center">
      <table width="558" height="110" border="0" cellpadding="0" cellspacing="0" background="image/fg39.jpg">
      <tr>
         <td>&nbsp;</td>
      </tr>
      </table>
    
    </div>
       
       <table width="560" border="0" align="center" cellpadding="0" cellspacing="0" bordercolor="#000000">
  <tr>
    <td bgcolor="#fffff" align="center">


  <html:form action="success.jsp"  onsubmit="return checkEmpty(memberForm)">
  <table width="298"  border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="105" height="35">
          <div align="right">会&nbsp;员&nbsp;名：</div></td>
        <td width="187"><div align="center">
          <html:hidden property="username" value="add"/>
        </div></td>
      </tr>
      <tr>
        <td height="35">
          <div align="right">原来的密码：</div></td>
        <td><div align="center">
           <html:hidden property="question" value="add"/>
           <html:hidden property="answer" value="add"/>
           <html:hidden property="pwd" value="add"/>
           <html:password property="pwd"></html:password>
        </div></td>
      </tr>
      <tr>
        <td height="35">
          <div align="right">新的密码：</div></td>  
        <td><div align="center">
          <html:password property="newPwd"></html:password>
        </div></td>
      </tr>
      <tr>
        <td height="35">
          <div align="right">密码确认：</div></td>
        <td><div align="center">
          <html:password property="confirmPwd"></html:password>
        </div></td>
      </tr>

    </table>
    <br>
   <html:submit>提交</html:submit>
   &nbsp;&nbsp;&nbsp;
   <html:reset>重置</html:reset>
   &nbsp;&nbsp;&nbsp;
   <input type="Button" class="input3" name="button" value="返回" onClick="history.go(-1)"/>
   <br/><br/><br/><br/><br/><br/><br/><br/><br/> <br/><br/><br/><br/><br/><br/><br/><br/><br/>
   <br/><br/><br/><br/><br/>
   </html:form>

  <p>&nbsp;  </p>    </td>
  </tr>
</table>
       
</td>
  </tr>

</table>

	<jsp:include page="fg-down.jsp" flush="true"/>

</body>
</html:html>
