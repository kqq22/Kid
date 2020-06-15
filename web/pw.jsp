<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv=“X-UA-Compatible” content=“IE=EmulateIE7″>
<meta http-equiv=“X-UA-Compatible” content=“IE=8″>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>阿拉亲子</title>

<link rel="stylesheet" href="Content/pw.css" type="text/css" />
<script type="text/javascript" src="Scripts/jquery1.42.min.js"></script>
<script type="text/javascript" src="Scripts/jquery.superslide.2.1.1.js"></script>
<script type="text/javascript" src="Scripts/public.js"></script>
</head>

<body>
	
	<div id="web">	
		
<div class="topall">
	<div class="top-line">
        <div class="top-line-box">
            <%@ include file="loginDo.jsp"%>
            <form class="search-form"  id="search-form">
                <input type="text" class="search-text" name="q" id="search_input" autocomplete="off" placeholder="请输入搜索关键字"/>
                <input type="submit" class="search-button" value=""/>
            </form>
        </div>
    </div>
    <div  style="clear:both;"></div>
  <div class="top">
  <img src="Picture/denglu_02.jpg" />
  <img src="Picture/index_03.jpg" style="float:right;" />
  </div>
</div>
        <div class="nav">
            <ul>
                <li><a href="index.jsp">首页</a></li>
                <li><a href="action?pageNum=1">亲子活动</a></li>
                <li><a href="travel?pageNum=1">亲子旅游</a></li>
                <li class="wbg"><a href="showticket?pageNum=1">票务</a></li>
                <li><a href="show?pageNum=1">活动展示</a></li>
                <li><a>关于我们</a></li>
            </ul>
        </div>
		
		<div class="main">
                 <div style=" clear:both;"></div>
			<div class="qzhd">
            <div class="qzhd-back">阿拉亲子&gt;票务</div>
				   <div class="qzhd-all">
                  <h2>您已选择：<span>共有<i>131</i>条活动信息</span></h2>
                  <div class="qzhd-all-d" ><p>区域：</p><a class="all-p-a">全部</a><a>宁波中心区</a><a>北仑区</a><a>慈溪</a><a>余姚</a><a>宁海</a><a>象山</a><a>奉化</a></div>
                  <div class="qzhd-all-d" ><p>商家活动：</p><a class="all-p-a">全部</a><a>户外亲子</a><a>室内亲子</a><a>亲子DIY</a><a>农家乐采摘</a><a>儿童剧</a></div>
                  <div  class="qzhd-all-d"><p>时间：</p><a class="all-p-a">全部</a><a>今天</a><a>最近一周</a><a>网期活动</a></div>
  					</div>
                    
                    
                    <ul class="pw-main" >
                        <!-- 循环开始 -->

                            <c:forEach items="${sessionScope.showTicketList}" var="showTicket" varStatus="st">
                                <li><a href="ticket3?topicpw=${showTicket.topic}"><img src="${showTicket.image}"  width="322" height="247"/></a>					                                    <div class="pw-li-t">
                                    <p>${showTicket.topic}</p>
                                    <a><b>￥</b>${showTicket.price}</a>
                                    <span>门店价<b>￥${showTicket.mprice}</b></span>
                                    <div class="pw-li-t-d">
                                        立即购买&gt;&gt;
                                    </div>
                                </div>
                                </li>
                            </c:forEach>

                        <!-- 循环结束 -->
							<div style="clear:both;"></div>		
					</ul>
                    <div class="page-normal">
                        第${sessionScope.pageNum}页（共${sessionScope.maxNum}页）
                        <a href="showticket?pageNum=${sessionScope.pageNum-1}">&lt;</a>
                        <a href="showticket?pageNum=1">首页</a>
                        <a href="showticket?pageNum=${sessionScope.maxNum}">尾页</a>
                        <a href="showticket?pageNum=${sessionScope.pageNum+1}" >&gt;</a>
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


		
	</div>

</body></html>