import java.util.Scanner;

public class TaskFour {
	
	public static void main(String[] args) {
		
        System.out.print("Enter 2 numbers: ");
        Scanner scanData = new Scanner(System.in);

        double m = scanData.nextDouble();
        double n = scanData.nextDouble();

        double nt = NearTen(m, n);

        if(m == n){
            System.out.println("Same numbers");
        } else {
            System.out.println(nt);
        }

        scanData.close();
    }

    private static double NearTen(double m, double n){

        double x1 = Math.abs(m - 10);
        double x2 = Math.abs(n - 10);
        return x1 < x2 ? m : n;
    }

}
