package interfce_check;

import java.util.Enumeration;

public class Main2 implements Enumeration<String> {

	public static void main(String[] args) {
		Main man = new Main();
		System.out.println(man.getAbc());

	}

	@Override
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String nextElement() {
		// TODO Auto-generated method stub
		return null;
	}

}
