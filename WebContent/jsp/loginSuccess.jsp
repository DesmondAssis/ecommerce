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
    <td colspan="3" background="image/bg_02.jpg" height="25">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;最新商品</td>
  </tr>
  <tr>
    <td align="center"><a href="LiXiaoChuan/fg-goodsContent.jsp">周大福宝宝系列</a></td>
    <td align="center"><a href="LiXiaoChuan/fg-goodsContent1.jsp">佰色天然珍珠耳钉</a></td>
    <td align="center"><a href="LiXiaoChuan/fg-goodsContent2.jsp">天然珍珠三件套</a></td>
  </tr>
  <tr>
    <td align="center"><a href="LiXiaoChuan/fg-goodsContent.jsp"><img src="image/11.jpg" alt="" title="" border="0" /></a></td>
    <td align="center"><a href="LiXiaoChuan/fg-goodsContent1.jsp"><img src="image/12.jpg" alt="" title="" border="0" /></a></td>
    <td align="center"><a href="LiXiaoChuan/fg-goodsContent2.jsp"><img src="image/13.jpg" alt="" title="" border="0" /></a></td>
  </tr>
  <tr>
    <td align="center"><img src="image/money2.jpg" width="20" height="20" alt="" title="" border="0" />520,00</td>
    <td align="center"><img src="image/money2.jpg" width="20" height="20" alt="" title="" border="0" />148,00</td>
    <td align="center"><img src="image/money2.jpg" width="20" height="20" alt="" title="" border="0" />560,00</td>
  </tr>
  <tr>
     <td align="center">
        <a href="LiWei/buyer.jsp" title="header=[Specials] body=[&nbsp;] fade=[on]"><img src="image/2.jpg" alt="" title="" border="0" class="left_bt" /></a></td>
	 <td align="center">
        <a href="LiWei/buyer.jsp" title="header=[Specials] body=[&nbsp;] fade=[on]"><img src="image/2.jpg" alt="" title="" border="0" class="left_bt" /></a></td>
	 <td align="center">
        <a href="LiWei/buyer.jsp" title="header=[Specials] body=[&nbsp;] fade=[on]"><img src="image/2.jpg" alt="" title="" border="0" class="left_bt" /></a></td>
  </tr>
  <tr>
    <td align="center"><a href="LiXiaoChuan/fg-goodsContent3.jsp">天珍珠胸针-飞逸-白</a></td>
    <td align="center"><a href="LiXiaoChuan/fg-goodsContent4.jsp">AMAZOW特供-钻石女戒</a></td>
    <td align="center"><a href="LiXiaoChuan/fg-goodsContent5.jsp">开光貔貅和田玉</a></td>
  </tr>
  <tr>
    <td align="center"><a href="LiXiaoChuan/fg-goodsContent3.jsp" class="prod_details"><img src="image/14.jpg" alt="" title="" border="0" /></a></td>
    <td align="center"><a href="LiXiaoChuan/fg-goodsContent4.jsp" class="prod_details"><img src="image/15.jpg" alt="" title="" border="0" /></a></td>
    <td align="center"><a href="LiXiaoChuan/fg-goodsContent5.jsp"><img src="image/16.jpg" alt="" title="" border="0" /></a></td>
  </tr>
  <tr>
    <td align="center"><img src="image/money2.jpg" width="20" height="20" alt="" title="" border="0" />268,00</td>
    <td align="center"><img src="image/money2.jpg" width="20" height="20" alt="" title="" border="0" />4,398,00</td>
    <td align="center"><img src="image/money2.jpg" width="20" height="20" alt="" title="" border="0" />1,300,00</td>
  </tr>
 <tr>
     <td align="center">
        <a href="LiWei/buyer.jsp" title="header=[Specials] body=[&nbsp;] fade=[on]"><img src="image/2.jpg" alt="" title="" border="0" class="left_bt" /></a></td>
	 <td align="center">
        <a href="LiWei/buyer.jsp" title="header=[Specials] body=[&nbsp;] fade=[on]"><img src="image/2.jpg" alt="" title="" border="0" class="left_bt" /></a></td>
	 <td align="center">
        <a href="LiWei/buyer.jsp" title="header=[Specials] body=[&nbsp;] fade=[on]"><img src="image/2.jpg" alt="" title="" border="0" class="left_bt" /></a></td>
  </tr>
  <tr>
    <td colspan="3" background="image/bg_02.jpg" height="25">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;推荐商品</td>
  </tr>
  <tr>
    <td align="center"><a href="LiXiaoChuan/fg-goodsContent6.jsp">脚链-施华洛世奇水晶</a></td>
    <td align="center"><a href="LiXiaoChuan/fg-goodsContent7.jsp">珂兰钻石吊坠</a></td>
    <td align="center"><a href="LiXiaoChuan/fg-goodsContent8.jsp">紫水晶手链</a></td>
  </tr>
  <tr>
    <td align="center"><a href="LiXiaoChuan/fg-goodsContent6.jsp"><img src="image/17.jpg" alt="" title="" border="0" /></a></td>
    <td align="center"><a href="LiXiaoChuan/fg-goodsContent7.jsp"><img src="image/18.jpg" alt="" title="" border="0" /></a></td>
    <td align="center"><a href="LiXiaoChuan/fg-goodsContent8.jsp"><img src="image/19.jpg" alt="" title="" border="0" /></a></td>
  </tr>
  <tr>
    <td align="center"><img src="image/money2.jpg" width="20" height="20" alt="" title="" border="0" />148,00</td>
    <td align="center"><img src="image/money2.jpg" width="20" height="20" alt="" title="" border="0" />4,998,00</td>
    <td align="center"><img src="image/money2.jpg" width="20" height="20" alt="" title="" border="0" />380,00</td>
  </tr>
 <tr>
     <td align="center">
        <a href="LiWei/buyer.jsp" title="header=[Specials] body=[&nbsp;] fade=[on]"><img src="image/2.jpg" alt="" title="" border="0" class="left_bt" /></a></td>
	 <td align="center">
        <a href="LiWei/buyer.jsp" title="header=[Specials] body=[&nbsp;] fade=[on]"><img src="image/2.jpg" alt="" title="" border="0" class="left_bt" /></a></td>
	 <td align="center">
        <a href="LiWei/buyer.jsp" title="header=[Specials] body=[&nbsp;] fade=[on]"><img src="image/2.jpg" alt="" title="" border="0" class="left_bt" /></a></td>
  </tr>
</table>
</form>

     
            
</td>
  </tr>

</table>

	<jsp:include page="fg-down.jsp" flush="true"/>

</body>
</html>
