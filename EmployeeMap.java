package task12;

import java.util.TreeMap;

public class EmployeeMap {
	

	    public static void main(String[] args) {

	        TreeMap<Integer, String> employeeMap = new TreeMap<>();

	        employeeMap.put(101, "Ravi");
	        employeeMap.put(102, "Sofi");
	        employeeMap.put(103, "Anitha");
	        employeeMap.put(104, "Raj");
	        employeeMap.put(105, "Naren");

	        System.out.println("Names of Employees in Alphabetical Order:");
	        for (String name : employeeMap.values()) {
	            System.out.println(name);
	        }
	    }
	}


