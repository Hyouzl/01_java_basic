package step1_06.loop;

//9:06 - 14
public class LoopEx20_정답 {

	public static void main(String[] args) {
		

		// 문제 1) 1부터 5까지 출력
		// 정답 1) 1 2 3 4 5
		int i;
		for ( i = 0 ; i < 5 ; i ++ ) {
			System.out.print( (i + 1) + " ");
			
		}
		System.out.println();

		// 문제 2) 1부터 10까지 반복해 5~9까지 출력
		// 정답 2) 5 6 7 8 9
		
		for (i = 1 ; i < 10 ; i++) {
			if (i > 4) {
			System.out.print( i + " ");
			}
		}
		
		System.out.println();
		// 문제 3) 10부터 1까지 반복해 6~3까지 출력
		// 정답 3) 6 5 4 3
		
		for (i = 10 ; i > 0 ; i --) {
			if (i < 6 && i >= 2) {
				System.out.print( (i + 1) + " " );
			}
		}
		System.out.println();
		// 문제 4) 1부터 10까지 반복해 3미만 7이상 출력
		// 정답 4) 1 2 7 8 9 10
		
		for (i = 1; i <= 10 ; i++) {
			if (i < 3 || i >= 7) {
				System.out.print(i + " ");
			}
			}
		}
	}

