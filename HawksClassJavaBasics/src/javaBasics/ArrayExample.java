package javaBasics;

import java.util.Iterator;

 public class ArrayExample {

	public static void main(String[] args) {
	
	//	Array= 1-array are fixed in size
	//	-2- array are in a contignes block of memory
	//	-3- arrays will hold same data type 
	// -4- array can have multi dimension
	// int []name = new int 	
	
	// [10,5,9,5,3]
//				int[] data;
//				data = new int[8];
//				data[0] = 5;
//				data[1] = 12;
//				data[2] = 23;
//				data[3] = 562;
//				data[4] = 12;
//				data[5] = 34;
//				data[6] = 34;
//				data[7] = 12;
//				int data2[] = { 5, 12, 23, 562, 12, 34, 34, 12 };
				
//				System.out.println(data[0]);
//				System.out.println(data[1]);
//				System.out.println(data[2]);
//				System.out.println(data[3]);
//				System.out.println(data[4]);
//				System.out.println(data[5]);
//				System.out.println(data[6]);
//				System.out.println(data[7]);
////			
				
//				for (int i= 0;i<data.length;i++) {
//					System.out.print(data[i]+"  ");
//				}
							//      i   0 - 7 < 8
//				for (int i = 0; i < data.length; i++) {
//					System.out.println(data[i]);
//				}
//				int[][] a = new int[3][3];
//				// 1,2,3
//				// 4,5,6
//				// 7,8,9
//				int a [][]=new int [3][3];
//				a[0][0]=1;
//				a[0][1]=2;
//				a[0][2]=3;				a[0][0]=1;
//				a[1][0]=4;
//				a[1][1]=5;
//				a[1][2]=6;
//				a[2][0]=7;
//				a[2][1]=8;
//				a[2][2]=9;
//				for (int i = 0; i < a.length; i++) {
//					for (int j =0; j<a.length;j++) {
//						System.out.print(a[i][j]+"  ");
//					}
//				
//			System.out.println();
			
//		String b[] = { "SD", "AK", "CA" };
//String twoDimension[][] = { { "SD", "AK", "CA" }, { "AL", "MS", "EC" }, { "DE", "OK", "IL" } };
//			
//		System.out.println("------------------------------");
//		for (int row = 0; row < twoDimension.length; row++) {
//		for (int col = 0; col < twoDimension[row].length; col++) {
//		System.out.print(twoDimension[row][col] + " ");
//		}
//		System.out.println();
//		}			
//				
//	System.out.print("----------------------------");	
// System.out.println();
//		// 12 25 15
//		// 14 85 41
//		// 78 97 42
//		// 74 85 41
//     int a [][]= {{12,25,15},{14,85,41},{74,85,41}};
//     for (int i=0; i<a.length;i++) {
//    	 for (int j=0; j<a[i].length;j++) {
//    		 System.out.print(a[i][j]+"   ");
//    	}	
//    	 System.out.println();
//    	  
     
//		int a[][] = { { 12,25,15} , {14,85,41 } , {78,97,42} , {74,85,41} } ; 
//			
//		for (int i = 0;  i<a .length; i++);
//			{
//						int i=0;
//						for (int j =0; j<a[i].length; j++)
//						{
//							System.out.println(a [i] [j] +"   ");
//						}
//						System.out.println();
//					}
							
		
	// create a two dimension array with name nums with data type of int with size of 10 x 10
	// then create a two dimension loop that goes through the array and assign a value to each index
	// the values should be 1 - 100 on first row
	// 201 - 300 on the second row
	// etc... 	
	
	// create a two dimension array with name nums with data type of int with size
			// of 10 x 10
			// then create a two dimension loop that goes through the array and assign a
			// value to each index
			// the values should be 1 - 100 on first row
			// 201 - 300 on the second row
			// etc...
			// nums[i][j] = 1;
			// when its done, create another nested loop to go through and print it
			
//	int[][] nums = new int[10][10]; // creating an array on in 10x10
//	int number = 1; // creating an int starting from 1
//	for (int i = 0; i < nums.length; i++) { // looping through all of the rows
//		for (int j = 0; j < nums[i].length; j++) { // looping through all of the cells in each row
//			nums[i][j] = number++; // assigning the number to that cell and then increasing the number by 1
//	}
//		}
//			for (int i = 0; i < nums.length; i++) { // looping through each row
//				for (int j = 0; j < nums[i].length; j++) { // looping through all of the cells of each row
	//				System.out.print(nums[i][j] + "\t"); // printing the value of that cell on the same line and adding space after each
				
		//System.out.println(); // going to the next line after each row is done
	
	int [][] nums =new int [10][10];
	int number =1;
	
	for (int i  = 0; i < nums.length; i++) {
		for (int j = 0; j < nums[i].length; j++) {
			nums[i][j]=number++;
		}
	}
	for (int i = 0; i < nums.length; i++) {
		for (int j = 0; j < nums[i].length; j++) {
			 
			System.out.print(nums[i][j]+"\t");
		}System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
		
				
 }
 
 

			
			
	// nums[i][j] = 1;
					
	// when its done, create another nested loop to go through and print it

					
					
			
	


					
					