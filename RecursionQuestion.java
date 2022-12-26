import java.util.Scanner;

public class RecursionQuestion {


	/* your solution code here */
	public static int binarySearch(Car[] cars, int s, int e, Car c) {
		if (e >= s && s <= cars.length - 1) {
 			int mid = s + (e - s) / 2;
 			System.out.println("s=" + s + ", e=" + e + ", mid=" + mid);
            		if (cars[mid].equals(c)) {
				System.out.println("FOUND at "+mid);
                		return mid;
 			}
            		if (cars[mid].compareTo(c) == 1 ) {
				System.out.println("go left");
                		return binarySearch(cars, s, mid - 1, c);
 			}
			System.out.println("go right");
            		return binarySearch(cars, mid + 1, e, c);
        	}
		System.out.println("Not Found");
		return -1;
	}

	//do not remove main method or its content
	public static void main(String[] args) {
		Car [] cars = new Car[10];
		int [][] seatConfigurations = {new int[]{2,2}, new int[]{2,3}, 
				new int[]{2,2,3}, new int[]{2,3,3}, new int[]{2,3,4}, new int[]{2,4,3}, 
				new int[]{2,3,5}, new int[]{2,4,4}, new int[]{2,4,5}, new int[]{3,4,5}};
		for(int i=0; i<cars.length; i++){
			cars[i] = new Car(2, 4, seatConfigurations[i]);
		}
		Scanner kb = new Scanner(System.in);
// 		System.out.print("enter seat info");   //uncomment only when testing on your local system
		String [] input = kb.nextLine().split(" ");
		int [] rowSeats = new int[input.length];
		for(int i=0; i<input.length; i++){
			rowSeats[i] = Integer.parseInt(input[i]);
		}
	}
}