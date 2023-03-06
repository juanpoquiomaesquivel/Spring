package com.seleniumexpress.beanlifecycle.annotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDAO {

	private String driver;
	private String url;
	private String userName;
	private String password;
	// my connection obj
	Connection con;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		System.out.println("setting driver..");
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		System.out.println("setting url..");
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("setting userName..");
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("setting password..");
		this.password = password;
	}

	// @PostConstruct
	public void init() throws ClassNotFoundException, SQLException {
		System.out.println("inside the custom init method");
		createStudentDBConnection();
	}

	public void createStudentDBConnection() throws ClassNotFoundException, SQLException {
		System.out.println("creating connection..");
		// load driver
		Class.forName(driver);

		// get a connection
		con = DriverManager.getConnection(url, userName, password);
	}

	public void closeConnection() throws SQLException {
		// closing the connection
		con.close();
	}

	// @PreDestroy	
	public void destroy() throws SQLException {
		// clean up job
		System.out.println("inside destroy method");
		closeConnection();
	}

	public void selectAllRows() throws SQLException {
		System.out.println("Retrieving all students data");

		// execute query
		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT * FROM esnew.hotelstudentinfo;");

		while (rs.next()) {
			int studentId = rs.getInt(1);
			String studentName = rs.getString(2);
			double hostelFees = rs.getDouble(3);
			String foodType = rs.getString(4);

			System.out.println(studentId + " " + studentName + " " + hostelFees + " " + foodType);
		}
	}

	public void deleteStudentRecord(int studentId) throws SQLException {
		// execute query
		Statement stmt = con.createStatement();

		stmt.executeUpdate("DELETE FROM esnew.hotelstudentinfo where Student_Id = " + studentId);

		System.out.println("Recorded deleted with the id " + studentId);
	}
}
