package step1_04.inputFunction;

import java.util.Scanner;



public class InputEx02_문제 {

	public static void main(String[] args) {
	
		// 문제1) 숫자 2개를 입력받아서 합 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 1 : ");
		int num1=scan.nextInt();
		System.out.println("정수 2 : ");
		int num2=scan.nextInt();
		
		int sum = num1 + num2;
		System.out.println("입력한 두 수의 합은 " + sum);
		
		
		// 문제2) 숫자 1개를 입력받아서 홀수이면 true 출력
		
		System.out.println("숫자 입력 : ");
		int num3 = scan.nextInt();
		System.out.println( num3%2 != 0 );
		
		
		// 문제3) 성적을 입력받아 60점 이상이고 100점 이하이면 true 출력
		
		System.out.println("성적 입력 : ");
		int score = scan.nextInt();
		System.out.println( score >= 60 && score <= 100);
		
		scan.close();
		
		
	}
	
}
