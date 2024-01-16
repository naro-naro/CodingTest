import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        int i;
        int sum = 0;
        for (i=1; i<num+1; i++){
            sum +=i;
        
        }
        System.out.println(sum);
    }
}