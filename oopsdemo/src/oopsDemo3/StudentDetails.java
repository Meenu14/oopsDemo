package oopsDemo3;

// multiple interface implementation

public class StudentDetails implements CollegeData,HostelData {
	
	College c1=new College("Mary",501,"Amity","B.tech");
	Hostel h1=new Hostel("Ram","Hostel 3");
	
	@Override
	public void HostelDetail() {
		System.out.println("*** Hostel Details ***");
		System.out.println("Hostel Name :"+h1.getName());
		System.out.println("Location  :"+h1.getLocation());
		
		
		
	}

	@Override
	public void studentRecord() {
		// TODO Auto-generated method stub
		System.out.println("Students getting selected on financial and percent basis");
		
	}

	@Override
	public void collegeDetail() {
		// TODO Auto-generated method stub
		System.out.println("*** College Details **");
		System.out.println("College Name :"+c1.getName());
		System.out.println("College Id :"+c1.getId());
		System.out.println("Course :"+c1.getCourse());
		System.out.println("University :"+c1.getUniversity());
		
	}

	@Override
	public void studentData() {
		System.out.println("Students can Join Courses: MCA, MTECH,BCA,BTECH");
		
	}

	public static void main(String[] args) {
		
		StudentDetails s1 =new StudentDetails();
		
		s1.collegeDetail();
		s1.studentData();
		s1.HostelDetail();
		s1.studentRecord();
	}


}