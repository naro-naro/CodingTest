//Case #1: 1 + 1 = 2
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        for (int i=1; i<=num; i++){
            int a, b, plus;
            a = input.nextInt();
            b = input.nextInt();
            plus = a + b;
            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + plus);
        }
    }
}