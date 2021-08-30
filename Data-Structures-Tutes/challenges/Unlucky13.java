package challenges;

public class Unlucky13 {/* 
	Given a linked list you are to delete nodes if it has value 13 or is the 13th node in the list. 

	Specifically perform deletion in the following order
	 1) delete all nodes that have value 13 
	 2) if there are more than 13 elements, delete the 13th node (just once)

	There can be multiple values of 13 in the linked list. Remove them all!
	*/

	public class Rm13
	{
		public static LinkedList cleanse(LinkedList l) {

			Node current = l.getHead();
			
			if(current.value == 13){
					Node temp = current;
					current = current.next;
					temp.next = null;
					l.head = current;
					
				}
			while(current != null){
				if(current.next.value == 13){
					Node temp = current.next;
					current.next = current.next.next;
					temp.next = null;
					
				}
				current = current.next;
				
			}
			
			if(l.size() >= 13){
				Node current2 = l.head;
				
				for(int i = 1; i < 11; i++){
					current2 = current2.next;
				}
				
				Node temp = current2.next;
				current2.next = current2.next.next;
				temp.next = null;
				
			}
			
			return l;
			
		}
	}

}



