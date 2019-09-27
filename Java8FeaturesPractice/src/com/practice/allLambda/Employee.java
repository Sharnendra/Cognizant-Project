package com.practice.allLambda;

public class Employee {
	
	private String Name;
	private float Salary;
	private int Months;
	
	public Employee(String name, float salary, int months) {
		Name = name;
		Salary = salary;
		Months = months;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	public int getMonths() {
		return Months;
	}
	public void setMonths(int months) {
		Months = months;
	}
	
}
