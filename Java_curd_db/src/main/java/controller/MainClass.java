package controller;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import model.Student;
import service.StudentService;

public class MainClass {

	public static void main(String[] args) throws SQLException {
		StudentService std=new StudentService();
		List<Student> listStudent =std.getAllStudent();
		for(Student leave : listStudent){
		    System.out.println(leave.getAddress());
		}
		System.out.println(Arrays.toString(listStudent.toArray()));
		
//		listStudent.add(new Student(1001,"Raj Islam", 24, "01780285746", "Rajbari"));
//		listStudent.add(new Student(1002,"Lamiya Akter Esa", 16, "01780285746", "Rajbari")); 
//		std.insertStudent(listStudent);
	}

}
