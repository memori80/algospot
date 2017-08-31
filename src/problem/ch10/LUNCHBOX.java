//https://github.com/abh0518/algorithm_study/tree/master/LUNCHBOX

package problem.ch10;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class LUNCHBOX {

	private class LunchSet {
		int heatingTime;
		int eatingTime;

		public LunchSet(int heatTime, int eatTime) {
			this.heatingTime = heatTime;
			this.eatingTime = eatTime;
		}

		@Override
		public String toString() {
			return this.heatingTime + ":" + this.eatingTime;
		}
	}

	LunchSet[] lunchSet;

	public LUNCHBOX(int[] heatTime, int[] eatTime) {
		lunchSet = new LunchSet[heatTime.length];
		for (int i = 0; i < heatTime.length; i++) {
			lunchSet[i] = new LunchSet(heatTime[i], eatTime[i]);
		}
	}

	// 이 함수를 작성하면 됩니다
	public int fastEat() {
		int totalTime = 0;

		// write

		return totalTime;
	}

	public static void main(String args[]) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();

		for (int i = 0; i < testCase; i++) {
			int lunchCount = in.nextInt();
			int lunchSet[][] = new int[2][lunchCount];

			for (int j = 0; j < 2; j++) {
				for (int c = 0; c < lunchCount; c++) {
					lunchSet[j][c] = in.nextInt();
				}
			}

			LUNCHBOX main = new LUNCHBOX(lunchSet[0], lunchSet[1]);
			System.out.println(main.fastEat());
		}
	}
}