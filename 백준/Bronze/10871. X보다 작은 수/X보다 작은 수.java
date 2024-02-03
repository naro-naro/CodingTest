import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	
    	int nums, x;
    	String answer = "";
        Scanner input = new Scanner(System.in); 
    
        nums = input.nextInt();
        x = input.nextInt();

        for (int i=0; i<nums; i++) {
        	int n = input.nextInt();
        	if (n < x) {
        		answer += Integer.toString(n);
        		answer += " ";
        	}
        	}

        answer = answer.trim();
        System.out.println(answer);

    }
}