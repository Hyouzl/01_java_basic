package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 1 ~ 100까지의 난수를 생성한다.
 * 2. 스캐너를 이용해 정답을 맞추기를 시도하고 정답을 맞출경우 게임은 종료된다.
 * 3. 점수는 100점부터 시작해서 오답을 입력할 때마다 5점씩 차감된다.
 * 4. 게임 종료 후, 점수를 출력한다.
 * 
 */
//9:17 - 23
public class LoopEx07_정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		int num =0 ;
		int myNum = 1;
		int score = 100;
		num = ran.nextInt(100) + 1;
		boolean isRun = true;
		while(isRun == true)
		{
			System.out.print("숫자를 예상해보세요 : ");
			myNum = scan.nextInt();
			
			
			if (num > myNum) {
				System.out.println("UP!");
				score -= 5;
			}
			else if (num == myNum) {
				System.out.println("정답!");
				isRun = false;
			}
			else if (num < myNum) {
				System.out.println("DOWN!");
				score -= 5;
			}
			else if (score < 0) isRun = false;
		}
		
		System.out.println("점수는 : " + score);
		
		
		
	}

}
