package com.servletscommunication;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sec")
public class SecondServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		System.out.println("control came to second servlet");
		String str = (String) req.getAttribute("data");
		int count = str.length();
		res.getWriter().print("Character count = "+count);
	}
}
