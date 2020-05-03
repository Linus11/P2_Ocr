package com.hemebiotech;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

		/*
		 * 
		 * @see ReadSymptomDataFromFile
		 * Lier le fichier symptomes.txt  
		 * Ecrire dans un fichier result.out
		 * 
		 * */
public class Controller {

	
	static void executer() throws IOException {
		
		ReadSymptomDataFromFile read = new ReadSymptomDataFromFile(Config.inputLink);
		
		Map<String, Integer> symptome = read.getSymptoms();
		
		WriteSymptomDataFromFile write = new WriteSymptomDataFromFile(symptome);
		write.transfert();
		
	}
	
}
