package inrecement_check;

public class Main2 {

	public static void main(String[] args) {
		int a = 0, b = 10;
		do {
			b--;
			++a;
		} while (a < 2);
		System.out.println(a + " " + b);
	}

}
