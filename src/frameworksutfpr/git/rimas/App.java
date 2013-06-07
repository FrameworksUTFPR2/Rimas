package frameworksutfpr.git.rimas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
	public static void main(String[] args) {

	}
	
	private static String lerVerso(){
	    try {  
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));    
	        return in.readLine();  
  
	    } catch (IOException exception) {  
	        exception.printStackTrace();  
	    }
		return "";
	}
}