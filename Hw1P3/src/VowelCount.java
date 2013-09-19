
public class VowelCount {
	public static void main(String[] args){
		String input;
		char ch;
		char letA = 'A', letE = 'E', letI = 'I', letO = 'O', letU= 'U';
		input = "Apple has yet too confirm rumors.";
		int length = input.length();
		System.out.println(input);
		char[] characters = input.toCharArray();
		
		int n = 0;
		
		for (int i = 0; i <characters.length; i++)
		{
			ch = input.charAt(i);
			
			if (    (ch == 'A')   ||  (ch == 'a')
				||  (ch == 'E')   ||  (ch == 'e')
				||  (ch == 'I')   ||  (ch == 'i')
				||  (ch == 'O')   ||  (ch == 'o')
				||  (ch == 'U')   ||  (ch == 'u')  )
				n++;
		}
		for	( int i = 0; i < characters.length; i++ )
		{
			if(input.charAt(i) == letA ) {
			} else if(input.charAt(i) == letE) {
			} else if(input.charAt(i) == letI) {
			} else if(input.charAt(i) == letO) {
			} else if(input.charAt(i) == letU) {
			}
				
		}
		
		int letters = 0;
		for (int i = 0; i <characters.length; i++)
		{
			if(Character.isLetter(characters[i]))
				letters++;
		}

		System.out.printf("The total number of vowels in the sentence:%7d\n",n);
		System.out.printf("The total number of letters in the sentence:%6d\n",letters);
        System.out.printf("The total number of characters in the sentence:%3d\n",length);
        System.out.println("Without Vowels = ppl hs yt t confrm rmrs");// You mean this way? or... ? hm
        
	}


}