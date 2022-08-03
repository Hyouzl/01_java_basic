package step1_06.loop;

import java.util.Scanner;

/*
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력받는다.
 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
 * 
 * 예)
 * 메뉴 선택 : 1
 * 메뉴 선택 : 1
 * 메뉴 선택 : 2
 * 메뉴 선택 : 2
 * 메뉴 선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 : 32000
 * === 롯데리아 영수증 ===
 * 1. 불고기 버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜         라 : 1개
 * 4. 총   금   액 : 31300원
 * 5. 잔         돈 : 700원
 */

//8:57 ~ 9:08
public class LoopEx05_정답 {

	public static void main(String[] args) {
		
		int bulgogiBurgerPrice = 8700;
		int shrimpBurgerPrice  = 6200;
		int colaPrice = 1500;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + bulgogiBurgerPrice + "원");
		System.out.println("2.새우    버거 : " + shrimpBurgerPrice + "원");
		System.out.println("3.콜         라 : " + colaPrice + "원");
		
		int i = 0;
		int bulgogiNum = 0;
		int shrimpNum = 0;
		int colaNum = 0;
		int choice;
		int allPrice = 0;
		int money;
		while (i < 5) {
			System.out.print("메뉴 선택 : ");
			choice = scan.nextInt();
			if (choice == 1) {
				bulgogiNum ++; 
				allPrice += bulgogiBurgerPrice;
			}
			else if (choice == 2) {
				shrimpNum ++;
				allPrice += shrimpBurgerPrice;
			}
			else if (choice == 3) {
				colaNum ++;
				allPrice += colaPrice;
			}
			i++;
		}
		
		System.out.println("총금액 : " + allPrice);
		System.out.print("현금 입력 : ");
		money = scan.nextInt();
		
		if ( money >= allPrice) {
			System.out.println("====롯데리아 영수증====");
			System.out.println("1. 불고기 버거 : " + bulgogiNum + "개");
			System.out.println("2. 새우    버거 : " + shrimpNum + "개");
			System.out.println("3. 콜         라 : " + colaNum + "개");
			System.out.println("4. 총금액 : " + allPrice);
			System.out.println("5. 잔돈 : " + (money - allPrice) + "원");
		}
		else System.out.println("금액 부족!");
		
		scan.close();
	}

}
