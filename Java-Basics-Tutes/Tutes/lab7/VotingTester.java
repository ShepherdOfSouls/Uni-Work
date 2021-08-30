package lab7;

public class VotingTester {

	public static void main(String[] args) 
	{
		Voting v1 = new Voting();
		
		v1.voteLabour();
		v1.voteLabour();
		v1.voteLabour();
		v1.voteLabour();
		v1.voteLabour();
		v1.voteLiberal();
		v1.voteLiberal();
		v1.voteLiberal();
		v1.voteLiberal();
		v1.voteLiberal();
		v1.voteLiberal();
		
		System.out.println("Labour votes= " + v1.getLabour());
		System.out.println("Liberal votes= " + v1.getLiberal());
		
		v1.clear();
		
		System.out.println("Labour votes= " + v1.getLabour());
		System.out.println("Liberal votes= " + v1.getLiberal());

	}

}
