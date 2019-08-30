package com.bank.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.web.domains.AccountBean;
import com.bank.web.services.AccountService;
import com.bank.web.serviecimpls.AccountServiceImpl;

@WebServlet("/account.do")
public class AccountController extends HttpServlet {

	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("맥락이 맞아 도착");
		AccountService service = new AccountServiceImpl();
		String money = request.getParameter("money");
		service.createAccount(money);
		
		// AccountBean acc = new AccountBean();
		// acc.setMoney(money);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
