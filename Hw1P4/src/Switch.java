import java.util.Scanner;


public class Switch {
	
	public static void main(String[] args) {   
		
        Scanner in = new Scanner(System.in);
        System.out.println("The students name is");
        
        int s = in.nextInt();
        System.out.println(studentName(s));
    }

       public static String studentName (int s ) {

    	                      
    		   String names = null ;
               switch (s) 
               {
                 case 1: names = "Ann";
                 break;
                 case 2: names ="Bane";
                 break;
                 case 3: names = "Charlie";
                 break;
                 case 4: names = "Dug";
                 break;
                 case 5: names = "Ed";
                 break;
                 case 6: names = "Fancy";
                 break;
                 case 7: names = "George";
                 break;
                 case 8: names = "Heinz";
                 break;
                 case 9: names = "Issac";
                 break;
                 case 10:names = "Jane";
                 break;
                 case 11:names = "Kevin";
                 break;
                 case 12:names = "Luke";
               }
               
               return names;    	   
       }

}