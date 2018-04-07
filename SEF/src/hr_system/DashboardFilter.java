package hr_system;
import java.util.*;
@SuppressWarnings("unused")



public class DashboardFilter {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		// DO NOT CHANGE any code main method!

		//Used for testing code
		//startup();

		// declare variables used for menu
		String userInput;
		char selection = 0;

		// implementation of the program menu
		do
		{

			// print menu to screen
			System.out.println("*** HR Task Assignment Menu ***");
			System.out.println();
			
			System.out.printf("%-25s%s\n", "Create Task", "A");
			System.out.printf("%-25s%s\n", "Edit Task", "B");
			System.out.printf("%-25s%s\n", "Delete Task", "C");
			System.out.printf("%-25s%s\n", "This Menu", "D");
			System.out.printf("%-25s%s\n", "This Menu", "E");
			System.out.printf("%-25s%s\n", "Exit Program", "X");
			System.out.println();

			// prompt user to enter selection
			System.out.print("Enter selection: ");
			userInput = sc.nextLine();

			System.out.println();

			// validate selection input length
			if (userInput.length() != 1)
			{
				System.out.println("Error - invalid selection!");
			}
			else
			{
				// make selection "case insensitive"
				selection = Character.toUpperCase(userInput.charAt(0));

				// process user's selection
				switch (selection)
		        {
			        case 'A':
			        	System.out.println("*** Option A Selected ***");
			        	//methodSelect01();
			        	break;
			
			        case 'B':
			        	System.out.println("*** Option B Selected ***");
			        	//methodSelect01();
			        	break;
			
			        case 'C':
			        	System.out.println("*** Option C Selected ***");
			        	//methodSelect01();
			        	break;
			
			        case 'D':
			        	System.out.println("*** Option D Selected ***");
			        	//methodSelect01();
			        	break;
			
			        case 'E':
			        	System.out.println("*** Option E Selected ***");
			        	//methodSelect01();
			        	break;
			
			        case 'X':
			        	System.out.println("Exiting the program...");
			        	//exit();
			        	break;
			
			        default:
			           System.out.println("Error - invalid selection!");
		        }
			}
			System.out.println();
			
		} 
		while (selection != 'X');
	}
	
	public void agentLogin()
	{
		
	}
	
	public void dashboard()
	{
		
	}
	
	public void dashboardFilter()
	{
		
	}
	
	public void viewTask()
	{
		
	}
	
	public void massViewTask()
	{
		
	}
	
	public void reportsMenu()
	{
		
	}
	
	public void payrollMenu()
	{
		
	}
}