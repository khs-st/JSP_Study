package com.redirect.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorPronServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String choose = request.getParameter("choose");
		if (choose == null) {
			//response.sendRedirect("/redirect/error.html"); //절대경로
			response.sendRedirect("redirect/error.html"); //서블릿 기준으로 URL 작성해야한다.(상대경로)
			return;
		}
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("");
		out.println("redirect 체크하여 넘어왔습니다." + choose);
		out.println("");

	}

}
