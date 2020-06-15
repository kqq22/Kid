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

<link href="Content/wddd.css" rel="stylesheet" type="text/css" />

<link href="Content/base.css" rel="stylesheet" type="text/css" />
</head>
<style type="text/css">


.demo-right{width:80%; float:right; background:#fff;}
.tb-title{ height:50px;}
.tb-title1{ margin:0 auto;border-collapse:collapse; background:#FFF;}
.tb-title1 td{border:1px solid #ccc; }
.tb-title2{  line-height:40px; text-indent:20px; border-top:1px solid #ccc; border-left:1px solid #ccc;border-right:1px solid #ccc;width:100%; background:#f4f4f4; box-sizing:border-box;}
.tb-title2 span{ float:right; position:absolute; right:10px; position:relative;}
.demo-right table{ float:right;  }
.demo table tr td{text-align:center; padding:20px 0;}
.tb-min{width:780px; margin:0 auto; margin-top:10px;}
</style>
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
                <li class="title2"><a href="grzl.jsp">我的资料</a></li>
                <li class="title2"><a href="wddd.jsp">我的订单</a></li>
                <li class="title2"><a href="#">意见反馈</a></li>
            </ul>
        </div>

        <div class="demo-right">
            <div style="width:780px; margin:0 auto; padding-top:10px;">
                <table width="100%" border="0"  class="tb-title" style=" border-collapse:collapse;" >
                    <tr style=" background:#fef7ea; border:1px solid #fed89a;">
                        <th scope="col" width="40%">主题</th>
                        <th scope="col" width="17%">订购信息</th>
                        <th scope="col" width="8%">数量</th>
                        <th scope="col" width="20%" >实付款（元）</th>
                        <th scope="col" width="15%">交易状态</th>
                    </tr>
                </table>
            </div>
            <div style="clear:both;"></div>
            <div  class="tb-min" >

                <!-- 循环开始 -->
                <c:forEach items="${sessionScope.orderList}" var="order">
                <table width="100%" border="1"class="tb-title1" >
                    <tr><p class="tb-title2">${order.date}<span>订单号：${order.ordernumber}</span></p></tr>
                    <tr >
                        <td class="ddc" width="40%"><a>${order.topic}</a></td>
                        <td class="ddc" width="17%" ><p>${order.type}，${order.count}人，￥${order.price}/人</p></td>
                        <td class="ddc" width="8%" >${order.count}</td>
                        <td class="ddc" width="20%" >${order.totalprice}</td>
                        <td class="ddc" width="15%"><a href="orderdetails?orderid=${order.oid}"><p>交易完成</p><p>查看详情</p></a></td>
                    </tr>
                </table>
                </c:forEach>
                <!-- 循环结束 -->
            </div>
                <div style="clear:both;"></div>

            <div class="page-normal">
                第${sessionScope.pageNum}页（共${sessionScope.maxNum}页）
                <a href="order?pageNum=${sessionScope.pageNum-1}">&lt;</a>
                <a href="order?pageNum=1">首页</a>
                <a href="order?pageNum=${sessionScope.maxNum}">尾页</a>
                <a href="order?pageNum=${sessionScope.pageNum+1}" >&gt;</a>
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

