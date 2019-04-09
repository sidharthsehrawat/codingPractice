package com.Arrays_Sorting_Programs;

public class MergeSorting {

	public void MakeSubArrayMethod(int[] a, int p, int q, int r) {

		int[] L = new int[q + 1];
		int[] R = new int[r - q];

		for (int i = 0; i < q + 1; i++) {
			L[i] = a[p + i];
		}

		for (int j = 0; j < q; j++) {

			R[j] = a[q + 1 + j];

		}

		int x = 0;
		int y = 0;
		for (int k = 0; k < a.length - 1; k++) {
			if (x < L.length && y < R.length) {

				if (L[x] < R[y]) {
					a[k] = L[x];
					x++;

				} else {
					a[k] = R[y];
					y++;
				}
			}

			else {
				if (x < L.length) {
					a[k] = L[x];
					x++;
				}

				if (y < R.length) {
					a[k] = R[y];
					y++;
				}

			}

		}

	}

	public void MergeFunction(int[] a, int p, int r) {

		if (p < r) {

			int q = (p + r) / 2;

			MergeFunction(a, p, q);
			MergeFunction(a, q + 1, r);
			MakeSubArrayMethod(a, p, q, r);
		}

	}

	public static void display(int[] a) {
		for (int c = 0; c < a.length - 1; c++) {
			System.out.print(" " + a[c]);

		}

	}

	public static void main(String[] args) {
		MergeSorting ob = new MergeSorting();
		int[] arr = { 5, 3, 2, 6, 1, 4 };

		ob.MergeFunction(arr, 0, arr.length - 1);
		display(arr);
	}

}
