package by.htp.conf03.main;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		int matrix [][] = new int[n][n];
		for(int i=0; i<n; ++i) {
			for(int j=0; j<n; ++j) {
				matrix[i][j] =  (int)(Math.random() * 100);
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		for(int i=0; i<n; ++i) {
			System.out.println(matrix[i][i]);
		}
		sc.close();
	}

}
