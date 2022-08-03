package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 입금
 * . 입금할 금액을 입력받아, myMoney에 입금
 * 2. 출금
 * . 출금할 금액을 입력받아, myMoney에서 출금
 * . 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
 * 3. 이체
 * . yourAcc 계좌번호를 입력받아, 이체
 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
 * . 이체 후 yourMoney 잔액 증가
 * 4. 조회
 * . myMoney와 yourMoney 잔액 모두 출력
 * 
 */


public class LoopEx09_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;	
		
		int inMoney;
		int outMoney;
		int sendAcc;
		int sendMoney;
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				System.out.print("입금할 금액 입력 : ");
				inMoney = scan.nextInt();
				
				myMoney += inMoney;
			}
			else if (selectMenu == 2) {
				System.out.print("출금할 금액 입력 : ");
				outMoney = scan.nextInt();
				
				if (myMoney < outMoney) {
					System.out.println("잔액 부족 출금 불가");
				}
				else {
					myMoney -= outMoney;
					System.out.println("출금 완료");
				}
			}
			else if (selectMenu == 3) {
				System.out.print("이체할 계좌 번호 입력 : ");
				sendAcc = scan.nextInt();
				if (sendAcc == yourAcc) {
					System.out.println("이체할 금액 입력 : ");
					sendMoney = scan.nextInt();
					
					if (sendMoney <= myMoney) {
						yourMoney += sendMoney;
						System.out.println("이체 완료");
					}
					else {
						System.out.println("잔액부족 이체 불가");
					}
				}
				else {
					System.out.println("계좌번호를 확인하세요.");	
				}
			}
			else if (selectMenu == 4) {
				System.out.println("내 계좌의 잔액 : " + myMoney + "원");
				System.out.println("이체한 계좌의 잔액 : " + yourMoney + "원");
			}
			else if (selectMenu == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}

		scan.close();
		
	}

}
