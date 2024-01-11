package com.org.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studentEntity")
public class StudentdEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "stud_name")
	private String name;

	@Column(name = "stud_standard")
	private Integer standard;

	@Column(name = "stud_code")
	private String code;

	@Column(name = "stud_faculty")
	private String faculty;

	

	public String getName() {
		return name;
	}

	public Integer getStandard() {
		return standard;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStandard(Integer Standard) {
		this.standard = standard;
	}

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

	public long getId() {
		return id;
	}

	

	public void setId(long id) {
		this.id = id;
	}

}
