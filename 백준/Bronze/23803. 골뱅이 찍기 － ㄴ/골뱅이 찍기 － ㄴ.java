import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	
    	int nums;
        Scanner input = new Scanner(System.in); 
    
        nums = input.nextInt();


        for (int i=0; i<nums*4; i++) {
        	System.out.println("@".repeat(nums));
        }

        for(int k=0; k<nums; k++) {
        	System.out.println("@".repeat(nums*5));
        }
}
}