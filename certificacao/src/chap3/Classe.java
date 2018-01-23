package chap3;

public class Classe {

	public static void main(String[] args) {

		int[][] rec = new int[3][4];
		rec[0][0] = 0;
		rec[0][1] = 1;
		rec[0][2] = 1;
		rec[0][3] = 1;

		rec[1][0] = 2;
		rec[1][1] = 3;
		rec[1][2] = 3;
		rec[1][3] = 1;

		rec[2][0] = 4;
		rec[2][1] = 5;
		rec[2][2] = 5;
		rec[2][3] = 1;

		for(int linha = 0; linha < rec.length; linha++) {
			for(int coluna = 0; coluna < rec[linha].length; coluna++ ) {
				System.out.print(rec[linha][coluna] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("=================");
		
		for(int[] first : rec) {
			for(int num : first) {
				System.out.print(num + " ");
			}
			System.out.println();
		}


	}
}
