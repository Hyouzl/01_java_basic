package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */
//9:16
public class IfEx14_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Random ran = new Random();
		
		int coin = ran.nextInt(2);
		
		System.out.println("동전 앞뒷면 맞추기 (0은 동전의 앞면, 1은 동전의 뒷면) : ");
		int coinNum = scan.nextInt();

		if (coinNum == coin) {
			System.out.println("정답!");
			if (coin == 1) System.out.println("정답은 뒷면");
			if (coin == 0) System.out.println("정답은 앞면");
			
		}
		if (coinNum != coin) {
			System.out.println("땡!");
			if (coin == 1) System.out.println("정답은 뒷면");
			if (coin == 0) System.out.println("정답은 앞면");
		}



	}

}
