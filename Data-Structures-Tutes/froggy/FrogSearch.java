package froggy;

import java.util.ArrayList;
/*
 * Implement basic Linked list functionality to perform a search and return the 
 * correct results of a query.
 * any null references for frogs are skipped over
 */
public class FrogSearch
{	
	/* searches list for the all frogs with the same value found
	 * returns results as a **new Linked List**. The new linked list is ordered 
	 * in reverse of when they are found.
	 * e.g. search for value 3
	 * input ("Froggy", 3), ("Toad", 2), ("Slimebiscuit", 3)
	 * output ("Slimebiscuit", 3) ("Froggy", 3) 
	 */
	public static FrogNode search(FrogNode node, int value) {

		FrogNode current = node;
		ArrayList<FrogNode> holder = new ArrayList<FrogNode>();
		
		if(current == null){
			return null;
		}
		
		while(current.next != null){
			if(current.frog.getValue() == value){
				Frog temp1 = new Frog(current.frog);
				FrogNode temp2 = new FrogNode(temp1);
				holder.add(temp2);
			}
		}
		
		if(holder.size() == 0){
			return null;
		}
		
		for(int i = (holder.size() - 1); i >= 0; i--){
			if(i == 0){
				break;
			}
			else{
				holder.get(i).next = holder.get(i - 1); 
			}
		}
		
		return holder.get(holder.size() - 1);
		

	}
	
	/* returns true/false if at least one frog with the value is in list
	 */
	public static boolean foundInList(FrogNode node, int value)
	{

		FrogNode current = node;
		
		while(current != null){
			if(current.frog.getValue() == value){
				return true;
			}
			
			current = current.next;
		}
		
		return false;

	}

	/* returns true/false if the frog object f appears in the list at 
	 * least once (matching id)
	 */
	public static boolean foundInList(FrogNode node, Frog f) 
	{	

		FrogNode current = node;
		
		while(current != null){
			if(current.frog.getID() == f.getID()){
				return true;
			}
			
			current = current.next;
		}
		
		return false;

	}
	
	/* returns true/false if the values of the given frog f match exactly with 
	 * any frog (name and value) which is in the list. 
	 */
	public static boolean foundSimilarInList(FrogNode node, Frog f) 
	{	

		FrogNode current = node;
		
		while(current != null){
			if(current.frog.getValue() == f.getValue() && current.frog.getName().equals(f.getName())){
				return true;
			}
			
			current = current.next;
		}
		
		return false;

	}

}