package testpro;

public class testpro 
{
	protected int i=0;
	
	public void main()
	{

		System.out.println("hello world");
	}

}

class Test
{
	public static void main(String args[])
	{
		testpro s=new testpro();
		s.i=8;
		System.out.println("i is equal to " + s.i);
	}
}