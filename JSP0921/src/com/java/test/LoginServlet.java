package com.java.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("여기는 doGet");
		out.println("아이디: " + id);
		out.println("비밀번호: " + pw);
		
		String pageNum = request.getParameter("page");
		
		PrintWriter out2 = response.getWriter();
		out2.println("페이지: " + pageNum);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
//		response.setContentType("text/html;charset=UTF-8");
//		PrintWriter out = response.getWriter();
//		out.println("여기는 doPost");
//
//		out.println("아이디: " + id);
//		out.println("비밀번호: " + pw);
//		
//
//		String pageNum = request.getParameter("page");
//		response.setContentType("text/html;charset-UTF-8");
//		PrintWriter out2 = response.getWriter();
//		out2.println("페이지: " + pageNum);
	}

}
