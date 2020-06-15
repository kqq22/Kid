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

<link rel="stylesheet" href="Content/hdzs.css" type="text/css" />
<script type="text/javascript" src="Scripts/common.min.js"></script>
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
                <li><a href="showticket?pageNum=1">票务</a></li>
                <li  class="wbg"><a href="show?pageNum=1">活动展示</a></li>
                <li><a>关于我们</a></li>
            </ul>
        </div>
<!--heder end-->
		
		<div class="banner">			
			<div class="bd">
				<ul class="fixed">
				<li style=" background:url(Images/index_02.png) 50% 0 no-repeat"><a href="cn/#"></a></li>
				<li style=" background:url(Images/index_01.png ) 50% 0 no-repeat"><a href="cn/#"></a></li>
				<li style=" background:url(Images/index_03.png) 50% 0 no-repeat"><a href="cn/#"></a></li>
				</ul>
			</div>
			<div class="hd"><ul class="fixed"><li class="on"></li><li class=""></li><li class=""></li></ul></div>
		</div>
		<script type="text/javascript">
			jQuery(".banner").slide({ titCell:".hd ul", mainCell:".bd ul", effect:"left", autoPage:"<li></li>", autoPlay:true, effect:"fold"})
		</script>
		<!--banner end-->
		
		<div class="main">
            
            <div class="hdzs">
            	<div class="title">
                    <p><i>S</i><b>活动展示</b><span>show</span></p>
                    </div>
                 	<ul class="hdzs-main" >
                        <!-- 循环开始 -->
                            <c:forEach items="${sessionScope.showList}" var="show" varStatus="st">
                                <li class="last">
                                    <a href=""><img src="${show.image}" width="236" height="185"/></a>
                                    <span>${show.topic}</span>
                                </li>
                            </c:forEach>

                        <!-- 循环结束 -->
							<div style="clear:both;"></div>		
					</ul>
                    <div class="page-normal">
                        第${sessionScope.pageNum}页（共${sessionScope.maxNum}页）
                        <a href="show?pageNum=${sessionScope.pageNum-1}">&lt;</a>
                        <a href="show?pageNum=1">首页</a>
                        <a href="show?pageNum=${sessionScope.maxNum}">尾页</a>
                        <a href="show?pageNum=${sessionScope.pageNum+1}" >&gt;</a>

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
<script id="jsID" type="text/javascript">
		 var ary = location.href.split("&");
		jQuery(".slideBox").slide( { mainCell:".bd ul", effect:ary[1],autoPlay:ary[2],trigger:ary[3],easing:ary[4],delayTime:ary[5],mouseOverStop:ary[6],pnLoop:ary[7] });
		</script>
      
</body></html>