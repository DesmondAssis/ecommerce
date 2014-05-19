<%@ page contentType="text/html; charset=utf-8" %>
<html>
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
<form name="form4">
		<table align="center">
			<tr>
				<td>
					<select name="bigtype" onchange="getSmallType()">
					<option value="bigtype" selected="selected">商品类别</option>
					<option value="dq">电器类</option>
					<option value="fz">服装类</option>
					<option value="jj">家具类</option>
					</select>
					&nbsp;&nbsp;
					<select name="smalltype">
					<option value="smalltype" selected="selected">细分类别</option>
					</select>
					<input type="text" size="25" value="请输入您要查询的商品"/>&nbsp;&nbsp;<input type="submit" value="查询" onclick="window.location='#'"/>
				</td>
			</tr>
		</table>
	</form>
     <form method="post">
<table width="550" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td colspan="3" background="../image/bar_bg.gif" height="25">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;最新商品</td>
  </tr>
  <tr>
    <td align="center"><a href="details.html">Motorola 156 MX-VL</a></td>
    <td align="center"><a href="details.html">Iphone Apple</a></td>
    <td align="center"><a href="details.html">Samsung Webcam</a></td>
  </tr>
  <tr>
    <td align="center"><a href="details.html"><img src="../image/laptop.gif" alt="" title="" border="0" /></a></td>
    <td align="center"><a href="details.html"><img src="../image/p4.gif" alt="" title="" border="0" /></a></td>
    <td align="center"><a href="details.html"><img src="../image/p5.gif" alt="" title="" border="0" /></a></td>
  </tr>
  <tr>
    <td align="center">270</td>
    <td align="center">5000</td>
    <td align="center">240</td>
  </tr>
  <tr>
    <td align="center"><a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img src="../image/cart.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img src="../image/favs.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Gifts] body=[&nbsp;] fade=[on]"><img src="../image/favorites.gif" alt="" title="" border="0" class="left_bt" /></a>           
            <a href="details.html" class="prod_details">详细信息</a></td>
    <td align="center"><a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img src="../image/cart.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img src="../image/favs.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Gifts] body=[&nbsp;] fade=[on]"><img src="../image/favorites.gif" alt="" title="" border="0" class="left_bt" /></a>           
            <a href="details.html" class="prod_details">详细信息</a></td>
    <td align="center"><a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img src="../image/cart.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img src="../image/favs.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Gifts] body=[&nbsp;] fade=[on]"><img src="../image/favorites.gif" alt="" title="" border="0" class="left_bt" /></a>           
            <a href="details.html" class="prod_details">详细信息</a></td>
  </tr>
  <tr>
    <td align="center"><a href="#">TISSOT经典系列</a></td>
    <td align="center"><a href="#">克里斯汀·迪奥 真皮男士钱夹</a></td>
    <td align="center"><a href="details.html">皇威暖脚王H-401A</a></td>
  </tr>
  <tr>
    <td align="center"><a href="details.html"><img src="../image/4.jpg" alt="" title="" border="0" /></a></td>
    <td align="center"><a href="#"><img src="../image/1.jpg" alt="" title="" border="0" /></a></td>
    <td align="center"><a href="#"><img src="../image/5.jpg" alt="" title="" border="0" /></a></td>
  </tr>
  <tr>
    <td align="center">1,950,00</td>
    <td align="center">3,400</td>
    <td align="center">230</td>
  </tr>
  <tr>
    <td align="center"><a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img src="../image/cart.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img src="../image/favs.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Gifts] body=[&nbsp;] fade=[on]"><img src="../image/favorites.gif" alt="" title="" border="0" class="left_bt" /></a>           
            <a href="details.html" class="prod_details">详细信息</a></td>
    <td align="center"><a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img src="../image/cart.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img src="../image/favs.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Gifts] body=[&nbsp;] fade=[on]"><img src="../image/favorites.gif" alt="" title="" border="0" class="left_bt" /></a>           
            <a href="goods/Purse.jsp" class="prod_details">详细信息</a></td>
    <td align="center"><a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img src="../image/cart.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img src="../image/favs.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Gifts] body=[&nbsp;] fade=[on]"><img src="../image/favorites.gif" alt="" title="" border="0" class="left_bt" /></a>           
            <a href="goods/Watch.jsp" class="prod_details">详细信息</a></td>
  </tr>
  <tr>
    <td colspan="3" background="../image/bar_bg.gif" height="25">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;推荐商品</td>
  </tr>
  <tr>
    <td align="center"><a href="details.html">SAMSUNG三星</a></td>
    <td align="center"><a href="details.html">紫彩兰花礼品餐具</a></td>
    <td align="center"><a href="details.html">Hasbro终极擎天柱</a></td>
  </tr>
  <tr>
    <td align="center"><a href="details.html"><img src="../image/6.jpg" alt="" title="" border="0" /></a></td>
    <td align="center"><a href="details.html"><img src="../image/7.jpg" alt="" title="" border="0" /></a></td>
    <td align="center"><a href="details.html"><img src="../image/8.jpg" alt="" title="" border="0" /></a></td>
  </tr>
  <tr>
    <td align="center">4,999</td>
    <td align="center">315</td>
    <td align="center">899</td>
  </tr>
  <tr>
    <td align="center"><a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img src="../image/cart.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img src="../image/favs.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Gifts] body=[&nbsp;] fade=[on]"><img src="../image/favorites.gif" alt="" title="" border="0" class="left_bt" /></a>           
            <a href="details.html" class="prod_details">详细信息</a></td>
    <td align="center"><a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img src="../image/cart.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img src="../image/favs.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Gifts] body=[&nbsp;] fade=[on]"><img src="../image/favorites.gif" alt="" title="" border="0" class="left_bt" /></a>           
            <a href="details.html" class="prod_details">详细信息</a></td>
    <td align="center"><a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img src="../image/cart.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img src="../image/favs.gif" alt="" title="" border="0" class="left_bt" /></a>
            <a href="#" title="header=[Gifts] body=[&nbsp;] fade=[on]"><img src="../image/favorites.gif" alt="" title="" border="0" class="left_bt" /></a>           
            <a href="details.html" class="prod_details">详细信息</a></td>
  </tr>
</table>
</form>
     
       
       
  </td>
  </tr>

</table>

	<jsp:include page="fg-down.jsp" flush="true"/>

</body>
</html>