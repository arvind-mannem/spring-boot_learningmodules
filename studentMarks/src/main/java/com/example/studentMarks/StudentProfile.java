package com.example.studentMarks;

import org.springframework.stereotype.Component;

@Component
public class StudentProfile {

	private int id;
	private String name;
	private double physics;
	private double maths;
	private double chemistry;
	private double avg;

	public StudentProfile() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPhysics() {
		return physics;
	}

	public void setPhysics(double physics) {
		this.physics = physics;
	}

	public double getMaths() {
		return maths;
	}

	public void setMaths(double maths) {
		this.maths = maths;
	}

	public double getChemistry() {
		return chemistry;
	}

	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public StudentProfile(int id, String name, double physics, double maths, double chemistry, double avg) {
		super();
		this.id = id;
		this.name = name;
		this.physics = physics;
		this.maths = maths;
		this.chemistry = chemistry;
		this.avg = avg;
	}

}
