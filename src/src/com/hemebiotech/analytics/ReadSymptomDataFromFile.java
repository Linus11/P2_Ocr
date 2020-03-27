package src.com.hemebiotech.analytics;


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
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filePath;
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}





	private Map<String, Integer> symtomes;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	

	public  Map<String, Integer> getSymptoms(){
		
		Map<String, Integer> frequency = new HashMap<>();
		try {
			Path path = Paths.get(System.getProperty("user.dir"))
					.resolve(AnalyticsCounter.inputLink);
			BufferedReader reader;
			reader = new BufferedReader(new FileReader(path.toFile()));
		
		
		
	
		String line = reader.readLine();
		while(line != null) {
			//System.out.println("Processing line: " + line);
			
			/*if(!line.trim().equals("")) {
				String [] words = line.split("\n");//
				
				for(String word : words) {
					if(word == null || word.trim().equals("")) {
						continue;
					}
					String processed = word.toLowerCase();
					processed = processed.replace(",", "-");*/
					
					if(frequency.containsKey(line)) {
						frequency.put(line, 
								frequency.get(line) + 1);
					} else {
						frequency.put(line, 1);
					}
				//}
			//}
			
			line = reader.readLine();
		}
		
		
		
		 
		 System.out.println(frequency);
		 
		 for(Map.Entry<String, Integer> items : frequency.entrySet()) {
			 
			System.out.println(items.getKey() + " " + items.getValue());
			
		 }
		 
		 /*FileOutputStream fos;
		 fos = new FileOutputStream("C:/Users/campus/eclipse-workspace/P2_Ocr/src/resultRech.txt");

		    ObjectOutputStream oos = new ObjectOutputStream(fos);
		     oos.writeObject(frequency);
		     oos.close();*/
		
		/*
		 * int mostFrequentlyUsed = 0;
		String theWord = null;
		
		for(String word : frequency.keySet()) {
			Integer theVal = frequency.get(word);
			if(theVal > mostFrequentlyUsed) {
				mostFrequentlyUsed = theVal;
				theWord = word;
			}
		}
		System.out.println();
		System.out.printf("Le sympt�me le plus fr�quent est '%s', %d times", 
				theWord, mostFrequentlyUsed);
		 * */
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
		return frequency;
		
	}

	@Override
	public List<String> GetSymptoms() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	/*public void transfert() throws IOException {

		
		var source = Paths.get("C:/Users/campus/eclipse-workspace/P2_Ocr/src/symptoms.txt");
        var dest = Paths.get("C:/Users/campus/eclipse-workspace/P2_Ocr/src/resultRech.txt");
        
        //var fis = Files.newInputStream(source);
        var fos = Files.newOutputStream(dest);
        
        byte[] buffer = new byte[1024];
        int length;
        while ((length = fis.read(buffer)) > 0) {
        	fos.write(buffer, 0, length);
        }*/

            
        }
	
	
	 
	
    


