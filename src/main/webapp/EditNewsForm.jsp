<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<html>
<head>
    <title></title>
</head>
<body>
<form method="post">
    <table>
        <h1 style="text-align: center; font-style: italic;"> HABER GÜNCELLE  </h1>
        <tr>
            <td><h3> Title: </h3></td>
            <td><textarea name="txtTitle"> ${edithaber.title} </textarea></td>
        </tr>
        <tr>
            <td>
                <h3>Date: </h3>
            </td>
            <td><textarea name="txtDate"></textarea></td>
        </tr>
        <tr>
            <td>
                <h3>Description: </h3>
            </td>
            <td>
                <textarea name="txtdesc"> ${edithaber.description} </textarea>
            </td>
        </tr>
        <tr>
            <td>
                <h3>Detail: </h3>
            </td>
            <td>
                <textarea name="txtdetail"> ${edithaber.detail} </textarea>
            </td>
        </tr>
        <tr>
            <td>
                <h3>Category: </h3>
            </td>
            <td>
                <select name="item">
                    <option value="Magazin" <c:if test="${edithaber.category.contains('Magazin')}"> selected="selected" </c:if>  name="magazin">Magazin</option>
                    <option value="Spor" <c:if test="${edithaber.category.contains('Spor')}"> selected="selected" </c:if>  name="spor">Spor</option>
                    <option value="Saglik" <c:if test="${edithaber.category.contains('Saglik')}"> selected="selected" </c:if>  name="Saglik">Saglik</option>
                    <option value="Moda" <c:if test="${edithaber.category.contains('Moda')}"> selected="selected" </c:if> name="moda">Moda </option>
                    <option value="Gundem" <c:if test="${edithaber.category.contains('Gundem')}"> selected="selected" </c:if>  name="gundem">Gundem</option>
                    <option value="Yasam" <c:if test="${edithaber.category.contains('Yasam')}"> selected="selected" </c:if>  name="yasam">Yasam</option>
                    <option value="Ekonomi" <c:if test="${edithaber.category.contains('Ekonomi')}"> selected="selected" </c:if>  name="ekonomi">Ekonomi</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>
                <h3> Image URL : </h3>
            </td>
            <td>
                <textarea name="txtimg"> ${edithaber.image} </textarea>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" id="btnSave" value =  "Save" /><br>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
