import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class MyClassifier{
	static ArrayList<ArrayList<String>> training;
	static ArrayList<ArrayList<String>> newExamples;
	static String classifier;
	static ArrayList<String> results;
	
	public static void main(String args[]){
		training = new ArrayList<ArrayList<String>>();
		newExamples = new ArrayList<ArrayList<String>>();
		results = new ArrayList<String>();
		classifier = args[2];
		Scanner scanEntry = null;
		Scanner scanAttribute = null;
		try {
			scanEntry = new Scanner(new File(args[0]));
			String temp;
			while(scanEntry.hasNextLine()){
				temp = scanEntry.nextLine();
				scanAttribute = new Scanner(temp).useDelimiter(",");
				training.add(new ArrayList<String>());
				while(scanAttribute.hasNext()){
					training.get(training.size() - 1).add(scanAttribute.next());
				}
			}
			
			scanEntry.close();
			scanAttribute.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			scanEntry = new Scanner(new File(args[1]));
			String temp;
			while(scanEntry.hasNextLine()){
				temp = scanEntry.nextLine();
				scanAttribute = new Scanner(temp).useDelimiter(",");
				newExamples.add(new ArrayList<String>());
				while(scanAttribute.hasNext()){
					newExamples.get(newExamples.size() - 1).add(scanAttribute.next());
				}
			}
			
			scanEntry.close();
			scanAttribute.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		if(classifier.equals("NB")){
			NB();
		}
		else{
			KNN();
		}
		
		for(int i = 0; i < results.size(); i++){
			System.out.println(results.get(i));
		}
	}
	
	static void NB(){
		for(int i = 0; i < newExamples.size(); i++){
			double probYes = 1;
			double probNo = 1;
			double yesNum = 0;
			double noNum = 0;
			for (int a = 0; a < training.size(); a++){
				if(training.get(a).get(training.get(0).size() - 1).equals("yes")){
					yesNum++;
				}
				else{
					noNum++;
				}
			}
			for(int j = 0; j < newExamples.get(0).size(); j++){
				double meanYes = 0;
				double stdDevYes = 0;
				double meanNo = 0;
				double stdDevNo = 0;
				for (int k = 0; k < training.size(); k++){
					if(training.get(k).get(training.get(0).size() - 1).equals("yes")){
						meanYes = meanYes + Double.parseDouble(training.get(k).get(j));
					}
					else{
						meanNo = meanNo + Double.parseDouble(training.get(k).get(j));
					}
				}
				meanYes = meanYes/yesNum;
				meanNo = meanNo/noNum;
				for (int l = 0; l < training.size(); l++){
					if(training.get(l).get(training.get(0).size() - 1).equals("yes")){
						stdDevYes = stdDevYes + Math.pow((Double.parseDouble(training.get(l).get(j)) - meanYes), 2);
					}
					else{
						stdDevNo = stdDevNo + Math.pow((Double.parseDouble(training.get(l).get(j)) - meanNo), 2);
					}
				}
				stdDevYes = Math.sqrt(stdDevYes/(yesNum - 1));
				stdDevNo = Math.sqrt(stdDevNo/(noNum - 1));
				probYes = probYes * (Math.exp(-(Math.pow((Double.parseDouble(newExamples.get(i).get(j)) - meanYes), 2)/(2*stdDevYes*stdDevYes))) / (stdDevYes*Math.sqrt(2*Math.PI)));
				probNo = probNo * (Math.exp(-(Math.pow((Double.parseDouble(newExamples.get(i).get(j)) - meanNo), 2)/(2*stdDevNo*stdDevNo))) / (stdDevNo*Math.sqrt(2*Math.PI)));
			}
			probYes = probYes * (yesNum/training.size());
			probNo = probNo * (noNum/training.size());
			if(probYes >= probNo){
				results.add("yes");
			}
			else{
				results.add("no");
			}
		}
	}
	
	static void KNN(){
		int k = Integer.parseInt(classifier.substring(0, classifier.length()-2));
		for(int i = 0; i < newExamples.size(); i++){
			int yes = 0;
			int no = 0;
			double[][] holder = new double[k][2];
			for(int j = 0; j < training.size(); j++){
				double distance = 0;
				for(int l = 0; l < newExamples.get(0).size(); l++){
					double add = Math.pow(Double.parseDouble(newExamples.get(i).get(l)) - Double.parseDouble(training.get(j).get(l)), 2);
					distance = distance + add;
				}
				distance = Math.sqrt(distance);
				double[] temp = {distance, j};
				for(int n = 0; n < k; n++){
					if(temp[0] < holder[n][0] || holder[n][0] == 0){
						double[] temp2 = holder[n];
						holder[n] = temp;
						temp = temp2;
					}
				}
			}
			
			for(int m = 0; m < k; m++){
				if (training.get((int) holder[m][1]).get(training.get(0).size() - 1).equals("yes")){
					yes++;
				}
				else{
					no++;
				}
			}
			if (yes >= no){
				results.add("yes");
			}
			else{
				results.add("no");
			}
			
		}
	}
}