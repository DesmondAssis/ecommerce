<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>�����̳�</title>
</head>
 <link href="css/css.css" rel="stylesheet" type="text/css">
 <script type="text/javascript" src="js/validateorderform.js"></script>


<body background="image/bg1.jpg">
<jsp:include page="fg-top.jsp" flush="true"/>
<table width="766" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td width="207" valign="top" bgcolor="#F5F5F5">
    <!--���01-->
    <jsp:include page="fg-left.jsp" flush="true"/></td>
    <td width="559" valign="top" bgcolor="#FFFFFF">
    <!--�Ҳ�01-->		
    <div align="center">
       </div>
<center><table  width="558" border="0" cellpadding="0" cellspacing="0" background="image/bg_02.jpg">
			<tr height="25"><td align="center"><b>�����Ĳ�ѯ</b></td></tr>
			<tr>&nbsp;</tr></table></center>
			<center><form action="" method="post"> 
  <table border="0" cellpadding="0" cellspacing="0" width="570">
        <tr><td colspan="3" align="left"><b>�����ѯ������</b></td></tr><tr><td>�����ţ�<input type="text" name="listid"/></td>
                       <td>ʱ��Σ�
                 <select name="time">
                 <option value="" selected="selected">ȫ��</option>
                 <option value="14">2011.01-2011.04</option>
                 <option value="58">2011.05-2011.08</option>
				 <option value="912">2011.09-2011.12</option>
              </select></td><td colspan="2" align="center">
              <input type="submit" value="��ѯ"/></td></tr></table>   
     </form></center>
	  <form action="dmessage.jsp" method="post" name="f1">
<table width="570" border="1">
  <tr>
    <th scope="col">������</th>
    <th scope="col">��Ʒ����</th>
    <th scope="col">Ӧ�����</th>
    <th scope="col">����״̬</th>
    <th scope="col" >��ϸ��Ϣ</th>
  </tr>
  <tr align="center">
    <td>92</td>
    <td>2</td>
    <td>20.46</td>
    <td>��֧��</td>
    <td ><a href="dmessage.jsp"><img src="image/details.png"></a></td>
  </tr>
   <tr align="center">
    <td>11</td>
    <td>1</td>
    <td>5600</td>
    <td>�¶���</td>
    <td><img src="image/details.png"></td>
  </tr>
   <tr align="center">
    <td>56</td>
    <td>3</td>
    <td>280</td>
    <td>��֧��</td>
    <td><img src="image/details.png"></td>
  </tr>
   <tr align="center">
    <td colspan="5"><input type="button" value="��ҳ" onClick="getUsers(1)">
         <input type="button" value="��һҳ" id="pre" onClick="getUsers()">
         <input type="button" value="��һҳ" id="next" onClick="getUsers()">
         <input type="button" value="βҳ" onClick="getUsers()">
                  ��3����¼&nbsp;&nbsp;��ǰ1/1ҳ</td>
    
  </tr>
</table>
</form>
     
       
       
</td>
  </tr>

</table>

	<jsp:include page="fg-down.jsp" flush="true"/>

</body>
</html>
