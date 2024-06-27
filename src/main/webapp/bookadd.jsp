<%--
  Created by IntelliJ IDEA.
  User: 杨涛
  Date: 2024/1/5
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>


<html>
    <head>
        <title>添加书籍</title>
        <link rel="stylesheet" type="text/css" href="./css/mystyle.css">
    </head>
    <body>
        <h1>添加书籍</h1>
        <p style="color: red; margin-left: 50px;">${param.message}</p>
        <div>
            <form action="/book/add" method="post">
                <table>
                    <tr>
                        <td class="from-left"><label>书籍id</label></td>
                        <td>
                            <input class="from-right" type="text" name="id" placeholder="请输入书籍id"/>
                        </td>
                    </tr>
                    <tr>
                        <td class="from-left"><label>书籍编号</label></td>
                        <td>
                            <input class="from-right" type="text" name="bookCno" placeholder="请输入书籍编号"/>
                        </td>
                    </tr>
                    <tr>
                        <td class="from-left"><label>书籍名称</label></td>
                        <td>
                            <input class="from-right" type="text" name="bookName" placeholder="请输入书籍名称"/>
                        </td>
                    </tr>

                    <tr>
                        <td class="from-left"><label>可不可借</label></td>
                        <td>
                            <input type="radio" name="isValid" value="1">
                            <label>可借</label>
                            <input type="radio" name="isValid" value="0">
                            <label>不可借</label>
                        </td>
                    </tr>
                </table>

                <div style="margin: 15px 100px;">
                    <input class="form-btn" type="submit" value="提交">
                </div>
            </form>
        </div>

    </body>
</html>
