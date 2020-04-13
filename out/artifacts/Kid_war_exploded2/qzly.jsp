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

<link rel="stylesheet" href="Content/qzly-1.css" type="text/css" />
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
                <li  class="wbg"><a href="travel?pageNum=1">亲子旅游</a></li>
                <li><a href="showticket?pageNum=1">票务</a></li>
                <li ><a href="show?pageNum=1">活动展示</a></li>
                <li><a>关于我们</a></li>
            </ul>
        </div>

		<div class="main">
            <div class="qzly">
            	<div class="title">
                    <p><i>T</i><b>亲子旅游</b><span>tourism</span></p>
                    
                    </div>
                    <div class="qzly-main">
                    	<div class="content2-main">
			<div class="hd">


				<ul>
                <li><a href="travel">全部</a></li>
                <li><a href="travel?dayTour=一日游">一日游</a></li>
                <li><a href="travel?dayTour=二日游">二日游</a></li>
                <li><a href="travel?dayTour=周边游">周边游</a></li>
                <li><a href="travel?dayTour=国内游">国内游</a></li>
                <li><a href="travel?dayTour=境外游">境外游</a></li>
                </ul>
			</div>
			<div class="bd">
				<ul>
                    <!-- 循环开始 -->

                    <c:forEach items="${sessionScope.travelList}" var="travel" varStatus="st">
                        <li class="last"><a href="ticket2?topicly=${travel.topic}"><img src="${travel.image}" width="205"  height="138"/></a>
                            <div>
                                <b>${travel.topic}</b>
                                <span>地址：${travel.address}</span>
                                <span>费用：${travel.price}元</span>
                                <span>年龄：${travel.age}岁以上</span>
                            </div>
                        </li>
                    </c:forEach>

                    <!-- 循环结束 -->
                    <div style="clear:both;"></div>
                    <div class="page-normal">
                        第${sessionScope.pageNum}页（共${sessionScope.maxNum}页）
                        <a href="travel?pageNum=${sessionScope.pageNum-1}">&lt;</a>
                        <a href="travel?pageNum=1">首页</a>
                        <a href="travel?pageNum=${sessionScope.maxNum}">尾页</a>
                        <a href="travel?pageNum=${sessionScope.pageNum+1}" >&gt;</a>
            		</div>
                   
				</ul>
			</div>
		</div>
        <div style="clear:both;"></div>
                    </div>
            </div>
            
            
            
		</div>
		<!--main end-->
		
	<!--footer end-->
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
<script>$(".top-line-box a").click(function(){
	  	$(this).siblings().removeClass('top-line-a-on');
			$(this).addClass("top-line-a-on");
        });</script>


</body></html>