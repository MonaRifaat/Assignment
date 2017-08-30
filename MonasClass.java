public class MonasClass {

	public static void main(String[] args) {
	
	  if(args.length != 0)
	  {
		  MonasClass obj = new MonasClass();
	      obj.PrintFirstAgrument(args[0]);
	  }
		     

	}
	
public void PrintFirstAgrument(String Argument)
{
    System.out.println(Argument);
}

}
