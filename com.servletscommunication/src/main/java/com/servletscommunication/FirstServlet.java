package com.servletscommunication;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		System.out.println("control came to first servlet");
		String value=req.getParameter("data");
		req.setAttribute("data", value);
		RequestDispatcher rd = req.getRequestDispatcher("sec");
		rd.forward(req, res);
	}
}
