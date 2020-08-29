package by.htp.conf03.main;

import java.util.Random;

public class Task12 {
	
	static void shuffleArray(int[] array)
	  {
	    Random rnd = new Random();
	    for (int i = array.length - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);
	      // Simple swap
	      int a = array[index];
	      array[index] = array[i];
	      array[i] = a;
	    }
	  }
	
	
	public static void main(String[] args) {
		int width = 20;
		int heigt = 10;

		System.out.println("Original out:");
		int matrix [][] = new int[heigt][width];
		/*for(int i=0; i<heigt; ++i) {
			for(int j=0; j<width; ++j) {
				matrix[i][j] =  (int)(Math.random() * 100);
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Modified out:");*/
		for(int i=0; i<heigt; ++i) {
			for(int j=0; j<i+1; ++j) {
				matrix[i][j] = 1;
				//System.out.print(matrix[i][j]+"\t");
			}
			shuffleArray(matrix[i]);
			//System.out.println();
		}
		int counter=0;
		for(int i=0; i<heigt; ++i) {
			for(int j=0; j<width; ++j) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}
