/**
 * cinema
 */
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;  
public class cinema {

	

	public static void main(String[] args) {
		//store user data
		ArrayList<CU> User = new ArrayList<CU>();
		ArrayList<CC> Cinema = new ArrayList<CC>();
		Scanner myObj = new Scanner(System.in); 
		//Ask for the task
		System.out.println("What do you want to do: ");
		String command = myObj.nextLine();
		 // Create a Scanner object
		 if (command.equals("CU")){
			System.out.println("Enter username: ");
			String userName = myObj.nextLine();
			//create user object and add it to array
			CU user = new CU(userName);
			User.add(user);
		 }
		 if (command.equals("CC")){
			System.out.println("Enter cinema name: ");
			String cinemaName = myObj.nextLine();
			System.out.println("Enter cinema Capacity: ");
			int capacity = myObj.nextInt();
			//create user object and add it to array
			CC cinema = new CC(cinemaName, capacity);
			Cinema.add(cinema);
		 }
		
	
	}
}