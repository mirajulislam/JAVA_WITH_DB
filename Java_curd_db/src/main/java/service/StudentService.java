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
public class StudentService implements StudentDao {

	DbConnection dbConnection = new DbConnection();
	Connection connection = dbConnection.getConnect();

	public List<Student> getAllStudent() throws SQLException {
		List<Student> studentList = new ArrayList<Student>();
		String sql = "SELECT * FROM t_student";
		Statement statement;
		statement = connection.createStatement();
		ResultSet result = statement.executeQuery(sql);
		while (result.next()) {
			Student std = new Student();
			std.setStudent_id(result.getInt("student_id"));
			std.setStudent_name(result.getString("student_name"));
			std.setAge(result.getInt("age"));
			std.setAddress(result.getString("address"));
			std.setMobile(result.getString("mobile"));
			std.setDate(result.getDate("Date"));
			studentList.add(std);
		}

		return studentList;
	}

	public void deleteStudent(Integer student_id) throws SQLException {
		String query = "delete from t_student where student_id =?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, student_id);
		ps.executeUpdate();
	}

	public void updateStudent(Student student) throws SQLException {
		String query = "update t_student set age=? where student_id = ?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, student.getAge());
		ps.setInt(2, student.getStudent_id());
		ps.executeUpdate();
	}

	public void insertStudent(List<Student> list) throws SQLException {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();

		String sql = "INSERT INTO t_student(student_id,student_name,age,mobile,address,date) values(?,?,?,?,?,?)";
		PreparedStatement statement = connection.prepareStatement(sql);

		for (Student student : list) {
			statement.setInt(1, student.getStudent_id());
			statement.setString(2, student.getStudent_name());
			statement.setInt(3, student.getAge());
			statement.setString(4, student.getMobile());
			statement.setString(5, student.getAddress());
			statement.setString(6, formatter.format(date));
			statement.executeUpdate();
		}
	}

	public Student getStudent(int student_id) throws SQLException {
		String sql = "SELECT * FROM t_student where student_id=?";
		PreparedStatement ps = null;
		ResultSet result = null;
		ps = connection.prepareStatement(sql);
		ps.setInt(1, student_id);
		result = ps.executeQuery();
		boolean check = false;
		Student std = new Student();
		while (result.next()) {
			check = true;
			std.setStudent_id(result.getInt("student_id"));
			std.setStudent_name(result.getString("student_name"));
			std.setAge(result.getInt("age"));
			std.setAddress(result.getString("address"));
			std.setMobile(result.getString("mobile"));
			std.setDate(result.getDate("Date"));
		}
		if (check == true) {
			return std;
		} else
			return null;
	}
}
