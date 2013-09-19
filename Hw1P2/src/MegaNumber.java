
public class MegaNumber {


		public int generateMegaNumbers(int a,int b) 
		{
			int[] numbers = new int[4]; 
			int i = 0;
			while( i < 5)
			{
				int generateMegaNumbers = 0;
				generateMegaNumbers= 1 + (int)(Math.random()*50);
				numbers[i] = (generateMegaNumbers);
				i++;
			}
			return (i);
		}
}


