package Multi_Level_Inheritence;

public class C3 extends C2
{
	public void Child()
	{
		System.out.println("This is method of child class");
	}
	
	public static void main(String[] args) 
	{
		C3 aaa = new C3();
		aaa.Child();
		aaa.father();
		aaa.Gfather();
		
		
	}

}
