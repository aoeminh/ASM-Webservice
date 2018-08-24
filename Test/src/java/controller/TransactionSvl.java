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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.client.Client;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author apple
 */
public class TransactionSvl extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

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
        //processRequest(request, response);
        HttpSession session = request.getSession();
        com.example.service.Partner partnerSes = (Partner) session.getAttribute("partner");
        String clientID = request.getParameter("clientid");
        String password = request.getParameter("cpassword");
        String checkFee = request.getParameter("check");
        String transName = request.getParameter("transname");
        //money of partner before transaction
        Date date = new Date();
        try {
            int moneyofPartner = partnerSes.getPartnermoney();
            int money = Integer.parseInt(request.getParameter("money"));

            com.example.service.Client client = new com.example.service.Client();
            client = checkClient(clientID, password);
            //money of client before transaction
            boolean checkUpdateClient = false;
            boolean checkUpdatePartner = false;

            int moneyOfClient = client.getCmoney();
            int fee = caculateFee(money);
            if (client != null) {
                if (checkFee != null) {

                    //money of client and partner before transaction
                    int clientMoneyChange = moneyOfClient - (fee + money);
                    int partnerMoneyChange = moneyofPartner + money;
                    //transaction
                    //update money for client and partner;
                    updateCLientMoney(clientID, clientMoneyChange);
                    updatePartnerMoney(partnerSes.getPartneraccount(), partnerMoneyChange);
                    userHis(transName, money, -fee, client.getClienid());
                    partnerHis(transName, money, 0, partnerSes.getPartnerid());

                } else {

                    //money of client and partner before transaction
                    int clientMoneyChange = moneyOfClient - money;
                    int partnerMoneyChange = moneyofPartner + (money - fee);
                    //transaction
                    //update money for client and partner;
                    checkUpdateClient = updateCLientMoney(clientID, clientMoneyChange);
                    checkUpdatePartner = updatePartnerMoney(partnerSes.getPartneraccount(), partnerMoneyChange);
                    userHis(transName, money, 0, client.getClienid());
                    partnerHis(transName, money, -fee, partnerSes.getPartnerid());

                }

//                if (checkUpdateClient && checkUpdatePartner) {
//                    request.getRequestDispatcher("success.jsp").forward(request, response);
//                } else {
//                    request.getRequestDispatcher("error.jsp").forward(request, response);
//                }
                request.getRequestDispatcher("success.jsp").forward(request, response);
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

    private boolean updateCLientMoney(java.lang.String clienid, int money) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.example.service.CheckPartnerService port = service.getCheckPartnerServicePort();
        return port.updateCLientMoney(clienid, money);
    }

    private boolean updatePartnerMoney(java.lang.String partnerid, int money) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.example.service.CheckPartnerService port = service.getCheckPartnerServicePort();
        return port.updatePartnerMoney(partnerid, money);
    }

    public int caculateFee(int money) {
        if (money <= 100000) {
            return 10000;
        } else if (money > 100000 && money <= 500000) {
            return money * 4 / 100;
        } else if (money > 500000 && money <= 1000000) {
            return (money * 3) / 100;
        } else if (money > 1000000 && money <= 5000000) {
            return (money * 2) / 100;
        } else if (money > 5000000) {
            return money / 100;
        } else {
            return 0;
        }
    }

    private com.example.service.Client checkClient(java.lang.String id, java.lang.String password) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.example.service.CheckPartnerService port = service.getCheckPartnerServicePort();
        return port.checkClient(id, password);
    }

    private boolean partnerHis(java.lang.String transname, int money, int fee, java.lang.String partnerid) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.example.service.CheckPartnerService port = service.getCheckPartnerServicePort();
        return port.partnerHis(transname, money, fee, partnerid);
    }

    private boolean userHis(java.lang.String transname, int money, int fee, java.lang.String clientid) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.example.service.CheckPartnerService port = service.getCheckPartnerServicePort();
        return port.userHis(transname, money, fee, clientid);
    }

}
