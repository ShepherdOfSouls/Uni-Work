package lab1;

import java.util.ArrayList;

public class AutoDiagnosis {

	private ArrayList<String> symptoms;
	
	public AutoDiagnosis()
	{
		symptoms = new ArrayList<String>();
	}
	
	public void addSymptom(String symptom)
	{
		this.symptoms.add(symptom);
	}
	
	public String diagnose()
	{
		if(symptoms.isEmpty())
		{
			return "Healthy";
		}
		else if(symptoms.contains("Headache") && symptoms.contains("Coughing") && symptoms.contains("Vomiting") && symptoms.size()==3)
		{
			return "Flu";
		}
		else if(symptoms.contains("Headache") && symptoms.contains("Coughing") && symptoms.contains("Sore Throat") && symptoms.size()==3)
		{
			return "Tonsilitis";
		}
		else if(symptoms.contains("Headache") && symptoms.contains("Sore Stomache") && symptoms.size()==2)
		{
			return "Viral Infection";
		}
		else if(symptoms.contains("Headache") && symptoms.contains("Sore Limb") && symptoms.size()==2)
		{
			return "Broken Bone";
		}
		else if(symptoms.contains("Vomiting") && symptoms.contains("Sore Limb") && symptoms.size()==2)
		{
			return "Bacterial Infection";
		}
		else
		{
			return "Unknown Illness";
		}
	}
	
	public String diagnoseClosest()
	{
		int flu = 0;
		int tonsilitis = 0;
		int viralInfection = 0;
		int brokenBone = 0;
		int bacterialInfection = 0;
		
		for (int i = 0; i < symptoms.size(); i++){
			if(symptoms.get(i).equals("Headache")){
				flu++;
				tonsilitis++;
				viralInfection++;
				brokenBone++;
			}
			else if(symptoms.get(i).equals("Coughing")){
				flu++;
				tonsilitis++;
			}
			else if(symptoms.get(i).equals("Vomiting")){
				flu++;
				bacterialInfection++;
			}
			else if(symptoms.get(i).equals("Sore Throat")){
				tonsilitis++;
			}
			else if(symptoms.get(i).equals("Sore Stomach")){
				viralInfection++;
			}
			else if(symptoms.get(i).equals("Sore Limb")){
				brokenBone++;
				bacterialInfection++;
			}
			
		}
		
		if(flu > tonsilitis && flu > bacterialInfection && flu > viralInfection && flu > brokenBone){
			return "Flu";
		}
		else if(tonsilitis > flu && tonsilitis > bacterialInfection && tonsilitis > viralInfection && tonsilitis > brokenBone){
			return "Tonsilitis";
		}
		else if(bacterialInfection > flu && bacterialInfection > tonsilitis && bacterialInfection > viralInfection && bacterialInfection > brokenBone){
			return "Bacterial Infection";
		}
		else if(viralInfection > flu && viralInfection > bacterialInfection && viralInfection > tonsilitis && viralInfection > brokenBone){
			return "Viral Infection";
		}
		else if(brokenBone > flu && brokenBone > bacterialInfection && brokenBone > viralInfection && brokenBone > tonsilitis){
			return "Broken Bone";
		}
		else{
			return "Unknown Illness";
		}
	}
}
