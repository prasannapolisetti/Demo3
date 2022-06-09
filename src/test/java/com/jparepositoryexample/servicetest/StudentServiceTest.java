package com.jparepositoryexample.servicetest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.jparepositoryexample.repository.StudentRepository;
import com.jparepositoryexample.service.StudentService;
import com.jparepositoryexample.student.StudentDemo;

@SpringBootTest
public class StudentServiceTest {
	
	@InjectMocks
	StudentService studentService;
	
	@Mock
	StudentRepository studentRepository;
	
	@Mock
	StudentDemo studentDemo;

	@Test
	public void testinsert() {
		Mockito.when(studentRepository.save(Mockito.any(StudentDemo.class))).thenReturn(studentDemo);
		StudentDemo response=studentService.insert(getdata());
		assertEquals(studentDemo,response);
	}
	
	public StudentDemo getdata() {
		StudentDemo studentDemo=new StudentDemo();
		studentDemo.setSid(1);
		studentDemo.setSname("sai");
		studentDemo.setSub("maths");
		return studentDemo;
	}
	
    @Test
    public void testupdate() {
    	Mockito.when(studentRepository.save(Mockito.any(StudentDemo.class))).thenReturn(studentDemo);
    	StudentDemo response=studentService.update(studentDemo);
    	assertEquals(studentDemo,response);
    }
    @Test
    public void testdelete() {
    	studentRepository.deleteById(Mockito.anyInt());
    	String reponse=studentService.del(1);
    	assertEquals(1,1);
    }
//    @Test
//    public void testgetbyid() {
//    	
//    	Mockito.when(studentRepository.findById(Mockito.anyInt())).thenReturn(getdata1());
//    }
// public Optional<StudentDemo> getdata1(){
//	 StudentDemo studentdemo=new StudentDemo();
//	 studentdemo.setSid(1);
//	 studentdemo.setSname("sai");
//	 studentdemo.setSub("maths");
//	 return studentdemo;
// }
 public List<StudentDemo> getdata2(){
	 List<StudentDemo> list=new ArrayList();
	
	 list.add(studentDemo);
	 System.out.println(studentDemo);
	 return list;
 }
// @Test
// public void testget() {
//	 Mockito.when(studentRepository.findAll(Mockito.any(StudentDemo.class))).thenReturn(getdata2());
//	 List response=studentService.get(studentDemo);
//	 assertEquals(1,response);
// }
 @Test
 public void testgetName() {
 Mockito.when(studentRepository.getByName(Mockito.anyString())).thenReturn(getdata2());
 List response=studentService.getname("sai");
 System.out.println(response);
 assertEquals("sai",response);
    
 }
}






