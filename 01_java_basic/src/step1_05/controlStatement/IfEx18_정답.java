package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;



/*
 * # 가위바위보 게임
 * 
 *   if - else if , else 등 구문을 활용하여 자율적으로 작성해보자.
 *   
 *   0 : 가위 , 1 : 바위 , 2 : 보
 */

//7:25 - 34
public class IfEx18_정답 {

	public static void main(String[] args) {
		
		int com = 0;	// 랜덤으로 저장
		int me = 0;		// 키보드로 입력받아 저장
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		com = ran.nextInt(3);
		
		System.out.println("가위(0) 바위(1) 보(2) 중 선택: ");
		me = scan.nextInt(); 
		
		if (me == 0 ) {
			if (com == 1) { System.out.println("You lose!"); }
			else if (com == 2) { System.out.println("You win!"); }
			else if (com == 0) {System.out.println("비겼습니다.");}
		}
		else if (me == 1) {
			if (com == 0) { System.out.println("You win!"); }
			else if (com == 2) { System.out.println("You lose!"); }
			else if( com == 1) { System.out.println("비겼습니다.");}
		}
		else if (me == 2) {
			if (com == 0) { System.out.println("You lose!"); }
			else if (com == 1) { System.out.println("You win!"); }
			else if (com == 2) { System.out.println("비겼습니다."); }
		}
		else System.out.println("다시 입력하세요");
	}

}
