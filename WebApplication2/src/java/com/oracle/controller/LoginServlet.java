/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.controller;
import com.oracle.dao.LoginDao;
import com.oracle.entity.Accoutnt;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Albin
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
    @Inject
private LoginDao dao;
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String uname=request.getParameter("uname");
      String password=request.getParameter("pwd");
        Accoutnt ac=dao.login(uname, password);
      if(ac!=null){
        request.setAttribute("accInfo", ac);
          
        RequestDispatcher rqsD=request.getRequestDispatcher("index.jsp");
        
        rqsD.forward(request, response);
        
      }
      else{
        response.sendRedirect("LoingJSP.jsp?ERRORMSG=wrong credentials");
      }
        }
    }

   

