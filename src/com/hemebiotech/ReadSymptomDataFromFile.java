package com.hemebiotech;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.DuplicateFormatFlagsException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implémentation de la classe ReadSymptomDataFromFile
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	String file;
	public ReadSymptomDataFromFile(String string) {
		
		file = string;
		
	}

	/**
	 *  Traitement de la liste des symptomes
	 *  
	 *  @return la liste des sympthomes et le nombre des occurences
	 *  
	  */
			
	
	public  Map<String, Integer> getSymptoms(){
		
		Map<String, Integer> frequency = new HashMap<>();
		BufferedReader reader = null;
		
		try {
					
			reader = new BufferedReader(new FileReader(file));
	
			String line = reader.readLine();
			
			while(line != null) {
						
						if(frequency.containsKey(line)) {
							frequency.put(line, 
									frequency.get(line) + 1);
						} else {
							frequency.put(line, 1);
						}
				
				line = reader.readLine();
			}	
		
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally{
			if(reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			}
		}
       
		return frequency;
		
	}

}
	
	