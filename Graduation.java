package anudipjava;

public class Graduation {
	
	String courseName;
	int No_of_Years;
	int courseFee;
	
	public Graduation(String courseName, int no_of_Years) {
		super();
		this.courseName = courseName;
		this.No_of_Years = no_of_Years;
	}
	
	void courseDetails() {
		System.out.println("Course Details:\n ->course name="+courseName+",no_of years:"+No_of_Years+",Course fee:"+courseFee);
	}
	public static void main(String[] args) {
		
	}
	

}

class EngineeringDegree extends Graduation {
	
	String branchName;
	int no_ofSubjects;
	int courseFee;
	int courseCode;
	
	

	
	public EngineeringDegree(String courseName, int No_of_Years, String branchName, int no_ofSubjects) {
		super(courseName, No_of_Years);
		this.branchName = branchName;
		this.no_ofSubjects = no_ofSubjects;
	}
	
	void courseDetails(int fee) {
		courseFee=fee;
		super.courseFee=fee;
		System.out.println("Engineering Degree details:\n ->branch name:"+branchName+",No_ofSubjects:"+no_ofSubjects+",Course fee:"+courseFee);
		super.courseDetails();
	}




	public static void main(String[] args) {
		EngineeringDegree btech=new EngineeringDegree("Btech",4,"CSE",8);
		btech.courseDetails(50000);

	}

}

