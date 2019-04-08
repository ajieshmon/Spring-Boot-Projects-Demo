package com.threeedge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.threeedge.jdbc.StudentJdbc;
import com.threeedge.model.Student;


public class StudentDao {
    public Connection connection=null;

	public String saveStudentData(Student student) throws SQLException {
		 String msg=null;
		 String query="insert into student_tbl values(?,?,?,?)";
		 connection=StudentJdbc.getCon();
		 PreparedStatement pstmnt=connection.prepareStatement(query);
		 pstmnt.setInt(1, student.getStudentId());
		 pstmnt.setString(2, student.getStudentName());
		 pstmnt.setString(3, student.getCollege());
		 pstmnt.setDouble(4, student.getPercentage());
		 int num=pstmnt.executeUpdate();
		 if(num>0)
		 {
			 msg="Data has been saved successfully...";
		 }
		return msg;
	}

	public List<Student> getStudentData() throws SQLException {
		List<Student> li=new LinkedList<Student>();
		ResultSet rs=null;
		String query="Select * from student_tbl";
		connection=StudentJdbc.getCon();
		PreparedStatement pstmnt=connection.prepareStatement(query);
		rs=pstmnt.executeQuery();
		while(rs.next())
		{
			Student s=new Student();
			s.setStudentId(rs.getInt(1));
			s.setStudentName(rs.getString(2));
			s.setCollege(rs.getString(3));
			s.setPercentage(rs.getDouble(4));
			li.add(s);
		}
		return li;
	}

	public String updateStudentData(Student student) throws SQLException {
		String msg=null;
		 String query="update student_tbl set studentName=?,collegeName=?,percentage=? where studentId=?";
		 connection=StudentJdbc.getCon();
		 PreparedStatement pstmnt=connection.prepareStatement(query);
		 pstmnt.setString(1, student.getStudentName());
		 pstmnt.setString(2, student.getCollege());
		 pstmnt.setDouble(3, student.getPercentage());
		 pstmnt.setInt(4, student.getStudentId());
		 int num=pstmnt.executeUpdate();
		 if(num>0)
		 {
			 msg="Data has been modified successfully...";
		 }
		return msg;
	}

	public String deleteStudentData(int id) throws SQLException {
		String msg=null;
		 String query="delete from student_tbl where studentId=?";
		 connection=StudentJdbc.getCon();
		 PreparedStatement pstmnt=connection.prepareStatement(query);
		 pstmnt.setInt(1, id);
		 int num=pstmnt.executeUpdate();
		 if(num>0)
		 {
			 msg="Data has been deleted successfully...";
		 }
		return msg;
	}

}
