package httpResponseHeaders_SourceLevel0_TransformationLevel0_n_TargetLevel0;

import org.apache.commons.text.StringEscapeUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/*
 * 
 * In diesem Fall befinden sich  die Quelle in einer und (Transformation und Ziel) in anderen  einzelnen Methoden. 
 * In Rahmen dieses Packetes ist nur der Transformationsteil variabel von 0 - n Zeilen Code, die Quellenparameter manupulieren.
 * 
 */


public class Source_TransformationTarget {
	
	private HttpServletRequest request;
	private HttpServletResponse response;
    
	protected void main()
    	    throws ServletException, IOException {
    	    	
    	    	String requestParameter = request.getParameter("page");
    	    	
    	    	TransformationLevel1target(requestParameter);
    	    	TransformationLevel2target(requestParameter);
    	    	TransformationLevel3target(requestParameter);
    	    	TransformationLevel1targetNegative(requestParameter);
    	    	TransformationLevel2targetNegative(requestParameter);
    	    	TransformationLevel3targetNegative(requestParameter);
    	    	
    	    }
	
	private void TransformationLevel1target(String requestParameter) throws IOException {
		 response.addHeader("X-Header", StringEscapeUtils.escapeEcmaScript(requestParameter) );
	}
	
	private void TransformationLevel2target(String requestParameter) throws IOException {
		 String x = StringEscapeUtils.escapeEcmaScript(requestParameter);
		 response.addHeader("X-Header", x );
	}

	private void TransformationLevel3target(String requestParameter) throws IOException {
		 String x = StringEscapeUtils.escapeEcmaScript(requestParameter);
		 String y = x; 
		 response.addHeader("X-Header", y );
	}
	
	private void TransformationLevel1targetNegative(String requestParameter) throws IOException {
		 response.addHeader("X-Header", requestParameter );
	}
	
	private void TransformationLevel2targetNegative(String requestParameter) throws IOException {
		 String x = requestParameter;
		 response.addHeader("X-Header", x );
	}
	
	private void TransformationLevel3targetNegative(String requestParameter) throws IOException {
		 String x = requestParameter;
		 String y = x; 
		 response.addHeader("X-Header", y );
	}

}
