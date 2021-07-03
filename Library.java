
import java.util.*;
public class Library
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of books available");
		int n=sc.nextInt();
		Books b[]=new Books[n];
		Author a[]=new Author[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter book details");
			System.out.println("enter book's name");
			String c=sc.next();
			sc.nextLine();
			System.out.println("enter price of the book");
			double d=sc.nextDouble();
			System.out.println("enter quantity available");
			int q=sc.nextInt();
			System.out.println("enter author details");
			System.out.println("enter author's name");
			String e=sc.next();
			sc.nextLine();
			System.out.println("enter gender");
			char ch=sc.next().charAt(0);
			System.out.println("enter  email id");
			String f=sc.next();
			sc.nextLine();
			a[i]=new Author(e,f,ch);
			b[i]=new Books(c,a[i],d,q);	
		}
		int store[]=new int[n];
		System.out.println("Enter the no. of Students");
		int n1=sc.nextInt();
		student s[]=new student[n1];
		Date w[][]=new Date[n][10];int l[]=new int[5];
		for(int i=0;i<n1;i++)
		{
			for(int k=0;k<n;k++)
			{
				store[k]=b[k].getQty();
			}
			System.out.println("enter student details");
			System.out.println("enter name");
			String f=sc.next();
			sc.nextLine();
			System.out.println("enter roll no.");
		
			int r=sc.nextInt();
			s[i]=new student(f,r);
			
			System.out.println("enter day month and year of issue");
			int d=sc.nextInt();
			int mon=sc.nextInt();
			int yy=sc.nextInt();
			Books b1[]=s[i].issueBook(b,d,mon,yy);int s1=0;
			
			for(int j=0;j<n;j++)
			{
				int s2=store[j]-b1[j].getQty();
				{
					for(int k=0;k<s2;k++)
					{
						l[s1]=j;
						s1++;
					}
				}	
				b[j]=b1[j];
			}
			System.out.println("enter day month and year of return");
			d=sc.nextInt();
			mon=sc.nextInt();
			yy=sc.nextInt();
			Books b2[]=s[i].depositBook(b,l,d,mon,yy);
			for(int j=0;j<n;j++)
			{
				b[j]=b2[j];
			}
			for(int k=0;k<5;k++)
			{
				l[k]=-1;
			}
		}
		System.out.println("the end");			
	}
}

