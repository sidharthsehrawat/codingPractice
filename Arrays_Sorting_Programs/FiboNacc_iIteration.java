package com.Arrays_Sorting_Programs;

public class FiboNacc_iIteration {

	public static void FiboMethod(int num) {
		int next = 0;
		int first = 0;
		int second = 1;
		int count = 0;
		while (count < num) {
			if (count <= 1) {
				next = count;
				count++;
			} else {
				next = first + second;
				first = second;
				second = next;

				count++;
			}

			System.out.println(next);

		}

	}

	public static void main(String[] args) {
		int num = 30;
		FiboNacc_iIteration.FiboMethod(num);

	}

}
