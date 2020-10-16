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
	 public  List<Student>  getAllStudent();
	 public void deleteStudent(Integer student_id);	  
	 public int updateStudent(Student student);	 
	 public void insertStudent(List<Student> list) throws SQLException;	 
	 public Student getStudent(int student_id);

}
