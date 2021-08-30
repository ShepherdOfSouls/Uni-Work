package lab2;

class SubjectScore {
	public SubjectScore(String subject, int score){
		this.subject = subject;
		this.score = score;
	}

	public String subject;
	public int score;
   }

public class StatisticsCalculator extends MyLinkedList{

	public StatisticsCalculator(){
		super();
	}

	public void addScore(int score){
		this.add(score);
	}

	public double getAverage(){
		if(head == null){
			return 0;
		}
		
		Node current = head;
		double sum = 0;
		int number = 0;
		while(current.getNext() != null){
			sum = sum + (double) current.getElement();
			number++;
			current = current.getNext();
		}
		
		return sum/number;
		
		
	}

	public String getGrade(){
		double mark = this.getAverage();
		
		if(mark <50){
			return "fail";
		}
		else if(mark < 65){
			return "pass";
		}
		else if(mark < 75){
			return "credit";
		}
		else if(mark < 85){
			return "distinction";
		}
		else{
			return "high distinction";
		}
	}
	
	public void addScore(int score, String subject){
		SubjectScore o = new SubjectScore(subject, score);
		this.add(o);
	}

    public String getBestSubject();

    public String getWorstSubject();
}
