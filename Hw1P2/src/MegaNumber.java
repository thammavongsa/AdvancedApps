
public class MegaNumber {
	public void generateMegaNumbers(){	
			final int t = 5;
			final int n = 50;
			
			int mn[] = new int[t];
			int l = 1;
			
			while( l <= 1)
			{
			for (int count = 0; count < mn.length; count++){
				int number;
			do{
					mn[count] = (int) (n * Math.random() + 1);
					number = 0;
					while(mn[count]!=mn[number])
					{		
						number++;
				    }
				}while(count != number);
				System.out.println(mn[number]);
			   }
			     ++l;
			     
		    }
			
		}
}




