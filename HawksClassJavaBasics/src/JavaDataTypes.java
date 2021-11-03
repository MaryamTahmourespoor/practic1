
  public class JavaDataTypes {

	public static void main(String[] args) {
		{
			{		
		//String is a reference type: String is a class in Java
		//When we create a String, the String value is a String Object stored in String Pool in the Heap
		//
		String strSubject = "Java";
		strSubject = "Selenium";
		
		/// integer
		
		//integer  as primitive data also integer as class
				// minimum value for integer - 2,147,483,648
				//maximum value for integer 2,147,483,647
				// default value is zero
				int ab = 10;
				int abc;
                abc = 100;
                System.out.println(abc);
                /// Long
                /// long is a primitive  data type and Long takes two times more space than integer
                // long reserve 64 bit and the minimum value is -9,233,372,036,775,808. The maximum value fir long is 9,223,372,036,854,807
                long lo = 32323l;
                long lon = 9223372036854807l;
/// Float
               /// it takes same space as integer > binary 32 bit. The default value is 0.0F. Decimal place.3.4. Float is not  recommended for use of currency.
                float fl = 4.2f;
                System.out.println(fl);
/// Double
                /// 64 bit. Default value zero 0.0d. Decimal                . It takes more place than Float
                double dbl = 4.3;
                System.out.println(dbl);
/// Byte
                /// Byte takes very smal space as primitive data. The minimum value is 128 and maximum is value 127. 8bit>> binary 128= 10001010
                byte bt = 10;
 /// Short
                /// The minmum value is is -32,768 and the maximum value is 32,768 and it takes 16 bit
                short sh = 3000;
                System.out.println(sh);
 /// Char
                // Char, Java is useing unicode system as> ASCII, European, Russian and China.
                // The minimum value is the smallest value in unicode system/table <u000
                //Maximum value is the largest value in unicode system/table > uffff (65535)
  ///NON PRIMITIVE
    /// STRING,used to store consecutive characters
                String s = "Example of String";
   /// Array
                ///Aray, you can store different data types. Set the size for an Array
         //       Aray [] arr = {"45,12,23"};
	}
	
	{

		{	
	    //String is a reference type: String is a class in Java
		}
		//When we create a String, the String value is a String Object stored in String Pool in the Heap
		//String is immutable. Mean we can not change it's size after we create it.
		String strSubject = "Java";
		
		int nbr1 = 10;
		int nbr2 = 20;
		System.out.println(nbr1 + nbr2);
		
		//String Concatenation (+) is actual used to concatenate Strings
		
		String strFirstName = "John";
	    String strLastName = "Leonardo";
		System.out.println(strFirstName + " " + strLastName);
		
		//Create 4 Strings
		//String str1 = "First";
		//String str2 = "Second";
		//String str3 = "Third";
		//String str4 = "Forth";
		//concatenate the above strings, use "and" between each String and make sure to leave a
		//space before and after "and"
	    String str1 = "First";
		String str2 = "Secent";
		String str3 = "Third";
		String str4 = "Fourth";
		System.out.println(str1 + "and"+ str2 + "and"+ str3 + "and"+ str4);
		
       // T on index 0 , o on index 1 , and m on index 2
		String name = "Tom";
		String customer = "Tom";
		//In Java we alway create object using "new" keyword
		
		String strName = new String("John");
		String strCustomer = new String ("John");
		//What if we create a third String Object and the thrid String Objec is
		//referring to the previous object
		String strNOVAStudent = strName;
		
		//so we use "new" keword to store same object twice?
		//when we use "new" keyword, we are actually creating new String Type Obejct inside the Heap memory
		
		//How to compare Strings
		String strCity = "Arlington";
		String strAddress = "Arlington";
		System.out.println(strCity == strAddress);

//both are store as two seperate objects inside the heap
		//single (=) is used for assignment
		//double (==) is used to compare primitive data type or reference to objects
		String strState = new String("Virginia");
		String strMyState = new String ("Virginia");
		System.out.println(strState == strMyState);
		
		//String Methods
		//contentEquals()
		System.out.println(strState.contentEquals(strMyState));
		
		//equalsIgnoreCase()
		//This method will ignore the upper or lower case letter for Strings and compare the contents
		String strSubject1 = "Java";
		String strSubject2 = "JAVA";
		//This method is case sensitive
		System.out.println(strSubject1.contentEquals(strSubject2));
		System.out.println(strSubject1.equalsIgnoreCase(strSubject2));
		
		//How to change the case letter for a String in Java
		//toLowerCase : to change all of the String characters to lower case letters
		String strCar = "bmw";
		String strCarUpperCase = strCar.toUpperCase();
		String strCar2 = "BMW";
		System.out.println("Comparing Cars: "+strCarUpperCase.contentEquals(strCar2));
		
		//toUpperCase : to change all of the String characters to upper case letters
		String strTruck = "volvo";
		String strTruck2 = "VOLVO";
		String strTruck2toLowerCase = strTruck2.toLowerCase();
		System.out.println("Comparing Trucks :"+strTruck.contentEquals(strTruck2toLowerCase));
		
		//length();
		//lenght(); method is giving us the number of characters in a String
		String strHouse = "Townhouse";
		System.out.println("Length of strHouse is :"+strHouse.length());
		
		//charAt();
		//this method will give us a character at a specific index
		String strApt = "Old Town Appartments";
		System.out.println("character at a specific index :"+strApt.charAt(9));
		//indexOf();
		//index of will give us the index of a character in a specific location
		System.out.println("Index of a specific character :"+strApt.indexOf('d'));
		
		//substring();
		//with using substring method on a string, we can choose to get partial substring
		//from previous one calling the substring(); method
		String strName1 = "John David Alexander";
		String strSubStringOfName = strName1.substring(5);
		System.out.println("My substring :"+strSubStringOfName);
		
		//For endindex always give the index number for character the one after last character of
		//substring your want to print
		String strlName = "Massod Ahmad Farzan";
		String strSubStringForOnlyAhmad = strlName.substring(7, 12);
		System.out.println("Sub string for Ahmad only: "+strSubStringForOnlyAhmad);
 
   
	
		}
	}
}
		
	}
		
		
		
		
	


