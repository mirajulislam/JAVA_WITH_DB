package Java_curd_db.Java_curd_db;

import java.util.Arrays;
import java.util.List;

import model.Student;
import service.StudentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StudentService std=new StudentService();
		List<Student> listStudent =std.getAllStudent();
		for(Student leave : listStudent){
		    System.out.println(leave.getAddress());
		}
		System.out.println(Arrays.toString(listStudent.toArray()));
    }
}
