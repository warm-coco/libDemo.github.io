<%--
  Created by IntelliJ IDEA.
  User: 杨涛
  Date: 2024/1/2
  Time: 9:23
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<style>
    button{
        margin: 15px 10px;
        background-color: antiquewhite;
        height: 40px;
        width: 80px;
        font-size: 18px;
        border-radius: 10px;
    }
    button:hover{
        background-color: #00ff55;
    }

    .table_box{
        margin: 30px auto;
        width: 80%;
    }
    .table_header td{
        padding: 10px 10px;
        color: rgb(70,167,159);
        font-size: 1.1em;
        font-weight: bold;
        text-align: center;
        border: 1px solid #CBD6DE;
    }
    .table_row td{
        padding: 5px 10px;
        border: 1px solid #CBD6DE;
    }
</style>
    <head>
        <title>图书系统</title>

        <link rel="stylesheet" type="text/css" href="./css/table.css">

        <script>
            function addBook(){
                window.location.href ="${pageContext.request.contextPath}/bookadd.jsp"
            }

            function findBook(){
                window.location.href ="${pageContext.request.contextPath}/findbook.jsp"
            }

            function removebook(id){
                if (confirm("确定要删除吗")){
                    location.href="${pageContext.request.contextPath}/book/remove/"+id;
                }
            }

        </script>

    </head>

    <body>
        <%-- <h1>this is a booklist page.</h1>--%>
        <div class="table_box">
            <div style="margin: 5px 5px">
                <button onclick="addBook()">添加</button>
                <button onclick="findBook()">查询</button>

            </div>

            <table>
                <tr class="table_header">
                    <td>选择</td>
                    <td>ID</td>
                    <td>书籍号</td>
                    <td>书籍名称</td>
                    <td>书籍状态</td>
                    <td>创建时间</td>
                    <td>更新时间</td>
                    <td style="width: 130px">操作</td>
                </tr>
                <c:forEach items = "${requestScope.booklist}" var="book">
                    <tr class="table_row">
                        <td>
                            <input type="checkbox" name="bookChk" value="${book.id}"/>
                        </td>
                        <td>${book.id}</td>
                        <td>${book.bookCno}</td>
                        <td>${book.bookName}</td>
                        <td>${(1==book.isValid) ? '可借' : '不可借' }</td>
                        <td>${book.createTime}</td>
                        <td>${book.updateTime}</td>
                        <td style="width: 130px;display: flex;padding-top: 20px">
                            <a href="${pageContext.request.contextPath}/book/detail?id=${book.id}">修改</a>&nbsp;&nbsp;&nbsp;
                            <a href="javascript:void(0);"onclick="removebook('${book.id}')">删除</a>&nbsp;&nbsp;&nbsp;

                            <form id="his_${book.id}"
                                  action="${pageContext.request.contextPath}/BookBorrowRecord/add" month="post">
                                <input type="hidden" name="book" value="${book.id}"/>
                                <a href="document.getElementById('his_${book.id}').submit();">借书</a>
                            </form>
                        </td>
                    </tr>
                </c:forEach>

            </table>

            <p style="color: red ;margin-left: 50px;">${param.message}</p>

        </div>
    </body>
</html>
