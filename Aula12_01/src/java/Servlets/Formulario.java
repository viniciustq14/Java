/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Negocios.Calculo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lab1
 */
public class Formulario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Calculo c =new Calculo();
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Formulario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p> Calculadora </p>");
            out.println("<form action='' method='GET' name='Calculadora'>");
            out.println("Primeiro Numero <input type ='text' name='n1' >");
            out.println("<br>");
             out.println("Segundo  Numero <input type ='text' name='n2' >");
             out.println("<br>");
             out.println("<input type='submit' value ='Somar' onclick=''>");
             out.println("<input type='submit' value ='Subtrair'>");
             out.println("<input type='submit' value ='Multiplicar' >");
             out.println("<input type='submit' value ='Dividir' >");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
            int n1= Integer.parseInt(request.getParameter("n1"));
            int n2=Integer.parseInt(request.getParameter("n2"));
            out.println(String.format("Soma : %d",n1));
            out.println(String.format("Soma : %d",n2));
            out.println(String.format("Soma : %f",c.somar(n2, n2)));
            out.println(String.format("Subtraçãp : %f",c.subtrair(n2, n2)));
            out.println(String.format("Multiplicação : %f",c.multiplicar(n2, n2)));
            out.println(String.format("divisao : %f",c.dividir(n2, n2)));
            
            
        }
    }
    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
