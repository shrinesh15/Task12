package task12;

public class ListToArray {
	
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;

	    public void static void main(String[] args) {
	        // Create a List of integers
	        List<Integer> myList = new ArrayList<>();
	        myList.add(1);
	        myList.add(2);
	        myList.add(3);
	        myList.add(4);
	        myList.add(5);

	        // Convert the List to an array of integers
	        Integer[] array = myList.toArray(new Integer[myList.size()]);

	        // Print the array elements
	        System.out.println("Array elements: " + Arrays.toString(array));
	    
	}



