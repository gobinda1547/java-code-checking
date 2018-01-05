package ascii_value_print;

public class Main {

	public static void main(String[] args) {
		System.out.println();
		System.out.println();
		for (int i = 20, m = 8; i < 45; i++) {
			for (int j = 0; j < m * 25; j += 25) {
				System.out.print(String.format("[ %d = %c ]  ", i + j, i + j));
			}
			System.out.println();
		}

	}

}
