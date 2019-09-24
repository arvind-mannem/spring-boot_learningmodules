package com.example.studentMarks;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class GetAverage {

	private List<StudentProfile> profileList;
	private List<Integer> idList;
	
	@Autowired
	public GetAverage(List<StudentProfile> profileList , List<Integer> idList) {
		this.profileList=profileList;
		this.idList=idList;
	}

	//get all students
	@RequestMapping(method=RequestMethod.GET)
	public List<StudentProfile> studentList(){
		return profileList;
	}
	
	//post student details
	@PostMapping("/marks")
	@Autowired
	public StudentProfile setProfile(@RequestBody StudentProfile p,StudentProfile studentProfile) {
		studentProfile.setId(p.getId());
		studentProfile.setName(p.getName());
		studentProfile.setMaths(p.getMaths());
		studentProfile.setPhysics(p.getPhysics());
		studentProfile.setChemistry(p.getChemistry());
		studentProfile.setAvg();
		profileList.add(studentProfile);
		idList.add(p.getId());
		return studentProfile;
	}
	
	//get student average by id
	@GetMapping("/{id}/avg")
	public double getAvg(@PathVariable (value="id") int id) {
		return profileList.get(idList.indexOf(id)+1).getAvg();
	}
	
	//get student by id
	@GetMapping("/{id}")
	public StudentProfile getStudent(@PathVariable (value="id") int id) {
		return profileList.get(idList.indexOf(id)+1);
	}

	@RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable("id") int id) {
		profileList.remove(idList.indexOf(id));
		idList.remove(idList.indexOf(id));
		return "Student with "+id+" is successfully deleted";
	}
}
