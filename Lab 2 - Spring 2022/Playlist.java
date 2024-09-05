import java.util.Scanner;
public class Playlist {
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	//assigned variables
    int totalMinutes = 0;
    int totalSeconds = 0;

	for (int i=0; i<=9; i+=1) {
         //Prints out questions for the user to plug in input
		System.out.printf("Enter Song %d title: ",i+1);
		String song = input.nextLine();
        // displays song and asks for minutes
		System.out.print("Enter number of minutes in " +song+ " : ");
		int Minutes = input.nextInt();
        // it calculates the minutes
        totalMinutes = totalMinutes + Minutes;
        // displays song and asks for seconds
		System.out.print("Enter number of seconds in " +song+ " : ");
		int Seconds = input.nextInt();
        // it calculates the seconds
        totalSeconds = totalSeconds + Seconds;
        input.nextLine();
	}
    //equation to convert minutes to seconds and add the remain seconds that were left
    int TotalInSeconds = totalMinutes * 60 + totalSeconds;
    //equation to convert seconds to minutes
    double TotalInMinutes = TotalInSeconds / 60;

    //equation to update all the seconds with the minutes
    totalMinutes = TotalInSeconds / 60;
    totalSeconds = TotalInSeconds % 60;
    //prints output the total of minutes,total of seconds, and the total length of the songs
    System.out.println("Total playlist length in seconds:"+ TotalInSeconds);
    System.out.printf("Total playlist length in minutes: %.2f\n", TotalInMinutes);
    System.out.println("Total playlist length: " + totalMinutes+":" + totalSeconds);
		}  
}
