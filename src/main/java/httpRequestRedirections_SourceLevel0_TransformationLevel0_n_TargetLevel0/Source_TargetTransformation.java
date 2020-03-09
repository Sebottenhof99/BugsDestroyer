package httpRequestRedirections_SourceLevel0_TransformationLevel0_n_TargetLevel0;


import org.apache.commons.text.StringEscapeUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Source_TargetTransformation {
	

	private HttpServletRequest request;
	private HttpServletResponse response;
	
	//			source 
	//			target(transformation)
	protected void responseSendError()
    	    throws ServletException, IOException {
	
		String requestParameter = request.getParameter("URL");
    	
    	// Transformation level 1 positive
    	response.sendRedirect(  transformationLevel1Positiv(requestParameter));
    	
    	// Transformation level 2 positive
     	response.sendRedirect(  transformationLevel2Positiv(requestParameter));
    	
    	// Transformation level 3 positive
    	response.sendRedirect(  transformationLevel3Positiv(requestParameter));
    	
    	// Transformation level 1 negative
    	response.sendRedirect(  transformationLevel1Negative(requestParameter));
 
    	//Transformation level 2 negative
    	response.sendRedirect(  transformationLevel2Negative(requestParameter));
    	
    	//Transformation level 3 negative
    	response.sendRedirect(  transformationLevel3Negative(requestParameter));
    	
    	
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
