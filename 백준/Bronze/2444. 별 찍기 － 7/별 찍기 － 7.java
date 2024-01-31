import java.util.Scanner;

public class Main{
    public static void main(String[] args){
		int lineCount;
        Scanner input = new Scanner(System.in); 
        

        lineCount = input.nextInt();
		int spaceCount = lineCount - 1;
		int starCount = 1;
		
		for(int i = 0; i<lineCount; i++) { 		
			for(int j = 0; j<spaceCount; j++) { 
				System.out.print(' ');
			}
			for(int j = 0; j<starCount; j++) {
				System.out.print('*');
			}

			spaceCount-=1;
			starCount+=2;
			System.out.println();

        }
		
		
		spaceCount = 1;
		starCount = lineCount*2-3;
		
		for(int i = 0; i<lineCount-1; i++) { 		
			for(int j = spaceCount; j>0; j--) { 
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
