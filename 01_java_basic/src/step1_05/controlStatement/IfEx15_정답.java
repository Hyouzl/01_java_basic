package step1_05.controlStatement;

import java.util.Random;

/*
 * # 당첨복권[1단계] 
 * 
 * 30%의 확률로 화면에 '당첨'이라는 글자가 화면에 출력된다.
 * 당첨되지 않은 경우는 '꽝'이라는 글자가 화면에 출력된다.
 */


public class IfEx15_정답 {

	public static void main(String[] args) {
	
		Random ran = new Random();
		
		/*int num = ran.nextInt(10);
		int jackpot = ran.nextInt(3);
		
		if (num == jackpot) {
			System.out.println("당첨");
		}
		
		if (num != jackpot) {
			System.out.println("꽝");
		}*/
		int rNum = ran.nextInt(10);
		
		if (rNum < 3) System.out.println("당첨"); 
		if (rNum >= 3) System.out.println("꽝");
		
	}

}
