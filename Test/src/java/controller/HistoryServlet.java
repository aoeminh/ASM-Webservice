/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.example.service.CheckPartnerService_Service;
import com.example.service.Partner;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import sun.util.BuddhistCalendar;
import com.example.service.Partnerhistory;
import java.util.List;

/**
 *
 * @author apple
 */
public class HistoryServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ASMWebservice-war/CheckPartnerService.wsdl")
    private CheckPartnerService_Service service;

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
//        processRequest(request, response);
           String username = request.getParameter("username");
        String password = request.getParameter("password");
        try {
            Partner partner = checkPartner(username, password);
//            session.setAttribute("partner", partner.getPartneraccount());
//            session.setAttribute("moneyPn", partner.getPartnermoney().toString());
          
           List<Partnerhistory> listHis = getPartnerHis(partner.getPartnerid(), "", "");
           
           request.setAttribute("listHis", listHis);
            if (partner.getPartnerid().equals(username)) {
                request.getRequestDispatcher("history.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        } catch (Exception ex) {
            request.getRequestDispatcher("error.jsp").forward(request, response);

        }
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

    private Partner checkPartner(java.lang.String id, java.lang.String password) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.example.service.CheckPartnerService port = service.getCheckPartnerServicePort();
        return port.checkPartner(id, password);
    }

    private java.util.List<com.example.service.Partnerhistory> getPartnerHis(java.lang.String partnerid, String startDate, String endDate) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.example.service.CheckPartnerService port = service.getCheckPartnerServicePort();
        return port.getPartnerHis(partnerid, startDate, endDate);
    }

    
    
}
