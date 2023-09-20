package task12;

import java.util.ArrayList;

public class RemoveAllElements {
	
	    public static void main(String[] args) {
	      
	        ArrayList<String> arrayList = new ArrayList<>();

	        arrayList.add("India");
	        arrayList.add("Nepal");
	        arrayList.add("Afganisthan");
	        arrayList.add("Srilanka");

	        System.out.println("ArrayList before removing elements: " + arrayList);

	        arrayList.clear();

	        System.out.println("ArrayList after removing elements: " + arrayList);
	    }
	}



