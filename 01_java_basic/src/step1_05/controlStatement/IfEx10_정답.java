package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 로그인[3단계]
 * 
 * 1. Id를 입력받아 dbId와 일치할 경우에만 Pw를 입력할 수 있다.
 * 2. Id가 틀린 경우, "Id를 확인해주세요"라는 메세지를 출력한다.
 * 3. Pw가 틀린 경우, "Pw를 확인해주세요"라는 메세지를 출력한다.
 * 4. Id와 Pw와 모두 일치하는 경우, "로그인 성공"라는 메세지를 출력한다.
 */

//8:23 - 27

public class IfEx10_정답 {

	public static void main(String[] args) {
		
		int dbId = 1234;
		int dbPw = 1111;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		int meId = scan.nextInt();
		int mePw;
		if (meId == dbId) {
			System.out.print("비밀번호 입력 :");
			mePw = scan.nextInt();
			if (mePw == dbPw) {
				System.out.println("로그인 성공!");
			}
			if (mePw != dbPw) {
				System.out.println("Pw를 확인해주세요");
			}
		}
		
		if (meId != dbId) {
			System.out.println("Id를 확인해주세요");
		}
		
		scan.close();
	}

}
