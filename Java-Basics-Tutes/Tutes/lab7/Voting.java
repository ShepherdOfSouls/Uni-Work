package lab7;

public class Voting 
{
	private int labourVotes;
	private int liberalVotes;
	
	public void voteLiberal()
	{
		liberalVotes++;
	}
	
	public void voteLabour()
	{
		labourVotes++;
	}
	
	public void clear()
	{
		labourVotes = 0;
		liberalVotes = 0;
	}
	
	public int getLabour()
	{
		return labourVotes;
	}
	
	public int getLiberal()
	{
		return liberalVotes;
	}
	
	public Voting()
	{
		liberalVotes = 0;
		labourVotes = 0;
	}

}
