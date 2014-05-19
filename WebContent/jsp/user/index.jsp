<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>电子商城</title>
</head>
 <link href="../../css/css.css" rel="stylesheet" type="text/css"> 
<body>
<jsp:include page="fg-top.jsp" flush="true"/>
<table width="766" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td width="207" valign="top" bgcolor="#F5F5F5">
    <!--左侧01-->
    <jsp:include page="fg-left.jsp" flush="true"/></td>
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
       
       
</td>
  </tr>

</table>

	<jsp:include page="fg-down.jsp" flush="true"/>

</body>
</html>
