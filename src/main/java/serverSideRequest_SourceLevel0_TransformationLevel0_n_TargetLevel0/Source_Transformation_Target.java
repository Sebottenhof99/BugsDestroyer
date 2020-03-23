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

public class Source_Transformation_Target {

	private HttpServletRequest request;
	private HttpServletResponse response;
    
	
	
	protected void main()
    	    throws ServletException, IOException {
    	    	
    	    	String requestParameter = request.getParameter("name ");
    	    	
    	    	String x = transformationLevel1Positiv(requestParameter);
    	    	
    	    	String y = transformationLevel2Positiv(requestParameter);
    	    	
    	    	String z = transformationLevel3Positiv(requestParameter);
    	    	
    	    	String xNeg = transformationLevel1Negative(requestParameter);

    	    	String yNeg = transformationLevel2Negative(requestParameter);
    	    	
    	    	String zNeg = transformationLevel3Negative(requestParameter);
    	    	
    	    	URL url_1 = new URL( x );

    			URL url_2 = new URL( y );
    				
    			URL url_3 = new URL( z );

				URL url_1_negative = new URL( xNeg );

				URL url_2_negative = new URL( yNeg );
    			
    			URL url_3_negative = new URL( zNeg );

    			HttpURLConnection conn_1 = (HttpURLConnection) url_1.openConnection();
				HttpURLConnection conn_2 = (HttpURLConnection) url_2.openConnection();
				HttpURLConnection conn_3 = (HttpURLConnection) url_3.openConnection();
				HttpURLConnection conn_1_negative = (HttpURLConnection) url_1_negative.openConnection();
				HttpURLConnection conn_2_negative = (HttpURLConnection) url_2_negative.openConnection();
				HttpURLConnection conn_3_negative = (HttpURLConnection) url_3_negative.openConnection();

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
			return StringEscapeUtils.escapeEcmaScript(s);
		}else {
			return StringEscapeUtils.escapeEcmaScript(s);
		}
	}
	
	// In unteren 3 Methoden werden keine Änderungen an dem übergebenem Parameter vorgenommen. 
	
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
