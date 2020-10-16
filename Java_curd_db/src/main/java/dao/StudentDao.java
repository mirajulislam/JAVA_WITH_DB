/**
 * 
 */
package dao;

import java.sql.SQLException;
import java.util.List;

import model.Student;


/**
 * @author mirajul.islam
 *
 */
public interface StudentDao {
	 public  List<Student>  getAllStudent()throws SQLException;
	 public void deleteStudent(Integer student_id)throws SQLException;	  
	 public void updateStudent(Student student)throws SQLException;	 
	 public void insertStudent(List<Student> list) throws SQLException;	 
	 public Student getStudent(int student_id)throws SQLException;

}
