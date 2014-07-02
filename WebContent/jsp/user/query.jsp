<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="/jsp/init.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>电子商城</title>
</head>
 <link href="${path}/css/css.css" rel="stylesheet" type="text/css"> 
<body>
<jsp:include page="/jsp/front/fg-top.jsp" flush="true"/>
<table width="766" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
  	<!--左侧01-->
    <td width="207" valign="top" bgcolor="#F5F5F5">
    	<%if(session.getAttribute("user") != null) {%>
			<%@include file="/jsp/front/fg-left-user-success.jspf" %>
		<%}else{ %>
			<%@include file="/jsp/front/fg-left-user-index.jspf" %>
		<%} %>
    </td>
    <!--end:左侧01-->	
    <td width="559" valign="top" bgcolor="#FFFFFF">
    

    <div align="center">
        <table width="558" height="85" border="0" cellpadding="0" cellspacing="0" background="${path}/image/fg41.jpg">
          <tr>
            <td>&nbsp;</td>
          </tr>
        </table>
     
    </div>
		 
	    <table width="560"  border="0" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bgcolor="#fffff">
 <tr>
    <td bgcolor="#fffff" align="center">
   

    <table width="300"  border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="200" height="35" align="right">会员名：</td>
        <td width="180" align="left"><jsp:getProperty property="name" name="user"/>
        </td></tr>
      
      <tr>
        <td height="35">
          <div align="right">真实姓名：</div></td>
        <td>
            <div align="left">
            	<jsp:getProperty property="reallyName" name="user"/>
            </div></td></tr>
      <tr>
        <td height="35">
          <div align="right">身份证号：</div></td>
        <td>
            <div align="left"><jsp:getProperty property="identity" name="user"/>          
          </div></td></tr>
      <tr>
        <td height="35">
          <div align="right">邮&nbsp;&nbsp;&nbsp;编：</div></td>
        <td>
            <div align="left"><jsp:getProperty property="postcode" name="user"/>
          </div></td></tr>
      <tr>
        <td height="35">
          <div align="right">邮箱地址：</div></td>
        <td>
            <div align="left"><jsp:getProperty property="email" name="user"/>
          </div></td></tr>
      <tr>
        <td height="35">
          <div align="right">邮寄地址：</div></td>
        <td>
            <div align="left"><jsp:getProperty property="address" name="user"/>
          </div></td></tr>
	  <tr>
        <td height="35">
          <div align="right">联系电话：</div></td>
        <td>
            <div align="left"><jsp:getProperty property="phone" name="user"/>
          </div></td></tr>
    </table>
    <br>
    <a href="update.jsp"><img src="${path}/image/update.jpg"/></a>
    &nbsp;&nbsp;
    <a href="loginSuccess.jsp"><img src="${path}/image/back.gif"/></a>


 
 </tr>
 
 </table> 



</td>
  </tr>
</table>
	<jsp:include page="/jsp/front/fg-down.jsp" flush="true"/>
</body>
</html>
