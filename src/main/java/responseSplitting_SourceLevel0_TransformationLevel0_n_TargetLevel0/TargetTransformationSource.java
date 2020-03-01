package responseSplitting_SourceLevel0_TransformationLevel0_n_TargetLevel0;

import org.apache.commons.text.StringEscapeUtils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
Insgesamt sind 3 Fehlermeldungen zu erwarten
 */

public class TargetTransformationSource {


	private HttpServletRequest request;
	private HttpServletResponse response;
	
	protected void main()
    	    throws ServletException, IOException {
		//Transformation level 0 
		 Cookie cookie = new Cookie("name", StringEscapeUtils.escapeEcmaScript(request.getParameter("name")));
		 response.addCookie(cookie);

		//Transformation level 1
		 
		 Cookie cookie_1 = new Cookie("name", transformationLevel1Positiv(request.getParameter("name")));
		 response.addCookie(cookie_1);

		//Transformation level 2
		 
		 Cookie cookie_2 = new Cookie("name", transformationLevel2Positiv(request.getParameter("name")));
		 response.addCookie(cookie_2);
		
				
		//Transformation level 3
		 Cookie cookie_3 = new Cookie("name", transformationLevel3Positiv(request.getParameter("name")));
		 response.addCookie(cookie_3);
		
		
		//Transformation level 1 Negative
		 Cookie cookie_11 = new Cookie("name", transformationLevel1Negative(request.getParameter("name")));
		 response.addCookie(cookie_11);
	
	
		//Transformation level 2 Negative
		 Cookie cookie_22 = new Cookie("name", transformationLevel2Negative(request.getParameter("name")));
		 response.addCookie(cookie_22);
		
		
		//Transformation level 3 Negative
		 Cookie cookie_33 = new Cookie("name", transformationLevel3Negative(request.getParameter("name")));
		 response.addCookie(cookie_33);
				
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
