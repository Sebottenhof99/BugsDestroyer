package serverSideRequest_SourceLevel0_TransformationLevel0_n_TargetLevel0;

import org.apache.commons.httpclient.util.HttpURLConnection;
import org.apache.commons.text.StringEscapeUtils;



import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;

public class SourceTransformation_Target {
	
	
	private HttpServletRequest request;
	private HttpServletResponse response;

/*
Insgesamt sind 3 Fehlermeldungen zu erwarten
 */

	protected void responseSendError()
    	    throws ServletException, IOException {
    	        
    	    	//Source(Transformation) Diesen Fall kann man auf das Problem SourceTarget reduzieren Source(Transoformation) = new Source
    	    	String requestParameter = StringEscapeUtils.escapeEcmaScript(request.getParameter("name"));
    	    	URL url = new URL( requestParameter);
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    	    	
    	    	String requestParameter1 = transformationLevel1Positiv(request.getParameter("name"));
    	    	URL url_1 = new URL( requestParameter1);
				HttpURLConnection conn_1 = (HttpURLConnection) url_1.openConnection();

    	    	String requestParameter2 = transformationLevel2Positiv(request.getParameter("name"));
    	    	URL url_2 = new URL( requestParameter2);
				HttpURLConnection conn_2 = (HttpURLConnection) url_2.openConnection();
    	    	
    	    	String requestParameter3 = transformationLevel3Positiv(request.getParameter("name"));
    	    	URL url_3 = new URL( requestParameter3);
				HttpURLConnection conn_3 = (HttpURLConnection) url_3.openConnection();
    	    	
    	    	
    	    	String requestParameter11 = transformationLevel1Negative(request.getParameter("name"));
    	    	URL url_11 = new URL( requestParameter11);
				HttpURLConnection conn_11 = (HttpURLConnection) url_11.openConnection();
    	    	
    	    	String requestParameter22 = transformationLevel2Negative(request.getParameter("name"));
    	    	URL url_22 = new URL( requestParameter22 );
    	    	HttpURLConnection conn_22 = (HttpURLConnection) url_22.openConnection();
    	    	
    	    	String requestParameter33 = transformationLevel3Negative(request.getParameter("name"));
    	    	URL url_33 = new URL( requestParameter33);
				HttpURLConnection conn_33 = (HttpURLConnection) url_33.openConnection();


    	    }
    

	// Transformation Level 1
		private String transformationLevel1Positiv(String requestParameter) {
			return StringEscapeUtils.escapeEcmaScript(requestParameter);
		}
		
		
		// Transformation Level 2
		private String transformationLevel2Positiv(String requestParameter) {
			String x = StringEscapeUtils.escapeEcmaScript(requestParameter);
			return x;
		}
		
		
		// Transformation Level 3
		private String transformationLevel3Positiv(String requestParameter) {
			String x = StringEscapeUtils.escapeEcmaScript(requestParameter);
			if(x.isEmpty()) {
				return StringEscapeUtils.escapeEcmaScript(x);
			}else {
				return StringEscapeUtils.escapeEcmaScript(x);
			}
		}

		// Transformation Level 1 Negative
		private String transformationLevel1Negative(String requestParameter) {
				return requestParameter;
		}
		
		// Transformation Level 2 Negative
		private String transformationLevel2Negative(String requestParameter) {
			String x = requestParameter;	
			return x;
		}
		
		// Transformation Level 3 Negative
		private String transformationLevel3Negative(String requestParameter) {
			String s = requestParameter;
			if(s.isEmpty()) {
				return s;
			}else {
				return s;
			}
		}
}
