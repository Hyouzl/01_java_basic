package step1_06.loop;


/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

public class LoopEx26_정답 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 50; i++) {
			if (i == 3 || i == 6 || i == 9 || i / 10 == 3 || i % 10 == 3 || i / 10 == 6 || i % 10 == 6 || i / 10 == 9 || i % 10 == 9) {
				System.out.print("짝 ");
			}
			else System.out.print(i + " ");
		}
	}

}
