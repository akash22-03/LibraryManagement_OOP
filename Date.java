
public class Date
{
	int dd, mm, yyyy;
	Date(int dd, int mm, int yyyy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yyyy=yyyy;
	}
	Date()
	{
		dd=0;
		mm=0;
		yyyy=0;
	}
	public int getDD()
	{
		return dd;
	}
	public int getMM()
	{
		return mm;
	}
	public int getYYYY()
	{
		return yyyy;
	}
	public String display()
	{
		return "[DD="+dd+",MM="+mm+",YYYY="+yyyy+"]";
	}
}