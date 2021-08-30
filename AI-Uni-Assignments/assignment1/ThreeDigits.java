import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class ThreeDigits {
	static ArrayList<Node> expanded = new ArrayList<Node>( );
	static ArrayList<Integer> goalPath = new ArrayList<Integer>( );
	static ArrayList<Integer> forbidden = new ArrayList<Integer>( );
	static ArrayList<Node> fringe = new ArrayList<Node>( );
	static int start;
	static int goal;
	static boolean goalFound = false;
	static ArrayList<Node> expandedTemp = new ArrayList<Node>();
	
	public static void main(String args[]){
		String method = args[0];
		Scanner scan = null;
		try {
			scan = new Scanner(new File(args[1]));
			start = scan.nextInt();
			goal = scan.nextInt();
			if (scan.hasNextLine()){
				while (scan.hasNextInt()){
					forbidden.add(scan.nextInt());
				}
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		if (start == goal){
			goalFound = true;
			expanded.add(new Node(start, 0, 0));
			goalPath.add(expanded.get(0).value);
		}
		else if (method.equals("B")){
			BFS();
		}
		else if (method.equals("D")){
			DFS();
		}
		else if (method.equals("I")){
			IDS();
		}
		else if (method.equals("G")){
			greedy();
		}
		else if (method.equals("A")){
			aStar();
		}
		else if (method.equals("H")){
			hill();
		}
		
		if (goalFound == false){
			System.out.println("No solution found.");
		}
		else{
			if(goalPath.get(0)/100 == 0){
				if(goalPath.get(0)/10 == 0){
					System.out.print("00" + goalPath.get(0));
				}
				else{
					System.out.print("0" + goalPath.get(0));
				}
			}
			else{
				System.out.print(goalPath.get(0));
			}
			for (int i = 1; i < goalPath.size(); i++){
				if(goalPath.get(i)/100 == 0){
					if(goalPath.get(i)/10 == 0){
						System.out.print(", 00" + goalPath.get(i));
					}
					else{
						System.out.print(", 0" + goalPath.get(i));
					}
				}
				else{
					System.out.print(", " + goalPath.get(i));
				}
			}
			System.out.println();
		}
		if(expanded.get(0).value/100 == 0){
			if(expanded.get(0).value/10 == 0){
				System.out.print("00" + expanded.get(0).value);
			}
			else{
				System.out.print("0" + expanded.get(0).value);
			}
		}
		else{
			System.out.print(expanded.get(0).value);
		}
		for (int i = 1; i < expanded.size(); i++){
			if(expanded.get(i).value/100 == 0){
				if(expanded.get(i).value/10 == 0){
					System.out.print(", 00" + expanded.get(i).value);
				}
				else{
					System.out.print(", 0" + expanded.get(i).value);
				}
			}
			else{
				System.out.print(", " + expanded.get(i).value);
			}
		}
	}

	static void BFS(){
		Node startNode = new Node(start, 0, 0);
		ArrayList<Node> fringeAdd = startNode.expand(false);
		for(int i = 0; i < fringeAdd.size(); i++){
			if (forbidden.contains(fringeAdd.get(i).value)){
				continue;
			}
			fringe.add(fringeAdd.get(i));
		}
		while (goalFound == false && expanded.size() != 1000){
			fringeAdd = fringe.get(0).expand(false);
			for(int i = 0; i < fringeAdd.size(); i++){
				boolean alreadyExpanded = false;
				for (int j = 0; j < expanded.size(); j++){
					if (expanded.get(j).isEqual(fringeAdd.get(i))){
						alreadyExpanded = true;
						break;
					}
				}
				
				if (forbidden.contains(fringeAdd.get(i).value) || alreadyExpanded == true){
					continue;
				}
				fringe.add(fringeAdd.get(i));
			}
			if(expanded.get(expanded.size() - 1).value == goal){
				Node temp = expanded.get(expanded.size() - 1);
				goalFound = true;
				goalPath.add(temp.value);
				do{
					temp = temp.parent;
					goalPath.add(0, temp.value);
				}while (temp.parent != null);
			}
		}
		
	}
	
	static void DFS(){
		Node startNode = new Node(start, 0, 0);
		ArrayList<Node> fringeAdd = startNode.expand(false);
		for(int i = 0; i < fringeAdd.size(); i++){
			if (forbidden.contains(fringeAdd.get(i).value)){
				continue;
			}
			fringe.add(fringeAdd.get(i));
		}
		while (goalFound == false && expanded.size() != 1000){
			fringeAdd = fringe.get(0).expand(false);
			for(int i = 0; i < fringeAdd.size(); i++){
				boolean alreadyExpanded = false;
				for (int j = 0; j < expanded.size(); j++){
					if (expanded.get(j).isEqual(fringeAdd.get(fringeAdd.size() - 1 - i))){
						alreadyExpanded = true;
						break;
					}
				}
				
				if (forbidden.contains(fringeAdd.get(fringeAdd.size() - 1 - i).value) || alreadyExpanded == true){
					continue;
				}
				fringe.add(0, fringeAdd.get(fringeAdd.size() - 1 - i));
			}
			if(expanded.get(expanded.size() - 1).value == goal){
				Node temp = expanded.get(expanded.size() - 1);
				goalFound = true;
				goalPath.add(temp.value);
				do{
					temp = temp.parent;
					goalPath.add(0, temp.value);
				}while (temp.parent != null);
			}
		}
	}
	
	static void IDS(){
		Node startNode = new Node(start, 0, 0);
		int depthBound = 0;
		while (goalFound == false && expanded.size() != 1000){
			ArrayList<Node> fringeAdd = startNode.expand(true);
			if(fringeAdd.get(0).depth <= depthBound){
				for(int i = 0; i < fringeAdd.size(); i++){
					if (forbidden.contains(fringeAdd.get(i).value)){
						continue;
					}
					fringe.add(fringeAdd.get(i));
				}
			}
			while (goalFound == false && expanded.size() + expandedTemp.size() != 1000 && fringe.size() != 0){
				fringeAdd = fringe.get(0).expand(true);
				if(fringeAdd.get(0).depth <= depthBound){
					for(int i = 0; i < fringeAdd.size(); i++){
						boolean alreadyExpanded = false;
						for (int j = 0; j < expandedTemp.size(); j++){
							if (expandedTemp.get(j).isEqual(fringeAdd.get(fringeAdd.size() - 1 - i))){
								alreadyExpanded = true;
								break;
							}
						}
						
						if (forbidden.contains(fringeAdd.get(fringeAdd.size() - 1 - i).value) || alreadyExpanded == true){
							continue;
						}
						fringe.add(0, fringeAdd.get(fringeAdd.size() - 1 - i));
					}
				}
			}
			expanded.addAll(expandedTemp);
			expandedTemp.clear();
			if(expanded.get(expanded.size() - 1).value == goal){
				Node temp = expanded.get(expanded.size() - 1);
				goalFound = true;
				goalPath.add(temp.value);
				do{
					temp = temp.parent;
					goalPath.add(0, temp.value);
				}while (temp.parent != null);
			}
			depthBound ++;
		}
	}
	
	static void greedy(){
		Node startNode = new Node(start, 0, 0);
		ArrayList<Node> fringeAdd = startNode.expand(false);
		for(int i = 0; i < fringeAdd.size(); i++){
			if (forbidden.contains(fringeAdd.get(i).value)){
				continue;
			}
			if(i == 0){
				fringe.add(fringeAdd.get(i));
			}
			else{
				for(int j = 0; j < fringe.size(); j++){
					if(fringeAdd.get(i).heuristic < fringe.get(fringe.size() - 1 - j).heuristic){
						continue;
					}
					else {
						fringe.add(fringe.size() - j, fringeAdd.get(i));
					}
				}
			}
		}
		while (goalFound == false && expanded.size() != 1000){
			fringeAdd = fringe.get(0).expand(false);
			for(int i = 0; i < fringeAdd.size(); i++){
				boolean alreadyExpanded = false;
				for (int j = 0; j < expanded.size(); j++){
					if (expanded.get(j).isEqual(fringeAdd.get(i))){
						alreadyExpanded = true;
						break;
					}
				}
				
				if (forbidden.contains(fringeAdd.get(i).value) || alreadyExpanded == true){
					continue;
				}
				for(int j = 0; j < fringe.size(); j++){
					if(fringeAdd.get(i).heuristic < fringe.get(fringe.size() - 1 - j).heuristic){
						continue;
					}
					else {
						fringe.add(fringe.size() - j, fringeAdd.get(i));
					}
				}
			}
			if(expanded.get(expanded.size() - 1).value == goal){
				Node temp = expanded.get(expanded.size() - 1);
				goalFound = true;
				goalPath.add(temp.value);
				do{
					temp = temp.parent;
					goalPath.add(0, temp.value);
				}while (temp.parent != null);
			}
		}
	}
	
	static void aStar(){
		Node startNode = new Node(start, 0, 0);
		ArrayList<Node> fringeAdd = startNode.expand(false);
		for(int i = 0; i < fringeAdd.size(); i++){
			if (forbidden.contains(fringeAdd.get(i).value)){
				continue;
			}
			if(i == 0){
				fringe.add(fringeAdd.get(i));
			}
			else{
				for(int j = 0; j < fringe.size(); j++){
					if(fringeAdd.get(i).heuristic + fringeAdd.get(i).depth < fringe.get(fringe.size() - 1 - j).heuristic + fringe.get(fringe.size() - 1 - j).depth){
						continue;
					}
					else {
						fringe.add(fringe.size() - j, fringeAdd.get(i));
					}
				}
			}
		}
		while (goalFound == false && expanded.size() != 1000){
			fringeAdd = fringe.get(0).expand(false);
			for(int i = 0; i < fringeAdd.size(); i++){
				boolean alreadyExpanded = false;
				for (int j = 0; j < expanded.size(); j++){
					if (expanded.get(j).isEqual(fringeAdd.get(i))){
						alreadyExpanded = true;
						break;
					}
				}
					
				if (forbidden.contains(fringeAdd.get(i).value) || alreadyExpanded == true){
					continue;
				}
				for(int j = 0; j < fringe.size(); j++){
					if(fringeAdd.get(i).heuristic + fringeAdd.get(i).depth < fringe.get(fringe.size() - 1 - j).heuristic + fringe.get(fringe.size() - 1 - j).depth){
						continue;
					}
					else {
						fringe.add(fringe.size() - j, fringeAdd.get(i));
					}
				}
			}
			if(expanded.get(expanded.size() - 1).value == goal){
				Node temp = expanded.get(expanded.size() - 1);
				goalFound = true;
				goalPath.add(temp.value);
				do{
					temp = temp.parent;
					goalPath.add(0, temp.value);
				}while (temp.parent != null);
			}		
		}
	}
	
	static void hill(){
		Node current = new Node(start, 0, 0);
		ArrayList<Node> children = current.expand(false);
		Node bestChild = children.get(children.size() - 1);
		for (int i = 1; i < children.size(); i++){
			if (children.get(children.size() - 1 - i).heuristic < bestChild.heuristic){
				bestChild = children.get(children.size() - 1 - i);
			}
		}
		if (bestChild.heuristic < current.heuristic){
			current = bestChild;
		}
		else{
			return;
		}
		while (expanded.size() != 1000 && goalFound == false){
			children = current.expand(false);
			bestChild = children.get(children.size() - 1);
			if(expanded.get(expanded.size() - 1).value == goal){
				Node temp = expanded.get(expanded.size() - 1);
				goalFound = true;
				goalPath.add(temp.value);
				do{
					temp = temp.parent;
					goalPath.add(0, temp.value);
				}while (temp.parent != null);
			}
			for (int i = 1; i < children.size(); i++){
				if (children.get(children.size() - 1 - i).heuristic < bestChild.heuristic){
					bestChild = children.get(children.size() - 1 - i);
				}
			}
			if (bestChild.heuristic < current.heuristic){
				current = bestChild;
			}
			else{
				return;
			}
		}
	}
	
	static class Node{
		int value;
		int prevChange;
		int heuristic;
		Node parent;
		int depth;
	
		public Node (int val, int change, int d){
			depth = d;
			value = val;
			prevChange = change;
			heuristic = Math.abs(value/100 - goal/100) + Math.abs((value % 100)/10 - (goal % 100)/10) + Math.abs(value % 10 - goal % 10);
		}
	
		ArrayList<Node> expand(boolean temp){
			if (temp == true){
				expandedTemp.add(this);
			}
			else{
				expanded.add(this);			
			}
			fringe.remove(this);
			ArrayList<Node> fringeAdd = new ArrayList<Node>();
		
			for (int i = 1; i < 4; i++){
				if (i == prevChange){
					continue;
				}
				else if (i == 1){
					if(value/100 != 0){
						Node temp1 = new Node((value - 100), 1, depth + 1);
						temp1.parent = this;
						fringeAdd.add(temp1);
					}
					if(value/100 != 9){
						Node temp2 = new Node((value + 100), 1, depth + 1);
						temp2.parent = this;
						fringeAdd.add(temp2);
					}
				}
				else if (i == 2){
					if((value % 100)/10 != 0){
						Node temp1 = new Node((value - 10), 2, depth + 1);
						temp1.parent = this;
						fringeAdd.add(temp1);
					}
					if((value % 100)/10 != 9){
						Node temp2 = new Node((value + 10), 2, depth + 1);
						temp2.parent = this;
						fringeAdd.add(temp2);
					}
				}
				else if (i == 3){
					if(value % 10 != 0){
						Node temp1 = new Node((value - 1), 3, depth + 1);
						temp1.parent = this;
						fringeAdd.add(temp1);
					}
					if(value % 10 != 9){
						Node temp2 = new Node((value + 1), 3, depth + 1);
						temp2.parent = this;
						fringeAdd.add(temp2);
					}
				}
			}
		
			return fringeAdd;
		}
		
		boolean isEqual(Node a){
			if (this.value == a.value && (this.prevChange == a.prevChange || this.prevChange == 0)){
				return true;
			}
			else{
				return false;
			}
		}
	}
}