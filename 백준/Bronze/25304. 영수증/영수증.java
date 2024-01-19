import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
//	첫째 줄에는 영수증에 적힌 총 금액 
//	둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 
//	N개의 줄에는 각 물건의 가격 개수 
//
//	구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다.
//	일치하지 않는다면 No를 출력한다.
//
//	예제 입력 1 
//	260000
//	4
//	20000 5
//	30000 2
//	10000 6
//	5000 8
	
		int total=0, amount=0,  summuch=0, summany=0;
		Scanner input = new Scanner(System.in);
		total = input.nextInt();
		amount = input.nextInt();
		
		
		for (int i=1; i<=amount; i++) {
			int howmuch=0, howmany=0;
			howmuch = input.nextInt();
			howmany = input.nextInt();
			summuch += howmuch*howmany;
			summany += howmany;
		}
		
		if(total == summuch) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
}
