import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter vehicle");
		char vehicle =s.next().charAt(0);
		char c= 'c';
		System.out.println("enter speed");
		int speed=s.nextInt();
		if(vehicle==c)
		{
			if(speed<40)
			{
				System.out.println("slow driving");
			}
			else if(speed>120)
			{
				System.out.println("fast driving");
			}
			else
			{
				System.out.println("good");
			}
			
			
		}
		

	}

}
