
public class TaskFive {
	
	public static void main(String[] args) {

        System.out.println("\nArrays type: ");

        int [] arr = new int[20];
        int min = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 200) - 100);
            System.out.print(arr[i] + "  ");


            if(arr[i] <= min){
                min = arr[i];
            } else if(arr[i] >= max){
                max = arr[i];
            }
        }

        System.out.println("\n\nMax: " + max + "\nMin: " + min);
    }

}
