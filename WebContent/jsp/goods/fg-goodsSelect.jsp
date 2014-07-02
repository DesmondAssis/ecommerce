<%@ page contentType="text/html; charset=utf-8" import="java.util.*"%>
<%@ page import="com.miaomiao.bean.GoodsBean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'fg-goodsSelect.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
   
 
   <link href="css/css.css" rel="stylesheet" type="text/css"> 
  
  </head>
  <jsp:useBean id="pagination" class="com.miaomiao.utils.MyPagination" scope="session"/>
 <%
   String str=request.getParameter("Page");
   int Page=1;
   List list =null;
   
   if(str==null){//第一次访问
   int pagesize=2;//每页显示7条记录
   list = (List)request.getAttribute("goodslist");//获取记录
   list = pagination.getInitPage(list,Page,pagesize);//初始化分页信息
   }else{//非第一次访问
    Page = pagination.getPage(str);
    list=pagination.getAppointPage(Page);//获取指定页的数据
   }
  %>
 
  <body>
      
      
       <jsp:include page="../front/fg-top.jsp" flush="true"/>
<table width="766" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td width="207" valign="top" bgcolor="#F5F5F5">
    <!--左侧01-->
    <jsp:include page="../front/fg-left.jsp" flush="true"/></td>
    <td width="560" valign="top" bgcolor="#FFFFFF"> 
    <!--右侧01-->		
     <form name="form4" action="LiXiaoChuan/fg-goodsResults.jsp">
		<table align="center">
			<a href="index.jsp">返回</a>
		</table>
	</form>
	
   
     <!-- 查询到的商品列表 -->
      <table width="530" height="283" border="0" cellpadding="0" cellspacing="0">
       <tr>
          <td height="28"colspan="2"  align="center" background="image/bg_02.jpg" height="30"><strong>商品信息如下</strong></td>
       </tr>
       <br/>
       
      <%
               if(pagination.getRecordSize()<=0){//如果有记录
             %>
	       <tr>
	         <td colspan="2" align="center">记录为空！</td>
	       </tr>
	      <%} else{%> 
	   <!--商品列表 -->
	   <logic:iterate id="goodsBean" collection="<%=list%>" indexId="number">
	     
	    
	    
       <tr >
	         <td width="217" height="239" >
			      <input name="pricture" type="image" src="<bean:write name="goodsBean" property="goodsImage"/>" width="200" height="165">			 
		     </td>
			 <td width="333">
		
			 
		       <table width="310" border="1" align="center">
                      <tr align="center">
                        <td width="100" height="35" >商品名：</td>
                        <td width="210"><bean:write name="goodsBean" property="goodsName"/></td>
                      </tr>
                      <tr align="center">
                           <td height="35" >大分类：</td>
                           <td><bean:write name="goodsBean" property="goodsBigType"/></td>
                      </tr>
                      <tr align="center">
                           <td height="35">小分类：</td>
                           <td><bean:write name="goodsBean" property="goodsClass"/></td>
                      </tr>
                      <tr align="center">
                           <td height="35" >单价：</td>
                           <td><bean:write name="goodsBean" property="goodsPrice"/>元</td>
                      </tr>
                      <tr align="center">
                           <td height="35">剩余数量:</td>
                          <td><bean:write name="goodsBean" property="goodsRemain"/>:<bean:write name="goodsBean" property="goodsUnit"/></td>
                      </tr>
                      <tr align="center">
                        <td height="35" colspan="2">
                              <a href='lookgoods.do?method=query_Cotenet&id=<bean:write name="goodsBean" property="goodsId"/>'> 
                                       查看商品详细信息
                             </a>
					    </td>
                        
                      </tr>
               </table>
			 </td>
	   </tr>
	  
	   <tr>
	       <td height="10"colspan="2" background="image/bg_02.jpg"></td>
	   </tr>
	  
	   </logic:iterate>
	  
	    
	   
	     <%=pagination.printCtrl(Page,"lookgoods.do?method=query_goods") %>
     
             <%} %>
    
            
    </table>
  
       
</td>
  </tr>

</table>

	<jsp:include page="../front/fg-down.jsp" flush="true"/>
       
  </body>
</html>
