package src.com.hemebiotech.analytics;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AnalyticsCounter {
	/*private static int headacheCount = 0;	// initialize to 0
	private static int rashCount = 0;		// initialize to 0
	private static int pupilCount = 0;		// initialize to 0
*/	
	public static final String inputLink = "C:/Users/campus/eclipse-workspace/P2_Ocr/src/symptoms.txt";
	public static final String outputLink = "C:/Users/campus/eclipse-workspace/P2_Ocr/src/reslutRech.txt"; //results.out
	
	public static void main(String args[]) throws Exception {
		
		
		//ReadSymptomDataFromFile read = new ReadSymptomDataFromFile("C:/Users/campus/eclipse-workspace/P2_Ocr/src/symptoms.txt");
		ReadSymptomDataFromFile read = new ReadSymptomDataFromFile();
		read.getSymptoms();
		
		
		
		
	}
}
