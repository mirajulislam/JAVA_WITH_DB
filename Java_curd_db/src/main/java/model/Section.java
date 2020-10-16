/**
 * 
 */
package model;

import java.util.Date;

/**
 * @author mirajul.islam
 *
 */
public class Section {
	private Integer section_id;
	private String section_name;
	private String section_time;
	private Date date;

	public String getSection_name() {
		return section_name;
	}
	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}
	public String getSection_time() {
		return section_time;
	}
	public void setSection_time(String section_time) {
		this.section_time = section_time;
	}
	public Integer getSection_id() {
		return section_id;
	}
	public void setSection_id(Integer section_id) {
		this.section_id = section_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
