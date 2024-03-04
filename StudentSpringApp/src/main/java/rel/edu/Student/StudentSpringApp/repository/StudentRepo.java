package rel.edu.Student.StudentSpringApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import rel.edu.Student.StudentSpringApp.dto.Student;

public interface StudentRepo  extends JpaRepository<Student, Integer>{
	
//	public List<Student> findByName(String name);
//
//	public List<Student> findByMarks(double marks);
//	
//	public List<Student> findByAge(int age);

}
