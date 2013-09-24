public class MegaLotto 
{
	public static void main( String[] args){ 
		System.out.println("The Mega Numbers are : ");
		
		MegaNumber mn = new MegaNumber();
		mn.generateMegaNumbers();     
		
		System.out.println("The Mega Ball is : ");
		
		MegaBall mb = new MegaBall();  
		mb.generateBallNumber();       
	}

}




