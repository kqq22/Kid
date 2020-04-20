<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
            <li class="title2-on"><a href="wddd.jsp">我的订单</a></li>
            <li class=""><a >意见反馈</a></li>		
            </ul>
        	</div>
        <div class="demo-right">
        <h2>订单详情</h2>
            <!-- 循环开始 -->
            <c:forEach items="${sessionScope.orderdetailsList}" var="orderdetails" varStatus="st">
                <div class="demo-right-tb">
                    <div class="demo-right-th">
                        <p>${orderdetails.topic}<span><img src="Picture/sc_03.jpg" /></span></p>
                    </div>
                    <div class="demo-right-tr">
                        <p class="demo-right-s1">目的地：${orderdetails.address}</p>
                        <p class="demo-right-s2">联系人信息</p>
                        <div style="clear:both;"></div>
                    </div>
                    <div style="clear:both;"></div>
                    <div class="demo-right-tr">
                        <p class="demo-right-s1">出行方式：${orderdetails.gotype}</p>
                        <p class="demo-right-s2">姓名：${orderdetails.name}</p>
                        <div style="clear:both;"></div>
                    </div>
                    <div style="clear:both;"></div>
                    <div class="demo-right-tr">
                        <p class="demo-right-s1">订购信息：${orderdetails.type}，${orderdetails.count}人，￥${orderdetails.price}/人</p>
                        <p class="demo-right-s2">手机号：${orderdetails.phone}</p>
                        <div style="clear:both;"></div>
                    </div>
                    <div style="clear:both;"></div>
                    <div class="demo-right-tr">
                        <p class="demo-right-s2">备注：无</p>
                        <div style="clear:both;"></div>
                    </div>
                    <div class="demo-right-tr">
                        <p class="demo-right-s1 demo-right-last1">
                            <span>实际付款：￥<b>${orderdetails.totalprice}</b></span>
                        </p>
                        <p class="demo-right-s2 demo-right-last2"></p>
                        <div style="clear:both;"></div>
                    </div>
                </div>
            </c:forEach>

            <!-- 循环结束 -->
        </div>
            <div style="clear:both;"></div>
        </div>
     
</div>

</div>


<div class="footer-b">
        	<ul>
            	<li><a href="index.html">首页</a></li>
                <li><a href="qzhd.html">亲子活动</a></li>
                <li><a href="qzly.html">亲子旅游</a></li>
                <li><a href="index.html">区域活动</a></li>
                <li><a href="pw.html">票务</a></li>
                <li><a href="hdzs.html">活动展示</a></li>
                <div style="clear:both;"></div>
            </ul>
            <p>	COPYRIGHT&nbsp;&nbsp;&nbsp;2015-2016&nbsp;&nbsp;&nbsp;版权所有：阿拉亲子&nbsp;浙IPC备14003668号-2</p>
        </div>


</body>

</html>

