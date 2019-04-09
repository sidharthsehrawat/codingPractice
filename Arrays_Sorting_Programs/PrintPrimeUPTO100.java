package com.Arrays_Sorting_Programs;

public class PrintPrimeUPTO100 {
	public void Print(int number) {
		int count = 0;
		for (int j = 3; j <= number; j++) {
			int i = 2;
			while (i <= j) {
				if (j % i == 0) {
					count++;
					i++;
				} else {
					i++;
				}

			}
			if (count == 1) {

				display(j);

				count = 0;
			} else {
				count = 0;
			}

		}

	}

	public void display(int k) {
		System.out.println(k);

	}

	public static void main(String[] args) {
		PrintPrimeUPTO100 ob = new PrintPrimeUPTO100();
		int number = 30;
		ob.Print(number);
	}

}
