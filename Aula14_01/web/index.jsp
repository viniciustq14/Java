<%-- 
    Document   : index
    Created on : 06/11/2018, 23:17:58
    Author     : lab1
--%>

<%@page import="negocio.Calculo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calculadora</h1>
        <form >
            Insira o primeiro numero <input type="text" name="n1"> <br>
            Insira o segundo numero <input type="text" name="n2"><br>
            <input type="submit" name="b" value="Somar">
            <input type="submit" name="b" value="subtrair">
            <input type="submit" name="b" value="multiplicar">
            <input type="submit" name="b" value="dividir">
        </form>
        <%

            if (request.getParameter("n1") != null && request.getParameter("n2") != null) {
                float a, b;

                a = Float.parseFloat(request.getParameter("n1"));
                b = Float.parseFloat(request.getParameter("n2"));

                Calculo c = new Calculo(a, b);
                if (request.getParameter("b").equals("Somar") ) {
                    c.somar();
                }
                if (request.getParameter("b").equals("subtrair") ) {
                    c.subtrair();
                }
                if (request.getParameter("b").equals("multiplicar")) {
                    c.multiplicar();
                }
            if (request.getParameter("b").equals("dividir")) {
                    c.dividir();
                }
                out.println(String.format("Resultado %f", c.getRes()));
            }
        %>
    </body>
</html>
