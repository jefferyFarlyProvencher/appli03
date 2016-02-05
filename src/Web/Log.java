package Web;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Log {
	
	private static ArrayList<String> logContent = new ArrayList<String>(0);
	
	/*
	 * Creates new log if non existing 
	 */
	
	public static void Read() throws IOException {

		File logFile = new File("log.txt");
		
		if(!logFile.exists()) {
			logFile.createNewFile();
			logContent = null;
		} else {
			
			FileReader fileReader = new FileReader("log.txt");
	        BufferedReader bufferedReader = new BufferedReader(fileReader);
	        String line = null;
	        while ((line = bufferedReader.readLine()) != null) {
	        	logContent.add(line);
	        }
	        bufferedReader.close();
		}
	}
	
	/*
	 * When program closes : Write to Log
	 */
	
	public static void Write() throws IOException {

		FileWriter fileWriter = new FileWriter("log.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        
        for (int i = 0; i < logContent.size(); i++) {
        	bufferedWriter.write(logContent.get(i));
        	bufferedWriter.newLine();
		}
        
        bufferedWriter.close();
	}
	
	/*
	 * Searches log
	 */
	
	public static Boolean CheckIfDownloaded(String title) {
		
		Boolean _downloaded = false;
		
	    for (int i = 0; i < logContent.size(); i++) {
			if(logContent.contains(title)) {
				_downloaded = true;
				break;
			}	
		}
	    
	    if(!_downloaded) { logContent.add(title); }

		return _downloaded;
	}
}
