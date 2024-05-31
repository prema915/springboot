package com.bca.service;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bca.entity.Student;
import com.bca.repository.StudentRep;

@Service

public class StudentService {
	@Autowired
	StudentRep SR;
	public String save_stu(Student s) {
		SR.save(s);
		return"data saves successfully";
	}
	public List<Student>view_stud(){
		return SR.findAll();
	}
	public java.util.Optional<Student>view_one_stu(Long id){
		return SR.findById(id);
		
	}
	public String del_stu(Long id) {
		SR.deleteById(id);
		return id+"deleted Successfully";
	}
	
	

}
