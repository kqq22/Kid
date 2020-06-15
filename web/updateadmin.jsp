<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta http-equiv="Content-Language" content="zh-cn">
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
    <title>管理员-修改</title>
    <link rel="stylesheet" type="text/css" href="Content/style_admin.css">
</head>

<body>
<form name="form1" action="updateadmin" method="post">
    <table cellspacing="1" cellpadding="4" width="100%" class="tableborder"
           id="table3">

        <input type="hidden" name="action" value="save">
        <tr>
            <td colspan="12" class="header">修改管理员信息</td>
        </tr>
        <tr>
            <td class="altbg1">管理员名称：</td>
            <td class="altbg2" colspan="11"><input type="text" value="${sessionScope.findadmin.name}" name="name" size="34"></td>
        </tr>
        <tr>
            <td class="altbg1">管理员密码：</td>
            <td class="altbg2" colspan="11"><input type="password" name="pwd" value="${sessionScope.findadmin.pwd}" size="34"></td>
        </tr>
        <tr>
            <td class="altbg1"></td>
            <td class="altbg2" colspan="11"><input type="submit" value="提交" name="B1" /> &nbsp;</td>
        </tr>

    </table>
</form>
</body>

</html>
