package com.hemebiotech;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class WriteSymptomDataFromFile {
	
	Map<String, Integer> map;
	
	/*
	 * constructeur par d�faut
	 * */
	public WriteSymptomDataFromFile(Map<String, Integer> countTreeMap) {
		map = countTreeMap;
	}

	/**
	 *  Traitement de la liste des symptomes
	 *  
	 *  la liste des sympthomes et le nombre des occurences puis l'enregistrer dans ule fichier results.out
	 *  
	  */
	public void transfert()  {

		try {
		
		TreeMap<String, Integer> ordre = new TreeMap<>(map);
		
 		FileWriter fos = new FileWriter(Config.outputLink); 
			
 		for (Map.Entry<String, Integer> entry : ordre.entrySet()) {
 			
 			fos.write(entry.getKey()+ " : " + entry.getValue() + " \n");
			
		}
 		
 		fos.close();
						
		}catch(Exception e) {
		
			e.printStackTrace();
			
		}
      
	        }

}
