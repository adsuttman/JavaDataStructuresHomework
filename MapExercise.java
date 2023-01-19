import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExercise {

	public static void main(String[] args) {
		//Create our hash map and fill it with some key value pairs
		Map<String,String> vehicles = new HashMap<>();
		vehicles.put("Civic", "Honda");
		vehicles.put("Accord", "Honda");
		vehicles.put("Charger", "Dodge");
		vehicles.put("Wrangler", "Jeep");
		vehicles.put("Camry", "Toyota");
		vehicles.put("Focus", "Ford");
		
		Scanner input = new Scanner(System.in);
		
		//ask the user for what model their looking for
		System.out.println("What model of car are you looking for?");
		//save the model to a variable that we can use to look up the make in our hash map
		String model = input.nextLine();
		String make = vehicles.get(model);
		
		System.out.printf("Oh, you're looking for a %s?\n", model);
		//if the model they asked for is not in our map make will be null so we can check
		if (make != null) {
			System.out.printf("Our %s selection is right over here...", make);
		} else {
			System.out.printf("This is where I'd put a %s...if I had one!", model);
		}

	}

}
