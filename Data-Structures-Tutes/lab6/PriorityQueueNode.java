package lab6;

class PriorityQueueNode implements Comparable<PriorityQueueNode>{
	public Integer key;
	public Object value;
	
	public PriorityQueueNode(int key, Object value){
		this.key = key;
		this.value = value;
	}
	
	public int compareTo(PriorityQueueNode arg0){
		return this.key.compareTo(arg0.key);
	}

}
