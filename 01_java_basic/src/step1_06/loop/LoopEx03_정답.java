package step1_06.loop;

//# 반복문 기본문제[2단계]

//8:38 - 47
public class LoopEx03_정답 {

	public static void main(String[] args) {
		
		// 문제1) 1~10까지 반복해 3미만 7이상만 출력
		// 정답1) 1 2 7 8 9 10
		
		
		System.out.println("문제 1) ");
		int i = 1;
		
		while (i <= 10) {
			if (i < 3 || i >= 7) {
				System.out.print(i + " ");
			}
			i++;
		}
		
		// 문제2) 문제1의 조건에 맞는 수들의 합 출력
		// 정답2) 37
		
		System.out.println();
		int sum = 0;
		
		i = 1;
		while (i <= 10) {
			if (i < 3 || i >= 7) {
				sum += i;
			}
			i++;
		}
		System.out.println("문제 2)");
		System.out.println("합은 : " + sum);
		
		// 문제3) 문제1의 조건에 맞는 수들의 개수 출력
		// 정답3) 6
		
		i = 1;
		int cnt = 0;
		System.out.println("문제 3) ");
		while (i <= 10)
		{
			if (i < 3 || i >= 7) {
				cnt++;
			}
			i++;
		}
		
		System.out.println("개수는 : " + cnt);
		// 문제4) 1~5까지의 합 출력
		// 정답4) 15
		
		System.out.println("문제 4) ");
		int j = 1;
		sum = 0;
		while (j <= 5) {
			sum += j;
			j++;
		}
		
		System.out.println("1~5까지의 합 : " + sum);
	}

}
