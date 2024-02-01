import java.util.Scanner;

public class Main{
    public static void main(String[] args){
		int n;
        Scanner input = new Scanner(System.in); 

        n = input.nextInt();
        
        for (int i=1; i<=n; i++) {
        	System.out.println("@".repeat(5*n));
        }
        for( int j=1; j<=(5*n-n); j++) {
        	System.out.println("@".repeat(n));
        }
    }
}