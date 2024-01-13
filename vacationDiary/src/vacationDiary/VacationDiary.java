// Jason McDuffy
// CIS 406
// Vacation Diary
// January 13, 2023 

package vacationDiary;
import java.util.Scanner;
public class VacationDiary 
{
	public static void main(String[] args) 
	{
		
		// Output application welcome statement
		System.out.println("Vacation Diary");
		
		//Prompt the user for input data
		System.out.print("Please enter Date Vacation Started (mm/dd/yyyy): ");
		Scanner input = new Scanner(System.in);
		String dateStarted = input.next();
		System.out.print("Plesase enter City Visited: ");
		String cityVisited = input.next();
		System.out.print("Please enter Country Visited: ");
		String countryVisited = input.next();
		System.out.print("Please enter number of days: ");
		String daysVisited = input.next();
		System.out.print("Please enter Mode of Travel (car, airplane, ship,  train, or bus): ");
		String modeTravel = input.next();
		
		// Display Output
		System.out.println();
		System.out.println("Details of your trip: ");
		System.out.println("Date: " + dateStarted );
		System.out.println("City: " + cityVisited );
		System.out.println("Country: " + countryVisited );
		System.out.println("Number of Days: " + daysVisited );
		System.out.println("Traveled by: " + modeTravel );
		System.out.println("Bye!!!");
		
	}
}
-