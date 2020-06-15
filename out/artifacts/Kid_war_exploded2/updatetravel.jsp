<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta http-equiv="Content-Language" content="zh-cn">
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
    <title>管理员-修改</title>
    <link rel="stylesheet" type="text/css" href="Content/style_admin.css">
</head>

<body>
<form name="form1" action="updatetravel" method="post">
    <table cellspacing="1" cellpadding="4" width="100%" class="tableborder"
           id="table3">

        <input type="hidden" name="action" value="save">
        <tr>
            <td colspan="12" class="header">修改旅游票信息</td>
        </tr>
        <tr>
            <td class="altbg1">票务主题：</td>
            <td class="altbg2" colspan="11"><input type="text" value="${sessionScope.findtravel.topic}" name="topic" size="34"></td>
        </tr>
        <tr>
            <td class="altbg1">出发地点：</td>
            <td class="altbg2" colspan="11"><input type="text" name="address" value="${sessionScope.findtravel.address}" size="34"></td>
        </tr>
        <tr>
            <td class="altbg1">年龄限制：</td>
            <td class="altbg2" colspan="11"><input type="text" name="age" value="${sessionScope.findtravel.age}" size="34"></td>
        </tr>
        <tr>
            <td class="altbg1">几日游类型：</td>
            <td class="altbg2" colspan="11"><input type="text" name="daytour" value="${sessionScope.findtravel.daytour}" size="34"></td>
        </tr>
        <tr>
            <td class="altbg1">票务价格：</td>
            <td class="altbg2" colspan="11"><input type="text" name="price" value="${sessionScope.findtravel.price}" size="34"></td>
        </tr>
        <tr>
            <td class="altbg1"></td>
            <td class="altbg2" colspan="11"><input type="submit" value="提交"
                                                   name="B1" /> &nbsp;</td>
        </tr>

    </table>
</form>
</body>

</html>
