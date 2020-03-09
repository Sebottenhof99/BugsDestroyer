package serverSideRequest_SourceLevel0_TransformationLevel0_n_TargetLevel0;

import org.apache.commons.text.StringEscapeUtils;
import sun.net.www.protocol.http.HttpURLConnection;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;


/*
Insgesamt sind 3 Fehlermeldungen zu erwarten
 */

public class Source_TransformationTarget {
	private HttpServletRequest request;
	private HttpServletResponse response;
    
	protected void main()
    	    throws ServletException, IOException {
    	    	
    	    	String requestParameter = request.getParameter("URL");
    	    	TransformationLevel1target(requestParameter);
    	    	TransformationLevel2target(requestParameter);
    	    	TransformationLevel3target(requestParameter);
    	    	TransformationLevel1targetNegative(requestParameter);
    	    	TransformationLevel2targetNegative(requestParameter);
    	    	TransformationLevel3targetNegative(requestParameter);
    	    }
	
	private void TransformationLevel1target(String requestParameter) throws IOException {
		URL url = new URL( StringEscapeUtils.escapeEcmaScript(requestParameter));
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	}
	
	private void TransformationLevel2target(String requestParameter) throws IOException {
		String x = StringEscapeUtils.escapeEcmaScript(requestParameter);
		URL url = new URL( x );
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		 
	}

	private void TransformationLevel3target(String requestParameter) throws IOException {
		 String x = StringEscapeUtils.escapeEcmaScript(requestParameter);
		 String y = x; 
		 URL url = new URL( y );
		 HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
	}
	
	private void TransformationLevel1targetNegative(String requestParameter) throws IOException {
		URL url = new URL( requestParameter);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
	}
	
	private void TransformationLevel2targetNegative(String requestParameter) throws IOException {
		 String x = requestParameter;
		 URL url = new URL( x);
		 HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	}
	
	private void TransformationLevel3targetNegative(String requestParameter) throws IOException {
		 String x = requestParameter;
		 String y = x; 
		 URL url = new URL( y);
		 HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	}
}
