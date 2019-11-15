import java.util.Scanner;

public class letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter character");
		char c=s.next().charAt(0);
		if(c>='A'&& c<='Z')
		{
			System.out.println("upper case");
		}
		else if(c>='a'&& c<='z')
		{
			System.out.println("lower case");
		}
		else if(c>='0'&&c<='9')
		{
			System.out.println("number");
		}
		else
		{
			System.out.println("spcl ch");
		}

	}

}
