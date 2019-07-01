<%-- 
    Document   : index
    Created on : 07/11/2018, 00:44:39
    Author     : lab1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Conversao de Massa</h1>
        <form action="ServletConversaoMassa">
            QT de Massa <input  type="text" name="massa" >
            <br>
            <input type="submit" name="converter" value="KL">
            <input type="submit" name="converter" value="Lbs">
        </form>
    </body>
</html>
