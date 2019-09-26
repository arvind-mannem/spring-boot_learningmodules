package com.example.studentMarks;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

	private AverageService aService;

	public StudentController(AverageService service) {
		this.aService = service;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<StudentProfile> studentList() {
		return aService.getStudents();
	}

	@RequestMapping("/{id}")
	public List<StudentProfile> student(@PathVariable("id") int id) {
		return aService.getProfileById(id);
	}

	@PostMapping("/marks")
	@Autowired
	public StudentProfile setProfile(@RequestBody StudentProfile student) {
		return aService.createProfile(student);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String deleteStudent(@PathVariable("id") int id) {
		aService.deleteStudent(id);
		return "user with id " + id + " is deleted";
	}

}
