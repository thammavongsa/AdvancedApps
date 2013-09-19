package packageOne;

public class TestOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading ol = new Overloading ();
		System.out.println(ol.addNums(2, 3));
		System.out.println(ol.addNums(2, 3, 5));
		System.out.println(ol.addNums(2.6, 3.5));
	}

}
