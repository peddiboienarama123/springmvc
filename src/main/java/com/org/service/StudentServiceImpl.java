package com.org.service;

import java.util.List;



import org.hibernate.boot.registry.StandardServiceInitiator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.bean.Student;
import com.org.entity.StudentdEntity;
import com.org.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	private static Logger log = LoggerFactory
			.getLogger(StandardServiceInitiator.class.getSimpleName());
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void save(Student student) {
		Student entity = new Student();
		entity.setName(student.getName());
		entity.setStandard(student.getStandard());
		entity.setCode(student.getCode());
		
		entity.setFaculty(student.getFaculty());
		
		studentRepository.save(entity);
		log.info("Standard saved", student);
	}

	@Override
	public List<Student> getAll() {
		return null;
	}

}
