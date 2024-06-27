<%--
  Created by IntelliJ IDEA.
  User: 杨涛
  Date: 2023/12/21
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>图书系统 - 注册</title>
    <link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<center>
    <div class="wrap">
        <h1>注册</h1>
        <p style="color: red; margin-left: 50px;">${param.message}</p>
        <form action="${pageContext.request.contextPath}/student/register" method="post">
            <table>
                <!-- 手机号 -->
                <tr>
                    <td class="from-left"><label for="mobile">手机号:</label></td>
                    <td><input type="text" id="mobile" name="mobile" class="from-right" placeholder="请输入手机号" required></td>
                </tr>
                <!-- 用户名 -->
                <tr>
                    <td class="from-left"><label for="name">用户名:</label></td>
                    <td><input type="text" id="name" name="name" class="from-right" placeholder="请输入用户名" required></td>
                </tr>
                <!-- 密码 -->
                <tr>
                    <td class="from-left"><label for="password">密 码:</label></td>
                    <td><input type="password" id="password" name="password" class="from-right" placeholder="请输入密码" required></td>
                </tr>
                <!-- 性别 -->
                <tr>
                    <td class="from-left"><label>性 别:</label></td>
                    <td>
                        <input type="radio" id="male" name="gender" value="1" checked>
                        <label for="male">男</label>
                        <input type="radio" id="female" name="gender" value="2">
                        <label for="female">女</label>
                    </td>
                </tr>
                <!-- 年龄 -->
                <tr>
                    <td class="from-left"><label>年 龄:</label></td>
                    <td><input class="from-right" type="number" name="age" placeholder="请输入年龄" min="1" max="150"></td>
                </tr>
                <!-- 验证码 -->
<%--                <tr>--%>
<%--                    <td class="from-left"><label for="authcode">验证码:</label></td>--%>
<%--                </tr>--%>
                <tr>
                    <td class="f"><label>验证码：</label></td>
                    <td><input  type="text"  name="code" placeholder="请输入验证码" class="a1"></td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <img id="verifycode" src="${pageContext.request.contextPath}/verifycode" width="220" height="60" />
                        <a href="javascript:;"
                           onclick="document.getElementById('verifycode').src='${pageContext.request.contextPath}/verifycode?'
                                   +(new Date()).getTime()" >换一张</a>
                    </td>
                </tr>
            </table>
            <!-- 注册按钮 -->
            <div style="text-align: center">
                <input class="form-btn" type="submit" value="注 册">
            </div>
            <!-- 登录链接 -->
            <p class="center"><a href="./login.jsp">已有账号，去登录</a></p>
        </form>
    </div>
</center>
</body>
</html>