package com.service.hello;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class StudentRepository {

	Connection con = null;
	
	public StudentRepository() {
		
		String url="jdbc:mysql://localhost:3306/STUDENT_DB?autoReconnect=true&useSSL=false";
		String user="user";
		String password="user";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public Student getStudent(int roll) {
		String query="select * from STUDENT where ROLL_NO ="+ roll;
		Student s = new Student();
		try{
			Statement st = con.createStatement();
			ResultSet rs =  st.executeQuery(query);
			if(rs.next()) {
				s.setRollNo(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setDate_Of_Birth(rs.getString(3));
				s.setPhysics(rs.getInt(4));
				s.setChemistry(rs.getInt(5));
				s.setMathematics(rs.getInt(6));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return s;
	}
	
	
	public List<Student> getAllStudents(){
		String query="select * from STUDENT";
		List<Student> lstStudent = new ArrayList<Student>();
		try{
			Statement st = con.createStatement();
			ResultSet rs =  st.executeQuery(query);
			while(rs.next()) {
				Student s =new Student();
				s.setRollNo(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setDate_Of_Birth(rs.getString(3));
				s.setPhysics(rs.getInt(4));
				s.setChemistry(rs.getInt(5));
				s.setMathematics(rs.getInt(6));
				lstStudent.add(s);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return lstStudent;
	}
	
	public void Save(Student s) {
		String query="insert into STUDENT values (?,?,?,?,?,?)";
		try{
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1, s.getRollNo());
			st.setString(2, s.getName());
			st.setString(3, s.getDate_Of_Birth());
			st.setInt(4, s.getPhysics());
			st.setInt(5, s.getChemistry());
			st.setInt(6, s.getMathematics());
			st.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void Update(Student s) {
		String query="update STUDENT set name=?,date_of_birth=?,physics=?,chemistry=?,mathematics=? where roll_no=?";
		try{
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1,s.getName());
			st.setString(2, s.getDate_Of_Birth());
			st.setInt(3, s.getPhysics());
			st.setInt(4, s.getChemistry());
			st.setInt(5, s.getMathematics());
			st.setInt(6, s.getRollNo());
			st.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void Delete(int roll) {
		String query="delete from STUDENT where roll_no=?";
		try{
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1, roll);
			st.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
