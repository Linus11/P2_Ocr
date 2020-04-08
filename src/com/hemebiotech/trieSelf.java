package com.hemebiotech;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class trieSelf {

	

	List<String> listSymptoms = new ArrayList<String>();
	
	public trieSelf(Map<String, Integer> symptoms) {
		// TODO Auto-generated constructor stub
	}

	public void intputSymp(List<String> symptoms) {
		listSymptoms = symptoms;
		
	}
	
	public TreeMap<String, Integer> countSymptom(Map<String, Integer> theSymptom) {
		
		TreeMap<String, Integer>  countedAlphaSymptoms = new TreeMap<String, Integer>();
		for (String string : listSymptoms) {
			if(countedAlphaSymptoms.containsKey(string)) {
				Integer wordOcc = countedAlphaSymptoms.get(string);
				countedAlphaSymptoms.replace(string, wordOcc++);
				
				
			} else {
				countedAlphaSymptoms.put(string, 1);
			}
		}
		
		System.out.println("==== Tester l'encodage  : countedAlphaSymptoms =====");
 		for (Map.Entry<String, Integer> entry : countedAlphaSymptoms.entrySet()) {
 			
			System.out.println(entry.getKey()+ "  " + entry.getValue());
		}
		System.out.println("hi");
		
		return countedAlphaSymptoms;
		
	}
}
