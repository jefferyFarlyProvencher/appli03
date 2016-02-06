package Web;

import java.net.*;
import java.io.*;
import Web.Constructors.WebSite;

public class WebRequest {
    public static String[] WebBundleRequester(WebSite website, int endIndex, int startIndex ) throws Exception {
    	
    	String[] _webPages = new String[endIndex];
    	String _inputLine;
    	int numberOfPage = startIndex + endIndex;
    	
    	for(int i = startIndex, j = 0; i < numberOfPage; i++, j++){
	        URL _url = new URL(website.getURL());
	        URLConnection yc = _url.openConnection();
	        BufferedReader in = new BufferedReader(new InputStreamReader(
	                                    yc.getInputStream()));
	        
	        _inputLine = "";				// Initialize _inputLine
	        _webPages[j] = "";				// Initialize _webPages[i]
	        
	        while ((_inputLine = in.readLine()) != null)
	        	_webPages[j] += _inputLine; 
	        
	        in.close();
    	}
        
        return _webPages;
        		
    }
    
	public static String WebRequester(String url) throws Exception {
	    	
    	String _webPage = "";
    	String _inputLine;
    	
        URL _url = new URL(url);
        URLConnection yc = _url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    yc.getInputStream()));
        
        _inputLine = "";				// Initialize _inputLine
        
        while ((_inputLine = in.readLine()) != null)
        	_webPage += _inputLine; 
        
        in.close();
    
        return _webPage;	
    }
}