<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
            <h1 style="text-align: center; font-style: italic;"> HABER YARAT  </h1>
            <tr>
                <td><h3> Title: </h3></td>
                <td><textarea name="txtTitle"></textarea></td>
            </tr>
             <tr>
                 <td>
                 <h3>Date: </h3>
                 </td>
                 <td><textarea name="txtDate"> </textarea></td>
             </tr>
            <tr>
                <td>
                 <h3>Description: </h3>
                </td>
                <td>
                    <textarea name="txtdesc"> </textarea>
                </td>
            </tr>
            <tr>
                <td>
                    <h3>Detail: </h3>
                </td>
                <td>
                    <textarea name="txtdetail"> </textarea>
                </td>
            </tr>
            <tr>
                <td>
                    <h3>Category: </h3>
                </td>
                <td>
                    <select name="item">
                        <option value="Magazin" name="magazin">Magazin</option>
                        <option value="Spor" name="spor">Spor</option>
                        <option value="Saglik" name="saglik">Sağlık</option>
                        <option value="Moda" name="moda">Moda </option>
                        <option value="Gundem" name="gundem">Gundem</option>
                        <option value="Yasam" name="yasam">Yasam</option>
                        <option value="Ekonomi" name="ekonomi">Ekonomi</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>
                   <h3> Image URL : </h3>
                </td>
                <td>
                    <textarea name="txtimg"></textarea>
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
