                //import to access Scanner class

class Amount1
{
    public static void main(String args[])
    {
        float a,prin,r, y, prod=1,p, principle;
        System.out.println("Enter principle amount");
        //Scanner object created
                         //Scanner function for taking Integer input from user
        for(r=3; r<=10; r++)
        {
            prod=1;
            y=(1+r/100);                          

            for(int t=1; t<=10; t++)
            {
                prod=prod*y;                   
            }
        a=p*prod;
        System.out.println("Amount for rate "+r+"% is "+a);
        }
    }
}