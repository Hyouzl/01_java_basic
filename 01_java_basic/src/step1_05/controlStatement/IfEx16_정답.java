package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 홀짝 게임
 * 
 * 1. 1~100사이의 랜덤 숫자를 저장한다.
 * 2. 저장된 랜덤 숫자를 보여주고,
 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
 * 
 */

public class IfEx16_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int num = ran.nextInt(100) + 1;
		System.out.println("1.홀수");
		System.out.println("2.짝수");

		System.out.print("번호를 선택하세요 : ");
		int choice = scan.nextInt();
		
		
		if (choice == 1) {
			if (num % 2 == 0) {
				System.out.println("땡!");
				System.out.println("정답은 " + num + ", 짝수." );
			}
			if (num % 2 != 0) {
				System.out.println("정답!");
				System.out.println("정답은 " + num);
			}
		}
		if (choice == 2) {
			if (num % 2 == 0) {
				System.out.println("정답!");
				System.out.println("정답은 " + num);
			}
			if (num % 2 != 0) {
				System.out.println("땡!");
				System.out.println("정답은 " + num + ", 홀수." );
			}
		}
	}

}
