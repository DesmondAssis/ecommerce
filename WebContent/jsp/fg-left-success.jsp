<%@ page contentType="text/html; charset=UTF-8" language="java" import="java.sql.*" errorPage="" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>无标题文档</title>
</head>
<script language="javascript">
function checkEmpty(form){
for(i=0;i<form.length;i++){
if(form.elements[i].value==""){
alert("表单信息不能为空");
return false;
}
}
}
function quit() {
  if(confirm("没有要买的东西了吗？")){
    window.location.href="../index.jsp";
	}
  }
</script>

<body background="image/bg1.jpg">

<table width="100%" height="138"  border="0" cellpadding="0" cellspacing="0" background="image/fg_left01.jpg">
      <tr>
        <td valign="top"><table width="100%"  border="0" cellpadding="0" cellspacing="0">
		 <tr>
            <td height="30">&nbsp;</td>
          </tr>
        </table>      
          <table width="167" border="0" align="center">
            <tr>
              <td width="161" height="15"><font color="#FB6801">mm,</font>欢迎回来</td>
              </tr>
            <tr>
              <td><a href="../PiMeng/query.jsp">个人信息</a></td>         
	 <tr><td><a href="../PiMeng/updatePwd.jsp">修改密码</a></td>	  
	 </tr>
	<tr>
	    <td><a href="javascript:quit()">安全退出</a></td>
	</tr>	  
          </table>
	  </td>
     </tr>
    </table>

	<!--左侧02-->		
        <table width="100%" height="194" border="0" background="image/fg_left02.jpg">
          <tr>
            <td valign="top"><table width="150" border="0">
              <tr>
                <td height="32">&nbsp;</td>
              </tr>
            </table>
              <table width="179" border="0" align="center">
                <tr>
                  <td width="171" height="143">
				  <marquee direction="up" height="114" onmouseout="this.start()" 
             onmouseover="this.stop()" scrollAmount="1" scrollDelay="1">	  

						<img src="image/sign.gif">&nbsp;<a href="#" onClick="window.open('fg-afficheSelect.jsp?id=44','','width=500,height=400');">44</a><br><br>

            </marquee>			      </td>
                </tr>
              </table></td>
          </tr>
        </table>	
	    <table width="100%" height="193" border="0" cellpadding="0" cellspacing="0" background="image/fg_left03.jpg">
          <tr>
            <td valign="top"><table width="194" border="0">
              <tr>
                <td height="40">&nbsp;</td>
              </tr>
            </table>          
	
			  <table width="178" height="19" border="0" align="center" cellpadding="0" cellspacing="0" background="image/fg_left04.jpg">
			    <tr>
			    <td width="14"></td>
                <td width="164"><a href="bg-sellResult.jsp?id=44&account=55">12&nbsp;&nbsp;ll</a></td>
				</tr>   
            </table>				
</td>
          </tr>
        </table>
	    <table width="207" height="181" border="0" cellpadding="0" cellspacing="0" background="image/fg_left05.jpg">
          <tr>
            <td valign="top"><table width="173">
              <tr>
                <td height="35">&nbsp;</td>
              </tr>
            </table>
              <table width="186" align="center">
                <tr>
                  <td height="38">
				  <MARQUEE direction="up" height="114" onmouseout="this.start()" 
             onmouseover="this.stop()" scrollAmount="1" scrollDelay="1">	  

					<img src="image/sign1.gif">&nbsp; <a href="#" target="_blank">123</a><br><br>

            </marquee>				 </td>
                </tr>
              </table></td>
          </tr>
      </table>
</body>
</html>
