package responseSplitting_SourceLevel0_TransformationLevel0_n_TargetLevel0;

import org.apache.commons.text.StringEscapeUtils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Source_TargetTransformation {


	private HttpServletRequest request;
	private HttpServletResponse response;
	
	protected void responseSendError()
    	    throws ServletException, IOException {
	
		String requestParameter = request.getParameter("name");
    	
		
		
		
		Cookie cookie_1 = new Cookie("name", transformationLevel1Positiv(requestParameter));

		Cookie cookie_2 = new Cookie("name", transformationLevel2Positiv(requestParameter));
			
		Cookie cookie_3 = new Cookie("name", transformationLevel3Positiv(requestParameter));

		Cookie cookie_1_negativ = new Cookie("name", transformationLevel3Negative(requestParameter));
		
		Cookie cookie_2_negative = new Cookie("name", transformationLevel3Negative(requestParameter));
		
		Cookie cookie_3_negative = new Cookie("name", transformationLevel3Negative(requestParameter));
    
		
		
		
		response.addCookie(cookie_1);
        response.addCookie(cookie_2);
        response.addCookie(cookie_3);
		
        response.addCookie(cookie_1_negativ);
        response.addCookie(cookie_2_negative);
        response.addCookie(cookie_3_negative);
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
				String x = requestParameter;
				if(x.isEmpty()) {
					return x;				
				}else {
					return x;
				}
			}
	
}
