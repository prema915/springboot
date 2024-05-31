package com.bca.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bca.entity.Student;
import com.bca.service.StudentService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController

public class StudentController {
	@Autowired
	StudentService SS;
	
@GetMapping("view")
public List<Student> view_st(){
	return SS.view_stud();
}
@PostMapping("/save")
public String save_stu(@RequestBody Student S) {
	return SS.save_stu(S);
}
@GetMapping("/view/{id}")
public Optional<Student>view_one(@PathVariable Long id){
	return SS.view_one_stu(id);
}
@DeleteMapping("/del/{id}")
public String del_stu(@PathVariable Long id) {
	return SS.del_stu(id);
}


}



