package anudipjava;

public class VotingAge {
	int age,vage;
	
	void Check_Voting_age(int age,int vage) {
		if(age>=vage) {
			System.out.println("Eligible for vote");
		}else {
			System.out.println("not eligible for vote");
		}
	}
	

	public static void main(String[] args) {
		VotingAge V=new VotingAge();
		V.Check_Voting_age(25, 18);

	}

}
