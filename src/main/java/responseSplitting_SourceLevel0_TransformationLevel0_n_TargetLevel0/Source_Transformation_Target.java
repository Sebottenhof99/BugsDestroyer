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

public class Source_Transformation_Target {

	private HttpServletRequest request;
	private HttpServletResponse response;
    
	
	
	protected void main()
    	    throws ServletException, IOException {
    	    	
    	    	String requestParameter = request.getParameter("name");
    	    	
    	    	String x = transformationLevel1Positiv(requestParameter);
    	    	
    	    	String y = transformationLevel2Positiv(requestParameter);
    	    	
    	    	String z = transformationLevel3Positiv(requestParameter);
    	    	
    	    	String xNeg = transformationLevel1Negative(requestParameter);

    	    	String yNeg = transformationLevel2Negative(requestParameter);
    	    	
    	    	String zNeg = transformationLevel3Negative(requestParameter);

				String xfalsePos = falsePositivTransformationLevel1(requestParameter);

				String yfalsePos = falsePositivTransformationLevel2(requestParameter);

				String zfalsePos = falsePositivTransformationLevel3(requestParameter);
    	    	
    	    	Cookie cookie_1 = new Cookie("name", x);

    			Cookie cookie_2 = new Cookie("name", y);
    				
    			Cookie cookie_3 = new Cookie("name", z);

    			Cookie cookie_1_negative = new Cookie("name", xNeg);
    			
    			Cookie cookie_2_negative = new Cookie("name", yNeg);
    			
    			Cookie cookie_3_negative = new Cookie("name", zNeg);

				Cookie cookie_1_falsePositive = new Cookie("name", xfalsePos);

				Cookie cookie_2_falsePositive = new Cookie("name", yfalsePos);

				Cookie cookie_3_falsePositive = new Cookie("name", zfalsePos);


    	    
    			response.addCookie(cookie_1);
    	        response.addCookie(cookie_2);
    	        response.addCookie(cookie_3);
    			
    	        response.addCookie(cookie_1_negative);
    	        response.addCookie(cookie_2_negative);
    	        response.addCookie(cookie_3_negative);
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


	private String falsePositivTransformationLevel1(String requestParameter) {
		StringEscapeUtils.escapeEcmaScript(requestParameter);
		return requestParameter;
	}


	private String falsePositivTransformationLevel2(String requestParameter) {
		if(requestParameter.contains(requestParameter)){
			return requestParameter;
		}else{
			return requestParameter;
		}

	}


	private static String falsePositivTransformationLevel3(String requestParameter) {
		String s = StringEscapeUtils.escapeEcmaScript(requestParameter);
		if(s.isEmpty()) {

			return s;
		}else {
			if(s.equalsIgnoreCase(requestParameter)){
				return requestParameter;
			}else{
				StringEscapeUtils.escapeEcmaScript(s);
				s = requestParameter;
				return s ;
			}

		}
	}



}
