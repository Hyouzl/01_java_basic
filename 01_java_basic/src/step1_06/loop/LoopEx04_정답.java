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


public class LoopEx04_정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int score = 0;

		int myAnswer;
		int answer;
		while (i < 5) {
			
			int num1 = ran.nextInt(8) + 2; //구구단... 
			int num2 = ran.nextInt(9) + 1;
			
			System.out.println(num1 + " * " + num2 + "= ?");
			answer = num1 * num2;
			myAnswer = scan.nextInt();
			if (answer == myAnswer) {
				System.out.println("정답!");
				score += 20;
			}
			else System.out.println("땡!");
			i++;
		}
		
		System.out.println("구구단 게임 점수는 : " + score);
		
		scan.close();

	}

}
