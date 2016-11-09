<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="tr.edu.anadolu.admin.models.News" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<title> tr.edu.anadolu.admin.models.News Website
</title>
<body>
    <h1 style="text-align: center; font-style: italic;"> HABER LİSTENİZ  </h1>
    <table>
        <tr>
            <th>Count</th>
            <th>Title</th>
            <th>Description</th>
            <th>Details</th>
            <th>Category</th>
            <th>Image URL</th>
        </tr>
        <c:forEach items="${haberler}" var="haber">
            <tr>
                <td>${ count=count+1 }</td>
                <td>${haber.title}</td>
                <td>${haber.description}</td>
                <td>${haber.detail}</td>
                <td>${haber.category}</td>
                <td>${haber.image}</td>
                <td><a href="edit-news?id=${haber.id}">Update</a></td>
                <td><a href="delete-news?id=${haber.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>