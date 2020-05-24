/**
 * cinema
 */
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;  
public class cinema {

	

	public static void main(String[] args) {
		boolean end = false;
		//store user data
		ArrayList<CU> User = new ArrayList<CU>();
		//store cinema data
		int i = 0;
		//get input
		//program runs
		// while (!end){
		System.out.println(args[0]=="CU");
		if(args[0] == "CU"){
			CU newuser = new CU(args[1]);
			User.add(newuser);
			System.out.println(args[1]);
		}
		System.out.println(args[0]);
		System.out.println(User.size());
	
	}
}