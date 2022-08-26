package step1_06.loop;

/*
 
 	(for문)
 
	# 문제1) 9의 배수중 십의 자리가 6인 첫번째 배수 출력
	# 답 : 63
	
	# 문제2) 8로 나누면 5가 남는수 중 150보다 적은수중에 가장 가까운수를 구하시요 ( 절대값 사용 x )
	# 답 149
	
	# 문제3) 50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까?
	# 답 6 (54,63,72,81,90,99)
	
	# 문제4) 28의 배수 중에서 가장 큰 세자리 수를 구하시요.
	# 답 980
	
	# 문제5) 8의 배수를 작은수부터 5개 출력
	# 답 : 0,8,16,24,32
	
*/

public class LoopEx31_테스트문제 {

	public static void main(String[] args) {

		System.out.print("정답 1) : ");
			
		
		int num = 1;
		for (int i = 1; num < 100; i++) {	
			num = i * 9;
			if (num / 10 == 6) {
				System.out.println(num);
				break;
			}
		}
		
		System.out.print("정답 2) : ");
		
		int max = 0;
		for (int i = 1; i <= 150; i++) {
			if ( i % 8 == 5) {
				max = i;
			}
		}
		
		System.out.println(max);
		
		System.out.print("정답 3) : ");
		
		int cnt = 0;
		
		int num2 = 0;
		System.out.print("(");
		
		for (int i = 1; num2 < 100; i++) {
			if (num2 > 50) {
				cnt++;
				System.out.print(num2);
				if (i * 9 > 100) break;
				else System.out.print(" ");
			}
			num2 = i * 9;
		}
		System.out.print(")");
		System.out.println(" " + cnt + "개");
	
		System.out.print("정답 4) : ");
		
		int num3 = 0;
		for (int i = 1; num3 < 1000; i++) {
			num3 = i * 28;
			if ( (i+1) * 28 > 1000) { 
				break;
			}
		}
		System.out.println(num3);
		
		System.out.print("정답 5) : ");
		
		
	}

}
