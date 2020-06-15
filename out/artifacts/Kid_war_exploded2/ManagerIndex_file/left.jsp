<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/22
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<!-- saved from url=(0044)http://localhost:8080/company/admin/left.jsp -->
<HTML><HEAD><TITLE>控制面板</TITLE>
    <META content="text/html; charset=gb2312" http-equiv=Content-Type>
    <STYLE type=text/css>.menutitle {
        BACKGROUND-IMAGE: url(images/menu_1.gif); TEXT-ALIGN: center; PADDING-BOTTOM: 2px; BACKGROUND-COLOR: #698cc3; PADDING-LEFT: 0px; WIDTH: 158px; PADDING-RIGHT: 0px; MARGIN-BOTTOM: 0px; COLOR: #ffffff; CURSOR: pointer; FONT-WEIGHT: bold; PADDING-TOP: 2px
    }
    .submenu {
        MARGIN-BOTTOM: 0em
    }
    .cn {
        FONT-FAMILY: 宋体; COLOR: #006599; FONT-SIZE: 9pt
    }
    </STYLE>

    <SCRIPT language=javascript type=text/javascript>
        if (document.getElementById){
            document.write('<style type="text/css">\n')
            document.write('.submenu{display: none;}\n')
            document.write('</style>\n')
        }

        function SwitchMenu(obj){
            if(document.getElementById){
                var el = document.getElementById(obj);
                var ar = document.getElementById("masterdiv").getElementsByTagName("span");
                if(el.style.display != "block"){
                    for (var i=0; i<ar.length; i++){
                        if (ar[i].className=="submenu")
                            ar[i].style.display = "none";
                    }
                    el.style.display = "block";
                }else{
                    el.style.display = "none";
                }
            }
        }

        function killErrors() {
            return true;
        }

        window.onerror = killErrors;
    </SCRIPT>
    <LINK rel=stylesheet type=text/css href="left_files/style_admin.css">
    <META name=GENERATOR content="MSHTML 8.00.7600.16535"></HEAD>
<BODY style="BACKGROUND-COLOR: #698cc3" bottomMargin=2 leftMargin=2
      rightMargin=2 topMargin=0>
<DIV id=masterdiv>
    <TABLE style="BORDER-COLLAPSE: collapse" id=table1 border=0 cellPadding=4
           width=158>
        <TBODY>
        <TR>
            <TD><FONT color=#ffffff><B>系统后台管理面板</B> </FONT></TD></TR>
        <TR>
            <TD>
                <P align=center><FONT color=#ffffff>[<A
                        href="../index.jsp"
                        target=_parent><FONT color=#ffffff>安全退出</FONT> </A>] [<A
                        href="../index.jsp" target=_parent><FONT
                        color=#ffffff>返回首页</FONT> </A>]</FONT> </P></TD></TR></TBODY></TABLE>
    <DIV class=menutitle onclick="SwitchMenu('sub1')">.系统管理
        <TABLE border=0 cellSpacing=0 cellPadding=0 width=158>
            <TBODY>
            <TR>
                <TD height=3></TD></TR>
            <TR>
                <TD bgColor=#ffffff height=1></TD></TR></TBODY></TABLE></DIV><SPAN id=sub1
                                                                                   class=submenu>
<TABLE class=tableborder cellSpacing=1 cellPadding=4 width=158>
  <TBODY>
  <TR class=altbg1>
    <TD bgColor=#d6e0ef height=25 width="100%" align=middle>&nbsp;&nbsp; <IMG
            border=0 src="left_files/icon_arrow_r.gif" width=13 height=13> <A
            class=menu href="../addadmin.jsp"
            target=main>添加管理员</A> </TD></TR>
  <TR class=altbg1>
    <TD bgColor=#d6e0ef height=25 width="100%" align=middle>&nbsp;&nbsp; <IMG
            border=0 src="left_files/icon_arrow_r.gif" width=13 height=13> <A
            class=menu href="../selectadmin"
            target=main>管理员管理</A> </TD></TR>
  <TR class=altbg1>
    <TD bgColor=#d6e0ef height=25 width="100%" align=middle>&nbsp;&nbsp;<IMG
            border=0 src="left_files/icon_arrow_r.gif" width=13 height=13><A
            class=menu href="../selectuser"
            target=main>&nbsp;用户管理</A> </TD></TR></TBODY></TABLE></SPAN>

    <DIV class=menutitle onclick="SwitchMenu('sub3')">.票务管理
        <TABLE border=0 cellSpacing=0 cellPadding=0 width=158>
            <TBODY>
            <TR>
                <TD height=3></TD></TR>
            <TR>
                <TD bgColor=#ffffff height=1></TD></TR></TBODY></TABLE></DIV><SPAN id=sub3
                                                                                   class=submenu>
<TABLE border=0 cellSpacing=0 cellPadding=0 width=158 background="">
  <TBODY>
  <TR>
    <TD bgColor=#d6e0ef height=25 width="100%" align=middle>
        <IMG border=0 src="left_files/icon_arrow_r.gif" width=13 height=13>
        <A class=menu href="../addaction.jsp" target=main>添加活动票</A>
    </TD>
  </TR>
<TR>
    <TD bgColor=#d6e0ef height=25 width="100%" align=middle>
        <IMG border=0 src="left_files/icon_arrow_r.gif" width=13 height=13>
        <A class=menu href="../addtravel.jsp"target=main>添加旅游票</A>
    </TD>
</TR>
    <TR>
    <TD bgColor=#d6e0ef height=25 width="100%" align=middle>
        <IMG border=0 src="left_files/icon_arrow_r.gif" width=13 height=13>
        <A class=menu href="../addticket.jsp" target=main>添 加 票务</A>
    </TD>
    </TR>
  <TR>
    <TD bgColor=#d6e0ef height=25 width="100%" align=middle>
        <IMG border=0 src="left_files/icon_arrow_r.gif" width=13 height=13>
        <A class=menu href="../selectaction" target=main>管理活动票</A>
    </TD>
  </TR>
  <TR>
    <TD bgColor=#d6e0ef height=25 width="100%" align=middle>
        <IMG border=0 src="left_files/icon_arrow_r.gif" width=13 height=13>
        <A class=menu href="../selecttravel" target=main>管理旅游票</A>
    </TD>
  </TR>
  <TR>
    <TD bgColor=#d6e0ef height=25 width="100%" align=middle>
        <IMG border=0 src="left_files/icon_arrow_r.gif" width=13 height=13>
        <A class=menu href="../selectshowticket" target=main>管 理 票务</A>
    </TD>
  </TR>



  </TBODY>
</TABLE>
</SPAN>
</DIV>
</BODY>
</HTML>

