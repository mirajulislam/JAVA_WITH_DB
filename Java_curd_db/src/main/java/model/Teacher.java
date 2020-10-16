/**
 * 
 */
package model;

import java.util.Date;

/**
 * @author mirajul.islam
 *
 */
public class Teacher {
	private Integer teacher_id;
	private String teachert_name;
	private Integer age;
	private String mobile;
	private String address;
	private Date date;
	
	public String getTeachert_name() {
		return teachert_name;
	}
	public void setTeachert_name(String teachert_name) {
		this.teachert_name = teachert_name;
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
	public Integer getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(Integer teacher_id) {
		this.teacher_id = teacher_id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
		
}
