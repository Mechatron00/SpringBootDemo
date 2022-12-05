package com.project.SpringMVC1Project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Staff 
{
	@Id
private int staff_id;
private String staff_name;




public int getStaff_id() {
	return staff_id;
}
public void setStaff_id(int staff_id) {
	this.staff_id = staff_id;
}
public String getStaff_name() {
	return staff_name;
}
public void setStaff_name(String staff_name) {
	this.staff_name = staff_name;
}

	
}
