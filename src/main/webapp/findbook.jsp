<%--
  Created by IntelliJ IDEA.
  User: Yang
  Date: 2024/5/28
  Time: 下午3:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>书籍查询</title>
    <style>
        .form-left{
            text-align: right;
        }
        .form-right{
            border-radius:20px;
            text-align: left;
            margin:8px auto;
            outline: none;
            padding:7px 17px 5px 15px;
        }
        .form-btn {
            text-align: left;
            padding: 8px 17px 8px 17px;
            border-radius: 10px;
            background-color: blanchedalmond;
        }
        </style>
    </head>
<body>
<h1>查询书籍信息</h1>
<p style="color: red;margin-left: 50px;">${param.message}</p>
<div>
    <form action="/book/find" method="post">
        <table>
            <tr>
                <td class="form-left"><label>书籍id：</label></td>
                <td>
                    <input class="form-right" type="text" name="id" placeholder="请输入书籍id"/>
                </td>
            </tr>
        </table>
        <div style="margin: 15px 100px">
            <input style="font-size: 15px" class="form-btn" type="submit" value="查询">
        </div>
    </form>
</div>
</body>
</html>


