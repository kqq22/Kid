<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>管理员-添加</title>
<link rel="stylesheet" type="text/css" href="Content/style_admin.css">
</head>

<body>
<form enctype="multipart/form-data" action="addshowticket" method="post">
<table cellspacing="1" cellpadding="4" width="100%" class="tableborder"
	id="table3">

	<input type="hidden" name="action" value="save">
	<tr>
		<td colspan="12" class="header">添加票务</td>
	</tr>
	<tr>
		<td class="altbg1">票务主题：</td>
		<td class="altbg2" colspan="11"><input type="text" name="topic" size="34"></td>
	</tr>

	<tr>
		<td class="altbg1">票务价格：</td>
		<td class="altbg2" colspan="11"><input type="text" name="price" size="34"></td>
	</tr>
	<tr>
		<td class="altbg1">门店价格：</td>
		<td class="altbg2" colspan="11"><input type="text" name="mprice" size="34" /></td>
	</tr>
	<tr>
		<td class="altbg1">票务图片：</td>
		<td class="altbg2" colspan="11"><input type="file" name="picture" size="34"></td>
	</tr>
	<tr>
		<td class="altbg1"></td>
		<td class="altbg2" colspan="11"><input type="submit" value="提交" name="B1" /> &nbsp;</td>
	</tr>

</table>
</form>
</body>

</html>
