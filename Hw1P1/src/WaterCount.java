
public class WaterCount {
	
	public void waterSong()
	{
		
		int waterNumber = 99;
		String word = "bottles";
		
		while (waterNumber > 0) 
		{
			
			if (waterNumber == 1) {
				word= "bottle" ; // singular, as in ONE bottle.
			}
			System.out.println(waterNumber + " " + word + " of beer on the wall.");
			System.out.println(waterNumber + " " + word + " of beer.");
			System.out.println("Take one down");
			System.out.println("Pass it around.");
			waterNumber = waterNumber - 1;
			
			if (waterNumber == 0)
			{
				System.out.println("No more bottle of beer on the wall");
			}
		}
	}
}
