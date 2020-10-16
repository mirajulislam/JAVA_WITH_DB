/**
 * 
 */
package model;

import java.util.Date;

/**
 * @author mirajul.islam
 *
 */
public class Department {
	private Integer department_id;
	private String department_name;
	private Date date;
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}
	
	
}
