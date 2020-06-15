<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta http-equiv="Content-Language" content="zh-cn">
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
    <title>管理员-修改</title>
    <link rel="stylesheet" type="text/css" href="Content/style_admin.css">
</head>

<body>
<form name="form1" action="updateaction" method="post">
    <table cellspacing="1" cellpadding="4" width="100%" class="tableborder"
           id="table3">

        <input type="hidden" name="action" value="save">
        <tr>
            <td colspan="12" class="header">修改活动票信息</td>
        </tr>
        <tr>
            <td class="altbg1">票务主题：</td>
            <td class="altbg2" colspan="11"><input type="text" value="${sessionScope.findaction.topic}" name="topic" size="34"></td>
        </tr>
        <tr>
            <td class="altbg1">票务状态：</td>
            <td class="altbg2" colspan="11"><input type="text" name="status" value="${sessionScope.findaction.status}" size="34"></td>
        </tr>
        <tr>
            <td class="altbg1">票务日期：</td>
            <td class="altbg2" colspan="11"><input type="text" name="date" value="${sessionScope.findaction.date}" size="34"></td>
        </tr>
        <tr>
            <td class="altbg1">票务价格：</td>
            <td class="altbg2" colspan="11"><input type="text" name="price" value="${sessionScope.findaction.price}" size="34"></td>
        </tr>
        <tr>
            <td class="altbg1"></td>
            <td class="altbg2" colspan="11"><input type="submit" value="提交" name="B1" /> &nbsp;</td>
        </tr>

    </table>
</form>
</body>

</html>
