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
    window.location.href="index.jsp";
	}
  }
</script>

<body>
<!--左侧01-->
	
	<table width="100%" height="138"  border="0" cellpadding="0" cellspacing="0" background="image/fg_left01.jpg">
      <tr>
        <td valign="top"><table width="100%"  border="0" cellpadding="0" cellspacing="0">
		 <tr>
            <td height="16">&nbsp;</td>
          </tr>
        </table>
        <form name="form" method="post" action="userAction.do?method=login" onSubmit="return checkEmpty(form)">
          <table width="200" border="0" align="center">
            <tr>
              <td width="100" height="20">用户名：</td>
              <td width="80"> <input name="name" type="text" size="15"></td>
            </tr>
            <tr>
              <td height="20">密&nbsp;&nbsp;&nbsp;&nbsp;码：</td>
              <td><input name="password" type="password" size="15"></td>
            </tr>
			 <tr>
              <td height="15"><input type="image" class="input1"  src="image/fg-land.gif" width="51" height="20"></td>
              <td height="15"><a href="jsp/user/regist.jsp">注册</a>&nbsp;<a href="jsp/user/search.jsp">找回密码?</a></td>
			 </tr>	  
          </table>
		  </form>
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

						<img src="image/sign.gif"><font color="#FF6699">现在注册会员，送200积分！</font><br>
						<img src="image/sign.gif"><font color="#FF6699">购物满1888抽大奖！</font><br>
						<img src="image/sign.gif"><font color="#FF6699">施华洛世奇水晶奢华亮相！</font><br>
                        <img src="image/sign.gif"><font color="#FF6699">圣诞节，有大礼相送！</font><br>
                        <img src="image/sign.gif"><font color="#FF6699">亲,多买多送哦</font><br>
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
                <td width="164"><a href="LiXiaoChuan/fg-goodsContent6.jsp"><font color="#FF6699">施华洛世奇水晶-脚链</font></a></td>
                </tr>
                <tr>
                <td width="14"></td>
                <td width="164"><a href="LiXiaoChuan/fg-goodsContent8.jsp"><font color="#FF6699">紫水晶手链-寻找幸福</font></a></td>
                </tr>
                <tr>
                <td width="14"></td>
                <td width="164"><a href="LiXiaoChuan/fg-goodsContent4.jsp"><font color="#FF6699">AMAZOW-钻石女戒</font></a></td>
                </tr>
                <tr>
                <td width="14"></td>
                <td width="164"><a href="LiXiaoChuan/fg-goodsContent.jsp"><font color="#FF6699">周大福宝宝系列吊坠</font></a></td>
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

					<img src="image/sign1.gif">&nbsp; <a href="http://www.taobao.com" target="_blank"><font color="#FF6699">淘宝网</font></a><br><br>
                    <img src="image/sign1.gif">&nbsp; <a href="http://www.dangdang.com" target="_blank"><font color=""><font color="#FF6699">当当网</font></a><br><br>
                    <img src="image/sign1.gif">&nbsp; <a href="http://www.amazon.cn/?tag=360daohang-23" target="_blank"><font color=""><font color="#FF6699">卓越亚马逊</font></a><br><br>
                    <img src="image/sign1.gif">&nbsp; <a href="http://www.moonbasa.com/#cn=127&type=0&adsiteid=10000007" target="_blank"><font color=""><font color="#FF6699">梦芭莎</font></a><br><br>
                    <img src="image/sign1.gif">&nbsp; <a href="http://www.yihaodian.com/product/index.do?tracker_u=7520169&merchant=1" target="_blank"><font color="#FF6699">1号店</font></a><br><br>
                    <img src="image/sign1.gif">&nbsp; <a href="http://www.shangpin.com/se-bd-wb/index.aspx?serialno=88733872" target="_blank"><font color="#FF6699">尚品</font></a><br><br>
            </marquee>				 </td>
                </tr>
              </table></td>
          </tr>
      </table>
</body>
</html>
