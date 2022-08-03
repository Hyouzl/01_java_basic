package step1_06.loop;

import java.util.Random;
import java.util.Scanner;


/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 * 
 */
//9:20-25
public class LoopEx22_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		 
		int num = ran.nextInt(10) + 1;
		int myNum;
		int score = 100;
		boolean isRun = true;
		
		while (isRun) {
			System.out.print("숫자를 입력 : ");
			myNum = scan.nextInt();
			
			if (num == myNum) {
				System.out.println("Bingo!");
				break;
			}
			else score -= 5;
		}
		
		System.out.println("점수는 " + score + "점 이다." );
	}

}
