import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int n, i, answer = 1;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        
        for (i =1; i<=n; i++){
            answer *= i;
        }
        System.out.println(answer);
    }
}