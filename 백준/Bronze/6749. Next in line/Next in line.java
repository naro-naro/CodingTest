import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	
		int n1, n2, n3;
        Scanner input = new Scanner(System.in); 
        
        n1 = input.nextInt();     
        n2 = input.nextInt();

        n3 = n2 + (n2-n1);
        System.out.println(n3);
    }
}