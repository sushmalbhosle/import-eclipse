class emp {
	int eid=10;
	emp()
	{
		
	}
	emp(int id)
	{
		this.eid=eid;
	}
	public String toString()
	{
		return "eid:" + this.eid;
	}

}
public class driver1 {


	public static void main(String[] args) {
	{
		emp obj=new emp(2345);
		System.out.println(obj);
	}
}

}
