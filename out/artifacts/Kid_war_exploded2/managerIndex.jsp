<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/22
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<!-- saved from url=(0045)http://localhost:8080/company/admin/index.jsp -->
<HTML><HEAD><TITLE>管理首页</TITLE>
    <META content="text/html; charset=gb2312" http-equiv=Content-Type><LINK
            rel=stylesheet type=text/css href="ManagerIndex_file/style_admin.css">
    <SCRIPT>
        function mfk()
        {
            if(shang.style.display=='none')
            {
                shang.style.display='';
            }
            else
            {
                shang.style.display='none';
            }
        }
    </SCRIPT>

    <META name=GENERATOR content="MSHTML 8.00.7600.16535"></HEAD>
<BODY leftMargin=0 scroll=no topMargin=0>
<TABLE border=0 cellSpacing=0 cellPadding=0 width="100%" align=center
       height="100%">
    <TBODY>
    <TR>
        <TD id=shang height="100%" width=162><IFRAME id=left height="100%"
                                                     src="ManagerIndex_file/left.jsp" frameBorder=0 width=162 name=left
                                                     target="main">
        </IFRAME></TD>
        <TD class=unnamed1 onclick=mfk(); height="100%" align=middle>
            <TABLE border=0 cellSpacing=0 cellPadding=0 width="100%" height="100%">
                <TBODY>
                <TR>
                    <TD bgColor=#3a5f94><FONT color=#ffffff>点此切换</FONT>
                    </TD></TR></TBODY></TABLE></TD>
        <TD height="100%" width="100%"><IFRAME id=main height="100%"
                                               src="ManagerIndex_file/right.jsp" frameBorder=0 width="100%" name=main
                                               scrolling=yes></IFRAME></TD></TR></TBODY></TABLE></BODY></HTML>
