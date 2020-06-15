<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv=“X-UA-Compatible” content=“IE=EmulateIE7″>
<meta http-equiv=“X-UA-Compatible” content=“IE=8″>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>首页</title>

<link rel="stylesheet" href="Content/style.css" type="text/css" />
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
    <li class="wbg"><a href="index.jsp">首页</a></li>
    <li><a href="action?pageNum=1">亲子活动</a></li>
    <li><a href="travel?pageNum=1">亲子旅游</a></li>
    <li><a href="showticket?pageNum=1">票务</a></li>
    <li ><a href="show?pageNum=1">活动展示</a></li>
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
        <div class="container-tit">
                	<div class="container-tit-p1"><img src="Picture/index_05.jpg" /><p><a href="qzhd.html">亲子活动</a></p></div>
                  <div class="container-tit-p2"><img src="Picture/index_05.jpg" style="padding-left:100px;"/><p><a href="qzly.html">亲子旅游</a></p></div>
                  <div class="container-tit-p3"><img src="Picture/index_05.jpg" /><p><a href="pw.html">票务</a></p></div>
                </div>
                 <div style=" clear:both;"></div>
			<div class="qzhd">
				    <div class="title">
                    <p><i>A</i><b>亲子活动</b><span>activities</span></p>
                    <span class="more">more</span>
                    </div>
                    
                    
                    <ul class="qzhd-main" >
									<li><a href=""><img src="Picture/qzhd-1.jpg" width="305"  height="242"/></a>					                                    <div class="qzhd-li-t">
                                    <p>新梦想少儿足球免费试踢啦！</p>
                                    <span><i><img src="Picture/time_19.jpg" /></i>2015年07月01日-2015年09月01日</span>
                                    <a><b>￥</b>90</a>
                                    </div>
                                    <div class="jinxin">进行中</div>
                                    </li>
									<li style="margin:0px 36px;"><a href=""><img src="Picture/qzhd-4.png" width="305"  height="242"/></a>					                                    <div class="qzhd-li-t">
                                    <p>小牛奶大秘密免费试做啦</p>
                                    <span><i><img src="Picture/time_19.jpg" /></i>2019年04月14日-2019年06月14日</span>
                                    <a><b>￥</b>80</a>
                                    </div>
                                     <div class="jinxin">进行中</div>
                                    </li>
                                    <li><a href=""><img src="Picture/qzhd-5.png" width="305"  height="242"/></a>					                                    <div class="qzhd-li-t">
                                    <p>北海公园游湖体验开始啦</p>
                                    <span><i><img src="Picture/time_19.jpg" /></i>2019年06月12日-2019年07月12日</span>
                                    <a><b>￥</b>100</a>
                                    </div>
                                     <div class="jinxin">进行中</div>
                                    </li>
                                    <li><a href=""><img src="Picture/qzhd-6.jpg" width="305"  height="242"/></a>					                                    <div class="qzhd-li-t">
                                    <p>北京故宫逛最“萌”皇城</p>
                                    <span><i><img src="Picture/time_19.jpg" /></i>2019年04月20日-2019年05月20日</span>
                                    <a><b>￥</b>90</a>
                                    </div>
                                    <div class="jinxin">进行中</div>
                                    </li>
                                    <li style="margin:0px 36px;"><a href=""><img src="Picture/qzhd-7.jpg" width="305"  height="242"/></a>					                                    <div class="qzhd-li-t">
                                    <p>天坛之神奇声学建筑不为人知的秘密</p>
                                    <span><i><img src="Picture/time_19.jpg" /></i>2019年09月28日-2019年10月28日</span>
                                    <a><b>￥</b>60</a>
                                    </div>
                                    <div class="jinxin">进行中</div>
                                    </li>
                                    <li><a href=""><img src="Picture/qzhd-8.png" width="305"  height="242"/></a>					                                    <div class="qzhd-li-t">
                                    <p>探秘警察博物馆防拐课堂开放啦</p>
                                    <span><i><img src="Picture/time_19.jpg" /></i>2019年05月17日-2019年06月17日</span>
                                    <a><b>￥</b>50</a>
                                    </div>
                                    <div class="jinxin">进行中</div>
                                    </li>
							<div style="clear:both;"></div>		
					</ul>
            </div>
            
            <div class="qzly">
            	<div class="title">
                    <p><i>T</i><b>亲子旅游</b><span>tourism</span></p>
                    <span class="more">more</span>
                    </div>
                    <div class="qzly-main">
                    	<div class="content2-main">
			<div class="hd">
				<ul>
                <li class="on">全部</li>
                <li>一日游</li>
                <li>二日游</li>
                <li>周边游</li>
                 <li>国内游</li>
                <li>境外游</li>
                </ul>
			</div>
			<div class="bd">
				<ul>
					<li><img src="Picture/qzly-1.png" width="205"  height="138"/></li>
                    <li><img src="Picture/qzly-4.png" width="205"  height="138"/></li>
					<li><img src="Picture/qzly-5.png" width="205"  height="138"/></li>
                    <li><img src="Picture/qzly-6.png" width="205"  height="138"/></li>
                    <li><img src="Picture/qzly-7.png" width="205"  height="138"/></li>
					<li><img src="Picture/qzly-8.png" width="205"  height="138"/></li>
				</ul>

			</div>
		</div>
        
        <div class="sideMenu" style="margin:0 auto">
        	<img src="Picture/qzly_03.jpg" />
			<h3><img src="Picture/1_03.jpg" />上海科技馆</h3>
			<ul>
				<img src="Picture/1-p_07.jpg" width="125" height="79" />
             <div class="sideMenu-t">
             <b>常州恐龙园</b>
             <span>中华恐龙园享有"东恐龙园享有"东方侏恐龙园享有"东方侏恐龙园享有"东方侏罗纪"中华恐龙园享有"东方侏中华恐龙园享有"东方侏
美誉</span>
             </div>
			</ul>

			<h3><img src="Picture/2_07.jpg" />幻灯片/焦点图系列</h3>

			<ul>
				<img src="Picture/1-p_07.jpg" width="125" height="79" />
             <div class="sideMenu-t">
             <b>常州恐龙园</b>
             <span>中华恐龙园享有"东恐龙园享有"东方侏恐龙园享有"东方侏恐龙园享有"东方侏罗纪"中华恐龙园享有"东方侏中华恐龙园享有"东方侏
美誉</span>
             </div>
			</ul>
			<h3><img src="Picture/1_06.jpg" />南京海底世界</h3>
			<ul>
				<img src="Picture/1-p_07.jpg" width="125" height="79" />
             <div class="sideMenu-t">
             <b>常州恐龙园</b>
             <span>中华恐龙园享有"东恐龙园享有"东方侏恐龙园享有"东方侏恐龙园享有"东方侏罗纪"中华恐龙园享有"东方侏中华恐龙园享有"东方侏
美誉</span>
             </div>
			</ul>
            <h3><img src="Picture/1_09.jpg"/>上海动物园</h3>
			<ul>
				<img src="Picture/1-p_07.jpg" width="125" height="79" />
             <div class="sideMenu-t">
             <b>常州恐龙园</b>
             <span>中华恐龙园享有"东恐龙园享有"东方侏恐龙园享有"东方侏恐龙园享有"东方侏罗纪"中华恐龙园享有"东方侏中华恐龙园享有"东方侏
美誉</span>
             </div>
			</ul>
            <h3><img src="Picture/1_11.jpg" />常州动物园</h3>
			<ul>
				<img src="Picture/1-p_07.jpg" width="125" height="79" />
             <div class="sideMenu-t">
             <b>常州恐龙园</b>
             <span>中华恐龙园享有"东恐龙园享有"东方侏恐龙园享有"东方侏恐龙园享有"东方侏罗纪"中华恐龙园享有"东方侏中华恐龙园享有"东方侏
美誉</span>
             </div>
			</ul>
		</div>
        
        <div style="clear:both;"></div>
                    </div>
            </div>
            <div class="pw">
            	<div class="title">
                    <p><i>T</i><b>票务</b><span>ticket</span></p>
                    <span class="more">more</span>
                    </div>
                 	<ul class="pw-main" >
									<li><a href=""><img src="Picture/pw-1.jpg"  width="326" height="247"/></a>					                                    <div class="pw-li-t">
                                    <p>北仑凤凰山海港乐园门票</p>
                                    <a><b>￥</b>145</a>
                                    <span>门店价<b>￥160</b></span>
                                    <div class="pw-li-t-d">
                                    立即购买&gt;&gt;
                                    </div>
                                    </div>
                                    </li>
                                    <li style="margin:0px 10px"><a href=""><img src="Picture/qzhd-1.jpg"  width="326" height="247"/></a>					                                    <div class="pw-li-t">
                                    <p>新梦想少儿足球门票</p>
                                    <a><b>￥</b>90</a>
                                    <span>门店价<b>￥110</b></span>
                                    <div class="pw-li-t-d">
                                    立即购买&gt;&gt;
                                    </div>
                                    </div>
                                    </li>
                                    <li><a href=""><img src="Picture/qzly-1.png"  width="326" height="247"/></a>					                                    <div class="pw-li-t">
                                    <p>南京海底世界门票</p>
                                    <a><b>￥</b>210</a>
                                    <span>门店价<b>￥235</b></span>
                                    <div class="pw-li-t-d">
                                    立即购买&gt;&gt;
                                    </div>
                                    </div>
                                    </li>
									<li><a href=""><img src="Picture/qzhd-4.png"  width="326" height="247"/></a>					                                    <div class="pw-li-t">
                                    <p>小牛奶大秘密门票</p>
                                    <a><b>￥</b>80</a>
                                    <span>门店价<b>￥100</b></span>
                                    <div class="pw-li-t-d">
                                    立即购买&gt;&gt;
                                    </div>
                                    </div>
                                    </li>
                                    <li style="margin:0px 10px"><a href=""><img src="Picture/qzly-4.png"  width="326" height="247"/></a>					                                    <div class="pw-li-t">
                                    <p>韩国江原道冬奥会之旅门票</p>
                                    <a><b>￥</b>2380</a>
                                    <span>门店价<b>￥2450</b></span>
                                    <div class="pw-li-t-d">
                                    立即购买&gt;&gt;
                                    </div>
                                    </div>
                                    </li>
                                    <li><a href=""><img src="Picture/qzhd-5.png"  width="326" height="247"/></a>					                                    <div class="pw-li-t">
                                    <p>北海公园游湖门票</p>
                                    <a><b>￥</b>100</a>
                                    <span>门店价<b>￥120</b></span>
                                    <div class="pw-li-t-d">
                                    立即购买&gt;&gt;
                                    </div>
                                    </div>
                                    </li>
							<div style="clear:both;"></div>		
					</ul>
            </div>
            
            <div class="hdzs">
            	<div class="title">
                    <p><i>S</i><b>活动展示</b><span>show</span></p>
                    <span class="more">more</span>
                    </div>
                 	<ul class="hdzs-main" >
									<li><a href=""><img src="Picture/qzly-8.png" width="236" height="185"/></a>
                                        <span>迪拜安纳塔拉沙漠度假村</span>
                                    </li>
                                    <li><a href=""><img src="Picture/qzly-7.png" width="236" height="185"/></a>
                                        <span>日本大阪环球影城冒险之旅</span>
                                    </li>
                                    <li><a href=""><img src="Picture/qzhd-12.png" width="236" height="185"/></a>
                                        <span>疯狂动物世界开放啦</span>
                                    </li>
                                    <li class="last"><a href=""><img src="Picture/qzly-4.png" width="236" height="185"/></a>
                                        <span>韩国江原道冬奥会之旅</span>
                                    </li>
                                    <li><a href=""><img src="Picture/qzly-6.png" width="236" height="185"/></a>
                                        <span>泰国沽岛soneva kiri</span>
                                    </li>
                                    <li><a href=""><img src="Picture/qzly-9.png" width="236" height="185"/></a>
                                        <span>台湾高翔义大乐园</span>
                                    </li>
                                    <li><a href=""><img src="Picture/qzhd-11.png" width="236" height="185"/></a>
                                        <span>探秘神秘海洋走进贝壳世界</span>
                                    </li>
                                    <li class="last"><a href=""><img src="Picture/qzly-13.png" width="236" height="185"/></a>
                                        <span>新加坡玩转圣淘沙</span>
                                    </li>
                                    
							<div style="clear:both;"></div>		
					</ul>
            </div>
		</div>
		<!--main end-->
		
	<div class="footer">
        <div class="footer-t">
        		<div class="footer-t-l">
                    <div class="title">
                        <p><i>A</i><b>亲子活动</b><span>activities</span></p>
                        <span class="more">more</span>
                     </div>
                     <p>由带队总指导员宣布 “成长体验营”成立并正式开始，任命各级训导员并进行授旗仪式，集体宣誓，承诺，辅导员、学员代表发言；团队建设：夏令营纪律学习、设计队名旗帜，建立团队归属感，团队荣誉感。认识小伙伴扩大社交圈...</p>
                 </div>
                    <div class="footer-t-r"><img src="Picture/demo_07.png" width="95" height="95" /><p >扫一扫，更多精彩</p></div>
            <div style="clear:both;"></div>
        </div>
	</div><!--footer end-->
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