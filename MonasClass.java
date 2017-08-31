public class MonasClass {

public static void main(String[] args) 
{
		
	if (args.length > 1)
	{
	   try 
	   {
		throw new Exception("Program accepts only one argument");
	   } 
	   catch (Exception e) 
	   {
		System.out.println("Program accepts only one int extra argument");
		System.exit(1);
	   }
	
	}
	else if(args.length != 0)
	{
		MonasClass obj = new MonasClass();
		obj.PrintFirstAgrument(args[0]);
	}		


}

public void PrintFirstAgrument(String Argument)
{
	try
	{	 
	    	int num = 0;
	        num = Integer.parseInt(Argument);
	        
	        if(num > 1)
	        {
		        for(int i=1; i<= num; i++)
		        {
		        	if ((i% 3 == 0) && (i%5 == 0))
						System.out.println("FizzBuzz");
	        		else if (i% 3 == 0)
		        		System.out.println("Fizz");
		        	else if (i%5 == 0)
		        		System.out.println("Buzz");
		        	else
		        		System.out.println(i);
		        }
	        }
		
	        else
			for(int i=num; i<= 1; i++)
		        {
					if ((i% 3 == 0) && (i%5 == 0))
						System.out.println("FizzBuzz");
	        		else if (i% 3 == 0)
		        		System.out.println("Fizz");
		        	else if (i%5 == 0)
		        		System.out.println("Buzz");
		        	else
		        		System.out.println(i);
		        }     	
	}
	
    catch (NumberFormatException nfe) 
    {
    	System.out.println("The extra argument must be an integer.");
    	System.exit(1);
    }
}

}