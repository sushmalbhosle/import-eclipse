import java.util.Scanner;

public class Case {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter letter");
		char ch=s.next().charAt(0);
		
		switch(ch)
		{
		case 'a':System.out.println("vowel");
		break;
		case 'e':System.out.println("vowel");
		break;
		case 'i':System.out.println("vowel");
		break;
		case 'o':System.out.println("vowel");
		break;
		case 'u':System.out.println("vowel");
		break;
		default:System.out.println("consonant");
		
		}
		
		
	}

}
