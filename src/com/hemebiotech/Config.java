package com.hemebiotech;


public class Config {

	public static String getInputlink() {
		return inputLink;
	}
	public static String getOutputlink() {
		return outputLink;
	}
	
	public static String outOccurences() {
		return outputLink;
	}
	
	/**
     * Retourne le level du zéro.
     * 
     * Les attributs stockent les liens vers le fichier à traiter et le fichier de sortie
     */
	
	public static final String inputLink = "src/symptoms.txt";
	public static final String outputLink = "src/results.out"; 
	
}
