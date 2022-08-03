package step1_01.print;

public class PrintEx03 {

	public static void main(String[] args) {

		/*
		 * 
		 *  # 이스케이프 문자 ( escape sequence ) 
		 * 
		 * 	1) \n : 줄바꿈
		 *  2) \t : tab
		 *  3) \" : 문자 자체 " (문법x)
		 * 
		 */
		
		System.out.println("안녕\n하세요");
		System.out.println("안녕\t하\t세\t요");
		System.out.println("\"안녕\"하세요");
		System.out.println("\n=============\n");
		
		
		 /* 
		 *  서식 문자 출력
		 *  
		 *  1) %d : 정수
		 *  2) %f : 실수
		 *  3) %c : 단일 문자
		 *  4) %s : 문자열
		 *  
		 *  5) %.1f : 소수점 1자리 까지 출력(반올림)
		 * 	   %.2f : 소수점 2자리 까지 출력(반올림)
		 *     %.3f : 소수점 3자리 까지 출력(반올림)
		 */
	
		System.out.printf("%d\n" , 3);
		System.out.printf("%f\n" , 3.14);
		
		System.out.printf("%.1f\n" , 5.2364);
		System.out.printf("%.2f\n" , 5.2364);
		System.out.printf("%.3f\n" , 5.2364);
		System.out.printf("%.4f\n" , 5.2364);
		
		System.out.printf("%c\n" , '#');
		System.out.printf("%s\n" , "글자");
		System.out.printf("글자\n");
		
		System.out.printf("총점 : %d ,  평균 : %.1f\n" , 290 , 290/3.0);
		System.out.printf("이름 : %s , 나이 : %d , 총점 : %d , 평균 : %.1f\n" , "제임스 고슬링" , 20 , 398 , 398/4.0);
		
		
	}

}
