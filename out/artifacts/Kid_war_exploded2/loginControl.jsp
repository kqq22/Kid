<%--
  Created by IntelliJ IDEA.
  User: K
  Date: 2020/4/9
  Time: 18:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
         <%--pageEncoding="UTF-8"%>--%>
<%--      old：[text/html; charset=UTF-8] 这个是对的，new：[text/html;charset=UTF-8]这个是错的     原因:分号后面少了一个空格   --%>


<html>
<head>
    <title></title>
</head>
<body>
<%
    //从session中取出User
    if(session.getAttribute("user")==null){
        //为空则没有登录
        out.print("<script>alert('您尚未登录，请先登录!');location.href='denglu.jsp'</script>");
        return;
    }
%>
</body>
</html>
