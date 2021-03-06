package Selection;

public class PracticeQuestion2 {

	public static void main(String[] args) {
		int[] data = { 54, 415, 5, 454, 1, 5, 1, 21, 5, 1, 21, 5, 14, 1, 1, 5, 4, 5, 4, 8 };
		// we want to loop through this array and find the largest number in this is
		// array
		int largest = data[0];
		int smallest = data[0];
		int sum = 0;
		int avg = 0;
		// find the smallest number in this array
		// find the sum of all of the numbers in the array
		// find the average of the numbers in the array
		for (int i = 0; i < data.length; i++) {
			if (data[i] > largest) {
				largest = data[i];
			} else if (data[i] < smallest) {
				smallest = data[i];
			}
			
			sum += data[i];
			
		}
		// print all of the numbers
		for (int i : data) {
			System.out.print(i + ", ");
		}
		System.out.println();
		System.out.println("Largest Value: " + largest);
		System.out.println("Smallest Value: " + smallest);
		System.out.println("Sum Value: " + sum);
		System.out.println("Count of Values: " + data.length);
		System.out.println("Average Value: " + ((double)sum/data.length)); // sum / count
	}
}