package com.example.studentMarks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GetAverage {

	private Marks marks;

	@Autowired
	GetAverage(Marks marks) {
		this.marks = marks;
	}

	@PostMapping("/marks")
	public Marks setMarks(@RequestBody Marks m) {
		this.marks.setMaths(m.getMaths() + 5);
		this.marks.setPhysics(m.getPhysics() + 5);
		this.marks.setChemistry(m.getChemistry() + 5);
		this.marks.setAvg();
		return marks;
	}

	@GetMapping("/avgofallsubjects")
	public double getAvg() {
		return this.marks.getAvg();
	}

}
