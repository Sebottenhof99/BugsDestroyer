package serverSideRequest_SourceLevel0_TransformationLevel0_n_TargetLevel0;

import org.apache.commons.httpclient.util.HttpURLConnection;
import org.apache.commons.text.StringEscapeUtils;


import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;
/*
Insgesamt sind 3 Fehlermeldungen zu erwarten
 */

public class TargetTransformationSource {


	private HttpServletRequest request;
	private HttpServletResponse response;
	
	protected void main()
    	    throws ServletException, IOException {
		//Transformation level 0 
		 URL url = new URL( StringEscapeUtils.escapeEcmaScript(request.getParameter("name")));
		 HttpURLConnection conn = (HttpURLConnection) url.openConnection();

		//Transformation level 1
		 
		 URL url_1 = new URL( transformationLevel1Positiv(request.getParameter("name")));
		 HttpURLConnection conn_1 = (HttpURLConnection) url_1.openConnection();

		//Transformation level 2

		URL url_2 = new URL( transformationLevel2Positiv(request.getParameter("name")));
		HttpURLConnection conn_2 = (HttpURLConnection) url_2.openConnection();
		
				
		//Transformation level 3
		URL url_3 = new URL( transformationLevel3Positiv(request.getParameter("name")));
		HttpURLConnection conn_3 = (HttpURLConnection) url_3.openConnection();
		
		
		//Transformation level 1 Negative
		URL url_11 = new URL(transformationLevel1Negative(request.getParameter("name")));
		HttpURLConnection conn_11 = (HttpURLConnection) url_11.openConnection();
	
	
		//Transformation level 2 Negative
		URL url_22 = new URL( transformationLevel2Negative(request.getParameter("name")));
		HttpURLConnection conn_22 = (HttpURLConnection) url_22.openConnection();
		
		
		//Transformation level 3 Negative
		URL url_33 = new URL( transformationLevel3Negative(request.getParameter("name")));
		HttpURLConnection conn_33 = (HttpURLConnection) url_33.openConnection();
				
	}
	
	
	// Transformation Level 1
	private String transformationLevel1Positiv(String requestParameter) {
		return StringEscapeUtils.escapeEcmaScript(requestParameter);
	}
	
	
	// Transformation Level 2
	private String transformationLevel2Positiv(String requestParameter) {
		String escapedString = StringEscapeUtils.escapeEcmaScript(requestParameter);
		return escapedString;
	}
	
	
	// Transformation Level 3
	private String transformationLevel3Positiv(String requestParameter) {
		String s = StringEscapeUtils.escapeEcmaScript(requestParameter);
		if(s.isEmpty()) {
			return StringEscapeUtils.escapeEcmaScript(requestParameter);
		}else {
			return StringEscapeUtils.escapeEcmaScript(requestParameter);
		}
		
	}
	

	// Transformation Level 1 
	private String transformationLevel1Negative(String requestParameter) {
			return requestParameter;
	}
	
	// Transformation Level 2
	private String transformationLevel2Negative(String requestParameter) {
		String x = requestParameter;	
	return x;
		}
	
	// Transformation Level 3
	private String transformationLevel3Negative(String requestParameter) {
		String s = requestParameter;
		if(s.isEmpty()) {
			return s;
		}else {
			return s;
		}
	}
	
}
