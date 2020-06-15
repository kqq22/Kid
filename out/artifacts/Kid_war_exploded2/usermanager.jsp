<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/22
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
    <meta http-equiv="Content-Language" content="zh-cn">
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
    <title>管理人员-管理</title>
    <link rel="stylesheet" type="text/css" href="css/style_admin.css">
</head>
<body>
<table cellspacing="1" cellpadding="4" width="100%"
       class="tableborder" id="table3">
    <form name="form1" action="showUserList.jsp" method="post">
        <tr>
            <td colspan="15" class="header">
                用户管理
            </td>
        </tr>
        <tr>
            <td align="center" class="altbg1">
                <b>用户名</b>
            </td>
            <td align="center" class="altbg1">
                <b>密  码</b>
            </td>
            <td align="center" class="altbg1">
                <b>操作</b>
            </td>
        </tr>

        <!-- 循环开始 -->
        <c:forEach items="${sessionScope.userList}" var="user" varStatus="st">
            <tr>
                <td rowspan="2" align="center" class="altbg2">
                    ${user.name}
                </td>
                <td class="altbg2" rowspan="2" align="center">
                    ${user.pwd}
                </td>
                <td class="altbg2" rowspan="2" align="center">
                    <a href="deleteuser?id=${user.id}">删除</a>
                </td>
            </tr>
            <tr>

            </tr>
        </c:forEach>
        <!-- 循环开始 -->

</table>
</body>
</html>