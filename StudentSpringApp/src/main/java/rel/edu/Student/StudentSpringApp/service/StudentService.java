package rel.edu.Student.StudentSpringApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import rel.edu.Student.StudentSpringApp.dao.StudentDAO;
import rel.edu.Student.StudentSpringApp.dto.Student;
import rel.edu.Student.StudentSpringApp.util.ResponseStructure;

@Service
public class StudentService {
	@Autowired
	private StudentDAO dao;

	// save
	public ResponseStructure<Student> saveStudent(Student student) {

		ResponseStructure<Student> rs = new ResponseStructure<Student>();

		rs.setStatusCode(HttpStatus.CREATED.value());
		rs.setMessage("data saved successfully..!");
		rs.setData(dao.saveStudent(student));

		return rs;
	}

	// fetch
	public ResponseStructure<Student> getById(int id) {

		ResponseStructure<Student> rs = new ResponseStructure<Student>();
		rs.setStatusCode(HttpStatus.OK.value());
		rs.setMessage("Here Data's You Needed..!");
		rs.setData(dao.getById(id));
		return rs;

	}

	// fetchByName
//	public ResponseStructure<List<Student>> getByName(String name) {
//		ResponseStructure<List<Student>> rs = new ResponseStructure<>();
//		rs.setStatusCode(HttpStatus.OK.value());
//		rs.setMessage("Here Data's You Needed..!");
//		rs.setData(dao.getByName(name));
//		return rs;
//	}
//
//	// fetchByMarks
//	public ResponseStructure<List<Student>> getByMarks(double marks) {
//		ResponseStructure<List<Student>> rs = new ResponseStructure<>();
//		rs.setStatusCode(HttpStatus.OK.value());
//		rs.setMessage("Here Data's You Needed..!");
//		rs.setData(dao.getByMarks(marks));
//		return rs;
//	}
//
//	// fetchByName
//	public ResponseStructure<List<Student>> getByAge(int age) {
//		ResponseStructure<List<Student>> rs = new ResponseStructure<>();
//		rs.setStatusCode(HttpStatus.OK.value());
//		rs.setMessage("Here Data's You Needed..!");
//		rs.setData(dao.getByAge(age));
//		return rs;
//	}

	// fetchAll
	public ResponseStructure<List<Student>> getAll() {

		ResponseStructure<List<Student>> rs = new ResponseStructure<>();
		rs.setStatusCode(HttpStatus.OK.value());
		rs.setMessage("Here Data's You Needed..!");
		rs.setData(dao.getAll());
		return rs;

	}

	// update
	public ResponseStructure<Student> updateStudentById(int id, Student s) {

		
		Student student = dao.getById(id);

		if (student != null) {

			s.setId(id);
			
			ResponseStructure<Student> rs = new ResponseStructure<Student>();
			rs.setStatusCode(HttpStatus.OK.value());
			rs.setMessage("Here Data's You Needed..!");
			rs.setData(dao.saveStudent(s));
			
			return rs;
		}
		return null;
		
		
	}

	// delete
	public String deleteStudent(int id) {
		dao.deleteStudent(id);
		return "deleted Successfully";
	}

}
