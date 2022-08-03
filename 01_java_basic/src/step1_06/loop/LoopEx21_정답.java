package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 */
//9:14-19

public class LoopEx21_정답 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
	
		int myAnswer;
		int answer;
		int score = 0; 
		for ( int i = 1 ; i <= 5 ; i++) {
			Random ran = new Random();
			int num1 = ran.nextInt(9) + 1;
			int num2 = ran.nextInt(8) + 2;
			
			System.out.println( num1 + " * " + num2 +" = ?");
			answer = num1 * num2;
			myAnswer = scan.nextInt();
			if (answer == myAnswer) {
				score += 20;
			}
		}
		
		System.out.println("점수는 " + score +"점 이다.");
		 
	}

}
