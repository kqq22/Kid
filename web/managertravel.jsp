<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/22
  Time: 13:35
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
                旅游票管理
            </td>
        </tr>
        <tr>
            <td align="center" class="altbg1">
                <b>票务主题</b>
            </td>
            <td align="center" class="altbg1">
                <b>出发地址</b>
            </td>
            <td align="center" class="altbg1">
                <b>年龄限制</b>
            </td>
            <td align="center" class="altbg1">
                <b>几日游类型</b>
            </td>
            <td align="center" class="altbg1">
                <b>票务价格</b>
            </td>
            <td align="center" class="altbg1">
                <b>修改</b>
            </td>
            <td align="center" class="altbg1">
                <b>删除</b>
            </td>
        </tr>
        <!-- 循环开始 -->
        <c:forEach items="${sessionScope.travelList}" var="travel" varStatus="st">
            <tr>
                <td rowspan="2" align="center" class="altbg2">
                    ${travel.topic}
                </td>
                <td class="altbg2" rowspan="2" align="center">
                    ${travel.address}
                </td>
                <td class="altbg2" rowspan="2" align="center">
                    ${travel.age}
                </td>
                <td class="altbg2" rowspan="2" align="center">
                    ${travel.daytour}
                </td>
                <td class="altbg2" rowspan="2" align="center">
                    ${travel.price}
                </td>

                <td class="altbg2" rowspan="2" align="center">
                    <a href="findtravel?id=${travel.tid}">修改</a>
                </td>
                <td class="altbg2" rowspan="2" align="center">
                    <a href="deletetravel?id=${travel.tid}">删除</a>
                </td>
            </tr>
            <tr>

            </tr>

        </c:forEach>
        <!-- 循环结束 -->
</table>
</body>
</html>
