package Keyword;

public class Student {
	   int stuid;
	   String stuname;
	   int joiningyear;
	   static String department="Electronics and communication";
	   public Student(int stuid,String stuname,int joiningyear) {
		  this.stuid=stuid;
		  this.stuname=stuname;
		  this.joiningyear=joiningyear;
    }
	 public  static void feesStructure() {
		 System.out.println("Fees paid");
	}
	 public void studentDetails() {
		System.out.println("Student id:"+stuid+" Student Name:"+stuname+"Student Joining year:"+joiningyear);
	}
      public static void main(String[] args) {
    	  Student p1=new Student(6201 , "Uma", 2016);
    	  Student p2=new Student(6202 , "Jayapriya", 2016);
    	  Student p3=new Student(6203 , "Sharmi", 2016);
    	  
    	  p1.studentDetails();
    	  p2.studentDetails();
    	  p3.studentDetails();
    	  Student.feesStructure();
		
	}
}
