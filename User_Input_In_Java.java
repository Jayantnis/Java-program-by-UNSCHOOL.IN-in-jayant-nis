//importing the package 
import java.util.Scanner;//input approval

class java
{	public static void main(String []args)
	{//Create the instance  of class scanners
	  Scanner obj=new Scanner(System.in);//scanner is always capital on fine
	  System.out.println("~~~`Student informations~~~");
	  
	  String Name;
	  int Rollno;
	  float Marks;
	  
	System.out.printf("\n\nUser_Input_In_Java\n\n");
		
	System.out.println("\nEnter Your name :- ");
		Name=obj.nextLine();//nextLine "L is Line capital":-read in string value in from user 
		System.out.println("\nEnter your Rollno :- ");
		Rollno=obj.nextInt();
		System.out.println("\nEnter YOur Marks :- ");
		Marks=obj.nextFloat();
	System.out.println("\n Name  :- "+Name);
	System.out.println(" Rollno:- "+Rollno);
	System.out.println(" Marks :- "+Marks);
	}
	
}

