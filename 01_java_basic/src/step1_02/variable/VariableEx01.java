package step1_02.variable;

public class VariableEx01 {

	public static void main(String[] args) {
		//	1. 정수 : Integer(int)
		int memberAge; //변수의 선언
		memberAge = 20; // 값을 저장
		System.out.println(memberAge);
		// 2. 실수 : double
		double memberWeight = 80.14; // 변수의 선언과 동시에 값을 저장
		System.out.println(memberWeight);
		// 3. 문자 1개 : character(char)
		char memberGenderEng = 'm'; 
		char memberGenderkor = '여';
		System.out.println(memberGenderEng);
		System.out.println(memberGenderkor);
		// 4. 문자열 : String
		String subjectName ="web development";
		System.out.println(subjectName);
		// 5. 참과 거짓 : boolean
		boolean isMember = true;
		System.out.println(isMember);
		
		System.out.println();
		
		//변수의 특징 (고유성)
		int goodsPrice = 18000;
		//int goodsPrice = 19000; 똑같은 이름의 변수를 생성할 수 없다.
		
		goodsPrice = 19800; //자료형을 생략했으므로 기존의 변수의 값을 수정한다.
		goodsPrice = 22000; 
		System.out.println(goodsPrice); // 가장 최근값 1개만 저장되어 있다.
		
		// 변수의 초깃값
		int deliveryPrice;
		//System.out.println(deliveryPrice);// 변수를 초기화하지 않으면 가비지 데이터가 변수에 들어가 있다.
		
		int tax = 0; // 0 데이터로 tax 변수 초깃값 지정
	}

}
