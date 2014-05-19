<%@ page contentType="text/html; charset=UTF-8" language="java" import="java.sql.*" errorPage="" %>
  <script Language="JavaScript">
 function quit() {
  if(confirm("确定要退出后台吗？")){
    window.location.href="../index.jsp";
	}
  }
 </script>
 
 
 
 
 
<table width="35" height="22" border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td><img src="image/bg_left01.jpg" width="170" height="45"></td>
      </tr>
    </table>
    
    
      <table width="170" height="46" border="0" cellpadding="0" cellspacing="0" background="image/bg_left02.jpg">
        <tr>
          <td><table width="120" border="0" align="center" cellpadding="0" cellspacing="0">
            <tr>
              <td width="120" height="17" align="center" valign="bottom"><div align="left"><a href="../PanBaoMing/bg-goodManage.jsp" class="a3">商品管理</a></div></td>
            </tr>
            <tr>
              <td height="17" align="center"><div align="left"><font color="#FFFFFF">Goods Manage</font></div></td>
            </tr>
          </table></td>
        </tr>
      </table>
      
      
       <table width="170" height="46" border="0" cellpadding="0" cellspacing="0" background="image/bg_left02.jpg">
        <tr>
          <td><table width="120" border="0" align="center" cellpadding="0" cellspacing="0">
            <tr>
              <td width="120" height="17" align="center" valign="bottom"><div align="left"><a href="../LiWei/bg-kindsmanage.jsp" class="a3">分类管理</a></div></td>
            </tr>
            <tr>
              <td height="17" align="center"><div align="left"><font color="#FFFFFF">Category Manage</font></div></td>
            </tr>
          </table></td>
        </tr>
      </table>
      
      <table width="170" height="46" border="0" cellpadding="0" cellspacing="0" background="image/bg_left02.jpg">
        <tr>
          <td><table width="120" border="0" align="center" cellpadding="0" cellspacing="0">
              <tr>
                <td width="120" height="17" align="center" valign="bottom"><div align="left"><a href="../PanBaoMing/bg-selectMember.jsp" class="a3">会员管理</a></div></td>
              </tr>
              <tr>
                <td height="17" align="center"><div align="left"><font color="#FFFFFF">Member Manage</font></div></td>
              </tr>
          </table></td>
        </tr>
      </table>
       

       <table width="170" height="46" border="0" cellpadding="0" cellspacing="0" background="image/bg_left02.jpg">
        <tr>
          <td><div align="left">
            <table width="120" border="0" align="center" cellpadding="0" cellspacing="0">
                <tr>
                  <td width="120" height="17" align="center" valign="bottom"><div align="left"><a href="bg-adminUpdatePassword.jsp" class="a3">修改密码</a></div></td>
                </tr>
                <tr>
                  <td height="17" align="center"><div align="left"><font color="#FFFFFF">Amend Password</font></div></td>
                </tr>
             </table>
          </div></td>
        </tr>
      </table>      
      
      
      <table width="170" height="46" border="0" cellpadding="0" cellspacing="0" background="image/bg_left02.jpg">
        <tr>
          <td><table width="120" border="0" align="center" cellpadding="0" cellspacing="0"> 
                                                                                
              <tr>
                <td width="120" height="17" align="center" valign="bottom"><div align="left"><a href="/MiaoMiao_gj3_g7/order.do?method=query_admin" class="a3">订单管理</a></div></td>
              </tr>
              <tr>
                <td height="17" align="center"><div align="left"><font color="#FFFFFF">Order Manage</font></div></td>
              </tr>
          </table></td>
        </tr>
      </table>
      
      
        <table width="170" height="46" border="0" cellpadding="0" cellspacing="0" background="image/bg_left02.jpg">
        <tr>
          <td><table width="120" border="0" align="center" cellpadding="0" cellspacing="0">
              <tr>
                <td width="120" height="17" align="center" valign="bottom"><div align="left"><a href="../LiWei/querybusiness.jsp" class="a3">销售统计</a></div></td>
              </tr>
              <tr>
                <td height="17" align="center"><div align="left"><font color="#FFFFFF">Sale Statistics</font></div></td>
              </tr>
          </table></td>
        </tr>
      </table>
      
      
      <table width="170" height="46" border="0" cellpadding="0" cellspacing="0" background="image/bg_left02.jpg">
        <tr>
          <td><table width="120" border="0" align="center" cellpadding="0" cellspacing="0">
              <tr>
                <td width="120" height="17" align="center" valign="bottom"><div align="left"><a href="/MiaoMiao_gj3_g7/info.do?method=aff_choice" class="a3">公告管理</a></div></td>
              </tr>
              <tr>
                <td height="17" align="center"><div align="left"><font color="#FFFFFF">Placard Manage</font></div></td>
              </tr>
          </table></td>
        </tr>
      </table>
      <table width="170" height="46" border="0" cellpadding="0" cellspacing="0" background="image/bg_left02.jpg">
        <tr>
          <td><table width="120" border="0" align="center" cellpadding="0" cellspacing="0">
              <tr>
                <td width="120" height="17" align="center" valign="bottom"><div align="left"><a href="/MiaoMiao_gj3_g7/info.do?method=info_query" class="a3">咨讯管理</a></div></td>
              </tr>
              <tr>
                <td height="17" align="center"><div align="left"><font color="#FFFFFF">Message Manage</font></div></td>
              </tr>
          </table></td>
        </tr>
      </table>
      <table width="170" height="47" border="0" cellpadding="0" cellspacing="0" background="image/bg_left03.jpg">
        <tr>
          <td><table width="120" border="0" align="center" cellpadding="0" cellspacing="0">
              <tr>
                <td width="120" height="17" align="center" valign="bottom"><div align="left"><a href="javascript:quit()" class="a3">安全退出</a></div></td>
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