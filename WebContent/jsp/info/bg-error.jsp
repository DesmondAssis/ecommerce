<%@ page contentType="text/html; charset=utf-8" import="java.util.*"%>
<%@ page import="com.desmond.ecommerce.bean.InfoMessBean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
   <head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <title>电子商城的后台</title>
     <link href="css/css.css" rel="stylesheet" type="text/css">
     
     <script language='javascript' type='text/javascript'>
  var secs =3; //倒计时的秒数  
  var URL ;
 
  

  function Load(){


  for(var i=secs;i>=0;i--)  
  {  
  window.setTimeout('doUpdate(' + i + ')', (secs-i) * 1000);  
    
  }  
  }
    
  function doUpdate(num)  
  {  
  document.getElementById('ShowDiv').innerHTML = '请稍候，系统将在'+num+'秒后自动返回...' ;
  if(num == 0) { window.history.back(); }  
  }
  </script>
     
   </head>
     
   <body>
         <jsp:include page="../back/bg-up.jsp" flush="true"/>
         <br/>
         <table width="788" border="0" align="center" cellpadding="0" cellspacing="0">
             <tr>
               <td width="170"  valign="top"><jsp:include page="../back/bg-left.jsp" flush="true" /></td>
               <td width="618" align="center" valign="top" bgcolor="#FFFFFF">
	              
	                 
	                  <bean:write name="error" property="mess"/>
	                  <script type="text/javascript">
	                  Load();
	                  </script>
	                  <div id="ShowDiv"></div>
	           
	             
             	</td>
              </tr>
      </table>
      
      <jsp:include page="../back/bg-down.jsp" flush="true" />

  </body>
</html>
