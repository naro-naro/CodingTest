import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	
		int n1, answer =0;
		String n2;
        Scanner input = new Scanner(System.in); 
        
        n1 = input.nextInt();     
        n2 = input.next();

        for (int i=0; i<n1; i++) {
        	char ch = n2.charAt(i);
        	int index = Character.getNumericValue(ch);
        	answer += index;
        }
        System.out.println(answer);
    }
}