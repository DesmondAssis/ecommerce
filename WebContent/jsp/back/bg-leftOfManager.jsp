<%@ page contentType="text/html; charset=UTF-8" language="java" import="java.sql.*" errorPage="" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 
 
<html>
<head>
<base href="<%=basePath%>">

  <script Language="JavaScript">
 function quit() {
  if(confirm("确定要退出后台吗？")){
    window.location.href="../index.jsp";
	}
  }
 </script> 

 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>电子商城的后台</title>
</head>

<body>
 
<table width="35" height="22" border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td><img src="image/bg_left01.jpg" width="170" height="45"></td>
      </tr>
    </table>
      
      
       
      <table width="170" height="46" border="0" cellpadding="0" cellspacing="0" background="image/bg_left02.jpg">
        <tr>
          <td><div align="left">
            <table width="118" border="0" align="center" cellpadding="0" cellspacing="0">
                <tr>
                  <td width="127" height="17" align="center" valign="bottom"><div align="left"><a href="PanBaoMing/bg-managerSelect.jsp" class="a3">后台管理员设置</a></div></td>
                </tr>
                <tr>
                  <td height="17" align="center"><div align="left"><font color="#FFFFFF">Admin Manage</font></div></td>
                </tr>
             </table>
          </div></td>
        </tr>
      </table>
       <table width="170" height="46" border="0" cellpadding="0" cellspacing="0" background="image/bg_left02.jpg">
        <tr>
          <td><div align="left">
            <table width="118" border="0" align="center" cellpadding="0" cellspacing="0">
                <tr>
                  <td width="127" height="17" align="center" valign="bottom"><div align="left"><a href="PanBaoMing/bg-managerUpdatePassword.jsp" class="a3">修改密码</a></div></td>
                </tr>
                <tr>
                  <td height="17" align="center"><div align="left"><font color="#FFFFFF">Amend Password</font></div></td>
                </tr>
             </table>
          </div></td>
        </tr>
      </table>      

     

      <table width="170" height="47" border="0" cellpadding="0" cellspacing="0" background="image/bg_left03.jpg">
        <tr>
          <td><table width="118" border="0" align="center" cellpadding="0" cellspacing="0">
              <tr>
                <td width="127" height="17" align="center" valign="bottom"><div align="left"><a href="javascript:quit()" class="a3">安全退出</a></div></td>
              </tr>
              <tr>
                <td height="17" align="center"><div align="left"><font color="#FFFFFF">Exit</font></div></td>
              </tr>
          </table></td>
        </tr>
      </table>
      <table width="37" border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td><img src="image/bg_left04.jpg" width="170" height="68"></td>
        </tr>
      </table>

</body>
</html>     
      
      