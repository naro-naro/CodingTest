import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        for(int i=1; i<=num; i++){
            int a=0, b=0;
            a = input.nextInt();
            b = input.nextInt();
            a += b;
            System.out.println("Case #"+i+": "+a);
        }
    }
}