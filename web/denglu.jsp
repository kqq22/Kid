﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<meta http-equiv=“X-UA-Compatible” content=“IE=EmulateIE7″>
<meta http-equiv=“X-UA-Compatible” content=“IE=8″>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>阿拉亲子</title>
<link href="Content/base.css" rel="stylesheet" type="text/css" />
<link href="Content/denglu.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="Scripts/jquery1.42.min.js"></script>
</head>
<body>
<div class="logBox">
		<div class="login">
			<div class="siderNav">
				<ul class="topmenu" id="jq_topmenu">
                <li class="first"><a href="index.jsp">首页</a>|<a>关于我们</a></li>
              
				</ul>
			</div>
		</div>
</div>
<div class="main-content">
	<div class="wrapper">
    <form id="signupForm" method="post" action="loginDo" class="zcform br">
    	<h2 class="title2">登录<a href="zhuce.jsp">立刻注册</a><a>没有注册&nbsp;？</a></h2>
        <p class="clearfix">
       <label>用户名：</label><input id="telphone" name="telphone" class="required"  /><a  style="padding-left:10px; line-height:22px;">注册</a>
        </p>
         <p class="clearfix">
           <label>密码：</label><input id="password" name="password" type="password" class=""  /><a style="padding-left:10px; line-height:22px;">找回密码</a>
        </p>
        <div class="clearfix question">
         <label >安全提问：</label><select size="1">
           <option selected="selected">安全提问(未设置请忽略)</option>
           <option>2</option>
           <option>3</option>
         </select>
            
      </div>
       
        <p class="clearfix agreement">
        	<input type="checkbox" />
            <b class="left" style="font-weight:normal;">自动登录</b>
        </p>
       	<p class="clearfix"><input class="submit br" type="submit" value="登录"/>
        </p>
        
    </form>
</div>


</div>
<div id="footer">
  <div style="clear:both;"></div>
  </div>

</body>
</html>
