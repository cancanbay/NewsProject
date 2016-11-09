<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Can Canbay
  Date: 23.6.2016
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <form method="post">
               <%--<fmt:parseNumber var="idAsNum" type="number" value="${id}" />--%>
            <%--<c:if test="${idAsNum == 0}"> </c:if>--%>
            <h1> id'si ${id} olan Kayıt silindi.</h1>
                <h3>  Haber listenize dönmek için aşağıdaki butona tıklayabilirsiniz.</h3>
                <button type="submit" name="btnlistnews" >Tıklayınız</button>
        </form>

</body>
</html>
