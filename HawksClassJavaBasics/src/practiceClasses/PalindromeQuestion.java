package practiceClasses;

 public class PalindromeQuestion {

	public static void main(String[] args) {
		
		
		// you will be given a string,
		// find if it is Palindrome?
		// dad mom
		// 123454321
		// madam 
		
//  	String word = "123";
		// if the reverse of the word is same as the word itself, it is palimdrome
		
//		for(int i =0; i<word.length(); i++) {
//			System.out.println(i); //012
//		}
//		for (int i = word.length()- 1; i >= 0; i--) {
//			System.out.println(i);  //210
//		}
//		System.out.println("*****************");
//		String word1="12345";
//		for (int i = 0; i<=5; i++) {
//			System.out.println(word1.charAt(i));
//		}
//		System.out.println();
//		for (int i=word1.length()-1; i>=0 ; i--) {
//				System.out.println(word1.charAt(i));
//		}
//		for(int i =1; i<=10; i++) {
//			System.out.println(i);
//		}
//		
//		System.out.println("*****************************************");
//		String word3="book";
//		for(int i = 0; i<4; i++) {	
//       System.out.print(word3.charAt(i));	
//		}           //******************************book*************//
		
		
		String word3="book";
        String rev = "";
		for (int i = word3.length()-1; i>=0; i--) {
		rev= rev + word3.charAt(i);
		}
		System.out.println(rev);//******************koob************//
	
		
//      String word = "madam";
//		
//		for (int i = word.length() - 1; i >= 0; i--) {
//			rev = rev + word.charAt(i);
//		}
//		System.out.println("word: " + word);
//		System.out.println("reverse: " + rev);
//		System.out.println(word.equals(rev) ? "Palimdrome" : "Not Palindrome");
//		if (word.equals(rev)) {
//			System.out.println("the word is palindrome");
//		} else {
//			System.out.println("the word is not palindrome");
//		}
//		
//      String word = "madam";
//		
//		for (int i = word.length() - 1; i >= 0; i--) {
//			rev = rev + word.charAt(i);
//		}
//		System.out.println("word: " + word);
//		System.out.println("reverse: " + rev);
//		System.out.println(word.equals(rev) ? "Palimdrome" : "Not Palindrome");
//		if (word.equals(rev)) {
//			System.out.println("the word is palindrome");
//		} else {
//			System.out.println("the word is not palindrome");
//		// book
//		// abccba
//		// 012345

				String word2 = "123321";
		// in this loop we are initializing 2 variables forward and backward
		// forward will start from beginning and goes to the end
		// backward will start from last index and goes to the first
		// condition of the loop will run for the length of the word, but we will stop in the middle by using keyword break
		for (int forward = 0, backward = word2.length() - 1; forward < word2.length(); forward++, backward--) {
//			// if the length is odd, the middle will be the same value
//			// if the length is even, we pass the middle of the word when forward is bigger than the backward
//			// when we reach or pass the middle and everything is the same so far, we can stop comparing, its palindrome and we can get out
			if(forward == backward || forward > backward) {
				System.out.println("Palindrome");
				break; // used to stop the loop
			}
//			// if we have not passed the middle of the word yet and we find a char that does not match, then the word is not palindrome
//			// so we can stop checking and get out
			if(word2.charAt(forward) != word2.charAt(backward)) {
				System.out.println("not palindrome");
				break; // used to stop the loop
			}
			}
						
//		String word2 = "123321";
//		for (int forward = 0, backward = word2.length() - 1; forward < word2.length(); forward++, backward--) {
//			if(forward == backward || forward > backward) {
//				if(forward == backward || forward > backward) {
//					System.out.println("Palindrome");
//					break; 
//				}
//			}
//			if(word2.charAt(forward) != word2.charAt(backward)) {
//				System.out.println("not palindrome");
//				break;
			
	}
 }	
 			