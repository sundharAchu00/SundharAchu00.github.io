package rel.edu.Student.StudentSpringApp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import rel.edu.Student.StudentSpringApp.dto.Student;
import rel.edu.Student.StudentSpringApp.repository.StudentRepo;

@Repository
public class StudentDAO {
	
	
	@Autowired
	StudentRepo repo;
	
	

	// save
	public Student saveStudent(Student student) {

		return repo.save(student);
	}

	// fetch
	public Student getById(int id) {

		Optional<Student> o = repo.findById(id);

		return o.get();

	}

	// fetchByName
//	public List<Student> getByName(String name) {
//		return repo.findByName(name);
//	}
//
//	// fetchByMarks
//	public List<Student> getByMarks(double marks) {
//		return repo.findByMarks(marks);
//	}
//
//	// fetchByName
//	public List<Student> getByAge(int age) {
//		return repo.findByAge(age);
//	}

	// fetchAll
	public List<Student> getAll() {

		return repo.findAll();

	}

	// update
	public Student updateStudentById(int id, Student s) {

		Student student = repo.findById(id).get();

		if (student != null) {

			s.setId(id);

			return repo.save(s);
		}
		return null;
	}

	// delete
	public String deleteStudent(int id) {
		repo.deleteById(id);
		return "deleted Successfully";
	}
}
