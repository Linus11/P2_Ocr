package com.hemebiotech;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class WriteSymptomDataFromFile {

	
	public Map<String, Integer> transfert() throws IOException{

		/**
		 * Prend le fichier outOccurences et le transferer dans un fichier result.out
		 * 	
		 * @return write liste des symthomes + occurences
		 * 
		 */

		
		Map<String, Integer>write = new HashMap();
		String writeString;

			
			var source = Paths.get(config.outOccurences);
	        var dest = Paths.get(config.outputLink);
	        
	        var fis = Files.newInputStream(source);
	        var fos = Files.newOutputStream(dest);
	        
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = fis.read(buffer)) > 0) {
	        	fos.write(buffer, 0, length);
	        	
	        }
			return write;

	            
	        }
}
