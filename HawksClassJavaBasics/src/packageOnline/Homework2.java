package packageOnline;

public class Homework2 {

	public static void main(String[] args) {
		
				String word1="book";
				String word2="Testing";
				String word3="I am going to get a job";
				String word4="Learning";
				String word5="My code works";
				String rev ="";
				for(int i =word1.length()-1;i >= 0; i--) {
				}for(int i =word2.length()-1;i >= 0; i--){
				}for(int i =word3.length()-1;i >= 0; i--) {
				}for(int i =word4.length()-1;i >= 0; i--) {
				}for(int i =word1.length()-1;i >= 0; i--) {	
					rev = rev + word1.charAt(i);
					rev = rev +word2.charAt(i);
					rev = rev +word3.charAt(i);
					rev = rev +word4.charAt(i);
					rev = rev +word5.charAt(i);
					if (word1.length() %2 !=0) {
			        System.out.print(word1.charAt(i));
			        }else if (word1.length() %2 ==0){
			        System.out.print(word1.charAt(i));
			        }
			    	System.out.println();			    	
			    	if (word2.length() %2 !=0) {
					       System.out.print(word2.charAt(i));
					}else if (word2.length() %2 ==0){
					System.out.print(word2.charAt(i));
					}
					if (word3.length() %2 !=0) {
					       System.out.print(word3.charAt(i-1));
					}else if (word3.length() %2 ==0){
					System.out.print(word3.charAt(i));
					}
					if (word4.length() %2 !=0) {
					       System.out.print(word4.charAt(i-1));
					}else if (word4.length() %2 ==0){
					System.out.print(word4.charAt(i));
					}
					if (word5.length() %2 !=0) {
					       System.out.print(word5.charAt(i-1));
					}else if (word5.length() %2 ==0){
					System.out.print(word5.charAt(i));
					}
				}
			

		}
		
	}


