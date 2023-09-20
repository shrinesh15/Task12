package com.example.hrtest;

public class EmployeeClass {

	public class Employee {
	    private String name;
	    private int id;
	    private String number;
	    private double salary;

	    public Employee(String name, int id, String number, double salary) {
	        this.name = name;
	        this.id = id;
	        this.number = number;
	        this.salary = salary;
	    }

	    public void printDetails() {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee Salary: $" + salary);
	    }
	}


}
