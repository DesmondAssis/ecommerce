<%@ page contentType="text/html; charset=utf-8" import="java.util.*"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>电子商城</title>

<script>
	var xmlhttp;
	function listSmall() {
		/*1.声明并创建XHR(XMLHttpRequest)对象*/
		if (window.ActiveXObject) {
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		//IE5.0+，其他浏览器
		else if (window.XMLHttpRequest) {
			xmlhttp = new XMLHttpRequest();
		} else {
			alert("该浏览器不支持Ajax技术");
		}

		/*2.与服务器器端建立连接(打开连接)*/
		var type = "post"; //设置客户端请求的提交方式
		var big = document.getElementById("big").value;
		//var url = "servlet/ZipServlet?zipcode="+zipcode;//设置要建立连接的web资源的路径
		var url = "servlet/SmallServlet";
		var sync = false;//设置通信的方式为异步/同步，同步为true，异步为false
		//打开与服务器端连接
		xmlhttp.open(type, url, sync);

		/*3.设置回调函数(ajax处理响应代码)*/
		xmlhttp.onreadystatechange = callback;

		/*4.发送请求*/
		xmlhttp.setRequestHeader("Content-Type",
				"application/x-www-form-urlencoded;charset=UTF-8");
		//xmlhttp.send(null);
		xmlhttp.send("big=" + big);

	}

	/*回调函数（处理响应信息代码）*/
	function callback() {

		//当交互完成时
		if (xmlhttp.readyState == 4) {
			//当响应状态为成功时，处理响应
			if (xmlhttp.status == 200) {
				//获取响应报文的内容
				var response = xmlhttp.responseXML;
				var rootNode = response.documentElement;//<cities></cities> 
				var childs = rootNode.childNodes;
				//获取城市下拉列表元素
				var smallSelect = document.getElementById("small");
				var options = smallSelect.options;
				options.length = 0;

				//动态生成下拉列表选项 
				for (var i = 0; i < childs.length; i++) {
					var cityNode = childs[i];
					var value = cityNode.firstChild.firstChild.nodeValue;
					var text = cityNode.childNodes[1].firstChild.nodeValue;
					//  alert(value);
					var option = new Option(text, value);//<option></option>
					//将下拉列表选项添加到下拉列表中
					options[i] = option;
				}

			}
		}

	}
</script>
<link href="css/css.css" rel="stylesheet" type="text/css">
</head>

<body background="image/bg1.jpg">
	<jsp:include page="jsp/fg-top.jsp" flush="true" />
	<table width="766" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td width="207" valign="top" bgcolor="#F5F5F5">
				<!--左侧01vvv--> <jsp:include page="jsp/fg-left.jsp" flush="true" /></td>
			<td width="560" valign="top" bgcolor="#FFFFFF">
				<!--右侧01--> <html:form action="lookgoods.do?method=query_goods">
					<table align="center">
						<tr>
							<td>【搜索 商品】 <input type="text" size="20" name="goods" />&nbsp;&nbsp;
								<select name="big" id="big" onchange="listSmall()">
									<option value="big">大类别</option>
									<option value="电器">电器类</option>
									<option value="服装">服装类</option>
									<option value="珠宝">珠宝类</option>
							</select> &nbsp;&nbsp; <select name="small" id="small">
									<option value="small">小类别</option>
							</select> &nbsp; <html:submit>搜索</html:submit>
							</td>
						</tr>
					</table>
				</html:form>
				<form method="post">
					<table width="550" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td colspan="3" background="image/bg_02.jpg" height="25">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;最新商品</td>
						</tr>
						<tr>
							<td align="center"><a href="LiXiaoChuan/fg-goodsContent.jsp">周大福宝宝系列</a></td>
							<td align="center"><a
								href="LiXiaoChuan/fg-goodsContent1.jsp">佰色天然珍珠耳钉</a></td>
							<td align="center"><a
								href="LiXiaoChuan/fg-goodsContent2.jsp">天然珍珠三件套</a></td>
						</tr>
						<tr>
							<td align="center"><a href="LiXiaoChuan/fg-goodsContent.jsp"><img
									src="image/11.jpg" alt="" title="" border="0" /></a></td>
							<td align="center"><a
								href="LiXiaoChuan/fg-goodsContent1.jsp"><img
									src="image/12.jpg" alt="" title="" border="0" /></a></td>
							<td align="center"><a
								href="LiXiaoChuan/fg-goodsContent2.jsp"><img
									src="image/13.jpg" alt="" title="" border="0" /></a></td>
						</tr>
						<tr>
							<td align="center"><img src="image/money2.jpg" width="20"
								height="20" alt="" title="" border="0" />520,00</td>
							<td align="center"><img src="image/money2.jpg" width="20"
								height="20" alt="" title="" border="0" />148,00</td>
							<td align="center"><img src="image/money2.jpg" width="20"
								height="20" alt="" title="" border="0" />560,00</td>
						</tr>
						<tr>
							<td align="center"><a href="LiWei/buyer.jsp"
								title="header=[Specials] body=[&nbsp;] fade=[on]"><img
									src="image/2.jpg" alt="" title="" border="0" class="left_bt" /></a></td>
							<td align="center"><a href="LiWei/buyer.jsp"
								title="header=[Specials] body=[&nbsp;] fade=[on]"><img
									src="image/2.jpg" alt="" title="" border="0" class="left_bt" /></a></td>
							<td align="center"><a href="LiWei/buyer.jsp"
								title="header=[Specials] body=[&nbsp;] fade=[on]"><img
									src="image/2.jpg" alt="" title="" border="0" class="left_bt" /></a></td>
						</tr>
						<tr>
							<td align="center"><a
								href="LiXiaoChuan/fg-goodsContent3.jsp">天珍珠胸针-飞逸-白</a></td>
							<td align="center"><a
								href="LiXiaoChuan/fg-goodsContent4.jsp">AMAZOW特供-钻石女戒</a></td>
							<td align="center"><a
								href="LiXiaoChuan/fg-goodsContent5.jsp">开光貔貅和田玉</a></td>
						</tr>
						<tr>
							<td align="center"><a
								href="LiXiaoChuan/fg-goodsContent3.jsp" class="prod_details"><img
									src="image/14.jpg" alt="" title="" border="0" /></a></td>
							<td align="center"><a
								href="LiXiaoChuan/fg-goodsContent4.jsp" class="prod_details"><img
									src="image/15.jpg" alt="" title="" border="0" /></a></td>
							<td align="center"><a
								href="LiXiaoChuan/fg-goodsContent5.jsp"><img
									src="image/16.jpg" alt="" title="" border="0" /></a></td>
						</tr>
						<tr>
							<td align="center"><img src="image/money2.jpg" width="20"
								height="20" alt="" title="" border="0" />268,00</td>
							<td align="center"><img src="image/money2.jpg" width="20"
								height="20" alt="" title="" border="0" />4,398,00</td>
							<td align="center"><img src="image/money2.jpg" width="20"
								height="20" alt="" title="" border="0" />1,300,00</td>
						</tr>
						<tr>
							<td align="center"><a href="LiWei/buyer.jsp"
								title="header=[Specials] body=[&nbsp;] fade=[on]"><img
									src="image/2.jpg" alt="" title="" border="0" class="left_bt" /></a></td>
							<td align="center"><a href="LiWei/buyer.jsp"
								title="header=[Specials] body=[&nbsp;] fade=[on]"><img
									src="image/2.jpg" alt="" title="" border="0" class="left_bt" /></a></td>
							<td align="center"><a href="LiWei/buyer.jsp"
								title="header=[Specials] body=[&nbsp;] fade=[on]"><img
									src="image/2.jpg" alt="" title="" border="0" class="left_bt" /></a></td>
						</tr>
						<tr>
							<td colspan="3" background="image/bg_02.jpg" height="25">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;推荐商品</td>
						</tr>
						<tr>
							<td align="center"><a
								href="LiXiaoChuan/fg-goodsContent6.jsp">脚链-施华洛世奇水晶</a></td>
							<td align="center"><a
								href="LiXiaoChuan/fg-goodsContent7.jsp">珂兰钻石吊坠</a></td>
							<td align="center"><a
								href="LiXiaoChuan/fg-goodsContent8.jsp">紫水晶手链</a></td>
						</tr>
						<tr>
							<td align="center"><a
								href="LiXiaoChuan/fg-goodsContent6.jsp"><img
									src="image/17.jpg" alt="" title="" border="0" /></a></td>
							<td align="center"><a
								href="LiXiaoChuan/fg-goodsContent7.jsp"><img
									src="image/18.jpg" alt="" title="" border="0" /></a></td>
							<td align="center"><a
								href="LiXiaoChuan/fg-goodsContent8.jsp"><img
									src="image/19.jpg" alt="" title="" border="0" /></a></td>
						</tr>
						<tr>
							<td align="center"><img src="image/money2.jpg" width="20"
								height="20" alt="" title="" border="0" />148,00</td>
							<td align="center"><img src="image/money2.jpg" width="20"
								height="20" alt="" title="" border="0" />4,998,00</td>
							<td align="center"><img src="image/money2.jpg" width="20"
								height="20" alt="" title="" border="0" />380,00</td>
						</tr>
						<tr>
							<td align="center"><a href="LiWei/buyer.jsp"
								title="header=[Specials] body=[&nbsp;] fade=[on]"><img
									src="image/2.jpg" alt="" title="" border="0" class="left_bt" /></a></td>
							<td align="center"><a href="LiWei/buyer.jsp"
								title="header=[Specials] body=[&nbsp;] fade=[on]"><img
									src="image/2.jpg" alt="" title="" border="0" class="left_bt" /></a></td>
							<td align="center"><a href="LiWei/buyer.jsp"
								title="header=[Specials] body=[&nbsp;] fade=[on]"><img
									src="image/2.jpg" alt="" title="" border="0" class="left_bt" /></a></td>
						</tr>
					</table>
				</form>

			</td>
		</tr>

	</table>

	<jsp:include page="jsp/fg-down.jsp" flush="true" />

</body>
</html>
