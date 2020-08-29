package by.htp.conf03.main;

public class Task05 {

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
				matrix[i][width-1-i]=i+1;
		}
		for(int i=0; i<heigt; ++i) {
			for(int j=0; j<width; ++j) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
