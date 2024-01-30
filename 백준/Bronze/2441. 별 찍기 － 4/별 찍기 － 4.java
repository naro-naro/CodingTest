import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int i = n; i > 0; i--){
        	System.out.println(" ".repeat(n-i)+"*".repeat(i));
        }
    }
}