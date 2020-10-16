/**
 * 
 */
package model;

import java.util.Date;

/**
 * @author mirajul.islam
 *
 */
public class Student {
	
	private Integer student_id;
	private String student_name;
	private Integer age;
	private String mobile;
	private String address;
	private Date date;	

	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getStudent_id() {
		return student_id;
	}
	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", age=" + age + ", mobile="
				+ mobile + ", address=" + address + ", date=" + date + "]";
	}
		
}
