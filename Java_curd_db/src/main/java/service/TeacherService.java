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

import org.apache.log4j.Logger;

import connectionDb.DbConnection;
import dao.TeacherDao;
import model.Teacher;

public class TeacherService implements TeacherDao{
	
	DbConnection dbConnection = new DbConnection();
	Connection connection = dbConnection.getConnect();
	static Logger logger = Logger.getLogger(TeacherService.class);

	public List<Teacher> getAllTeacher() throws SQLException {
		List<Teacher> teacherList = new ArrayList<Teacher>();
		String sql = "SELECT * FROM t_teacher";
		Statement statement;
		statement = connection.createStatement();
		ResultSet result = statement.executeQuery(sql);
		while (result.next()) {
			Teacher tec = new Teacher();
			tec.setTeacher_id(result.getInt("student_id"));
			tec.setTeacher_name(result.getString("student_name"));
			tec.setAge(result.getInt("age"));
			tec.setAddress(result.getString("address"));
			tec.setMobile(result.getString("mobile"));
			tec.setDate(result.getDate("Date"));
			teacherList.add(tec);
		}

		return teacherList;
	}

	public void deleteTeacher(Integer teacher_id) throws SQLException {
		String query = "delete from t_teacher where teacher_id =?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, teacher_id);
		ps.executeUpdate();
		logger.debug("Delete Successfully Teacher Id : "+teacher_id);	
	}

	public void updateTeacher(Teacher teacher) throws SQLException {
		String query = "update t_teacher set age=? where teacher_id = ?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, teacher.getAge());
		ps.setInt(2, teacher.getTeacher_id());
		ps.executeUpdate();
		logger.debug("Delete Successfully : ");
	}

	public void insertTeacher(List<Teacher> list) throws SQLException {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();

		String sql = "INSERT INTO t_teacher(teacher_id,teacher_name,age,mobile,address,date) values(?,?,?,?,?,?)";
		PreparedStatement statement = connection.prepareStatement(sql);

		for (Teacher teacher : list) {
			statement.setInt(1, teacher.getTeacher_id());
			statement.setString(2, teacher.getTeacher_name());
			statement.setInt(3, teacher.getAge());
			statement.setString(4, teacher.getMobile());
			statement.setString(5, teacher.getAddress());
			statement.setString(6, formatter.format(date));
			statement.executeUpdate();
			logger.debug("Insert Successfully : ");
		}
		
	}

	public Teacher getTeacher(int teacher_id) throws SQLException {
		String sql = "SELECT * FROM t_teacher where teacher_id=?";
		PreparedStatement ps = null;
		ResultSet result = null;
		ps = connection.prepareStatement(sql);
		ps.setInt(1, teacher_id);
		result = ps.executeQuery();
		boolean check = false;
		Teacher tec = new Teacher();
		while (result.next()) {
			check = true;
			tec.setTeacher_id(result.getInt("teacher_id"));
			tec.setTeacher_name(result.getString("teacher_name"));
			tec.setAge(result.getInt("age"));
			tec.setAddress(result.getString("address"));
			tec.setMobile(result.getString("mobile"));
			tec.setDate(result.getDate("Date"));
			logger.debug("Select Data : ");
		}
		if (check == true) {
			return tec;
		} else
			return null;
	}

}
