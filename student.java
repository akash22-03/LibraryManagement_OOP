import java.util.Scanner;

class student
{
	String name;
	int roll;
	Date issueDate;
	Date returnDate;
	Books boo;
	student(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
	}
	student(String name,int roll,Date issueDate,Date returnDate)
	{
		this.name=name;
		this.roll=roll;
		this.issueDate=issueDate;
		this.returnDate=returnDate;
	}
	public String getName()
	{
		return name;
	}
	public int getroll()
	{
		return roll;
	}
	public Date getdate()
	{
		return issueDate;
	}
	public Date getdate1()
	{
		return returnDate;
	}
	public Books[] issueBook(Books  bo[],int d,int mon,int yy)
	{
		int j=0;
		for(int i=0;i<bo.length;i++)
		{ 
			System.out.println("serial no-"+(i+1)+" "+bo[i].toString());
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the serial number of the book you want to issue");
			System.out.println("Enter 0 to Exit");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			if(n==0)
			{
				return bo;
			}
			else
			{
				int a=bo[n-1].getQty();
				if(0<a)
				{
					bo[n-1].setQty(a-1);
					issueDate=new Date(d,mon,yy);
					j=j+2;
				}
				else
				{
					System.out.println("book unavailable");--i;
				}
			}
		}
		return bo;
	}
	public Books[] depositBook(Books b[],int a[],int d,int mon,int yy)
	{
		System.out.println("books issued by you are");int fine=0;
		for(int i=0;i<5;i++)
		{
			if(a[i]>=0)
			{
				System.out.print("serial no.-"+(a[i]+1)+" ");
				System.out.println(	b[a[i]].toString());
			}
		}
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("select the serial no of book you want to return or type 0");
			int n=sc.nextInt();
			if(n!=0)
			{
				b[n-1].setQty(b[n-1].getQty()+1);
				returnDate=new Date(d,mon,yy);
				fine=fine+Math.abs(issueDate.getDD()-returnDate.getDD())+Math.abs(issueDate.getMM()-returnDate.getMM())*30+Math.abs(issueDate.getYYYY()-returnDate.getYYYY())*365;
			}
			else 
			{
				System.out.println("fine=Rs"+fine);
				return b;
			}
		}
	}
	public String toString()
	{
		return("name="+getName()+"rollno"+getroll()) ;	
	}
}
