package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * identfier 변수가 -1 이면 로그아웃 상태이고
 * 				   1 이면 dbAcc1유저가 로그인한 상태이며
 * 				   2 이면 dbACcc2유저가 로그인한 상태이다.
 * 
 * 
 * 1. 로그인
 *  - dbAcc1유저 및 dbAcc2유저가 로그인 후 다시 로그인을 누를경우 '현재 000 유저님 로그인중' 출력
 * 	- 로그아웃 상태에서만 이용 가능
 * 		> 로그인 되었습니다. '000 유저님 환영합니다.' 출력
 * 2. 로그아웃
 *  - 로그 아웃 상태에서 진행시 '로그인 이후 이용해주세요' 출력
 * 	- 로그인 후 이용가능 ' 로그아웃 되었습니다.' 출력
 * 
 */

//9:24-40
public class LoopEx08_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int id = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		boolean isRun = true;
		int user;
		int userPw;
		
		while (isRun) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				
				if (id == -1) {
					System.out.print("ID 를 입력 : ");
					user = scan.nextInt();
					if (user == dbAcc1) { {
							System.out.print("PW 를 입력 : ");
							userPw = scan.nextInt();
						}
						if (userPw == dbPw1){
								id = 1;
								System.out.println("user1님 환영합니다.");
							}
						}
					if (user == dbAcc2) { {
						System.out.print("PW 를 입력 : ");
						userPw = scan.nextInt();
						}
						if (userPw == dbPw2) {
							id = 2;
							System.out.println("user2님 환영합니다.");
						}
					}
					}
				else if (id == 1) {
					System.out.println("현재 user1님이 로그인 중");
				}
				else if (id == 2) {
					System.out.println("현재 user2님이 로그인 중");
				}
				}
	
			else if (selectMenu == 2) {
				if (id == 1 || id == 2) {
					System.out.println("로그아웃 되었습니다.");
					id = -1;
				}
				else if ( id == -1 ) System.out.println("로그인 후 이용해주세요.");
				
			}
			else if (selectMenu == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}

		scan.close();
	}

}
