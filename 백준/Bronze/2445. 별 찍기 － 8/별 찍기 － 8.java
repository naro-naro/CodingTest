import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	
		int line, star, blank;
        Scanner input = new Scanner(System.in); 
        
        line = input.nextInt();       
        star = 0;
        blank = 2*line;
        
        for (int i=0; i<line; i++) {
        	for (int j=0; j<line; j++) {
        		star += 1;
        		blank -= 2;
        		System.out.print("*".repeat(star));
        		System.out.print(" ".repeat(blank));
        		System.out.println("*".repeat(star));
        	}
        	if (blank == 0) break;
        	
        	}
        
        for (int i=0; i<line-1; i++) {
        	if (star == 1) break;
        	for (int j=0; j<line-1; j++) {
        		star -= 1;
        		blank += 2;
        		System.out.print("*".repeat(star));
        		System.out.print(" ".repeat(blank));
        		System.out.println("*".repeat(star));
        	}       	
        }
    }
}