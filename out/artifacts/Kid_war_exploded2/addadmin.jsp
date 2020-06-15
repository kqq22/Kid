<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/22
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<html>

<head>

    <meta http-equiv="Content-Language" content="zh-cn">
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
    <title>管理员-添加</title>
    <link rel="stylesheet" type="text/css" href="css/style_admin.css">

</head>

<body>
<form name="form1" action="addadmin" method="post">
    <table cellspacing="1" cellpadding="4" width="100%"
           class="tableborder" id="table3">

        <input type="hidden" name="action" value="save" />
        <tr>
            <td colspan="12" class="header">
                管理员-添加
            </td>
        </tr>
        <tr>
            <td class="altbg1">
                管理员名称：
            </td>
            <td class="altbg2" colspan="11">
                <input type="text" name="userName" size="34">
            </td>
        </tr>
        <tr>
            <td class="altbg1">
                密&nbsp; 码：
            </td>
            <td class="altbg2" colspan="11">
                <input type="password" name="password" size="34">
            </td>
        </tr>
        <tr>
            <td class="altbg1">
                确认密码：
            </td>
            <td class="altbg2" colspan="11">
                <input name="confirmpassword" size="34" type="password">
            </td>
        </tr>


        <tr>
            <td class="altbg1">
            </td>
            <td class="altbg2" colspan="11">
                <input type="submit" value="提交" name="B1"
                       onClick="return fun_check_form();">
                &nbsp;
                <input type="reset" value="重置" name="B2">
            </td>
        </tr>

    </table>
</form>
</body>

</html>

