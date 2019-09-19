package All_Type_Inheritence;

public class ChildClass extends ParentClass
{
	public void child1()
	{
		System.out.println("This is default method of child class");
	}
	
	public void child2(int a)
	{
		System.out.println("This is 1 parameterized method of child class");
	}
	
	public static void main(String[] args) 
	{
		ChildClass aaa= new ChildClass();
		aaa.child1();   //Calling own method
		aaa.child2(10); //Calling own method
		aaa.test1(); // calling parent default method
		aaa.test2(44);  //Calling parent 1 parameter method
		
	}

}
