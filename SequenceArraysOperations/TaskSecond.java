
public class TaskSecond {

	public static void main(String[] args) {
		
		System.out.println("Sequence with positive(mon-negative) numbers: '90, 85, 80, ...' : ");
		
        int i = 0;
        int numb = 90;
        
        firstversion(numb);
        secondversion(i);
    }

    private static void firstversion(int numb){

        do {
        	
            System.out.print(numb + " ");
            numb -= 5;
            
        } while (numb >= 0);

    }

    private static void secondversion(int i){
    	 
        for (i = 90; i >= 0; i -= 5) {
        	
            System.out.print(i + " ");
            
        }
    }
}
