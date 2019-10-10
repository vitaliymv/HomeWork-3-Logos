
public class TaskFirst {
	
	public static void main(String[] args) {
		
        int numb = 1;
        
        firstversion(numb);
        //shortversion(numb);
        
    }

    private static void firstversion(int numb){

        System.out.println("Sequence of 55 numbers, type: '1, 3, 5, 7, ...' : ");
        int i = 0;
        numb = 1;

        while (i < 55){
        	
            System.out.print(numb + " ");
            
            numb += 2;
            i++;
            
        }
    }

    private static void shortversion(int numb) {
    	
        System.out.println("Sequence of 55 numbers '1, 3, 5, 7, ...' : ");
        numb = 1;

        for (int i = 0; i <= 55; i++, numb += 2) {
        	
            System.out.print(numb + " ");
            
        }
    }
}
