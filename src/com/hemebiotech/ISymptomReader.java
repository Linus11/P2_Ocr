	package com.hemebiotech;

import java.util.List;
import java.util.Map;


	/**
	 * L'interface ISymptomReader retourne une liste brute de symptomes même si la liste est vide.
	 */

public interface ISymptomReader {
	
	Map<String, Integer> getSymptoms();
}
