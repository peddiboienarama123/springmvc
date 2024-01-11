package com.org.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.org.bean.Student;
import com.org.entity.StudentdEntity;

@Repository
@Transactional
public class StudentRepository {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	public void save(Student entity) {
		hibernateTemplate.save(entity);
	}

	public List<StudentdEntity> getAll() {
		return hibernateTemplate.loadAll(StudentdEntity.class);
	}
}
