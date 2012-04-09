package ポリモーフィズム;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(new Engiineer().payAmount(emp));
		System.out.println(new SalesMan().payAmount(emp));
		System.out.println(new Manager().payAmount(emp));

	}

}
