package com.kb.www.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.kb.www.dao.BoardDAO;
import com.kb.www.vo.ArticleVO;

//오버플로우 오류방지로 static으로 설정한 getConnection() 불러오기
import static com.kb.www.common.JdbcUtil.*;

//ArticleListAction에서 호출해야한다.
public class BoardService {
	public ArrayList<ArticleVO> getArticleList() {
		BoardDAO dao = BoardDAO.getInstance();
		Connection con = getConnection();
		dao.setConnection(con);
		ArrayList<ArticleVO> list = dao.getArticleList();
		close(con);
		return list;
	}

	public ArticleVO getArticleDetail(String num) {
		BoardDAO  dao = BoardDAO.getInstance();
		Connection con = getConnection();
		dao.setConnection(con);
		ArticleVO article = dao.getArticleDetail(num);
		close(con);
		return article;
	}
}
