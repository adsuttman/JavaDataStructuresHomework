import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoopExercise {

	public static void main(String[] args) {
		//Initialize Scanner to read user input and ArrayList to store input
		Scanner input = new Scanner(System.in);
		List<Double> numList = new ArrayList<>(5);
		
		//Use a for loop to ask the user to enter 5 numbers, using Double to allow decimals
		//breaks if you don't enter a Double value but we haven't learned error handling stuff so just play along
		Double numInput;
		for (int i = 0;i < 5; i++) {
			System.out.print("Enter a number: ");
			numInput = Double.parseDouble(input.nextLine());
			numList.add(numInput);
		}
		
		//check to make sure things look right
		System.out.println(numList);
		
		//Initialize variables for the results we are looking for
		Double sum = 0.0;
		Double product = 1.0;
		Double max = null;
		Double min = null;
		
		//we can loop through the ArrayList and perform a calculation for each of these values
		//or we can do it all in a single loop, which would be much more efficient put might look messier
		//Since we are looping through a list we can use an enhanced for loop
		for (Double num : numList) {
			//add current num to sum
			sum += num;
			//multiply product by current num
			product *= num;
			//save the first num to max and min so we can compare it to the rest
			if(max == null) {
				max = num;
				min = num;
			} else {
				//if our num is greater than max, set max to our num
//				if (num > max) {
//					max = num;
//				}
				//or we could do 
				//max = Math.max(num, max) to cut out the if statement
				max = Math.max(num, max);
				//if our num is less than min, set min to our num
//				if (num < min) {
//					min = num;
//				}
				min = Math.min(num, min);
				//yeah baby, that's clean as heck
			}
		}
		//Now that we have calculated all the values we are looking for, we can print them out
		System.out.println("\nHere are you results:");
		System.out.println("Sum = " + sum);
		System.out.println("Product = " + product);
		System.out.println("Largest = " + max);
		System.out.println("Smallest = " + min);
	}

}
