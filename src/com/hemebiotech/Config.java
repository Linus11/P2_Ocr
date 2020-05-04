package com.hemebiotech;

public class Config {

	/*
	 * 
	 * Chemin physique vers symptomes.txt
	 * 
	 */

	public static String getInputlink() {
		return inputLink;
	}

	/*
	 * 
	 * Chemin physique vers results.out
	 * 
	 */
	public static String getOutputlink() {
		return outputLink;
	}

	public static final String inputLink = "src/symptoms.txt";
	public static final String outputLink = "src/results.out";

}
