package com.kb.www.dao;
import java.sql.Connection;


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
}
