import java.util.Scanner;

public class TaskThird {
	
	public static void main(String[] args) {

        System.out.print("Enter a number to check for evenness and oddness: ");

        Scanner scanData = new Scanner(System.in);
        int n = scanData.nextInt();

        if(n % 2 == 0) {
        	
            System.out.println("Even number");
            
        } else {
        	
            System.out.println("Odd number");
            
        }

        scanData.close();
    }

}
