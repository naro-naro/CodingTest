import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        int i;
        for (i=1; i<10; i++) {
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }
}
//2 * 1 = 2