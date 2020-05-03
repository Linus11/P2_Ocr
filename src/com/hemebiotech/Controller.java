package com.hemebiotech;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

		/*
		 * 
		 * @see ReadSymptomDataFromFile  
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
