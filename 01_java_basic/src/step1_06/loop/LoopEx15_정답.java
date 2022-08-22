package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 랜덤학생
 * 
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 * 
 */

public class LoopEx15_정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int max = 0;
		int passNum = 0;
		int maxidx = 1;
		for (int i = 0; i < 10; i++) {
			int num = ran.nextInt(100) + 1; 
			sum += num;
			if (num >= 60) {
				passNum++;
			}
			if (num > max) {
				max = num ;
				maxidx = i;
			}
		}
		
		int avg = sum / 10;
		System.out.println("전교생 총점은 " + sum + "점, 평균은 " + avg + "점");
		System.out.println("합격자 수는 " + passNum + "명이다.");
		System.out.println("1등 학생의 번호는 " + (maxidx+1) +", 점수는 " + max + "점이다.");

	}

}
