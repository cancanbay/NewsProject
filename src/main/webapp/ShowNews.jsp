<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/headermenu.jsp" %>
<html>
<head>
    <link rel="stylesheet" href="style.css">
    <title>Baslik </title>
</head>
<body>
<form method="get">
    <table class="shownewstable">
        <tr>
                <tr class="title"><td> ${shownews.title}</td></tr>
                <tr><td> ${shownews.description}</td></tr>
                <tr><td><img src="${shownews.image}" width="500px" height="500px"></td></tr>
                <tr><td> ${shownews.detail}</td></tr>
        </tr>
    </table>
</form>
</body>
</html>