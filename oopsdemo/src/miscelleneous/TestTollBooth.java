package miscelleneous;

interface TollBooth
{
public void showdata();
public void calculation(truck t);
}
interface truck
{
public int calaxles();
public int calweight();
}

//Now we will make two classes as specified

class toll implements TollBooth
{
toll()
{
  counttruck=0;
  receipts=0;
}

public void calculation(truck t)
{
  int axles=t.calaxles();
  int weight=t.calweight();
  int dueamount=5*axles+((weight/500)*10);
  System.out.println("No. of axles: "+axles+" axles");
  System.out.println("weight of the truck: "+weight+"kg");
  counttruck=counttruck+1;
  receipts=receipts+dueamount;
  System.out.print("Amount due for truck "+counttruck+": ");
  System.out.println(dueamount);
}

public void showdata()
{
  System.out.println("No. of trucks pass the toll: "+counttruck);
  System.out.println("Total Amount of receipts when "+counttruck+" trucks passes the toll: "+receipts);
}
int receipts;
int counttruck;
}
class truck1 extends toll implements truck
{
truck1(int axles, int weight)
{
  this.axles=axles;
  this.weight=weight;  
}

public int calaxles()
{
  return axles;
}

public int calweight()
{
  return weight;
}

int axles;
int weight;
}

public class TestTollBooth {

	public static void main(String[] args) {
		
		toll booth=new toll();
		truck1 Ford=new truck1(5,12500);
		truck1 nissan=new truck1(2,5000);
		truck1 daewoo=new truck1(6,17000);
		
		System.out.println("FORD TRUCK BE:");
		booth.calculation(Ford);
		booth.showdata();
		
		System.out.println("*****");
		System.out.println("NISSAN TRUCK BE:");
		booth.calculation(nissan);
		booth.showdata();
		
		System.out.println("*****");
		System.out.println("DAEWOO TRUCK BE:");
		booth.calculation(daewoo);
		booth.showdata();

	}
	

		
	}


