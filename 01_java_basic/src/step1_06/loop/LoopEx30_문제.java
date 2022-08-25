package step1_06.loop;

/*
 * # 2차원 반복문
 * 
 * 1   2  3  4  5
 * 10  9  8  7  6
 * 11 12 13 14 15
 * 20 19 18 17 16
 * 21 22 23 24 25
 * 
 * 
 * 1) 오른쪽방향으로 순서대로 출력
 * 2) 왼쪽방향대로 순서대로 출력
 * 
 * 1)2) 5번 반복
 * 
 */


public class LoopEx30_문제 {

	public static void main(String[] args) {

		int i = 1;
		int turn = 1;
		while (true) {
			if (turn == 6) {
				break;
			}
			else if ( (i-1) % 5 == 0) {
				System.out.println();
				turn++;
				if (turn % 2 == 0) {
					i += 5;
				}
			}
			else {
				if (turn % 2 != 0) {
					System.out.print(i + "\t");
					i++;
				}
				else {
					System.out.print((i+5) + "\t");
					i--;
				}
			}

		}
		
		
	}

}
