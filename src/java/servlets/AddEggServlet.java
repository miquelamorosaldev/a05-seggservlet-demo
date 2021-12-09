/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import eggs.EggsManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alumne
 */
@WebServlet(name = "AddEggServlet", urlPatterns = {"/AddEggServlet"})
public class AddEggServlet extends HttpServlet {

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
        // Llegim el codi de l'ou passat per l'usuari, des del form de addNewEgg.jsp
        String eggCode = request.getParameter("eggCode");
        
        /**
         * Dins del servlet, validarem el codi d’ou, i enviarem el resultat a la mateixa JSP 
            Si és correcte: 
            Afegirem l’ou a la llista.
            Informarem a l’usuari, que s’ha afegit.
        */
        EggsManager eggsManager = new EggsManager();
        boolean addOK = eggsManager.addEgg(eggCode);
        request.setAttribute("addEggResponse","<p> L'ou s'ha afegit correctament al sistema.</p>");
        /*
            Si no és correcte.
            Informarem a l’usuari que el format no és vàlid.
            Si l’ou ja existeix.
            Informarem a l’usuari, que ja existeix aquest ou.
         */
        // TODO.
        
        
        // Declarar cap a on enviem les dades
        RequestDispatcher rd=request.getRequestDispatcher("addNewEgg.jsp");
        // Quina informació li envies a la JSP; ens serveix per enviar
        // tant la request com la response.
        rd.forward(request, response);
            
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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Error AddEggServlet GET Not Avaliable.</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Error AddEggServlet GET Not Avaliable.</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
