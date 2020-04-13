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
                document.getElementById("sel").value="";
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
            <li class="wbg"><a href="action?pageNum=1">亲子活动</a></li>
            <li><a href="travel?pageNum=1">亲子旅游</a></li>
            <li><a href="showticket?pageNum=1">票务</a></li>
            <li ><a href="show?pageNum=1">活动展示</a></li>
            <li><a>关于我们</a></li>
        </ul>
    </div>
    <div class="main">
        <!-- 循环开始 -->
        <form action="buytickethd" method="post">
        <c:forEach items="${sessionScope.tickethdList}" var="ticket" varStatus="st">
            <div class="main-top" >
                <h2>${ticket.topic}</h2>
                <div id="demo1" class="picBtnTop">
                    <div class="hd">
                        <ul>
                            <li><img src="Picture/qzhd-1.jpg" /></li>
                            <li><img src="Picture/qzhd-2.png" /></li>
                            <li><img src="Picture/qzhd-3.png" /></li>
                        </ul>
                    </div>
                    <div class="bd">
                        <ul>
                            <li>

                                <div class="pic"><a href=""><img src="Picture/qzhd-1.jpg" /></a></div>

                            </li>
                            <li>

                                <div class="pic"><a href=""><img src="Picture/qzhd-2.png" /></a></div>

                            </li>
                            <li>

                                <div class="pic"><a href=""><img src="Picture/qzhd-3.png" /></a></div>

                            </li>
                        </ul>
                    </div>
                </div>
                <div class="table-right">
                    <h1><b>￥</b>${ticket.price}</h1>
                    <span>推荐理由：新梦想少儿足球是全国第一个沉浸式体感交互活动，是全国最火热的足球运动，超越你的想象</span>
                    <span><img src="Picture/hd-n_06.jpg" />${ticket.paddress}<i style="font-style:normal; padding-left:50px;"><img src="Picture/hd-n_03_03.jpg" style="padding:5px 5px 0px 0px;" />${ticket.gotype}</i></span>
                    <div class="table-right-box">
                        <div class="table-right-b-t1">
                            <p>出行日期：</p>
                            <span class="table-span">${ticket.godate}</span>
                            <div style="clear:both;"></div>
                        </div>
                        <div style="clear:both;"></div>
                        <div class="table-right-b-t2">
                            <p>票&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp务：</p>
                            <div class="table-right-b-t2-box">
                                <div class="table-right-b-t2-m">
                                    <div id="d1" class="Spinner">
                                    </div>
                                    <b>${ticket.ptype}</b><i>￥${ticket.price}</i>
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
        </form>
        <!-- 循环结束 -->


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
                            <p>1. 锻炼身体。足球运动作为一项深受青少年追捧的体育项目，关键是可以起到强身健体的作用。足球不是走着踢的，而是跑着踢的，在绿茵场上不停的高速跑动，弹跳，身体对抗，在运动中锻炼了身体。最大的足球场给小朋友一个不一样的足球世界。
                                2. 缓解压力。生活在都市的孩子们，白天要承受学习带来的巨大压力，压力太大无法有效的释放容易导致心情抑郁。而踢足球就是一种行之有效的缓解压力的方法。放下学习的包袱，尽情的奔跑在绿茵场上，挥汗如雨，和球友们开开心心的进行一场对战。
                                3. 培养团队合作意识。足球是一项最能体现团队协作的体育项目，场上分守门员，后卫，中场，前锋等几个位置，相互之间要有默契合作才能最终取得比赛的胜利，因此喜欢踢足球的一般都有较强的团队合作能力。
                            </p>
                            <span><img src="Picture/qzhd-1.jpg" /><span>
                        </ul>
                        <ul>
                            <p>收费标准一律以实际情况为准，杜绝乱收费，多收费的恶劣现象。如有工作人员出现这种恶劣情况，请及时拨打投诉热线44448888，我们必定实事求是。</p>
                            <span><img src="Picture/qzhd-1.jpg" /><span>
                        </ul>
                        <ul>
                            <p>活动地点参照票务即可，如若有任何需要帮助的地方，请及时与我们的工作人员联系。</p>
                            <span><img src="Picture/qzhd-1.jpg" /><span>
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


</div>


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