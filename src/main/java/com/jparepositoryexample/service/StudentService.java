package com.jparepositoryexample.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.jparepositoryexample.repository.StudentRepository;
import com.jparepositoryexample.student.StudentDemo;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentrepo;
public StudentDemo insert(StudentDemo studentdem){
	return studentrepo.save(studentdem);
}
public StudentDemo update(StudentDemo studentdem) {
	return studentrepo.save(studentdem);
}
public List<StudentDemo> insert1(List<StudentDemo> studentdem)
{
	return studentrepo.saveAll(studentdem);
}
public List get(StudentDemo studentdem)
{
	return studentrepo.findAll();
}

public Optional<StudentDemo> getbyid( StudentDemo studentdem)
{
	int sid=studentdem.getSid();
	return studentrepo.findById(sid);
}
@CacheEvict(value="StudentDemo",allEntries=true)
public String del(int sid)
{     
	studentrepo.deleteById(sid);
	return "deleted";
}
public List<StudentDemo> getname(String sname)
{
	return studentrepo.getByName(sname);
}

}

