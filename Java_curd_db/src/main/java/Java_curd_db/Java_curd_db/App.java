package Java_curd_db.Java_curd_db;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import model.Student;
import service.StudentService;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger logger =LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	StudentService std=new StudentService();
		List<Student> listStudent =std.getAllStudent();
//		for(Student leave : listStudent){
//		    System.out.println(leave.getAddress());
//		}
    	logger.error("student data"+Arrays.toString(listStudent.toArray()));
    }
}
