package com.java.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoinOk
 */
@WebServlet("/JoinOK")
public class JoinOK extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JoinOK() {
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
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);

		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String phone1 = request.getParameter("phone1");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");
		String gender = request.getParameter("gender");

		System.out.println("-----------insert----------");
		System.out.println(name);
		System.out.println(id);
		System.out.println(pw);
		System.out.println(phone1 + phone2 + phone3);
		System.out.println(gender);
		System.out.println("---------------------------");

		String query = "insert into member2 values ('" + name + "', '" + id + "', '" + pw + "', '" + phone1 + "', '"
				+ phone2 + "', '" + phone3 + "', '" + gender + "')";

		String query1 = "select * from member2";
		System.out.println(query);
		Connection connection;
		Statement statement;
		ResultSet resultSet;

		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			String uid = "scott";
			String upw = "tiger";

			Class.forName(driver);
			connection = DriverManager.getConnection(url, uid, upw);
			statement = connection.createStatement();

			int i = statement.executeUpdate(query);

			resultSet = statement.executeQuery(query1);
			while (resultSet.next()) {
				String name1 = resultSet.getString("NAME");
				String id1 = resultSet.getString("ID");
				String pw1 = resultSet.getString("PW");
				String phone11 = resultSet.getString("PHONE1");
				String phone21 = resultSet.getString("PHONE2");
				String phone31 = resultSet.getString("PHONE3");
				String gender1 = resultSet.getString("GENDER");

				System.out.println("이름 : " + name1 + ", 아이디 : " + id1 + ", 비밀번호 : " + pw1 + ", 전화번호 : " + phone11
						+ phone21 + phone31 + ", 성별 :  " + gender1);

			}
			if (i == 1) {
				response.sendRedirect("JoinResult.jsp");
			} else {
				response.sendRedirect("join.html");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			response.sendRedirect("index.jsp");
		}
	}

}
