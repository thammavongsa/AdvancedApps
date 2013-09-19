package packageYield;

public class testYield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yield ol = new Yield ();
	
		
		System.out.println("Year 1 @ 3% " + ol.yieldOne(.03, 1, 1000));
		System.out.println("Year 1 @ 5% " + ol.yieldTwo(.05, 1, 1000)); 
		System.out.println("Year 1 @ 7% " + ol.yieldThree(.07,1, 1000));
		
		System.out.println("Year 2 @ 3% " + ol.yieldOne(.03, 2, 1000));
		System.out.println("Year 2 @ 5% " + ol.yieldTwo(.05, 2, 1000)); 
		System.out.println("Year 2 @ 7% " + ol.yieldThree(.07,2, 1000));
		
		System.out.println("Year 3 @ 3% " + ol.yieldOne(.03, 3, 1000));
		System.out.println("Year 3 @ 5% " + ol.yieldTwo(.05, 3, 1000)); 
		System.out.println("Year 3 @ 7% " + ol.yieldThree(.07,3, 1000));
	}
	}


