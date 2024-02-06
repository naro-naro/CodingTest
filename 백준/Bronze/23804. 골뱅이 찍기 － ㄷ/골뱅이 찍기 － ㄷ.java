import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	
    	int nums;
        Scanner input = new Scanner(System.in); 
    
        nums = input.nextInt();

        for(int k=0; k<nums; k++) {
        	System.out.println("@".repeat(nums*5));
        }
        
        for (int i=0; i<nums*3; i++) {
        	System.out.println("@".repeat(nums));
        }

        for(int k=0; k<nums; k++) {
        	System.out.println("@".repeat(nums*5));
        }
}
}