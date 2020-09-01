import java.util.Scanner;
//facatorial program
class f
{
	public static void main(String []args)
	{
		int n,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter facatorial number  ! :-");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
	System.out.println("\nFacatorial number :- "+ n +"! is :- " +fact);
	
	}
}