import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	
		int n;
        Scanner input = new Scanner(System.in); 
        
        n = input.nextInt();       

        for (int i=0; i<n; i++) {
        	String pw = input.next();
        	if ((pw.length()>=6)&&(pw.length()<=9)) {
        		System.out.println("yes");       		
        	} else {
        		System.out.println("no");
        	}
        }
    }
}