package step1_06.loop;

import java.util.Scanner;

/*
 * # 최대값 구하기[2단계]
 * 
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 * 
 */
//9:44-47
public class LoopEx25_정답 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[3];
		int max = 0;
		for ( int i = 0; i < 3; i++) {
			System.out.print("숫자 입력 : ");
			num[i] = scan.nextInt();
			if (max < num[i]) {
				max = num[i];
			}
		}
		
		System.out.println("입력한 숫자 중 가장 큰 값은 " + max + "이다.");
	}

}
