/**
 * 
 */
package dao;

import java.sql.SQLException;
import java.util.List;

import model.Teacher;


/**
 * @author mirajul.islam
 *
 */
public interface TeacherDao {
	 public  List<Teacher>  getAllTeacher()throws SQLException;
	 public void deleteTeacher(Integer teacher_id)throws SQLException;	  
	 public void updateTeacher(Teacher teacher)throws SQLException;	 
	 public void insertTeacher(List<Teacher> list) throws SQLException;	 
	 public Teacher getTeacher(int teacher_id)throws SQLException;

}
