<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>阿拉亲子</title>

<script type="text/javascript" src="Scripts/jquery1.42.min.js"></script>
<script language="javascript" type="text/javascript" src="Scripts/jquery.validate.js"></script>
<script language="javascript" type="text/javascript" src="Scripts/validate_expand.js"></script>
<script language="javascript" type="text/javascript" src="Scripts/validate.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	initValidator();
});
</script>
<link href="Content/regist.css" rel="stylesheet" type="text/css" />
</head>
<body>

<div class="content">
  <div class="demo">
  <div class="title"><img src="Picture/demo_03.jpg" /><p>账号注册</p>
  <div class="c"></div>
  </div>
	<form id="thisForm" method="post" action="registerDo">
	<table width="50%">
		<tr>
			<td class="tdcon"><span style="color:#F00;">*</span>用户名：</td>
			<td>
				<input class="stext" type='text' name="userName" id="userName" value="" />
				<div class="tipinfo"></div>
			</td>
		</tr>
		<tr>
			<td class="tdcon"><span style="color:#F00;">*</span>密码：</td>
			<td>
				<input class="stext" type="password" name="passWord" id="passWord" value="" />
				<div class="tipinfo"></div>
			</td>
		</tr>
		<tr>
			<td class="tdcon"><span style="color:#F00;">*</span>确认密码：</td>
			<td>
				<input class="stext" type='password' name="passWordAgain" id="passWordAgain" value="" />
				<div class="tipinfo"></div>
			</td>
		</tr>
		<tr>
			<td class="tdcon"><span style="color:#F00;">*</span>邮箱：</td>
			<td>
				<input class="stext" type='text' name="email" id="email" value="" />
				<div class="tipinfo"></div>
			</td>
		</tr>
		<tr>
			<td class="tdcon"><span style="color:#F00;">*</span>手机号码：</td>
			<td>
				<input class="stext" type='text' name="sms" id="sms" value="" />
				<div class="tipinfo"></div>
			</td>
		</tr>
		<tr>
			<td class="tdcon"><span style="color:#F00;">*</span>居住地：</td>
			<td>
				<select name="jzd" style=" width:150px; border-color:#ddd;">
				  <option>湖南省</option>
				  <option>湖北省</option>
				  <option>河南省</option>
				  <option>江苏省</option>
				  <option>广东省</option>
				</select>
				<div class="tipinfo"></div>
			</td>
		</tr>
        <tr>
			<td class="tdcon"><span style="color:#F00;">*</span>QQ：</td>
			<td>
				<input class="stext" name="qq" type='text' value="" />
				<div class="tipinfo"></div>
			</td>
		</tr>
        
        <tr >
			<td class="tdcon"><span style="color:#F00;">*</span>宝宝性别：</td>
			<td>
				<p >
				  <label style="padding-right:30px;">
				    <input type="radio" name="RadioGroup1" value="小王子" id="RadioGroup1_0" />
				    小王子</label>
				  <label style="padding-right:30px;">
				    <input type="radio" name="RadioGroup1" value="小公主" id="RadioGroup1_1" />
				    小公主</label>
				  <br />
			  </p>
<div class="tipinfo"></div>
		  </td>
		</tr>
        
        <tr>
			<td class="tdcon"><span style="color:#F00;">*</span>宝宝姓名：</td>
			<td>
				<input class="stext" name="bname" type='text' value="" />
				<div class="tipinfo"></div>
			</td>
		</tr>
        
        <tr >
			<td class="tdcon" colspan="2">
             <p class="clearfix agreement">
        	<input type="checkbox" />
            <b class="left" style="font-weight:normal;">我已经阅读并接受<a style=" color:#2ba0bb;">《阿拉亲子用户协议》</a></b>
        </p>
            </td>
			
		</tr>
        
        
		<tr>
			
            <td style="width:50px;"></td>
			<td id="submit"><input type="submit" value="立即注册" class="Button br" >
            </td>
            
		</tr>
	</table>
	</form>
    
    <div class="erweima">
    <p>已有阿拉亲子论坛账号？ <a href="denglu.jsp">立即登录</a></p>
    <img src="Picture/demo_07.png" width="170" height="170"/>
    <p>「最新资讯 请关注我们的微信号」</p>
    </div>
</div>

</div>
</body>
</html>