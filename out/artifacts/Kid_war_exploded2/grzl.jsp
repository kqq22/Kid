<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<meta http-equiv=“X-UA-Compatible” content=“IE=EmulateIE7″>
<meta http-equiv=“X-UA-Compatible” content=“IE=8″>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />


<title>阿拉亲子</title>

<meta name="description" content="" />

<meta name="keywords" />

<link href="Content/ddxq.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="Scripts/public.js"></script>
<link href="Content/base.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="Scripts/jquery1.42.min.js"></script>
<script type="text/javascript" src="Scripts/popup_layer.js"></script>
<script type="text/javascript" src="Scripts/blk.js"></script>
</head>

<body style="background:#f9f9f9;">

<div class="logBox">
		<div class="login">
			<div class="siderNav">
				<ul class="topmenu" id="jq_topmenu">
                <li class="first"><a href="index.jsp">首页</a>|<a>关于我们</a></li>
              
				</ul>
			</div>
		</div>
</div>
<div class="main">
    <div class="search-box">
	 	<form class="search-form"  id="search-form">
	 		<input type="text" class="search-text br" id="search_input" autocomplete="off" placeholder="搜索"/>
	 		<input type="submit" class="search-button br" value=""/>
	 	</form>
        <div class="c"></div>
        </div>
<div class="demo">
		
		<div class="demo-left">
        <div class="demo-left-top">
        <p><img src="Picture/dingdan_03.jpg" /></p>
        <h3>${user.name}</h3>
        </div>
        	<ul>
            <li class=""><a href="grzl.jsp">我的资料</a></li>
            <li class=""><a href="order?pageNum=1">我的订单</a></li>
            <li class=""><a >意见反馈</a></li>		
            </ul>
        	</div>
        <div class="demo-right">
        <h2>个人资料</h2>
 <table width="400" border="0" class="demo-table">
  <tr>
    <td style="text-align:right">用户名</td>
    <td id="name">${user.name}</td>
  </tr>
  <tr>
    <td style="text-align:right">密码</td>
    <td id="pwd">${user.pwd}</td>
  </tr>
  <tr>
    <td style="text-align:right">手机号</td>
    <td>${user.phone}</td>
  </tr>
  <tr>
    <td style="text-align:right">邮箱</td>
    <td>${user.email}</td>

  </tr>
   <tr>
       <td align="center" colspan="3"><h2 class="title2"><a href="grzlDo.jsp">修改</a></h2></td>
   </tr>
</table>

<div class="tsgl-top" id="blk7" style="display:none;">
 <a id="close7" class="closeBtn br ">×</a>
   					<div class="tsgl-top-p1"><label><span class="p1-text">当前密码</span><input name="" type="text" placeholder="请输入当前密码"/></label></div>
<div class="tsgl-top-p1"><label><span class="p1-text">新密码</span><input name="" type="text" placeholder="请输入新密码" /></label></div>
                     <div class="tsgl-top-p1"><label><span class="p1-text">确认密码</span><input name="" type="text" placeholder="请再次输入密码"/></label></div>
                     
			<div class="c"></div>
				<a class="tijiao br">提交</a>
                
                    </div>
        </div>
            <div style="clear:both;"></div>
        </div>
     
</div>

</div>


<div class="footer-b">
        	<ul>
            	<li><a href="index.jsp">首页</a></li>
                <li><a href="qzhd.jsp">亲子活动</a></li>
                <li><a href="qzly.jsp">亲子旅游</a></li>
                <li><a href="index.jsp">区域活动</a></li>
                <li><a href="pw.jsp">票务</a></li>
                <li><a href="hdzs.jsp">活动展示</a></li>
                <div style="clear:both;"></div>
            </ul>
            <p>	COPYRIGHT&nbsp;&nbsp;&nbsp;2015-2016&nbsp;&nbsp;&nbsp;版权所有：阿拉亲子&nbsp;浙IPC备14003668号-2</p>
        </div>


</body>

</html>

