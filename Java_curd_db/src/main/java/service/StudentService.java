/**
 * 
 */
package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import connectionDb.DbConnection;
import dao.StudentDao;
import model.Student;

/**
 * @author mirajul.islam
 *
 */
public class StudentService implements StudentDao{
	DbConnection dbConnection = new DbConnection();
	Connection connection=dbConnection.getConnect();

	public List<Student> getAllStudent() {
		List<Student> studentList = new ArrayList<Student>();
		String sql = "SELECT * FROM t_student";
//		dbConnection.getConnect();		 
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()){
				int student_id=result.getInt("student_id");
			    String student_name = result.getString("student_name");
			    int age=result.getInt("age");
			    String mobile = result.getString("mobile");	
			    String address=result.getString("address");			   	
			    Date date =result.getDate("Date");
			    Student std=new Student(student_id, student_name, age, mobile, address, date);
			    studentList.add(std);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		// TODO Auto-generated method stub
		return studentList;
	}

	/* (non-Javadoc)
	 * @see dao.StudentDao#deleteStudent(java.lang.Integer)
	 */
	public void deleteStudent(Integer student_id) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see dao.StudentDao#updateStudent(model.Student)
	 */
	public int updateStudent(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see dao.StudentDao#insertStudent(model.Student)
	 */
	public void insertStudent(List<Student> list) throws SQLException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	    Date date = new Date();  
	    
		String sql="INSERT INTO t_student(student_id,student_name,age,mobile,address,date) values(?,?,?,?,?,?)";	
		PreparedStatement  statement=connection.prepareStatement(sql);
		
		for(Student student:list) {
			statement.setInt(1, student.getStudent_id());
			statement.setString(2, student.getStudent_name());
			statement.setInt(3, student.getAge());
			statement.setString(4, student.getMobile());
			statement.setString(5, student.getAddress());
			statement.setString(6, formatter.format(date));
			statement.executeUpdate();
		}
	}

	/* (non-Javadoc)
	 * @see dao.StudentDao#getStudent(int)
	 */
	public Student getStudent(int student_id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
