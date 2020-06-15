<%--
  Created by IntelliJ IDEA.
  User: K
  Date: 2020/4/10
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%
    if (session.getAttribute("user")==null){
%>
<a href="denglu.jsp">登录</a><a href = "zhuce.jsp" class="top-line-a-on">注册</a>
<%
}else {
%>
<a href="denglu.jsp" class="top-line-a-on">退   出</a>
<a href="grzl.jsp">${user.name}</a>
<a href="" class="top-line-a-on">欢迎您!</a>
<%
    }
%>
