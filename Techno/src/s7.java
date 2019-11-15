
public class s7 {
	public static void main(String[]args)
	{
		int count=0;
		String str = "abcdef Ghi lmoadsdf as vdfsds ";
		String []a=str.split(" ");
		System.out.println(a);
		for(int i=0;i<a.length;i++)
		{
			if(a[i].length()>4)
			{
				count++;
				System.out.println(a[i]);
			}
		}
		System.out.println("no of words" +count);
	}

}
