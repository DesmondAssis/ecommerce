<%@ page contentType="text/html; charset=utf-8" import="java.util.*"%>
<%@ page import="com.miaomiao.bean.CommentBean"%>
<%@ page import="com.miaomiao.bean.PageBean"%>
<%@ page import="com.miaomiao.bean.GoodsBean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html:html>
   <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>电子商城</title>

   </head>
 <script language="javascript">
 
   function checkEmptyForm(){

   form = document.forms[0];
   if(form.cf.commentContent.value==""){
   alert("kong");
   }
   
   for(i=0;i<form.length;i++){
        if(form.elements[i].value==""){
            alert(form.elements[i].title);
            form.elements[i].focus();
          return false;
         }
    }
}

 
  
</script>
<body background="image/bg1.jpg">
    <jsp:include page="../front/fg-top.jsp" flush="true"/>

      <table width="766" border="0" align="center" cellpadding="0" cellspacing="0">
         <tr>
             <td width="207" valign="top" bgcolor="#F5F5F5">
             <!--左侧01-->
             <jsp:include page="../front/fg-left.jsp" flush="true"/></td>
             <td width="559" valign="top" bgcolor="#FFFFFF">
             <!--右侧01-->		

         

          <br/>
       <div align="center">
               <p class="style1"><font size="3">商品详情</font></p>
       </div>
   
   
   
     <table width="530" height="182"  border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolorlight="#FFFFFF" bordercolordark="#819BBC">
            <tr>
                <td width="200" rowspan="5" height="165"  align="center">
                    <input name="pricture" type="image" src='${gBean.goodsImage}'>
	            </td>
				<td><table width="311" height="168" border="1">
                  <tr >
                    <td width="101" height="27">商品名：</td>
                    <td width="194"><bean:write name="gBean" property="goodsName"/></td>
                  </tr>
                  <tr>
                    <td height="27">商品大分类：</td>
                    <td><bean:write name="gBean" property="goodsBigType"/></td>
                  </tr>
                  

                  <tr>
                    <td height="27">商品小分类：</td>
                    <td><bean:write name="gBean" property="goodsClass"/></td>
                  </tr>
                  <tr>
                    <td height="27">单价：</td>
                    <td><bean:write name="gBean" property="goodsPrice"/>元</td>
                  </tr>
                  <tr>
                    <td height="27">剩余数量：</td>
                    <td>
                    <bean:write name="gBean" property="goodsRemain"/> <bean:write name="gBean" property="goodsUnit"/> 
                    </td>
                  </tr>
                  
                  <tr>
                    <td height="30">是否推荐</td>
                    <td>
                       <logic:equal name="gBean" property="isRecommand" value="0">否</logic:equal>
                     <logic:equal name="gBean" property="isRecommand" value="1">是</logic:equal>
               
                    </td>
                  </tr>
                  
                  <tr>
                      <td>
                             商品描述
                         
                      </td>
                      <td > 
                      <textarea rows="3" cols="20" disabled="disabled" onclick="alert('此文本框只读,不能修改')">
                         <bean:write name="gBean" property="describe"/>
                      </textarea>
                      </td>
                 </tr> 
                </table></td>
           </tr>
        
            
		   
		   
     </table>
<br/><br/>

  <!-- 评论-->
  <table width="530" border="1" align="center">
   <caption>商品品论</caption>
   <logic:empty name="pageInfo">
        <tr>
            <td colspan="2" align="center">暂无评论！</td>
        </tr> 
   </logic:empty>
   <logic:notEmpty name="pageInfo">
       <logic:iterate id="cBean" collection="${pageInfo.commentList}" >
  
      <tr>
         <td width="350"><bean:write name="cBean" property="commentContent"/></td>
          <td width="157"><bean:write name="cBean" property="userName"/></td>
      </tr>
      </logic:iterate>
   </logic:notEmpty>
    
    
  </table>

<!--分页 -->
       <center> ${pageInfo.printCtr}</center>
  
   <br/>
   <!-- 评论框-->
   <center>发表评论</center>
   <html:form action="lookgoods.do?method=add_Comment" onsubmit='return checkEmptyForm()'>
       <table width="530" border="1" align="center">
  
	
	
    <tr>
       <td height="79" colspan="2" align="center">
           <label>
              <html:textarea property="cf.commentContent"  rows="5" cols="60" title="请输入评论内容"></html:textarea>
              <html:hidden property="cf.userName" value="user"/>
               <html:hidden property="cf.goodsId" value="${gBean.goodsId}"/>
              <input type="hidden" name="id" value="${gBean.goodsId}" />
           </label>
       </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
	     <html:submit>提交</html:submit>
	  </td>
      
    </tr>
  </table>
    </html:form>
  
  <p>&nbsp;</p>
  <p>&nbsp; </p>

       
       
</td>
  </tr>

</table>

	<jsp:include page="../front/fg-down.jsp" flush="true"/>

</body>
</html:html>
