package com.kb.www.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kb.www.common.Action;
import com.kb.www.common.ActionForward;
import com.kb.www.service.BoardService;
import com.kb.www.vo.ArticleVO;

public class DetailAction implements Action {
	// 9월 23일자 MysqlDB 연결 후 작성
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		
		BoardService svc = new BoardService();
		String num= request.getParameter("num"); //글번호 받음
		ArticleVO article = svc.getArticleDetail(num);
		ActionForward forward = new ActionForward();
		// article 데이터(Attribute)를 키값으로 DetailController로 넘겨줌
		request.setAttribute("num", article);
		forward.setPath("/views/detail.jsp");
		return forward;

	}
}
