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
		

		
		/*
		 * 문제 2)
		 *   #
		 *  ##
		 * ###
		 */
		
		for (i = 1; i <= 3-i ; i++) {
			for (j = 1; j <= 3-i; j++)
			{
				System.out.print(" ");
				
			}
			System.out.println("");
		}
		
		
		/*
		 * 문제 3)
		 * ###
		 * ##
		 * #
		 */

		
		/*
		 * 문제 4)
		 * ###
		 *  ##
		 *   #
		 */

		
		/*
		 * 문제 5)
		 * @##
		 * @@#
		 * @@@
		 */

		
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

		
		
	}
}
