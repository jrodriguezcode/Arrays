// Thanks to Bro Code and his video
public class Main {

	public static void main(String[] args) {
		// array = used to store multiple values in a single variable
		
		String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
		
		cars[0] = "Mustang";
		
		System.out.println(cars[0]);
		
		String[] holder = new String[3];
		
		holder[0] = "Cloud";
		holder[1] = "Tifa";
		holder[2] = "Aerith";
		
		System.out.println(holder[0]);
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

	}

}
