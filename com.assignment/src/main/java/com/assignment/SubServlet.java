package com.assignment;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sub")

public class SubServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		int num= Integer.parseInt(req.getParameter("n1"));
		int num1= Integer.parseInt(req.getParameter("n2"));
		int diff = num-num1;
		resp.getWriter().print("DIff ="+diff);
	}
}
