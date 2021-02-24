package nameid;									//packages 
import java.io.*;
import java.lang.*;
import java.util.*;
class incrctid extends Exception						//userdefined exception
{
	public incrctid(String str)
	{
		System.out.println(str);
	}
}
public class hapckg1
{
	int id;
	String details[]=new String[10];
	public hapckg(int i)
	{
		this.id=i;
	}
	public String[] getname()
	{
		switch(id)												//switch-case
	{
		case 1:	
			details[0]="Raju";
			details[1]="10";
			details[2]="Male";
			details[3]="9290296396";
			break;
		case 2:	
			details[0]="Rani";
			details[1]="20";
			details[2]="Female";
			details[3]="9290296896";
			break;
		case 3:	
			details[0]="Rama";
			details[1]="30";
			details[2]="Male";
			details[3]="8290896396";
			break;
		case 4:	
			details[0]="Ravi";
			details[1]="40";
			details[2]="Male";
			details[3]="9290255396";
			break;
		case 5:	
			details[0]="Rachana";
			details[1]="50";
			details[2]="Female";
			details[3]="9290296789";
			break;
		case 6:	
			details[0]="Siri";
			details[1]="60";
			details[2]="Female";
			details[3]="9298996378";
			break;
		case 7:	
			details[0]="Latha";
			details[1]="70";
			details[2]="Female";
			details[3]="9290212346";
			break;
		case 8:	
			details[0]="Haritha";
			details[1]="80";
			details[2]="Female";
			details[3]="9290291236";
			break;
		case 9:	
			details[0]="Ramani";
			details[1]="90";
			details[2]="Female";
			details[3]="9290296456";
			break;
		case 10:
			details[0]="Nandini";
			details[1]="100";
			details[2]="Female";
			details[3]="9290292346";
			break;
		default:
			try
			{
				throw new incrctid("invalid");										//exception handling-try-catch,throw
			}
			catch(incrctid e)
			{
				System.out.println(e);
				System.exit(0);
			}
	
		}
		return details;
	}
}


