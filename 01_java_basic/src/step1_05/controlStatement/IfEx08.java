package step1_05.controlStatement;

/*
 * 
 * # 중첩 if 문 
 * 
 *  - if 문 안에 또 다른 if 문이 중첩으로 들어간 형태  
 * 
 */

public class IfEx08 {

	public static void main(String[] args) {
		
		int totalGrade = 60;
		
		if (totalGrade >= 60){
			System.out.println("합격");
			if (totalGrade == 100) {
				System.out.println("- 만점 -");
			}
		}
		if (totalGrade < 60) {
			System.out.println("불합격");
		}

	}

}
