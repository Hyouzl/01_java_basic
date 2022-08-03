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

//9:31-44

public class LoopEx24_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] student = new int[10];
		int sum = 0;
		int passNUm = 0;
		int aStudentId = 0;
		int aStudentScore = 0;
		
		for (int i = 0; i < 10; i++) {
			Random ran = new Random();
			student[i] = ran.nextInt(100) + 1;
			sum += student[i];
			if (student[i] >= 60) {
				passNUm ++;
			}
			if (aStudentScore < student[i]){
				aStudentScore = student[i];
				aStudentId = i;
			}
			
		}
		
		int aver = sum / 10;
		System.out.println("총점은 " + sum + "점 이다. 평균은" + aver + "점 이다.");
		System.out.println("합격자 수는 " + passNUm + "명 이다.");
		System.out.println("1등 학생의 번호는" + (aStudentId + 1) + ", 점수는 " + aStudentScore +"점 이다.");
		 
		
		
	}

}
