
public interface i1 {
	static int i=10;
	static void staticmethod()
	{
		System.out.println("static concrete method");
		
	}
	void test();// adbstract method
}
abstract class p1 implements i1
{

	//public static p2 obj2;
	
}

class p2 extends p1
{
	public void test()
	{
		System.out.println("test.....p2");
		
	}
}
class driver
{
	public static void main(String[]args)
	{
		//i1.i=20;
		p2 obj=new p2();
		obj.test();
		i1.staticmethod();
		p1 obj2=obj;
		obj2.test();
		
		i1.staticmethod();
		i1 obj1=obj;
		obj1.test();
		i1.staticmethod();
		
		
			
	}
}