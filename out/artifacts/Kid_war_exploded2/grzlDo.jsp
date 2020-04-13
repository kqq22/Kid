<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>阿拉亲子</title>

    <script type="text/javascript" src="Scripts/jquery1.42.min.js"></script>
    <script language="javascript" type="text/javascript" src="Scripts/jquery.validate.js"></script>
    <script language="javascript" type="text/javascript" src="Scripts/validate_expand.js"></script>
    <script language="javascript" type="text/javascript" src="Scripts/validate.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            initValidator();
        });
    </script>
    <link href="Content/regist.css" rel="stylesheet" type="text/css" />
</head>
<body>

<div class="content">
    <div class="demo">
        <div class="title"><img src="Picture/demo_03.jpg" /><p>个人资料修改</p>
            <div class="c"></div>
        </div>
        <form id="thisForm" method="post" action="updateuser?id=${user.id}">
            <table width="50%">
                <tr>
                    <td class="tdcon"><span style="color:#F00;">*</span>用户名：</td>
                    <td>
                        <input class="stext" type='text' name="userName" id="userName" value="${user.name}" />
                        <div class="tipinfo"></div>
                    </td>
                </tr>
                <tr>
                    <td class="tdcon"><span style="color:#F00;">*</span>密码：</td>
                    <td>
                        <input class="stext" type="password" name="passWord" id="passWord" value="${user.pwd}" />
                        <div class="tipinfo"></div>
                    </td>
                </tr>
                <tr>
                    <td class="tdcon"><span style="color:#F00;">*</span>手机号码：</td>
                    <td>
                        <input class="stext" type='text' name="sms" id="sms" value="${user.phone}" />
                        <div class="tipinfo"></div>
                    </td>
                </tr>
                <tr>
                    <td class="tdcon"><span style="color:#F00;">*</span>邮箱：</td>
                    <td>
                        <input class="stext" type='text' name="email" id="email" value="${user.email}" />
                        <div class="tipinfo"></div>
                    </td>
                </tr>
                <tr>

                    <td style="width:50px;"></td>
                    <td id="submit"><input type="submit" value="确定修改" class="Button br" >
                    </td>

                </tr>
            </table>
        </form>

        <div class="erweima">
            <img src="Picture/demo_07.png" width="170" height="170"/>
            <p>「最新资讯 请关注我们的微信号」</p>
        </div>
    </div>

</div>
</body>
</html>