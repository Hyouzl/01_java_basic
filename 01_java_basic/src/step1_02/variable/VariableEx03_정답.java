package step1_02.variable;

// 7.19.9:08
public class VariableEx03_정답 {

	public static void main(String[] args) {
		
		//예) 현금이 10000원있다. 2800원짜리 과자 구입 후, 잔돈 출력
		
		int cash = 10000;
		int snack = 2800;
		int change = cash - snack;
		System.out.println("잔돈 = " + change + "원");
		
		//문제1) 프리랜서의 세율은 3.3%이다. 월급이 2000000원일때 세금을 출력
		int salary = 2000000;
		double taxRatio = 0.033;
		
		System.out.println(salary*taxRatio);
		
		
		//문제2) 시험점수를 100, 88, 92점 을 받았다. 평균은?
		int korean = 100;
		int english = 88;
		int math = 92;
		int aver;
		
		aver = ( korean + english + math ) /3;
		
		System.out.println(aver);
		
		
		//문제3) 밑변이 3이고 높이가 7인 삼각형 넓이 출력 (삼각형의 넓이 구하는 공식 : 밑변 * 높이 / 2)

		int width = 3;
		int height = 7;
		int area;
		
		area = (width * height)/2;
		
		System.out.println(area);
		
		
		//문제4) 100초를 1분 40초로 출력
		
		int time = 100;
		int sec = 60;
		
		System.out.println(time/sec + "분" + time%sec + "초");
		
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		//정답5) 500원의 개수 = 1개
		//       100원의 개수 = 3개 
		
		int price = 800;
		int coin500= 500;
		int coin100= 100;
		
		System.out.println(price/coin500 + "개" + (price%coin500)/coin100 + "개");
		
	}

}
