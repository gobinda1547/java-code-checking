package interfce_check;

import java.util.Iterator;
import java.util.Vector;

class Main implements Car {

	private Main main;

	public static void main(String[] args) {

		System.out.println();

		Vector<Integer> v = new Vector<>();
		for (int i = 0; i < 100; i++)
			v.add(i);

		System.out.println(v);

		
		Vector<Integer> v2 = new Vector<>();
		for (int i = 0; i < v.size(); i++)
			v2.add(v.get(i));
		System.out.println("v2" + v2);

		Iterator<Integer> it = v.iterator();
		while (it.hasNext()) {
			int x = it.next();
			System.out.print(x + " ");
			if (x % 5 == 0)
				it.remove();
		}
		System.out.println();

		System.out.println(v);

		System.out.println("v2" + v2);

	}

	@Override
	public int getAbc() {
		System.out.println(main.getAbc());
		return 0;
	}

}
