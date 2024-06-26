package step1_04.inputFunction;

/*
 * 
 * # 콘솔에 키보드로 데이터 입력받기
 * 
 * [ 순서 중요 ]
 * 
 * 1) import java.util.Scanner;  				// Scanner클래스를 불러온다.
 * 2) Scanner scan = new Scanner(System.in);    // scan 객체를 생성한다.
 * 3) System.out.println("#나이 입력: ");       // 안내문을 작성한다.
 * 4) scan.nextInt();                           // 키보드로 입력받는다.
 * 5) scan.close();								// scan을 다 사용한 코드 뒤에 작성한다.
 * 
 * */

import java.util.Scanner;

public class InputEx01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // 코드의 시작부분에서 한 번만 작성한다.
		
		System.out.print("나이 : ");
		int getAge = scan.nextInt(); // nextInt(); 메서드를 통하여 숫자를 입력받는다.
		
		System.out.println("입력하신 나이는 " + getAge + "살 입니다.");
		System.out.println("5년 뒤 나이는" + (getAge + 5) + "살 입니다.");
		
		System.out.print("월급 :");
		int getSalary = scan.nextInt();
		
		System.out.println("입력하신 월급은" + getSalary + "원 입니다.");
		System.out.println("원천징수 금액은" + getSalary * 0.033 + "원 입니다.");
		System.out.println("실 수령액은" + (getSalary - getSalary * 0.033) + "원 입니다.");
		
		scan.close(); //코드 맨 마지막에 작성한다.
		
		
		
		
		
		
		

	}

}
