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
	</script>

	<body>
		<!--begin:左侧01-->
		<%if(session.getAttribute("user") != null) {%>
			<%@include file="fg-left-user-success.jspf" %>
		<%}else{ %>
			<%@include file="fg-left-user-index.jspf" %>
		<%} %>
		<!--end:左侧01-->
		
		<!--begin:左侧02-->		
	    <table width="100%" height="194" border="0" background="${path}/image/fg_left02.jpg">
	    	<tr>
		    	<td valign="top">
		        	<table width="150" border="0">
			        	<tr>
			            	<td height="32">&nbsp;</td>
			          	</tr>
			        </table>
			        
		          	<table width="179" border="0" align="center">
			            <tr>
				        	<td width="171" height="143">
								<marquee direction="up" height="114" onmouseout="this.start()" 
							         onmouseover="this.stop()" scrollAmount="1" scrollDelay="1">	  
		
									<img src="${path}//image/sign.gif"><font color="#FF6699">现在注册会员，送200积分！</font><br>
									<img src="${path}/image/sign.gif"><font color="#FF6699">购物满1888抽大奖！</font><br>
									<img src="${path}/image/sign.gif"><font color="#FF6699">施华洛世奇水晶奢华亮相！</font><br>
				                    <img src="${path}/image/sign.gif"><font color="#FF6699">圣诞节，有大礼相送！</font><br>
				                    <img src="${path}/image/sign.gif"><font color="#FF6699">亲,多买多送哦</font><br>
		        				</marquee>			     
			        		</td>
		           		 </tr>
		            </table>
		        </td>
	       </tr>
	    </table>
	    <!--end:左侧02-->
	    
	    <!--begin:左侧03-->
		<table width="100%" height="193" border="0" cellpadding="0" cellspacing="0" background="${path}/image/fg_left03.jpg">
	    	<tr>
	        	<td valign="top">
	        		<table width="194" border="0">
		            	<tr>
		                	<td height="40">&nbsp;</td>
		              	</tr>
	            	</table>          
		
				  	<table width="178" height="19" border="0" align="center" cellpadding="0" cellspacing="0" background="${path}/image/fg_left04.jpg">
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
	   	<!--end:左侧03-->
	   	
	   	<!--begin:左侧04-->
		<table width="207" height="181" border="0" cellpadding="0" cellspacing="0" background="${path}/image/fg_left05.jpg">
	    	<tr>
	        	<td valign="top">
	        		<table width="173">
	              		<tr>
	                		<td height="35">&nbsp;</td>
	              		</tr>
	            	</table>
	              	<table width="186" align="center">
	                	<tr>
	                  		<td height="38">
					  			<MARQUEE direction="up" height="114" onmouseout="this.start()" 
	             					onmouseover="this.stop()" scrollAmount="1" scrollDelay="1">	  
									<img src="${path}/image/sign1.gif">&nbsp; <a href="http://www.taobao.com" target="_blank"><font color="#FF6699">淘宝网</font></a><br><br>
				                    <img src="${path}/image/sign1.gif">&nbsp; <a href="http://www.dangdang.com" target="_blank"><font color=""><font color="#FF6699">当当网</font></a><br><br>
				                    <img src="${path}/image/sign1.gif">&nbsp; <a href="http://www.amazon.cn/?tag=360daohang-23" target="_blank"><font color=""><font color="#FF6699">卓越亚马逊</font></a><br><br>
				                    <img src="${path}/image/sign1.gif">&nbsp; <a href="http://www.moonbasa.com/#cn=127&type=0&adsiteid=10000007" target="_blank"><font color=""><font color="#FF6699">梦芭莎</font></a><br><br>
				                    <img src="${path}/image/sign1.gif">&nbsp; <a href="http://www.yihaodian.com/product/index.do?tracker_u=7520169&merchant=1" target="_blank"><font color="#FF6699">1号店</font></a><br><br>
				                    <img src="${path}/image/sign1.gif">&nbsp; <a href="http://www.shangpin.com/se-bd-wb/index.aspx?serialno=88733872" target="_blank"><font color="#FF6699">尚品</font></a><br><br>
	           				 	</marquee>				 
	           				 </td>
	                	</tr>
	              	</table>
	             </td>
			</tr>
		</table>
		<!--end:左侧04-->
	</body>
</html>
