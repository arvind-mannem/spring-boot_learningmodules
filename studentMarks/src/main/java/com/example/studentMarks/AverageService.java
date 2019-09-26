package com.example.studentMarks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class AverageService {

	private List<StudentProfile> profileList = new ArrayList<>();

	public List<StudentProfile> getStudents() {
		return profileList;
	}

	public List<StudentProfile> getProfileById(int id) {
		return profileList.stream().filter(f -> f.getId() == id).map(m -> new StudentProfile(m.getId(), m.getName(),
				m.getMaths(), m.getPhysics(), m.getChemistry(), m.getAvg())).collect(Collectors.toList());
	}

	public StudentProfile createProfile(StudentProfile student) {
		StudentProfile profile = new StudentProfile();

		double avg = (student.getMaths() + student.getPhysics() + student.getChemistry()) / 3;
		profile.setId(student.getId());
		profile.setName(student.getName());
		profile.setMaths(student.getMaths());
		profile.setPhysics(student.getPhysics());
		profile.setChemistry(student.getChemistry());
		profile.setAvg(Math.ceil(avg));
		profileList.add(profile);
		return profile;
	}

	public void deleteStudent(int id) {
		profileList.removeIf(f -> f.getId() == id);
	}

}
