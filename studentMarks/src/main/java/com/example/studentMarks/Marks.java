package com.example.studentMarks;

public class Marks {

	private double physics;
	private double maths;
	private double chemistry;
	private double avg;

	public Marks(double physics, double maths, double chemistry, double avg) {
		this.physics = physics;
		this.maths = maths;
		this.chemistry = chemistry;
		this.avg = avg;
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
}
