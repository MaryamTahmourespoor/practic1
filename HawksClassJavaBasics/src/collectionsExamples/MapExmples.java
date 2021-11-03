package collectionsExamples;

import java.util.HashMap;

public class MapExmples {

	public static void main(String[] args) {
	
		HashMap<Integer , String>data = new HashMap<Integer , String>();
		
		data.put(1, "this is value 1");
		data.put(2, "this is value 2");
		data.put(3, "this is value 3");
		data.put(4, "this is value 4");
		data.put(5, "this is value 5");
		data.put(5, "this is value 6");
		
		System.out.println("Printing the Map = " + data);
		System.out.println("Printing the Map = "+ data.get(3));
	System.out.println("Printing the Key = "+ data.keySet());	
	System.out.println("Printing the Value = "+ data.values());
		
		
	System.out.println("************************************************");
	System.out.println("*************Key*****************");
	for (Integer i : data.keySet()) {
		System.out.println(i);
	}
 
	System.out.println("***********************************************");
	System.out.println("**************Values******************");
	for (String i :data.values()) {
		System.out.println(i);
	}
	
	// example of use case
	// write a function that indicates if there are duplicate in an array
	// and give us a count of each duplicate as well
	System.out.println("----------------------------------------------------------");
	System.out.println("----------------------------------------------------------"); 
		String[] strs = { "James", "David", "David", "David", "George", "Christopher", 
		"George", "Ronald", "Richard","Richard" }; 
		
		HashMap<String, Integer> namesCounts = new HashMap<String, Integer>();
		// keys = name
	// values = count / integer
		for (int i = 0; i < strs.length; i++) {
			
			if(namesCounts.containsKey(strs[i])) {
			
		}else {
			
			System.out.println(strs[i]);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	 HashMap<Integer, String> data = new HashMap<Integer, String>(); // put method will add variables to the map
//		data.put(1, "this is value 1");
//		data.put(2, "this is value 2");
//		data.put(3, "this is value 3");
//		data.put(4, "this is value 4");
//		data.put(5, "this is value 5");
//		data.put(5, "this is value 5"); // -Map is a key /value data structure
//		// -Map is not based on indexes / if you want to go through all of your values,
//		// you have to go through all of the keys
//		// -Map keys will be stored in a set and so it can only take unique values // -To add values to the map, use method put()
//		// -To get the keys of the map, use the method keySet()
//		// -To get a value returned from the map, use the method get and pass a key System.out.println("Printing the Map: " + data);
//		System.out.println("Printing one var from the Map: " + data.get(3));
//		System.out.println("Printing all keys: " + data.keySet());
//		System.out.println("Printing all values: " + data.values()); System.out.println("----------------------------------------------------------");
//		System.out.println("Going through all of the keys of a map with a foreach loop");
//		for (Integer i : data.keySet()) {
//		System.out.println(i);
//		} System.out.println("----------------------------------------------------------");
//		System.out.println("Going through all of the values of a map with a foreach loop");
//		for (String i : data.values()) {
//		System.out.println(i);
//		} 
	
		// example of use case
//		// write a function that indicates if there are duplicate in an array
//		// and give us a count of each duplicate as well
//		System.out.println("----------------------------------------------------------");
//		System.out.println("----------------------------------------------------------"); 
//	String[] strs = { "James", "David", "David", "David", "George", "Christopher", "George", "Ronald", "Richard",
//		"Richard" }; HashMap<String, Integer> namesCounts = new HashMap<String, Integer>();
//		// keys = names
//		// values = count / integer // loop will go through all of the names
//		for (int i = 0; i < strs.length; i++) { // check to see if the name is already in the map
//		if (namesCounts.containsKey(strs[i])) {
//		// the name is already in the map
//		int prevCount = namesCounts.get(strs[i]);
//		// we need to increase the count
//		namesCounts.put(strs[i], prevCount + 1);
//		} else {
//		// its the first time that we see the name
//		namesCounts.put(strs[i], 1);
//		// add the name to the map with count of 1
//		} }
//
//		System.out.println(namesCounts); }
//		}
//
//		sep 2
//		package LabSession_9_2_2021;public class Employee {
//
//		private String firstName;
//		private String lastName;
//		private String userName;
//		private String password;
//		private String dob;
//
//		public Employee() {
//		super();
//		this.firstName = "";
//		this.lastName = "";
//		this.userName = "";
//		this.password = "";
//		this.dob =""; 
//		} public Employee(String firstName, String lastName, String userName, String password, String dob) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.userName = userName;
//		this.password = password;
//		this.dob = dob;
//		} public String getFirstName() {
//		return firstName;
//		} public void setFirstName(String firstName) {
//		this.firstName = firstName;
//		} public String getLastName() {
//		return lastName;
//		} public void setLastName(String lastName) {
//		this.lastName = lastName;
//		} public String getUserName() {
//		return userName;
//		} public void setUserName(String userName) {
//		this.userName = userName;
//		} public String getPassword() {
//		return password;
//		} public void setPassword(String password) {
//		this.password = password;
//		} public String getDob() {
//		return dob;
//		} public void setDob(String dob) {
//		this.dob = dob;
//		} @Override
//		public String toString() {
//		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", password="
//		+ password + ", dob=" + dob + "]";
//		}



		}

	}


