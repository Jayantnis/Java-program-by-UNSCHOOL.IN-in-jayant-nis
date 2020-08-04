import java.util.Scanner;// S is capital
//instructions to input users
class Red//classname is Red by RDX
{
 public static void main(String[]args)
 {	int n,digit,rev=0,p/*plaindromenumber check*/;
	System.out.println("\nhello world\n");
	Scanner obj=new Scanner(System.in);//input calling object so on 
	System.out.printf("\n\t~~please Enter The Numbers:- \n\t");
	n=obj.nextInt();
	p=n;

	while(n>0)
	{
		digit=n%10;
		rev=rev*10+digit;
		n=n/10;
	}
	System.out.println("\nReverse numbers is:- "+rev);
	if(p==rev)
	
		System.out.println("\nplaindrome number\n"+p);
	else 
		System.out.println("!not A plaindrome number"+p);

}
//success mission
}//access updated//yooooooooo