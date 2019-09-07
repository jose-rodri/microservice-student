package com.example.demo.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@RestController
public class StudentController {

	// prueba de proyecto sin microservicios V.1.0.0
	
	@Autowired
	private StudentRepository repository;
	
	
	
	
	@PostMapping("/addStudent")
	public String saveStudent(@RequestBody Student student) {
		repository.save(student);
		return "Agregar el estududiante con id :"+student.getId();
	}
	
	
	@GetMapping("/findAllStudent")
	public List<Student> getStudent(){
		return repository.findAll();
	}
	
	
	@GetMapping("/findAllStudents/{id}")
	public Optional<Student>  getStudent(@PathVariable int id){
		return repository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudents(@PathVariable int id) {
		repository.deleteById(id);
		return "Eliminar estudiante con id : " + id;
	}
	
}
