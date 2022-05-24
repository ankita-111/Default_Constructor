import java.util.Scanner;

public class Customer 
{
	int Cid;
	String Cname;
	long Cnum;
	String Cloc;
	
	public Customer() {
		super();
		
	}
	
	void acceptInput()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Customer Id :");
		Cid= s.nextInt();
		System.out.println("Enter Customer Name: ");
		Cname=s.next();
		//s.next();
		System.out.println("Enter Customer Contact Number: ");
		Cnum= s.nextLong();
		System.out.println("Enter Customer Location");
		Cloc=s.next();
	}
	void display() 
	{
		System.out.println("Customer Id ==>"+ Cid );
		System.out.println("Customer Name ==>"+ Cname);
		System.out.println("Customer Contact Number ==> "+Cnum);
		System.out.println("Customer Location ==> "+Cloc);
	}
	
	

}
