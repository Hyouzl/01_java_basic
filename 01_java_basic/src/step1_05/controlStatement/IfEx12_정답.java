package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 최대값 구하기[1단계]
 * 
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */


//8:36 - 41
public class IfEx12_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = scan.nextInt();
		
		System.out.print("두번째 숫자 입력 : ");
		int num2 = scan.nextInt();
		
		System.out.print("세번째 숫자 입력 : ");
		int num3 = scan.nextInt();
		
		int max = num1;
		
		if  (max < num2) {
			max = num2;
			if (max < num3) {
				max = num3;
			}
		}
		
		System.out.println("가장 큰 수는 " + max + "이다.");
		scan.close();
	}
	

}
