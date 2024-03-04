package rel.edu.Student.StudentSpringApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rel.edu.Student.StudentSpringApp.dto.Student;
import rel.edu.Student.StudentSpringApp.service.StudentService;
import rel.edu.Student.StudentSpringApp.util.ResponseStructure;

@RestController
@CrossOrigin("http://localhost:3000/")
public class StudentController {
	
	@Autowired
	StudentService service;

	
	@PostMapping("saveStudent")
	public ResponseStructure<Student> saveStudent(@RequestBody Student student) {
		
		return service.saveStudent(student);
	}
	
	@GetMapping("fetch")
	public ResponseStructure<Student> fetchStudentById(@RequestParam int id) {
		
		return service.getById(id);
		
	}
	
//	@GetMapping("fetchByName")
//	public ResponseStructure<List<Student>> fetchStudentByName(@RequestParam String name) {
//		
//		return service.getByName(name);
//	}
	
	@GetMapping("fetchAll")
	public ResponseStructure<List<Student>> fetchAllStudent(){
		
		return service.getAll();
	}

}
