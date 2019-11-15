
public class c {
	c()
	{
		//System.out.println("constructor");	//default constructor
		
	}
	
	c(int a)
	{
		this.i=a;	//parameterized constructor
		System.out.println(i);
	}
	int i;
	public static void main(String[] args) {
		c obj=new c();
		System.out.println(obj.i);
		c obj1=new c(10);
		System.out.println(obj1.i);
		c obj2=new c(1000);
		System.out.println(obj2.i);
	}

}
