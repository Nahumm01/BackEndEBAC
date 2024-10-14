package array;

public class BubbleSortExample {
	public static void main(String[] args) {
		declaracaoArray();
		arrayBidimensional();
		bubbleSort();
	}

	private static void declaracaoArray(){
		System.out.println("*** declaracaoArray ***");

		int[] a = new int[4];
		int[] b;
		int[] r = new int[4], k = new int[4];

		int[] iniciaValores = {12,21,34,54,34};

		int[] meuArray;
		meuArray = new int[10];

		meuArray [0] = 100;
		meuArray [1] = 200;
		meuArray [2] = 300;
		meuArray [3] = 400;
		meuArray [4] = 500;
		meuArray [5] = 600;
		meuArray [6] = 700;
		meuArray [7] = 800;
		meuArray [8] = 900;
		meuArray [9] = 1000;

		System.out.println(meuArray[9]);
		System.out.println(meuArray[6]);


	}

	private static void arrayBidimensional(){
		System.out.println("*** arrayBidimensional ***");
		int[][] a = {{1,2,3},{4,5,6}};
		int[][] b = {{1,2},{3,4},{5,6}};
		outputArray(a);
		outputArray(b);
	}

	private static void outputArray(int[][] array){
		System.out.println("*** outputArray ***");
		for (int[] ints : array) {
			for (int anInt : ints) {
				System.out.println("%d " + anInt);
			}
		}
	}

	private static void bubbleSort(){
		System.out.println("*** bubbleSort ***");
		int[] vet = {7,8,4,5,2,9,1};
		int aux = 0;
		int i = 0;

		System.out.println("Vetor Desordenado: ");
		for (i = 0; i < vet.length; i++) {
			System.out.println(" " + vet[i]);
		}

		for (i = 0; i < 7; i++) {
			for (int j = 0; j < 6; j++) {
				if (vet[j] > vet[j+1]) {
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
			}
		}

		System.out.println("Vetor Ordenado: ");
		for (i = 0; i < 7; i++) {
			System.out.println(" " + vet[i]);
		}
	}
}

