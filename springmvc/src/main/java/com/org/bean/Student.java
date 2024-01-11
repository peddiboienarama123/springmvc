package com.org.bean;

import java.sql.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Student {
	
private long id;
@NotEmpty(message = "Name is required")
private String name;

@NotNull(message="Sandard is required")
private Integer standard;

private String code;

private String faculty;


public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getFaculty() {
	return faculty;
}
public void setFaculty(String faculty) {
	this.faculty = faculty;
}
public Integer getStandard() {
	return standard;
}
public void setStandard(Integer standard) {
	this.standard = standard;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", standard=" + standard + ", code=" + code + ", faculty=" + faculty
			+  "]";
}

}
