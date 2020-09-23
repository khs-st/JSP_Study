package com.kb.www.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kb.www.action.ArticleListAction;
import com.kb.www.common.Action;
import com.kb.www.common.ActionForward;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/list")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		ActionForward forward = null;
		Action action = new ArticleListAction();
		// 이벤트 처리 콘트롤러
		try {
			forward =action.execute(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 내질문!
		//if문의 forward가 널이아닐때 isRedirect 실행하는데 if문을 써서 sendRedirect일 경우를 만든이유: 현재 미완성/sendRedirect와 RequestDispatcher차이
		if (forward != null) {
			if (forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			} else {
				//else를 실행한다.
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

}
