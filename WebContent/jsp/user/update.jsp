<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>电子商城</title>
</head>
 <link href="css/css.css" rel="stylesheet" type="text/css"> 
<body background="image/bg1.jpg">
<jsp:include page="/jsp/front/fg-top.jsp" flush="true"/>
<table width="766" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td width="207" valign="top" bgcolor="#F5F5F5">
    <!--左侧01-->
    <jsp:include page="/jsp/front/fg-left-user-success.jspf" flush="true"/></td>
    <td width="559" valign="top" bgcolor="#FFFFFF">
    <!--右侧01-->		
    <div align="center">
      <table width="558" height="112" border="0" cellpadding="0" cellspacing="0" background="image/fg40.jpg">
      <tr>
         <td>&nbsp;</td>
      </tr>
      </table>
    </div>
      
       <table width="560" border="0" align="center" cellpadding="0" cellspacing="0" bordercolor="#000000">
  <tr>
    <td bgcolor="#fffff" align="center">


  <html:form action="userAction?method=update"  onsubmit="return checkEmpty(memberForm)">
  
  <table width="298"  border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="200" height="35">
          <div align="right">会&nbsp;员&nbsp;名：</div><br><br></td>
        <td width="187"><div align="center">
          <html:hidden property="username" value="add"/>
        </div><br><br></td>
      </tr>
	  <tr>
        <td height="35">
          <div align="right">密码提示问题：</div><br><br></td>
        <td>
            <div align="left">
               <html:select property="question">
                   <html:option value="请选择提示问题">请选择提示问题</html:option>
                   <html:option value="您的父亲的名字是？">您的父亲的名字是？</html:option>
	               <html:option value="您的母亲的名字是？">您的母亲的名字是？</html:option>
                   <html:option value="您的父亲的工作是？">您的父亲的工作是？</html:option>
                   <html:option value="您的母亲的工作是？">您的母亲的工作是？</html:option>
				   <html:option value="您最喜欢的动物是？">您最喜欢的动物是？</html:option>
				   <html:option value="您最喜欢的颜色是？">您最喜欢的颜色是？</html:option>
               </html:select>&nbsp;&nbsp;&nbsp;&nbsp;
          </div><br><br></td>
	  </tr>
      <tr>
        <td height="35">
          <div align="right">密码提示答案：</div><br><br></td>
        <td><div align="left">
          <html:text property="answer" value="222"></html:text>
        </div><br><br></td>
      </tr> 
      <tr>
        <td height="35">
          <div align="right">真实姓名：</div><br><br></td>
        <td><div align="left">
          <html:text property="name" value="333"></html:text>
        </div><br><br></td>
      </tr>
      <tr>
        <td height="35">
          <div align="right">身份证号：</div><br><br></td>
        <td><div align="left">
          <html:text property="identity" value="444"></html:text>
        </div><br><br></td>
      </tr>
      <tr>
        <td height="35">
          <div align="right">邮&nbsp;&nbsp;&nbsp;编：</div><br><br></td>
        <td><div align="left">
          <html:text property="postcode" value="555"></html:text>
        </div><br><br></td>
      </tr>
      <tr>
        <td height="35">
          <div align="right">邮箱地址：</div><br><br></td>
        <td><div align="left">
          <html:text property="email" value="666"></html:text>
        </div><br><br></td>
      </tr>
	  <tr>
        <td height="35">
          <div align="right">邮寄地址：</div><br><br></td>
        <td><div align="left">
          <html:text property="address" value="111"></html:text>
        </div><br><br></td>
      </tr>
	  <tr>
        <td height="35">
          <div align="right">联系电话：</div><br><br></td>
        <td><div align="left">
          <html:text property="tel" value="777"></html:text>
        </div><br></td>
      </tr>
    </table>
    <br/>
    <br>
   <html:submit>提交</html:submit>
   &nbsp;&nbsp;&nbsp;
   <html:reset>重置</html:reset>
   &nbsp;&nbsp;&nbsp;
   <input type="Button" class="input3" name="button" value="返回" onClick="history.go(-1)"/>
  <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
  </html:form>

  <p>&nbsp;  </p>    </td>
  </tr>
</table>
       
</td>
  </tr>

</table>

	<jsp:include page="/jsp/front/fg-down.jsp" flush="true"/>

</body>
</html:html>
