package Web.Constructors;

import java.util.ArrayList;

public class WebSite {
	
	public String baseURL;
	public String name;
	public String protocol;
	public String extension;

    public WebSite(String name, String protocol, String extension ) {
		this.name = name;
		this.protocol = protocol;
		this.extension = extension;
		this.buildURL();
	}

	private void buildURL(){
		this.baseURL = this.protocol + "://www." + this.baseURL + this.extension;
	}

	public String GetURL(){
		return this.baseURL;
	}
}