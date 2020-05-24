
import java.util.ArrayList;
import java.util.Scanner;  
public class cinema {

	

	public static void main(String[] args) {
		boolean end = false;
		//store user data
		
		//for storing user
		ArrayList<CU> User = new ArrayList<CU>();
		//for storing cinema
		ArrayList<CC> Cinema = new ArrayList<CC>();
		//for storing booking
		ArrayList<Booking> Book = new ArrayList<Booking>();
		//for storing cinema's seat available on the date
		ArrayList<BookAvai> BookAvai = new ArrayList<BookAvai>();
		Scanner myObj = new Scanner(System.in); 
		//Ask for the task
		while (!end){
		System.out.println("What do you want to do: ");
		String command = myObj.nextLine();
		 // For creating user
		 if (command.equals("CU")){
			System.out.println("Enter username: ");
			String userName = myObj.nextLine();
			//create user object and add it to array
			CU user = new CU(userName);
			User.add(user);
		 }
		 //for creating cinema
		 else if (command.equals("CC")){
			System.out.println("Enter cinema name: ");
			String cinemaName = myObj.nextLine();
			System.out.println("Enter cinema Capacity: ");
			int capacity = myObj.nextInt();
			//create user object and add it to array
			CC cinema = new CC(cinemaName, capacity);
			Cinema.add(cinema);
		 }
		 //for booking
		 if(command.equals("B")){
			 System.out.println("Enter UserID: ");
			 int userid = myObj.nextInt();
			 System.out.println("Enter CinemaID: ");
			 int cinemaid = myObj.nextInt();
			 System.out.println("Enter StartDate (1-365): ");
			 int startdate = myObj.nextInt();
			 System.out.println("Enter EndDate (1-365): ");
			 int enddate = myObj.nextInt();
			 Booking booking = new Booking(userid, cinemaid, startdate, enddate);
			Book.add(booking);
			//adding booking detail to Cinema
			boolean CinemaDate;
			
		 }
		if(command.equals("GetU")){
			System.out.println("Getting all the user info...");
			int size = User.size();
			for (int id = 0; id < size; id++ ){
				System.out.println(User.get(id).getName().toString()+ " " + id);
			}
		}
		
		if(command.equals("GetC")){
			System.out.println("Getting all the cinema info...");
			int size = Cinema.size();
			for (int id = 0; id < size; id++ ){
				System.out.println(Cinema.get(id).getName().toString() + " Capacity: "+ Cinema.get(id).getcap() + " " +id );
			}
		}
	
	}
	}
}