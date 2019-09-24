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

	public StudentProfile(){
	}
	public StudentProfile(int id,String name,double physics, double maths, double chemistry, double avg) {
		this.id=id;
		this.name=name;
		this.physics = physics;
		this.maths = maths;
		this.chemistry = chemistry;
		this.avg = avg;
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

	public void setAvg() {
		avg = (physics + maths + chemistry) / 3;
	}

	public double getAvg() {
		return avg;
	}
	
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = prime + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        StudentProfile test = (StudentProfile) obj;
        if (id != test.id)
            return false;
        return true;
    }
}
