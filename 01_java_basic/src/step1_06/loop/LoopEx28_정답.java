package step1_06.loop;


// # 삼각형 그리기

public class LoopEx28_정답 {
	
	public static void main(String[] args) {
		
		/*
		 * 예)
		 * ###
		 * ###
		 * ###
		 */
		
		for (int i = 0; i < 9; i++) {
			System.out.print("#");
			if (i % 3 == 2) System.out.println();
		}
		
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		//8:05
		
		/*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */
		
		int i,j,k;
		
		for (i = 1; i <= 3; i++) {
			for (j = 1; j <= i; j++)
			{	
				System.out.print("#");
			}
			System.out.println();

		}
		
		System.out.println();

		
		/*
		 * 문제 2)
		 *   #
		 *  ##
		 * ###
		 */
		
		for (i = 1; i <= 3; i++) {
			for (j = i; j < 3; j++) {
				System.out.print(" ");
			}
			for (k = 0; k < i; k++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		/*
		 * 문제 3)
		 * ###
		 * ##
		 * #
		 */

		
		for (i = 3; i > 0; i--) {
			for (j = 0; j < i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		
		System.out.println();
		/*
		 * 문제 4)
		 * ###
		 *  ##
		 *   #
		 */

		
		for (i = 3; i > 0; i--) {
			for (k = 0; k < 3-i; k++) {
				System.out.print(" ");
			}
			for (j = i; j > 0; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 * 문제 5)
		 * @##
		 * @@#
		 * @@@
		 */
		
		
		for (i = 0; i < 3; i++) {
			for (k = 0; k <= i; k++) {
				System.out.print("@");
			}
			for (j = 1; j < 3-i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}

		System.out.println();
		
		/*
		 * 문제 6)
		 *   #
		 *  ###
		 * #####
		 */
		


		/*
		 * 문제 7)
		 *  #####
		 *   ###
		 *    #
		 */
		
		int t = 0;
		for (i = 0; i < 3; i++) {
			for (k = 0; k < i; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}

		
		
	}
}
