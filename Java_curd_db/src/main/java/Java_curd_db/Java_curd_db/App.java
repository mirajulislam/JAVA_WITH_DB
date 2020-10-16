package Java_curd_db.Java_curd_db;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import model.Student;
import service.StudentService;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * Hello world!
 *
 */
public class App 
{
	static Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args )throws SQLException
    {
    	DOMConfigurator.configure("log4j.xml");
    	StudentService std=new StudentService();
		List<Student> listStudent =std.getAllStudent();
		Student stdt=std.getStudent(1001);	
//		for(Student leave : listStudent){
//		    System.out.println(leave.getAddress());
//		}
//    	logger.error("student data"+Arrays.toString(listStudent.toArray()));
//    	logger.error(""+" "+stdt.getStudent_id()+" "+ stdt.getStudent_name()+" "+stdt.getAge()+" "+stdt.getMobile()+" "+stdt.getAddress()+" "+stdt.getDate());		
		 
    }
}
