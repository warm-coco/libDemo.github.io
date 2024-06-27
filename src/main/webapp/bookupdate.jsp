<%--
  Created by IntelliJ IDEA.
  User: 杨涛
  Date: 2024/1/5
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
    <head>
        <title>修改书籍</title>
        <link rel="stylesheet" type="text/css" href="./css/mystyle.css">

    </head>
    <body>
        <h1>修改书籍</h1>
        <p style="color: red;margin-left: 50px;">${param.message}</p>
        <div>
            <form action="${pageContext.request.contextPath}/book/update" method="post">
                <table>
                    <tr>
                        <td class="from-left"><label>书籍id:</label></td>
                        <td>
                            <input class="from-right" type="text" name="id" placeholder="请输入书籍id" value="${requestScope.book.id}" />
                        </td>
                    </tr>
                    <tr>
                        <td class="from-left"><label>书籍编号：</label></td>
                        <td>
                            <input class="from-right" type="text" name="bookCno" placeholder="请输入书籍编号" value="${requestScope.book.bookCno}" />
                        </td>
                    </tr>
                    <tr>
                        <td class="from-left"><label>书籍名称：</label></td>
                        <td>
                            <input class="from-right" type="text" name="bookName" placeholder="请输入书籍名称" value="${requestScope.book.bookName}" />
                        </td>
                    </tr>
                    <tr>
                        <td class="from-left"><label>可不可借</label></td>
                        <td>
                            <input type="radio" name="isValid"
                                   value="1"  ${1== requestScope.book.isValid ? 'checked' : ''}>
                            <label>可借</label>
                            <input type="radio" name="isValid"
                                   value="0"  ${1 !=requestScope.book.isValid ? 'checked' : ''}>
                            <label>不可借</label>
                        </td>
                    </tr>

                </table>

                <div style="margin: 15px 100px;">
                    <input class="form-btn" type="submit" value="修改">
                </div>
            </form>
        </div>
    </body>
</html>
