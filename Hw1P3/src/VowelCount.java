
public class VowelCount {
	public static void main(String[] args){
		String input;
		int vowelCount = 0;
		input = "Apple has yet too confirm rumors.";
		char[] characters2 = new char[input.length()];
		input = input.toLowerCase();
		char[] characters = input.toCharArray();

		
		for (int i = 0; i< characters.length; ++i)
		{
			if (isVowel(characters[i]))
			{
				vowelCount++;
			}
			else
			{
				characters2[i] = characters[i];
			}
		}
		for(int i=0;i<characters2.length;++i) {
			//if(characters2[i] null)
	        System.out.print(characters2[i]);// You mean this way? or... ? hm	
		}
		System.out.print("\n");

        System.out.println(input);
		System.out.println("Total number of vowels is: " + vowelCount);
        
	}

	private static boolean isVowel(char charAt) {
		// TODO Auto-generated method stub		
		if (charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u')
			return true;
		else 
			return false;
	}


}