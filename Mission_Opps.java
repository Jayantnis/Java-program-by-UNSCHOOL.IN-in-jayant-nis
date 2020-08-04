import java.util.Scanner;
//switch
class joo
{
	public static void main(String [] args)
	{	int n,no,a,i,/*factorial no.*/f=1,c,root=0;//analysis code
		System.out.println("\n~~~\tEnter user coditions :- ~~~\t\n");
		
		System.out.println("\n!1.Even and odd number :- \n");
		System.out.println("\n 2.Factorial number    :- \n");
		System.out.println("\n 3.Prime number        :- \n");
		System.out.println("\n 4.Exit 				 :- \n");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		
		switch(n)//switch case apply
		{
			case 1:
				
				System.out.println("\n~~~Enter any number\n\n To check at 1.Even  and Odd~~\n");
				a=obj.nextInt();//new input rewrite a input on user's
				if(a%2==0)
				{
					System.out.println("Even number is "+a);
				}else 
					System.out.println("Odd number is :- "+a);
				break;
				
			case 2:
				System.out.printf("\n\n2.FACTORIAL NUMBER :- \n\n");
				System.out.printf("\nEnter Number to change in FACTORIAL :-  \n");
				no=obj.nextInt();//new input rewrite a input on user's
		//{( .........)}
				for(i=1;i<=no;i++)
				{
				f=f*i;//FACT. LOGIC
				}
				System.out.printf("FACTORIAL number is:- "+f);
				break;//mistake as correct code
			case 3:
				System.out.println("\n3.PRIME NUMBERS:- \n ");
				System.out.println("USER INPUT NUMBER ANY :- \n");
				c=obj.nextInt();
				
				for(i=2;i<=c/2;i++)
				{//condition non -prine nober.
					if(c%i==0)
					{
						root=1;
						break;
					}
				}
				if(c==1)
				{
					System.out.println("1 is neither prime nor composite");
				}
				else{
					if(root==0)
						System.out.println(" Prime number:= "+c);
					else
					System.out.println("~! not prime no "+c);
				}
			break/*finaly finish prime no.*/;
			
			case 4:
				System.out.println("\n\tEXIT\t\n");
			
			break;
			
			default:
			System.out.println("not! condition match please see on carefully number Enter ");
		}//switch
	}///end main
	
}//endclass