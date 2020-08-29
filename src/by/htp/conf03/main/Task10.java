package by.htp.conf03.main;

public class Task10 {

	public static void main(String[] args) {
		int width = 10;
		int heigt = width;

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
			for(int j=0; j<width; ++j) {
				matrix[i][j] = (int)(Math.random()*50-25);
				//System.out.print(matrix[i][j]+"\t");
			}
			//System.out.println();
		}
		for(int i=0; i<heigt; ++i) {
			for(int j=0; j<width; ++j) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Result:");
		for(int i=0; i<heigt; ++i) {
			if(matrix[i][i]>0) {
				System.out.println(matrix[i][i]);
			}
		}

	}

}
