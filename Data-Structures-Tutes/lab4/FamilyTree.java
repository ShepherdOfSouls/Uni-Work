package lab4;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
	private Tree tree;
	
	public FamilyTree(Tree t){
		this.tree = t;
	}
	
	public String getParent(Node person){
		if(person.getParent() == null){
			return "No Parent";
		}
		else{
			String name = (String) person.getParent().getElement();
			return name;
		}
	}
	
	public String getGrandparent(Node person){
		Node grand = person.getParent().getParent();
		if(grand == null){
			return "No Grandparent";
		}
		else{
			String name = (String) grand.getElement();
			return name;
		}
	}
	
	public List<String> getChildren(Node person){
		if(person.getChildren() == null){
			List<String> empty = new ArrayList<String>();
			return empty;
		}
		else{
			List<String> children = new ArrayList<String>();
			
			for(Node n: person.getChildren()){
				children.add((String) n.getElement());
			}
			
			return children;
		}
		
	}
	
	public List<String> getGrandchildren(Node person){
		if(person.getChildren() == null){
			List<String> empty = new ArrayList<String>();
			return empty;
		}
		else{
			List<String> grandChildren = new ArrayList<String>();
			
			for(Node n: person.getChildren()){
				grandChildren.addAll(getChildren(n));
			}
			
			return grandChildren;
		}
	}

}
