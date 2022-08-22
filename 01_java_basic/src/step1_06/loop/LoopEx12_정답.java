package step1_06.loop;

/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

public class LoopEx12_정답 {

	public static void main(String[] args) {
		int i = 1;
		
		while (true) {		
			if (i > 50) {
				break;
			}
			else {
				if ( (i/10) > 0 && (i/10) % 3 == 0) {
				System.out.print("짝 ");
				}
				else if((i%10) != 0 && (i%10) % 3 == 0) {
					System.out.print("짝 ");
				}
				else {
					System.out.print(i + " ");
				}
			}
			i++;
		}
	}

}
