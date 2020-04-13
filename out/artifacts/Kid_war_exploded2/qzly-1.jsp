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
            <li><a href="action?pageNum=1">亲子活动</a></li>
            <li  class="wbg"><a href="travel?pageNum=1">亲子旅游</a></li>
            <li><a href="showticket?pageNum=1">票务</a></li>
            <li ><a href="show?pageNum=1">活动展示</a></li>
            <li><a>关于我们</a></li>
        </ul>
    </div>
    <div class="main">
        <!-- 循环开始 -->
        <form action="buyticketly" method="post">
        <c:forEach items="${sessionScope.ticketlyList}" var="ticketly" varStatus="st">

            <div class="main-top" >
                <h2>${ticketly.topic}</h2>
                <div id="demo1" class="picBtnTop">
                    <div class="hd">
                        <ul>
                            <li><img src="Picture/qzly-3.png" /></li>
                            <li><img src="Picture/qzly-1.png" /></li>
                            <li><img src="Picture/qzly-2.png" /></li>
                        </ul>
                    </div>
                    <div class="bd">
                        <ul>
                            <li>

                                <div class="pic"><a href=""><img src="Picture/qzly-3.png" /></a></div>

                            </li>
                            <li>

                                <div class="pic"><a href=""><img src="Picture/qzly-1.png" /></a></div>

                            </li>
                            <li>

                                <div class="pic"><a href=""><img src="Picture/qzly-2.png" /></a></div>

                            </li>
                        </ul>
                    </div>
                </div>
                <div class="table-right">
                    <h1><b>￥</b>${ticketly.price}</h1>
                    <span>推荐理由：南京海底世界是全国第一个沉浸式体感交互海底乐园，是全国最高端的海底乐园，超越你的想象</span>
                    <span><img src="Picture/hd-n_06.jpg" />${ticketly.paddress}<i style="font-style:normal; padding-left:50px;"><img src="Picture/hd-n_03_03.jpg" style="padding:5px 5px 0px 0px;" />${ticketly.gotype}</i></span>
                    <div class="table-right-box">
                        <div class="table-right-b-t1">
                            <p>出行日期：</p>
                            <span class="table-span">${ticketly.godate}</span>
                            <div style="clear:both;"></div>
                        </div>
                        <div style="clear:both;"></div>
                        <div class="table-right-b-t2">
                            <p>票&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp务：</p>
                            <div class="table-right-b-t2-box">
                                <div class="table-right-b-t2-m">
                                    <div id="d1" class="Spinner"></div>
                                    <b>${ticketly.ptype}</b><i>￥${ticketly.price}</i>
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
                            <p>宁波西溪水上世界是宁波最大、最先进、最安全、水上游乐项目最多的水上世界。园内有惊险刺激的巨兽碗，儿童池，游泳池，皮筏滑梯，高速滑梯，环型漂流河，合家欢喜池，三彩竞赛滑梯，具保健功能的水疗五星池，具亚热带风情的休息亭及宁波地区最大海浪池。<br />

                                　　为了让游客真正体验顶级的水上世界，水上世界为广大市民带来了众多的惊喜体验，小朋友可以和爸爸妈妈同时体验水的乐趣，增进亲情，几位好友可以同时体验水的激情，增进友情，水上世界不仅是一个好玩的场所，更是一个亲情友情的释放地。水上世界为了让广大市民在盛夏有不同的水体验，在整体设计上下了一番苦心，每个设备带给每位游客的体验感觉是截然不同，有的体验落差带给游客随浪花飞流直下的感受，有的带给游客随着水卷入万丈漩涡的感受，造浪池的9种不同海浪会带给您不一样的感受，让游客仿佛置身于大海之中，最长的漂流河给游
                                客带来舒适享受的浪漫之旅，最大的宝贝水城给小朋友一个不一样的童话水世界。</p>
                            <span><img src="Picture/hd-n_07.jpg" /><span>
                        </ul>
                        <ul>
                            <p>收费标准一律以实际情况为准，杜绝乱收费，多收费的恶劣现象。如有工作人员出现这种恶劣情况，请及时拨打投诉热线44448888，我们必定实事求是。</p>
                            <span><img src="Picture/hd-n_07.jpg" /><span>
                        </ul>
                        <ul>
                            <p>活动地点参照票务即可，如若有任何需要帮助的地方，请及时与我们的工作人员联系。</p>
                            <span><img src="Picture/hd-n_07.jpg" /><span>
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