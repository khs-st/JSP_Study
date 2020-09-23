package com.kb.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.kb.www.vo.ArticleVO;

//PreaperdStatement와 ResultSet을 JdbcUtil의 close를 이용해 close 해줘야함
import static com.kb.www.common.JdbcUtil.close;

/*DB에 입력한 명령문
 * create table boardtest(
num int auto_increment primary key,
subject varchar(100) not null,
content text,
hit int default 0,
wdate datetime default now(),
udate datetime,
ddate datetime);
 * */

//싱글톤패턴 개념 커넥션풀을 만들기위한 / 객체를 여러개 생성하지 않고 기존에 있는 객체에서 쓰레드를 사용
public class BoardDAO {
	private Connection con;

	// 다른 곳에서 못쓰도록 만듬
	private BoardDAO() {

	}

	// getInstance()로 쓰레드를 가져올 수 있음
	public static BoardDAO getInstance() {
		return LazyHolder.INSTANCE;
	}

	private static class LazyHolder {
		private static final BoardDAO INSTANCE = new BoardDAO();
	}

	public void setConnection(Connection con) {
		this.con = con;
	}

	// BoardService를 만들고 난 후부터 작성함, 쿼리문입력하기
	public ArrayList<ArticleVO> getArticleList() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<ArticleVO> list = new ArrayList<ArticleVO>();
		try {
			pstmt = con.prepareStatement("select * from boardtest");
			rs = pstmt.executeQuery();
			// while문을 이용하면 데이터가 있는동안은 계속 반복되므로 데이터가 없을때까지 확인가능
			while (rs.next()) {
				ArticleVO vo = new ArticleVO();
				vo.setArticleNumber(rs.getInt("num"));
				vo.setArticleSubject(rs.getString("subject"));
				vo.setArticleContents(rs.getString("content"));
				vo.setHit(rs.getInt("hit"));
				vo.setWriteDate(rs.getString("wdate"));
				vo.setUpdateDate(rs.getString("udate"));
				vo.setDeleteDate(rs.getString("ddate"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return list;
	}

	// BoardService를 만들고 난 후부터 작성함, 쿼리문입력하기
	public ArticleVO getArticleDetail(String num) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArticleVO vo = new ArticleVO();
		try {
			pstmt = con.prepareStatement("select * from boardtest where num="+num);
			rs = pstmt.executeQuery();
			// while문을 이용하면 데이터가 있는동안은 계속 반복되므로 데이터가 없을때까지 확인가능
			while (rs.next()) {
				vo.setArticleNumber(rs.getInt("num"));
				vo.setArticleSubject(rs.getString("subject"));
				vo.setArticleContents(rs.getString("content"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return vo;
	}
}
