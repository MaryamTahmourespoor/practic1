package packageOnline;

public class Homework {

	public static void main(String[] args) {
//		String word1="book";
//		String word2="Testing";
//		String word3="I am going to get a job";
//		String word4="Learning";
//		String word5="My code works";
//		String rev ="";
//		for(int i =word1.length()-1 ;i >= 0; i--) {
//			rev = rev + word1.charAt(i)  ;
//				if (word1.length() %2 !=0) {
//	System.out.print(word1.charAt(i));
//				
//			}else if (word1.length() %2 == 0){
//				System.out.print(word1.charAt(i));
//			}
//		}System.out.println();
//			for(int i =word2.length()-1 ;i >= 0; i--) {
//			rev = rev + word2.charAt(i);
//			if (word2.length() %2 !=0) {
//	System.out.print(word2.charAt(i));
//				
//			}else if (word2.length() %2 ==0){
//				System.out.print(word2.charAt(i));
//						}
//			}
//			System.out.println();
//			
//		for(int i =word3.length()-1 ;i >= 0; i--) {
//			rev = rev + word3.charAt(i);
//			if (word3.length() %2 !=0) {
//	       System.out.print(word3.charAt(i));
//				
//			}else if (word3.length() %2 ==0){
//				System.out.print(word3.charAt(i));
//		
//		}		
//		}
//		System.out.println();
//		for(int i =word4.length()-1 ;i >= 0; i--) {
//			rev = rev + word4.charAt(i)  ;
//				if (word4.length() %2 !=0) {
//	System.out.print(word4.charAt(i));
//				
//			}else if (word4.length() %2 == 0){
//				System.out.print(word4.charAt(i));
//			}
//		}System.out.println();
//		
//	for(int i =word5.length()-1 ;i >= 0; i--) {
//		rev = rev + word5.charAt(i)  ;
//			if (word5.length() %2 !=0) {
//System.out.print(word5.charAt(i));
//			
//		}else if (word5.length() %2 == 0){
//			System.out.print(word5.charAt(i));
//			}
//	}System.out.println();
//
////Create arrays based on the following requirements and then using for loop,
////	go through each and print all variables in each:
////1- Array of strings that holds the values “blue”, “red”, “brown”, “white”, and “yellow”

//	String []data =new String[5];
//	data[0]="blue";
//	data[1]="red";
//	data[2]="brown";
//	data[3]="white";
//	data[4]="yellow";
//	for(int i =0; i< data.length; i++)
//	System.out.println(data[i]);
//	 
//	//Array of integers that holds the values 15,18,26,24,25,8,5,411,26,2,1
		//15,5,13,5,1,4,2,5,36,3,4,2
//	int data1[] = {15,5,13,5,1,4,2,5,36,3,4,2};
//		int largest = data1[0];
//			for(int i =0; i< data1.length; i++) {
//		if (data1 [i]>largest) {
//			largest = data1[i];
//		}
//	}
//		System.out.println(largest);
	
	//	Array of chars that holds the values c,s,c,s,r,g,a,c,d,g
	//	Logic: after you have the array with all the chars in it
	//	, write a for loop that goes through the array and checks to see
//		if each char is same as the previous char in the array.
//		As soon as you find the first instance that there are two of 
//		the same char in a sequence, you can break the loop and print found it + the char value.
	//
		char []data={'c','s','c','s','r','g','a','c','d','g'};

		 for (char i=0; i<data.length;i++) 
	 {
		 System.out.print(data[i]+"  ");
		 if(data.length == data.length-1) 
	 { System.out.println();
	break;
	 }	 
//		 System.out.println(data[i]);
//	 
	 }
	
	 

	}}
