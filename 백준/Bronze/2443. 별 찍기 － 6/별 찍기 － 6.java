import java.util.Scanner;

public class Main{
    public static void main(String[] args){
		int lineCount;
        Scanner input = new Scanner(System.in); 
        lineCount = input.nextInt();
		int spaceCount = 0;
		int starCount = lineCount*2-1;
		
		for(int i = 0; i<lineCount; i++) { 		// n줄 동안 반복
			for(int j = spaceCount; j>0; j--) { // 공백 개수 만큼 반복
				System.out.print(' ');
			}
			for(int j = starCount; j>0; j--) {
				System.out.print('*');
			}

			spaceCount += 1;
			starCount -= 2;
			System.out.println();

        }
    }
}