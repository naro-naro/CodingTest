// long int는 $4$바이트 정수까지 저장
// long long int는 $8$바이트 정수까지 
// “int 앞에 long을 하나씩 더 붙일 때마다 $4$바이트씩 저장할 수 있는 공간이 늘어나는 걸까?
// long long long int는 $12$바이트, 
// long long long long int는 $16$바이트까지 저장

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int byt;
        Scanner input = new Scanner(System.in);
        byt = input.nextInt();
        int i;
        int num;
        String print_byt = "long int";
        num = ((int)byt/4);
        for (i=1; i<num; i++){
            print_byt = "long " + print_byt;
        }
        System.out.println(print_byt);
    }
}