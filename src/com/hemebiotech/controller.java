package com.hemebiotech;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class controller {

	
	static void executer() {
		
		
		/*
		 * Insantiation d'un nouveau reader 
		 * @see ReadSymptomDataFromFile 
		 * le null revoie � un constructeur par d�faut (que le programme m'a exig�)
		 * 
		 * 
		 * */
		ReadSymptomDataFromFile read = new ReadSymptomDataFromFile(null);
		
		Map<String, Integer> symptome = read.getSymptoms();
		
		
		WriteSymptomDataFromFile write = new WriteSymptomDataFromFile(null);
		try {
			write.transfert(symptome);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		/*
		 * Ce code n'affiche aucun r�sultat... 
		 * Il instantie le contenu de la classe trieSelf
		 * Pour exp�rimenter un r�slutat avec encodage 
		 * @see trieSelf.java
		 * */
		
		System.out.println("== form trieSelf class test ==");
		
		Map<String, Integer> symp1 = read.getSymptoms();
		
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("C:/Users/Elev/eclipse-workspace-java-se/P2_java/src/symptoms.txt");
		trieSelf countSym = new trieSelf(reader.getSymptoms());
		TreeMap<String, Integer> countTreeMap = countSym.countSymptom(symp1);
		WriteSymptomDataFromFile write1 = new WriteSymptomDataFromFile(countTreeMap);
		write1.write();
		
	}
	
}
