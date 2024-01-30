import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int i = 1; i <= n; i++){
        	String str = input.next();
        	System.out.print((char)str.charAt(0));
        	System.out.println((char)str.charAt(str.length()-1));
        }
    }
}