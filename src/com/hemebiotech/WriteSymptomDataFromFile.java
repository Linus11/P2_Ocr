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
	

	/*
	 * constructeur par défaut
	 * */
	public WriteSymptomDataFromFile(TreeMap<String, Integer> countTreeMap) {
		
	}

	public void transfert(Map<String, Integer> map) throws IOException{
			
		TreeMap<String, Integer> ordre = new TreeMap<>(map);
		
 		FileWriter fos = new FileWriter(Config.outputLink); //result.out
			
 		for (Map.Entry<String, Integer> entry : ordre.entrySet()) {
 			
 			fos.write(entry.getKey()+ " : " + entry.getValue() + " \n");
			
		}
 		
 		fos.close();

      
	        }

	public void write() {
		
		
	}
}
