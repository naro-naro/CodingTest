import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int a, b, sum;
        Scanner input = new Scanner(System.in);
        int i = 1;
        while (i<=2){
            a = input.nextInt();
            b = input.nextInt();
            if ((a==0)&&(b==0)){
                break;
            }
            sum = a+b;
            System.out.println(sum);

        }
    }
}