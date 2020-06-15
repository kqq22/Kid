<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv=“X-UA-Compatible” content=“IE=EmulateIE7″>
	<meta http-equiv=“X-UA-Compatible” content=“IE=8″>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>管理员-添加</title>
<link rel="stylesheet" type="text/css" href="Content/style_admin.css">
</head>

<body>
<form enctype="multipart/form-data" action="addaction" method="post">
<table cellspacing="1" cellpadding="4" width="100%" class="tableborder"
	id="table3">

	<input type="hidden" name="action" value="save">
	<tr>
		<td colspan="12" class="header">添加活动票</td>
	</tr>
	<tr>
		<td class="altbg1">票务主题：</td>
		<td class="altbg2" colspan="11"><input type="text" name="topic" size="34"></td>
	</tr>
	<tr>
		<td class="altbg1">票务状态：</td>
		<td class="altbg2" colspan="11"><input type="text" name="status" size="34"></td>
	</tr>
	<tr>
		<td class="altbg1">票务价格：</td>
		<td class="altbg2" colspan="11"><input type="text" name="price" size="34"></td>
	</tr>
	<tr>
		<td class="altbg1">票务时间：</td>
		<td class="altbg2" colspan="11"><input type="text" name="date" size="34"></td>
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
