import java.io.*;
import java.lang.*;
import java.util.*;
import nameid.hapckg;                             //package
import java.util.concurrent.ThreadLocalRandom;    //thread
interface A                                       //interface   
{
	int payment(int a,int b);
	int payment(int a);
}
class S implements A                             //interface                          
{
	int t;
	S()
	{
		t=0;					
	}
	public int payment(int a)	//overloading,overriding,polymorphism

	{
		t=t+a;
		return t;
	}
	public int payment(int a,int b)      //overloading, overriding,polymorphism   
	{
		t=t+a*b;
		return t;	
	}
}
class SI extends S implements A             //interface,inheritance    
{
	public int payment(int a)           //overloading,overriding,polymorphism
	{	
		return 0;
	}
	public int payment(int a,int b)	    //overloading,overriding,polymorphism		
	{
		return 0;
	}
}

public class ha1	                     //class
{									
	public static void main(String[] args)  throws IOException,FileNotFoundException   //exception handling     
	{
		int idy,ay,stay;
		int id;
		String nameofpatient;
		String[] nofpatient=new String[10];
		System.out.println("Welcome to ABC Hospital");
		Scanner sc=new Scanner(System.in);
		System.out.println("Is he having record in this hospital if yes enter 1 else enter 0");
		idy=sc.nextInt();
		if(idy==1)
		{
			System.out.print("if yes enter patient number:");
			id=sc.nextInt();
			hapckg pkg=new hapckg(id);
			nofpatient=pkg.getname();
			System.out.print("Details(name,age,gender,phonenumber) of patient:");
	 		nameofpatient=nofpatient[0];
			for(int i=0;i<=3;i++)
			{
		
				System.out.println(nofpatient[i]);
			}

		}
		else if(idy==0)
		{
			id=ThreadLocalRandom.current().nextInt();        //randomvariable generation through threadconcept
			System.out.println("Patient id is:"+id);
			System.out.print("Please enter name of patient:");
			String nam=sc.next();                                      
			System.out.println("Please enter age of patient:");
			int ag=sc.nextInt();
			System.out.println("Please enter gender of patient:");
			String gen=sc.next();
			System.out.println("Please enter phone no. of patient:");
			String phn=sc.next();
			System.out.println("Details of patient:");
			System.out.println("\t id = "+id);
			System.out.println("\t name = "+nam);			
			System.out.println("\t age = "+ag);			
			System.out.println("\t gender = "+gen);			
			System.out.println("\t phone number = "+phn);	
		}

		System.out.println("Please enter 1 for general checkup");
		System.out.println("Please enter 2 for admiting into hospital");
		ay=sc.nextInt();
		S s;	                                                  //dynamic method dispatch									
									//dynamic method dispatch									
		int gfees=300;
		int hfees=500;
		int ans=0;
		System.out.println("If you have Arogya sri enter 1 ,else 0");
		int sp=sc.nextInt();
		if(ay==1)
		{
			System.out.println("Fee for general checkup  is"+gfees+"rs");	
			if(sp==1)
			{	s=new SI();
				 ans=s.payment(gfees);
				System.out.println("Total fee = "+ans);
				System.out.println("You have Aarogya sri card so no need to pay money...");
			}
			else if(sp==0)
			{
				s=new S();
		 		ans=s.payment(gfees);
				System.out.println("Total fee = "+ans);
			}
		}
		else if(ay==2)
		{
			System.out.println("Fee for admitting for one day is "+hfees+" rs!!");
			if(sp==1)
			{
				s=new SI();
				 ans=s.payment(hfees);
				System.out.println("Total fee = "+ans);
				System.out.println("You have Aarogya sri card so no need to pay money...");
	
			}
			else if(sp==0)
			{
				s=new S();	
				System.out.print("Please enter no.of days of stay: ");
				stay=sc.nextInt();
				ans=s. payment(hfees,stay);
				System.out.println("Total fee = "+ans);
			}
		}

		FileWriter o=new FileWriter("haoutput.txt");				//filesconcept						
		o.write("Total fees is: ");
		o.write( String.valueOf(ans));	
		o.close();
		System.out.println("Receipt is prepared successfuly!!!");

	}
}



