package by.htp.conf03.main;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int width = sc.nextInt();
		int heigt = sc.nextInt();
		int matrix [][] = new int[heigt][width];
		for(int i=0; i<heigt; ++i) {
			for(int j=0; j<width; ++j) {
				matrix[i][j] =  (int)(Math.random() * 100);
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("k, p:");
		int k = sc.nextInt();
		while(k<0 || k>heigt-1) {
			System.out.println("Wrong k, try again: ");
			k = sc.nextInt();
		}
		int p = sc.nextInt();
		while(p<0 || p>width-1) {
			System.out.println("Wrong p, try again: ");
			p = sc.nextInt();
		}
		
		
		for(int i=0; i<width; ++i) {
			System.out.print(matrix[k][i] + "\t");
		}
		System.out.println();
		for(int i=0; i<heigt; ++i) {
			System.out.println(matrix[i][p] + "\t");
		}
		sc.close();

	}

}
