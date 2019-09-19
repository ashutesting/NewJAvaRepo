package Hierarchical_Inheritence;

public class C3 extends C1
{
	public void child2()
	{
		System.out.println("This is Child2 method");
	}
	
	public static void main(String[] args) 
	{
		C3 ref = new C3();
		ref.child2();
		ref.method1();
	}

}
