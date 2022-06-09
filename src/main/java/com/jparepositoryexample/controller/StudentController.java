package com.jparepositoryexample.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.jparepositoryexample.service.StudentService;
import com.jparepositoryexample.student.StudentDemo;

@RestController
public class StudentController {
@Autowired
StudentService studserv;
	
@PostMapping("/insert")
public StudentDemo insert(@RequestBody StudentDemo studentdem ){
	return studserv.insert(studentdem);
	}

@GetMapping("/get")
public List get(@RequestBody StudentDemo studentdem){
	return studserv.get(studentdem);
	}

@GetMapping("/getbyid")
public Optional<StudentDemo> getbyid(@RequestBody StudentDemo studentdem ){
	return studserv.getbyid(studentdem);
	}

@PostMapping("/insert1")
public List<StudentDemo> insert1(@RequestBody  List<StudentDemo> studentdem ){
	return studserv.insert1(studentdem);
	}

@PutMapping("/update")
public StudentDemo updated(@RequestBody StudentDemo studentdem) {
	return studserv.update(studentdem);
	}

@DeleteMapping("/delete")
public String delete(@RequestBody int sid) {
	return  studserv.del(sid);
	}

@GetMapping("/getbyname/{sname}")
public List<StudentDemo> getname(@PathVariable String sname)
{
	return studserv.getname(sname);
	}
}


