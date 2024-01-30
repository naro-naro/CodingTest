import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        String str;
        int nth;
        Scanner input = new Scanner(System.in);
        str = input.next();
        nth = input.nextInt();
        System.out.println(str.charAt(nth-1));
        input.close();
    }
}