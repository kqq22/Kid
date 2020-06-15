<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@include file="loginControl.jsp"%>
<head>
    <meta http-equiv=“X-UA-Compatible” content=“IE=EmulateIE7″>
    <meta http-equiv=“X-UA-Compatible” content=“IE=8″>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

        <title>阿拉亲子</title>

        <link rel="stylesheet" href="Content/qzhd-1.css" type="text/css" />

        <script type="text/javascript" src="Scripts/jquery1.42.min.js"></script>
        <script type="text/javascript" src="Scripts/jquery.superslide.2.1.1.js"></script>
        <script type="text/javascript" src="Scripts/public.js"></script>
        <script type="text/javascript" src="Scripts/jquery.spinner.js"></script>

        <script type="text/javascript">

            jQuery(".content2-main").slide({trigger:"click"});

            //这里是给了购买这个按钮一个点击事件
            /*$(".goumai").click(function(){
                //这里是获取class为Spinner的div元素里所有的input元素的值
                var count = $("div[class=Spinner] :input").val();
                document.getElementById("sel").innerHTML="获取到的值:'"+count+"'";
            });*/

            function getCount(){
                //这里是获取class为Spinner的div元素里所有的input元素的值
                var count = $("div[class=Spinner] :input").val();
                document.getElementById("sel").value=" ";
                document.getElementById("sel").value = count;
                //document.getElementById("sel").innerHTML=""+count+"";
            }
            setInterval(getCount,1);
        </script>
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
            <li  class="wbg"><a href="showticket?pageNum=1">票务</a></li>
            <li ><a href="show?pageNum=1">活动展示</a></li>
            <li><a>关于我们</a></li>
        </ul>
    </div>
    <div class="main">
        <form action="buyticketpw" method="post">
    <!-- 循环开始 -->
        <c:forEach items="${sessionScope.ticketpwList}" var="ticketpw" varStatus="st">
            <div class="main-top" >
                <h2>${ticketpw.topic}</h2>
                <div id="demo1" class="picBtnTop">
                    <div class="hd">
                        <ul>
                            <li><img src="Picture/pw-2.jpg" /></li>
                            <li><img src="Picture/pw-3.jpg" /></li>
                            <li><img src="Picture/pw-4.jpg" /></li>
                        </ul>
                    </div>
                    <div class="bd">
                        <ul>
                            <li>

                                <div class="pic"><a href=""><img src="Picture/pw-2.jpg" /></a></div>

                            </li>
                            <li>

                                <div class="pic"><a href=""><img src="Picture/pw-3.jpg" /></a></div>

                            </li>
                            <li>

                                <div class="pic"><a href=""><img src="Picture/pw-4.jpg" /></a></div>

                            </li>
                        </ul>
                    </div>
                </div>
                <div class="table-right">
                    <h1><b>￥</b>${ticketpw.price}</h1>
                    <span>推荐理由：北仑凤凰山海港乐园是全国第一个沉浸式体感交互主题乐园，是全国最高端的高科技乐园，超越你的想象</span>
                    <span><img src="Picture/hd-n_06.jpg" />${ticketpw.paddress}<i style="font-style:normal; padding-left:50px;"><img src="Picture/hd-n_03_03.jpg" style="padding:5px 5px 0px 0px;" />${ticketpw.gotype}</i></span>
                    <div class="table-right-box">
                        <div class="table-right-b-t1">
                            <p>出行日期：</p>
                            <span class="table-span">${ticketpw.godate}</span>
                            <div style="clear:both;"></div>
                        </div>
                        <div style="clear:both;"></div>
                        <div class="table-right-b-t2">
                            <p>票&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp务：</p>
                            <div class="table-right-b-t2-box">
                                <div class="table-right-b-t2-m">
                                    <div id="d1" class="Spinner"></div>
                                    <b>${ticketpw.ptype}</b>
                                    <div style="clear:both;"></div>
                                </div>
                                <div style="clear:both;"></div>
                            </div>
                        </div>
                    </div>
                    <input type="text" id="sel" name="count" value="" style="display: none">
                    <input type="submit" class="goumai" value="立刻购买"/>
                </div>
            </div>

        </c:forEach>
        <!-- 循环结束 -->
        </form>

        <div class="qzly">

            <div class="qzly-main">
                <div class="content2-main">
                    <div class="hd">
                        <ul>
                            <li>活动介绍</li>
                            <li>收费标准</li>
                            <li>交通路线</li>
                        </ul>
                    </div>
                    <div class="content2-main-r">
                        <img src="Picture/hd-n_03.jpg" width="100%"/>
                        <p>
                            <img src="Picture/index_16.jpg"/>
                            <span>杭州烂苹果乐园</span>
                        </p>
                        <p>
                            <img src="Picture/index_16.jpg"/>
                            <span>杭州烂苹果乐园</span>
                        </p>
                        <p>
                            <img src="Picture/index_16.jpg"/>
                            <span>杭州烂苹果乐园</span>
                        </p>
                    </div>
                    <div class="bd">



                        <ul>
                            <p> 宁波市北仑凤凰山海港乐园位于东距浙江省宁波市中心30公里的北仑区行政中心附近，占地面积80多万平方米。其中一期项目投资近1亿美元，占地面积26万平方米。乐园采用世界最新的设计理念，由美国顶尖游乐设计公司杰克·劳斯公司设计。
                                北仑凤凰山海港乐园由“世界广场”、“魔幻村庄”、“凤凰城堡”、“探险旅程”、“波波港湾”、“东海龙宫”六大主题景观组成，营造出“欢乐、时尚、惊喜、刺激”的乐园氛围。园内30项国际最流行的娱乐设施分别从意大利、瑞士、美国、德国等地引进。除“飞天凤凰（过山车）”、“大舟冲浪”、“森林探险漂流”等刺激项目外，还有“自由落体”、“互动小飞机”、“活蹦乱跳”、“旋转气球”、“疯狂小巴士”、“扭转乾坤”、“海盗船”、“醉酒桶”等老少皆宜的游乐项目。
                                凤凰山海港乐园,有亚洲回环最多、世界第二、比香港海洋公园更惊险刺激的8回环云宵飞车(过山车———“飞天凤凰”;世界上落差最大的漂流项目———“森林探险漂流”;国内惟一的双冲水项目———“大舟冲浪”……宁波人自己打造的“迪斯尼”已浮出水面,有10多项娱乐属“中国之最”。宁波凤凰山海港乐园二期游乐设施2012年8月16日正式开放。
                                凤凰山海港乐园二期在原有的世界广场、探险旅程、凤凰城堡和魔幻村庄四个主题区的基础上全新增加了波波港湾和东海龙宫主题区，新增宁波之眼（摩天轮）、绝密飞行、霹雳飞车、海底追逐、梦幻秋千、龙宫救火队、澳洲之星、乘风破浪、雷神撼天锤（大摆锤） 等十项设施。
                                每每提到凤凰山海港乐园，甬城的百姓总会把它和惊险、刺激联系在一起，感觉游乐园只适合成年人游玩，其实凤凰山海港乐园里也有很多适合亲子游玩的设施，而此次增加的设施里更以亲子游乐为主，充分体现园方致力于打造亲子新乐园的决心！
                                东海龙宫主题区：以海底世界为背景，独特的造型让你可以在这里感觉到梦幻的龙宫风格，主题区里的设施有宁波之眼（摩天轮）、绝密飞行、海底追逐、澳洲之星、龙宫救火队、雷神撼天锤（大摆锤）和乘风破浪。</p>
                            <span><img src="Picture/pw-1.jpg" width="600px" height="600px"/><span>
                        </ul>
                        <ul>
                            <p>收费标准一律以实际情况为准，杜绝乱收费，多收费的恶劣现象。如有工作人员出现这种恶劣情况，请及时拨打投诉热线44448888，我们必定实事求是。</p>
                            <span><img src="Picture/pw-1.jpg" width="600px" height="600px"/><span>
                        </ul>
                        <ul>
                            <p>活动地点参照票务即可，如若有任何需要帮助的地方，请及时与我们的工作人员联系。</p>
                            <span><img src="Picture/pw-1.jpg" width="600px" height="600px"/><span>
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
<script type="text/javascript">

    jQuery(".content2-main").slide({trigger:"click"});

</script>
<script type="text/javascript">

    jQuery("#demo1").slide({ mainCell:".bd ul",effect:"top",autoPlay:true,triggerTime:0 });

</script>
<script type="text/javascript">
    $(function(){
        $("#d").Spinner();
        $("#d1").Spinner();
        $("#d2").Spinner();
        $("#d3").Spinner();

    });
</script>
</body></html>