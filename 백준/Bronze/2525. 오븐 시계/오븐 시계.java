import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int h;
        int m;
        int cooktime;
        
        Scanner input = new Scanner(System.in);
        h = input.nextInt();
        m = input.nextInt();
        cooktime = input.nextInt();
        
        m += cooktime;
        h = h + m/60;
        m = m%60;
        h = h%24;
        System.out.println(h + " " + m);

    }
}