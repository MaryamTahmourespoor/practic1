package LabSession_9_2_2021;

	public class Runner {
		
		public static void main(String[] args) {
	
			WalmartEmployeeDB alexandriaBranch = new WalmartEmployeeDB(5);
			WalmartEmployeeDB alingtoncBranch = new WalmartEmployeeDB(5);
			
			alexandriaBranch.addEmployee(new Employee("qqq", "www", "kkk", "123", "4/4/1995"));
			alexandriaBranch.addEmployee(new Employee("qqq", "www", "kkk", "123", "4/4/1995"));
			
			alingtoncBranch.addEmployee(new Employee("ggg", "ddd", "ggg", "145", "4/5/1965"));
			
			
			System.out.println("alexandriaBranch Count :"+ alexandriaBranch.getBranchCount());
			System.out.println("alingtoncBranch Count :"+ alingtoncBranch.getBranchCount());
			System.out.println("Global WalmartEmployeeDB Count:"+ WalmartEmployeeDB.getAllEmployeesCount());
			
			
	        alexandriaBranch.printBranchEmployees();

		//***************************************************************//
	    	
		}
//		public class Runner {
//			public static void main(String[] args) { WalmartEmployeeDB alexandriaBranch = new WalmartEmployeeDB(5, "Alexandria Branch");
//			WalmartEmployeeDB arlingtonBranch = new WalmartEmployeeDB(5, "Arlington Branch"); alexandriaBranch.addEmployee(new Employee("Jack", "something", "jSOmething", "test123", "1/1/1990"));
//			alexandriaBranch.addEmployee(new Employee("David", "something", "jSasdhing", "tewervc3", "4/4/1965")); arlingtonBranch.addEmployee(new Employee("emp1", "emp1 Lastname", "emp.user", "emp1.pass", "1/1/1950"));
//			arlingtonBranch.addEmployee(new Employee("emp2", "emp1 Lastname", "emp.user", "emp1.pass", "1/1/1950"));
//			arlingtonBranch.addEmployee(new Employee("emp3", "emp1 Lastname", "emp.user", "emp1.pass", "1/1/1950"));
//			arlingtonBranch.addEmployee(new Employee("emp4", "emp1 Lastname", "emp.user", "emp1.pass", "1/1/1950"));
//			arlingtonBranch.addEmployee(new Employee("emp5", "emp1 Lastname", "emp.user", "emp1.pass", "1/1/1950"));
//			arlingtonBranch.addEmployee(new Employee("emp6", "emp1 Lastname", "emp.user", "emp1.pass", "1/1/1950")); System.out.println("alexandriaBranch Count: " + alexandriaBranch.getBranchCount());
//			System.out.println("arlingtonBranch Count: " + arlingtonBranch.getBranchCount());
//			System.out.println("Global WalmartEmployeeDB Count: " + WalmartEmployeeDB.getAllEmployeesCount()); System.out.println(alexandriaBranch);
//			System.out.println(arlingtonBranch);
//
//			WalmartEmployeeDB.printGlobalListOfEmployees();
//
//
//
//			}
//			}
//			sep 7
//			package collectionsExamples;import java.util.LinkedList;public class ListExamples {
//			public static void main(String[] args) { // Generic
//			// ctrl = shift + o ==== manages imports
//			LinkedList<Integer> data = new LinkedList<Integer>();
//			// data-type identifier
//			data.add(15);
//			data.add(11);
//			data.add(12);
//			data.add(11);
//			data.add(155);
//			data.add(158);
//			data.add(159);
//			data.add(141);
//			data.add(148);
//			data.add(184);
//			data.add(986);
//			data.add(5);
//
//			System.out.println(data); System.out.println(data.contains(188));
//			System.out.println(data.indexOf(148));
//
//			for (int i = 0; i < data.size(); i++) {
//			System.out.println(data.get(i));
//			}
//
//
//			}
//			}
//			sep 8
//			package collectionsExamples;import java.util.HashSet;public class SetExampleInJava { public static void main(String[] args) {
//
//
//			// set in collections is a going to take unique values
//			// set is an un-ordered collection
//			HashSet<String> data = new HashSet<String>();
//
//			System.out.println(data.add("test"));
//			System.out.println(data.add("test1"));
//			System.out.println(data.add("test2"));
//			System.out.println(data.add("test3"));
//			System.out.println(data.add("test4"));
//			System.out.println(data.add("test1"));
//
//			System.out.println(data);
//
//
//			// how to find duplicates in an array
//			String [] values = {"Jack", "David", "Jack", "Anna"};
//
//			// O(n^2)
//			boolean f = true;
//			outerLoop: for (int i = 0; i < values.length; i++) {
//			for (int j = i+1; j < values.length; j++) {
//			System.out.println(values[i] + " " + values[j]);
//			if(values[i].equals(values[j])) {
//			// if we find a duplicate, we stop the loop
//			System.out.println("Dulicate Values Found: " + values[i] + " " + values[j]);
//			break outerLoop;
//			}
//			}
//			// two option to break the outer loop
//			// option 1 = is to give the loop a name, and break the loop with that name
//			// option 2 = to create boolean that keeps track of if we should stop the outer loop
//			// we call this boolean - flag }
//
//			System.out.println("-------------------------------------");
//
//			// n = 4
//			//O(n) = > 4
//			//O(n^2) = > 4*4
//
//			HashSet<String> temp = new HashSet<String>();
//
//			for (int i = 0; i < values.length; i++) {
//			if(temp.add(values[i]) == false) {
//			// if the method returns false, it means that the element already exist in the set and its a duplicate
//			System.out.println("Duplicate found with using a set: " + values[i] + " " + i);
//			// break;
//			}
//			} for(String i: temp) {
//			System.out.println(i);
//			}
//
//
//
//			// will be back at 9:23
//
//
//
//			// O(2n)
//
//
//
//			}
//
//
//			}

}
