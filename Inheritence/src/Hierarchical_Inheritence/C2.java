package Hierarchical_Inheritence;

public class C2 extends C1
{
	public void child1()
	{
		System.out.println("This is Child1 method");
	}
	
	public static void main(String[] args) 
	{
		C2 sa= new C2();
		sa.child1();
		sa.method1();
		
	}

}
