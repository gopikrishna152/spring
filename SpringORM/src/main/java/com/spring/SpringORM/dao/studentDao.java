package com.spring.SpringORM.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.SpringORM.entities.Student;

public class studentDao {

	private HibernateTemplate hibernatetemplate;

	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}

	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}

	// save student method 
	@Transactional
	public void insert(Student student) {
//		hibernate template
		hibernatetemplate.save(student);
	} 
	
	public List<Student> getAll(){
		return hibernatetemplate.loadAll(Student.class);
	} 
	public Student getstudentdetails(Student student) {
//		System.out.println("vacha");
		Student stu=this.hibernatetemplate.load(Student.class, student.getId()); 
		return stu;
	}   
	@Transactional
	public boolean update(Student stu) {
	    try {
	        System.out.println("vacha");
	        hibernatetemplate.update(stu);
	        System.out.println("bayatakivacha");
	        return true;
	    } catch (Exception e) {
	        // Handle the exception, log it, or throw it further
	        e.printStackTrace();
	        return false;
	    }
	}

	

	public void delete (int id){
		Student student=this.hibernatetemplate.get(Student.class,id);
		hibernatetemplate.delete(student);
	} 
//	public void update(i)

}
