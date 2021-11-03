package Selection;

     public class SelectionBasic {

  	    public static void main(String[] args) {
		
		
//		double grade = 60;
//		if (grade>90) {                
//			System.out.println("A");
//		}else if (grade >80) {
//			System.out.println("B");
//		}else if (grade >70) {
//			System.out.println("C");
//		}else if (grade >=60) {
//			System.out.println("D");
//		}else {
//			System.out.println("F");
//		}
//		
//		//
//		double total = 600;
//		double interest =0;
//		      
//		if (total > 3500) {
//			// for odd, interest = 5.5
//			// for even, interest = 6.5
//		} else if (total >= 2500) {
//			// interest should be 3.5
//			interest = total * 0.035;
//			System.out.println("total: " + total + " interest 3.5%  = " + interest + " = " + (total + interest));
//		} else if (total >= 900) {
//			// interest should be 2.5
//			interest = total * 0.025;
//			System.out.println("total: " + total + " interest 2.5%  = " + interest + " = " + (total + interest));
//		} else if (total >= 500) {
//			// interest should be 1.5
//			interest = total * 0.015;
//			System.out.println("total: " + total + " interest 1.5%  = " + interest + " = " + (total + interest));
//		} else if (total >= 100) {
//			// interest should be 1.0
//			interest = total * 0.01;
//			System.out.println("total: " + total + " interest 1.0%  = " + interest + " = " + (total + interest));
//		} else {
//			// interest should be 0.0
//			interest = 0;
//			System.out.println("total: " + total + " interest 0.0%  = " + interest + " = " + (total + interest));
//		}         
//		          
//////////// if total is more than 3500, then check to see if the number is odd or even
//  			// for odd, interest = 5.5
//  			// for even, interest = 6.5
//  			// for totals 2500 - 3500, interest should be 3.5
//  			// for totals 900 - 2500, interest should be 2.5
//  			// for totals 500 - 900, interest should be 1.5
//  			// for totals 100 - 500, interest should be 1.0
  	    	
  	    	double total = 4585;
  	    	double interest =0.0d;
  	    	           if (total >3500) {
  	    		       if (total % 2 == 0) {
  	    		       interest = total * 0.055;
  	    		    			System.out.println("total :  " +  total  + " interest 5.5%"+ "=" + interest + "=" + (total + interest) );
  	    		                System.out.println("even"); 
  	    		       }else {
  	    		       interest = total *0.065;
  	    		             	System.out.println("total :  " +  total  + " interest 6.5%"+ "=" + interest + "=" + (total + interest) );
  	    		                System.out.println("odd");
  	    		    }
  	          	
  	    	 }else if (total >=2500) { 
  	    		interest = total * 0.035;
  	    		System.out.println("total :  " +  total  + " interest 3.5%"+ "=" + interest + "=" + (total + interest) );
  	    	}else if (total >= 900) {
  	    		interest = total * 0.025;
  	    		System.out.println("total:"+total+ "interest 2.5%"+ "=" + interest +"="+(total + interest));
  	    	}else if (total >=500 ) {
  	    		interest = total * 0.015;
  	    		System.out.println("total:"+total+ "interest 1.5%"+ "=" + interest +"="+(total + interest));
  	    	}else if (total >=100) {
  	    		interest = total * 0.010;
  	    		System.out.println("total:"+total+ "interest 1.0%"+ "=" + interest +"="+(total + interest));
  	    	}else {interest = total * 0;
  	    		System.out.println("total:"+total+ "interest 0 %"+ "=" + interest +"="+(total + interest));
  	    	}
  	    		
  	    	
  	    	////////////////if (total% 2==0)
//		
//		int age = 20;
//		if (age > 20) {
//			System.out.println("they can take loan");
//		} else {
//			System.out.println("they can not take loan");
//		}
//		// grading example
//		// 0 - 100
//		// 90 - 100 = A
//		// 80 - 90 = B
//		// 70 - 80 = C
//		// 60 - 70 = D
//		// <60 = F
//		
//		double grade1 = 89.5;
//		if (grade1 >= 90) { // checking for A
//			System.out.println("A");
//		} else if (grade1 >= 80) { // checking for B
//			System.out.println("B");
//		} else if (grade1 >= 70) { // checking for C
//			System.out.println("C");
//		} else if (grade1 >= 60) { // checking for D
//			System.out.println("D");
//		} else { // F
//			System.out.println("F");
//		}
//		if (grade1 < 60) {
//			System.out.println("F");
//		} else if (grade1 < 70) {
//			System.out.println("D");
//		} else if (grade1 < 80) {
//			System.out.println("C");
//		} else if (grade1 < 90) {
//			System.out.println("B");
//		} else {
//			System.out.println("A");
//		}
//		//
		double total1 = 900;
		double interest1 = 0;
//		// check to see if the total is within these ranges and change interest based on
//		// that
//		// if total is more than 3500, then check to see if the number is odd or even
//		// for odd, interest = 5.5
//		// for even, interest = 6.5
//		// for totals 2500 - 3500, interest should be 3.5
//		// for totals 900 - 2500, interest should be 2.5
//		// for totals 500 - 900, interest should be 1.5
//		// for totals 100 - 500, interest should be 1.0

  	     		if (total1 > 3500) {
			// for odd, interest = 5.5
			if (total1 % 2 == 0) {
				// even
				// interest should be 6.5
				interest1 = total1 * 0.065;
				System.out.println("total: " + total1 + " interest 3.5%  = " + interest1 + " = " + (total1 + interest1));
			} else {
				// odd
				// interest should be 5.5
				interest1 = total1 * 0.055;
				System.out.println("total: " + total1 + " interest 3.5%  = " + interest1 + " = " + (total1 + interest1));
			}
			// for even, interest = 6.5
		} else if (total1 >= 2500) {
			// interest should be 3.5
			interest1 = total1 * 0.035;
			System.out.println("total: " + total1 + " interest 3.5%  = " + interest1 + " = " + (total1 + interest1));
		} else if (total1 >= 900) {
			// interest should be 2.5
			interest1 = total1 * 0.025;
			System.out.println("total: " + total1 + " interest 2.5%  = " + interest1 + " = " + (total1 + interest1));
		} else if (total1 >= 500) {
			// interest should be 1.5
			interest1 = total1 * 0.015;
			System.out.println("total: " + total1 + " interest 1.5%  = " + interest1 + " = " + (total1 + interest1));
		} else if (total1 >= 100) {
			// interest should be 1.0
			interest1 = total1 * 0.01;
			System.out.println("total: " + total1 + " interest 1.0%  = " + interest1 + " = " + (total1 + interest1));
		} else {
			// interest should be 0.0
			interest1 = 0;
			System.out.println("total: " + total1 + " interest 0.0%  = " + interest1 + " = " + (total1 + interest1));
		}
		
		
		
		
		float anuualSalary = 95000f;
		float biWeeklySalary =anuualSalary/52;
		System.out.println(biWeeklySalary);
				
		
		float salaryJohn = 96000.52f;
		float weeklySalaryJohn= salaryJohn/52;
		System.out.println(weeklySalaryJohn);
		
		
		
		
		
		
		
		
		
		
		
	}


}


