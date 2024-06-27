<%--
  Created by IntelliJ IDEA.
  User: 杨涛
  Date: 2023/12/21
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">

        <title>登录</title>

        <link rel="stylesheet" type="text/css" href="./css/mystyle.css">

    </head>
    <body>

        <center>

            <div class="wrap">

                <h1 style="text-align: center">登录</h1>

                <% String msg = request.getParameter("message"); %>
                <% if (null != msg) { %>
                <p style="color: red">
                    <%= msg %>
                </p>
                <% } %>

                <%--<p style="color: red";margin-left="50px;">${param.message}</p>--%>

                <form action="${pageContext.request.contextPath}/student/login" method="post">

                    <table>

                        <!-- 手机号 -->
                        <tr>
                            <td class="from-left"> <label for="mobile">手机号:</label></td>
                            <td> <input type="text" id="mobile"  name="mobile" class="from-right" placeholder="请输入手机号" required></td>
                        </tr>

                        <!-- 密码 -->
                        <tr>
                            <td class="from-left"> <label for="password">密 码:</label></td>
                            <td > <input type="password" id="password" name="password" class="from-right" placeholder="请输入密码" required></td>
                        </tr>

                    </table>

                    <!-- 登录按钮 -->
                    <div style="text-align: center">
                        <input class="form-btn" type="submit" value="登录" required>
                    </div>

                    <a href="./regist.jsp">还没有账号,去注册</a>

                </form>

            </div>

        </center>

    </body>
</html>
