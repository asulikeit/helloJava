
public class Dia {
	public static void main(String[] args) {
		int N = 3;
		for (int i = 0; i < N; i++) {
			printSquare(N, i);
		}
		for (int i = N; i > 0; i--) {
			printSquare(N, i);
		}
	}
	private static void printSquare(int N, int i) {
		for (int j = 0; j < N - i; j++) {
			System.out.print(' ');
		}
		printDia(i);
		printDia(i);
		System.out.print('\n');
	}
	private static void printDia(int i) {
		for (int k = 0; k < i; k++) {
			System.out.print('*');
		}
	}
}
