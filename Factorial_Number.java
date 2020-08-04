import java.util.Scanner;
class Fact
{
	public static void main(String []args)
	{ int n,i,/*factorial no.*/f=1;
			System.out.printf("\n~~~~Factorial number program~~~~\n");
		System.out.println("\nEnter Number to change in FACTORIAL :-  \n");
		Scanner obj=new Scanner(System.in);//mistake
		n=obj.nextInt();
		for(i=1;i<=n;i++)
		{
		 f=f*i;
		}
		System.out.println("FACTORIAL number is:- "+f);
	}
	
	
}