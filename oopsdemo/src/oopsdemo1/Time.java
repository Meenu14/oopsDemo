package oopsdemo1;

/* java program to perfrom addition of 2 time
 t1 --> 12: 45:55
 t2 --> 10:30:30
 t1+t2
 if sec>60.. minute should be increamented & sec -60
 if min>0  hour should be increamented & min -60
 */


public class Time {
	
	int hr,min,sec;
	
	Time()
	{
		hr=min=sec=0;
	}
	Time(int h,int m,int s)
	{
		hr=h;
		min=m;
		sec=s;
		
	}
	
	void add(Time obj)
	
	{
		
		this.hr+= obj .hr;
		this.min+= obj.min;
		this.sec+= obj.sec;
		
		if(sec>60)
		{min=min+1;
		sec=sec-60;
		}
		if(min>60)
		{
			hr=hr+1;
			min=min-60;
		}
	}
		void display()
		{
			System.out.println("h"+this.hr+":m"+this.min+":s"+this.sec);
			
		}
	}
	
	
	


