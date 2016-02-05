package Web;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Html {
	
	private static String intro = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">"
							    + "<html lang=\"fr\"><head><meta charset=\"utf-8\"/><title>Monde Impitoyable</title>"
							    + "<!-- CSS --><link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\"><link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\">"
								+ "<!-- Scripts --><script src=\"js/required/jquery-2.1.3.min.js\"></script><script src=\"js/required/bootstrap.min.js\"></script><script src=\"js/index.js\"></script>"
								+ "</head><body><div class=\"container-fluid\"><div class=\"row\"><div id=\"content\" class=\"col-xs-12\"><h1>Links</h1><ul>";
	
	private static String outro = "</ul></div></div></div></body></html>";
			
			
	// Generates a Web Page with downloadLinks 
	public static void Generate(String[] links) throws IOException {
		
		FileWriter fileWriter = new FileWriter("index.html");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        
        bufferedWriter.write(intro);
        
        for (int i = 0; i < links.length; i++) {
        	if(links[i] != "") {
        		bufferedWriter.write("<li><a target=\"_blank\" href=\"" + links[i] + "\">Click Here</a></li>");
            	bufferedWriter.newLine();
        	}
		}
        
        bufferedWriter.write(outro);
        
        bufferedWriter.close();
	}
}
