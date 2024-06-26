package step1_06.loop;

import java.util.Scanner;

/*
 * # 베스킨라빈스31
 * 
 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
 * 3. br이 31을 넘으면 게임은 종료된다.
 * 4. 승리자를 출력한다.
 * 
 * 예) 
 * 1턴 : p1(2)	br(2)
 * 2턴 : p2(1)	br(3)
 * 3턴 : p1(3)	br(6)
 * ...
 */


public class LoopEx11_정답 {

	public static void main(String[] args) {
		
		int p1 = 0;
		int p2 = 0;
		
		int br = 0;
		int turn = 0;
		boolean isRun = true;
		
		Scanner scan = new Scanner(System.in);
		
		while (isRun != false)
		{
			System.out.print("p1 : ");
			p1 = scan.nextInt();
			br += p1;
			System.out.println("br = " + br);
			turn ++;
			if (br < 31) {
				System.out.print("p2 : ");
				p2 = scan.nextInt();
				br += p2;
				System.out.println("br = " +br);
				turn ++;
				if (br > 31) isRun = false;
			}
			else isRun = false;
	
		}
		if ( turn % 2 == 0 ) {
			System.out.println("p2 win!");
		}
		else {
			System.out.println("p1 win!");
		}

	}

}
