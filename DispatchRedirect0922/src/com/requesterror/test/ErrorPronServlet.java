package com.requesterror.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
		// request.html의 name을 파라미터로
		String choose = request.getParameter("choose");
		if (choose == null) {
			// 오류 메시지를 request scope에 binding
			request.setAttribute("error_message", "체크되지 않았습니다.");
			// error.jsp로 수행이동 --> request scope를 이용하기 때문에 디스패치 요청 방식으로 이동
			RequestDispatcher rdp = request.getRequestDispatcher("/dispatch/error.jsp");
			rdp.forward(request, response);
			return;
		}
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("");
		out.println("request 체크하여 넘어왔습니다." + choose);
		out.println("");

	}

}
