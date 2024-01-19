import java.util.Scanner;
public class Main {
	public static void main(String[] args){
        int a, b, c, answer=1;
	    Scanner input = new Scanner(System.in);
	    a = input.nextInt();
	    b = input.nextInt();
	    c = input.nextInt();
	    
	    if ((a!=b)&&(b!=c)&&(c!=a)) {
	    	 answer = a;
	    	 if (b > answer) answer = b;
	         if (c > answer) answer = c;
             answer = answer*100;
	         System.out.println(answer);
	    }
	    
	    else if ((a==b)&&(b==c)) {
	    	answer = a*1000 + 10000;
	    	System.out.println(answer);
	    }
	    
	    else if ((a==b)||(b==c)||(c==a)){
	    	if (a==b) answer =a;
	    	else if (b==c) answer =b;
	    	else if (c==a) answer = c;
	        answer = answer*100 + 1000;
	        System.out.println(answer);
	    }
	    
	}
}