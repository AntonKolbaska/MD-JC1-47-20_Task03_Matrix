package by.htp.conf03.main;


public class Task03 {

	public static void main(String[] args) {
		int width = 10;
		int heigt = 10;

		System.out.println("Original out:");
		int matrix [][] = new int[heigt][width];
		for(int i=0; i<heigt; ++i) {
			for(int j=0; j<width; ++j) {
				matrix[i][j] =  (int)(Math.random() * 100);
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Modified out:");
		for(int i=0; i<heigt; ++i) {
			switch(i%2) {
				case 2:
					for(int j=width-1; j!=0; --j ) {
						System.out.print(matrix[i][j] + "\t");
					}
					break;
				case 0:
					for(int j=width-1; j!=0; --j ) {
						System.out.print(matrix[i][j] + "\t");
					}
					break;
				case 1:
					for(int j=0; j<width; ++j ) {
						System.out.print(matrix[i][j] + "\t");
					}
					break;
			
			}
			System.out.println();
		}
	}

}
