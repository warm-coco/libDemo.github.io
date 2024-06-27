<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>书籍详情</title>
</head>
<body>
<h1>书籍详情</h1>
<c:if test="${not empty book}">
    <p>ID: ${book.id}</p>
    <p>书籍号: ${book.bookCno}</p>
    <p>书籍名称: ${book.bookName}</p>
    <p>书籍状态: ${book.isValid eq 1 ? '可借' : '不可借'}</p>
    <p>创建时间: ${book.createTime}</p>
    <p>更新时间: ${book.updateTime}</p>
</c:if>
<c:if test="${empty book}">
    <p>未找到该书籍。</p>
</c:if>
</body>
</html>