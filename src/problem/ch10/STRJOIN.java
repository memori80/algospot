/**
 * @(#) STRJOIN.class $version 2017. 08. 29
 *
 * Copyright 2017 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package problem.ch10;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * STRJOIN
 *
 * @author 스포츠_개발 (dl_sports_sweng@navercorp.com)
 */
public class STRJOIN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt = scanner.nextInt();

		while (cnt-- > 0) {
			int length = scanner.nextInt();
			List<Integer> list = new LinkedList<>();
			for (int i = 0; i < length; i++) {
				list.add(scanner.nextInt());
			}
			System.out.println(strjoin(list));
		}
	}

	// 이 함수를 작성하면 됩니다
	public static int strjoin(List<Integer> list) {
		int total = 0;

		// write

		return total;
	}
}