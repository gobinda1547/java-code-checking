package value_assign_where_condition;

public class Main {

	public static void main(String[] args) {
		boolean b1 = false;
		if ((b1 = true)) {
			System.out.println("yes " + b1);
		} else {
			System.out.println("no " + b1);
		}
	}

}
