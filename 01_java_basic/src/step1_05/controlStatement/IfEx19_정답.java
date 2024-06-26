package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # ATM[1단계] : 이체하기
 * 
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */

//7:35 - 42
public class IfEx19_정답 {

	public static void main(String[] args) {
		
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이체 할 계좌번호를 입력 : ");
		int sendAcc = scan.nextInt();
		
		if (sendAcc == yourAcc) {
			System.out.print("이체 할 금액 입력 : ");
			int sendMoney = scan.nextInt();
			if (sendMoney > myMoney) System.out.println("잔액 부족 이체 불가");
			else if (sendMoney <= myMoney) {
				System.out.println("이체 가능");
				System.out.println("내 계좌의 남은 금액 : " + (myMoney - sendMoney) + "원");
				System.out.println("보낸 계좌의 이체 후 금액 : " + (yourMoney + sendMoney) + "원");
				}
		}

		else System.out.println("계좌오류 이체불가");
		
	
	}

}
