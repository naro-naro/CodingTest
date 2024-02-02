import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	
    	String str, answer = "";
        Scanner input = new Scanner(System.in); 
    
        str = input.next();

        for (char j='a'; j<='z'; j++) {
        		answer += str.indexOf(j);
        		answer += " ";
        	}

        answer = answer.trim();
        System.out.println(answer);

    }
}