package httpRequestRedirections_SourceLevel0_TransformationLevel0_n_TargetLevel0;

import org.apache.commons.text.StringEscapeUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 * 
 * In diesem Fall sind die Quelle, Transformation und Ziel in einzelnen Methoden verpackt. 
 * In Rahmen dieses Packetes ist nur der Transformationsteil variabel von 0 - n Zeilen Code, die Quellenparameter manupulieren.
 * 
 */
public class Source_Transformation_Target {

	private HttpServletRequest request;
	private HttpServletResponse response;
    
	
	
	protected void main()
    	    throws ServletException, IOException {
    	    	
    	    	String requestParameter = request.getParameter("URL");
    	    	
    	    	String x = transformationLevel1Positiv(requestParameter);
    	    	
    	    	String y = transformationLevel2Positiv(requestParameter);
    	    	
    	    	String z = transformationLevel3Positiv(requestParameter);
    	    	
    	    	String xNeg = transformationLevel1Negative(requestParameter);

    	    	String yNeg = transformationLevel1Negative(requestParameter);
    	    	
    	    	String zNeg = transformationLevel1Negative(requestParameter);
    	    	
    	    	response.sendRedirect( x );
    	    	response.sendRedirect( y );
    	    	response.sendRedirect( z );
    	    	response.sendRedirect( xNeg );
    	    	response.sendRedirect( yNeg );
    	    	response.sendRedirect( zNeg );
    	    	
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
			return StringEscapeUtils.escapeEcmaScript(requestParameter);
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
