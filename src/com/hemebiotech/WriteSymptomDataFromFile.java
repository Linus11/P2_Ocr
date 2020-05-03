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
	 * constructeur par défaut
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

		
		
		TreeMap<String, Integer> ordre = new TreeMap<>(map);
		
 		FileWriter fos = null;
		try {
			fos = new FileWriter(Config.outputLink);
		} catch (IOException e1) {
			
			e1.printStackTrace();
		} 
 		try {
 			
 		for (Map.Entry<String, Integer> entry : ordre.entrySet()) {
 			
 			try {
				fos.write(entry.getKey()+ " : " + entry.getValue() + " \n");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
 		
 		
						
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
      
	        }

}
