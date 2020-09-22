package com.kb.www.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kb.www.common.Action;
import com.kb.www.common.ActionForward;
import com.kb.www.vo.ArticleVO;

public class ArticleListAction implements Action {
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<ArticleVO> articleList = new ArrayList();
		//게시글 없을 때 '게시글이 없습니다'를 출력하기 위해서 객체생성을 주석처리
		ArticleVO articleVo = new ArticleVO();
		articleVo.setArticleNumber(1);
		articleVo.setArticleSubject("테스트 글 제목");		articleVo.setArticleContents("테스트 글 내용");
		articleVo.setHit(1);
		articleVo.setWriteDate("2020-09-22 13:10");
		articleVo.setUpdateDate("2020-09-22 13:15");
		articleVo.setDeleteDate("2020-09-22 13:20");

		articleList.add(articleVo);

		ArticleVO articleVo2 = new ArticleVO();
		articleVo2.setArticleNumber(2);
		articleVo2.setArticleSubject("테스트2 글 제목");
		articleVo2.setArticleContents("테스트2 글 내용");
		articleVo2.setHit(2);
		articleVo2.setWriteDate("2020-09-22 15:10");
		articleVo2.setUpdateDate("2020-09-22 15:15");
		articleVo2.setDeleteDate("2020-09-22 15:20");

		articleList.add(articleVo2);

		ActionForward forward = new ActionForward();
		request.setAttribute("list", articleList);
		forward.setPath("/views/list.jsp");
		return forward;
	}
}
