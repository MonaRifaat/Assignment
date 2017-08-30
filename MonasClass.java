public class MonasClass {

	public static void main(String[] args) {
		
		if (args.length > 1)
		{
		   try {
			throw new Exception("Program accepts only one argument");
		} catch (Exception e) {
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
	try {	 
	    	int num = 0;
	        num = Integer.parseInt(Argument);
	        System.out.println(num);
		}
catch (NumberFormatException nfe) {
    System.out.println("The extra argument must be an integer.");
    System.exit(1);
}
}

}
