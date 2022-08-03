package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 3. 입금
 * . 로그인 후 이용가능
 * 4. 출금
 * . 로그인 후 이용가능
 * 5. 이체
 * . 로그인 후 이용가능
 * 6. 조회
 * . 로그인 후 이용가능
 * 7. 종료
 * 
 */
//7:26-47
public class LoopEx10_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		int inMoney;
		int sendMoney;
		int outMoney;
		int sendAcc;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;
		
		int userId;
		int userPw;

		
		int identifier = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				if (identifier == -1) {
					System.out.println("Id 를 입력하세요 : ");
					userId = scan.nextInt();
					System.out.println("Pw 를 입력하세요 : ");
					userPw = scan.nextInt();
					
					if (userId == dbAcc1 && userPw == dbPw1) {
						identifier = 1;
						System.out.println("user1 님 환영합니다.");
					}
					else if (userId == dbAcc2 && userPw == dbPw2) {
						identifier = 2;
						System.out.println("user2 님 환영합니다.");
					}	
				}
				else {
					if (identifier == 1) {
						System.out.println("user1 님이 로그인 중입니다.");
					}
					else if (identifier == 2) {
						System.out.println("user2 님이 로그인 중입니다.");
					}
				
				}
			}
			else if (sel == 2) {
				if (identifier == 1){
					identifier = -1;
					System.out.println("user1 님 로그아웃 중 ...");
				}
				else if (identifier == 2) {
					identifier = -1;
					System.out.println("user2 님 로그아웃 중 ...");
				}
				else {
					System.out.println("로그인 이후 사용가능");
				}
			}
			else if (sel == 3) {
				if (identifier == 1) {
					System.out.print("입금할 금액 입력 : ");
					inMoney = scan.nextInt();
					dbMoney1 += inMoney;
				}
				else if (identifier == 2) {
					System.out.print("입금할 금액 입력 : ");
					inMoney = scan.nextInt();
					dbMoney2 += inMoney;
				}
				else {
					System.out.println("로그인 이후 사용가능");
				} 
			}
			else if (sel == 4) {
				if (identifier == 1) {
					System.out.print("출금할 금액 입력 : ");
					outMoney = scan.nextInt();
					if (outMoney <= dbMoney1) dbMoney1 -= outMoney;
					else System.out.println("잔액 부족 출금 불가.");
				}
				else if (identifier == 2) {
					System.out.print("출금할 금액 입력 : ");
					outMoney = scan.nextInt();
					if (outMoney <= dbMoney2) dbMoney2 -= outMoney;
					else System.out.println("잔액 부족 출금 불가.");
				}
				else {
					System.out.println("로그인 이후 사용가능");
				} 
				
			}
			else if (sel == 5) {
				if (identifier != -1) {
					System.out.println("이체할 계좌번호 입력 : ");
					sendAcc = scan.nextInt();
					System.out.println("이체할 금액 입력 : ");
					sendMoney = scan.nextInt();
					if (sendAcc == dbAcc1) {
						dbMoney1 += sendMoney;
					}
					else if (sendAcc == dbAcc2) {
						dbMoney2 += sendMoney;
					}
				}
				else {
					System.out.println("로그인 이후 사용가능");
				} 
			}
			else if (sel == 6) {
				System.out.println("조회할 계좌 번호 입력 : ");
				userId = scan.nextInt();
				System.out.println("비밀번호 입력 : ");
				userPw = scan.nextInt();
				if (userId == dbAcc1 && userPw == dbPw1) {
					System.out.println("user1 님의 잔액은 " + dbMoney1 + "원 입니다.");
				}
				else if (userId == dbAcc2 && userPw == dbPw2)
				{
					System.out.println("user1 님의 잔액은 " + dbMoney2 + "원 입니다.");
				}
			}
			else if (sel == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}
	
		scan.close();
		
	}

}
