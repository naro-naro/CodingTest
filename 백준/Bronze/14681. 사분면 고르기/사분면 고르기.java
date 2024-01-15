import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int x, y;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        if (x>0){
            if (y>0){
                System.out.println(1);
            }
            else if (y<0){
                System.out.println(4);
            }
        }
        else if (x<0){
            if (y<0){
                System.out.println(3);
            }
            else if (y>0){
                System.out.println(2);
            }
        }
    }
}