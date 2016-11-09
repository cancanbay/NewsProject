<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/headermenu.jsp" %>


<html>
<head>
    <link rel="stylesheet" href="style.css">
    <title>Title</title>
</head>
<body>

<form method="get" >


    <h2 style="padding-top: 50px">${newsquery.get(0).category} türündeki haberler</h2>
    <table>


        <c:forEach items="${newsquery}" var="haber">

            <tr>
                    <tr>
                        <td width="15%" height="15%" rowspan="2"><img src="${haber.image}" width="150px" height="150px"></td>
                        <td><a href="show-news?id=${haber.id}"> ${haber.title}</a></td>
                        <tr><td>${haber.detail}</td></tr>
                    </tr>
            </tr>
        </c:forEach>
    </table>

</form>
</body>
</html>
