import java.util.Scanner;

public class Main{
    public static void main(String[] args){
		int n;
        Scanner input = new Scanner(System.in); 

        n = input.nextInt();
        
        System.out.println("@".repeat(n+2));
        for (int i=1; i<=n; i++) {
        	System.out.print("@");
        	System.out.print(" ".repeat(n));
        	System.out.println("@");
        }
        System.out.println("@".repeat(n+2));
    }
}
