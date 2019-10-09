
public class TaskSecond {

	public static void main(String[] args) {
        int i = 0;
        int numb = 90;
        
        FirstVersion(numb);
        //SecondVersion(i);
    }

    private static void FirstVersion(int numb){

        System.out.println("Sequence with positive(mon-negative) numbers: '90, 85, 80, ...' : ");

        do {
            System.out.print(numb + " ");
            numb -= 5;
        } while (numb > 0);

    }

    private static void SecondVersion(int i){
    	
        System.out.println("Sequence with positive(mon-negative) numbers: '90, 85, 80, ...' : ");
        
        for (i = 90; i > 0; i -= 5) {
            System.out.print(i + " ");
        }
    }
}
