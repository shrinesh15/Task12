package com.example.hr;

public class Employee {

	    private int employeeId;
	    private String firstName;
	    private String lastName;
	    private String jobTitle;
	    private double salary;

	    public Employee(int employeeId, String firstName, String lastName, String jobTitle, double salary) {
	        this.employeeId = employeeId;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.jobTitle = jobTitle;
	        this.salary = salary;
	    }

	    public int getEmployeeId() {
	        return employeeId;
	    }

	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getJobTitle() {
	        return jobTitle;
	    }

	    public void setJobTitle(String jobTitle) {
	        this.jobTitle = jobTitle;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    public String toString() {
	        return "Employee ID: " + employeeId + "\n" +
	               "First Name: " + firstName + "\n" +
	               "Last Name: " + lastName + "\n" +
	               "Job Title: " + jobTitle + "\n" +
	               "Salary: $" + salary;
	    }

		public void printDetails() {
			
		}
	}



