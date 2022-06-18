package Constructor;



public class ChildDemo extends ParentDemo
{
	String name;
	
	ChildDemo()
	{
		super();
		System.out.println("Child class constructor");
	}
	
	ChildDemo(String name)
	{
		this();
		System.out.println("child parametaried constructor");
		
	}
	public static void main(String[] args) {
		System.out.println("child class main method");
		ChildDemo childDemo = new ChildDemo("Anand");
		//System.out.println(childDemo.name);
		
	}

}
