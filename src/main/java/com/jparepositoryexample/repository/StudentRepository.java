package com.jparepositoryexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jparepositoryexample.student.StudentDemo;

@Repository
public interface StudentRepository extends JpaRepository<StudentDemo, Integer>  {
	@Query ("Select s from StudentDemo s where s.sname like %?1%")
	List<StudentDemo> getByName(String sname);
}
