package com.org.service;

import java.util.List;

import com.org.bean.Student;

public interface StudentService {
void save(Student student);
List<Student> getAll();// throws 
}
