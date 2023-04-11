public class Date212 {
	private int year;
	private int month;
	private int day;
	
	
	public Date212(String a) {
		int y=Integer.parseInt(a.substring(0,4));
		int m=Integer.parseInt(a.substring(4,6));
		int d=Integer.parseInt(a.substring(6,8));
		
		year=y;
		month=m;
		day=d;
		
	}
	
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	
	public void setYear(int y) {
		year=y;
	}
	public void setMonth(int m) {
		month=m;
	}
	public void setDay(int d) {
		day=d;
	}
	
	public static String monthName(int month) {
		String[] monthName= {"", "January","February", "March","April",
							"May","June","July","August","September",
							"October","November","December"};
		
		return monthName[month];
	}
	
	public static String Zellercongruence(int day, int month,
            int year)
{
if (month == 1)
{
month = 13;
year--;
}
if (month == 2)
{
month = 14;
year--;
}
int q = day;
int m = month;
int k = year % 100;
int j = year / 100;
int h = q + 13*(m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
h = h % 7;
String d = Integer.toString(h);
switch (d)
{
case ("0") : d = "Saturday, "; break;
case ("1") : d = "Sunday, "; break;
case ("2") : d = "Monday, "; break;
case ("3") : d = "Tuesday, "; break;
case ("4") : d = "Wednesday, "; break;
case ("5"): d = "Thursday, "; break;
case ("6") : d = "Friday, "; break;
}
return d;
}
	
	public String toString() {
		return Zellercongruence(day, month, year) + monthName(month)+" "+day+", "+year;
			
}
	
	public int compareTo(Date212 other) {
		if(this.year<other.year) {
			return -1;
		}
		if(this.year>other.year) {
			return 1;
		}
		if(this.year==other.year&&this.month<other.month) {
			return -1;
		}
		
		if(this.year==other.year&&this.month>other.month) {
			return 1;
		}
		
		if(this.year==other.year&&this.month==other.month&&this.day<other.day) {
			return -1;
		}
		
		if(this.year==other.year&&this.month==other.month&&this.day>other.day) {
			return 1;
		}
		if(this.year==other.year&&this.month==other.month&&this.day==other.day) {
			return 0;
		}
		return 1;
		
	}
	
}
