import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        for (int i=num; i>=1; i--){
            System.out.println(i);
        }
        
    }
}