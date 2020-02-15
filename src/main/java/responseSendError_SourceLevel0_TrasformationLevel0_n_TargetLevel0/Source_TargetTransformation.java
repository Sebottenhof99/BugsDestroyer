package responseSendError_SourceLevel0_TrasformationLevel0_n_TargetLevel0;


import org.apache.commons.text.StringEscapeUtils;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Source_TargetTransformation {
	

	private HttpServletRequest request;
	private HttpServletResponse response;
	
	//			source 
	//			target(transformation)
	protected void responseSendError()
    	    throws ServletException, IOException {
	
		String requestParameter = request.getParameter("page");
    	
    	// Transformation level 1 positive
    	response.sendError(HttpServletResponse.SC_NOT_FOUND,  transformationLevel1Positiv(requestParameter));
    	
    	// Transformation level 2 positive
     	response.sendError(HttpServletResponse.SC_NOT_FOUND,  transformationLevel2Positiv(requestParameter));
    	
    	// Transformation level 3 positive
    	response.sendError(HttpServletResponse.SC_NOT_FOUND,  transformationLevel3Positiv(requestParameter));
    	
    	// Transformation level 1 negative
    	response.sendError(HttpServletResponse.SC_NOT_FOUND,  transformationLevel1Negative(requestParameter));
 
    	//Transformation level 2 negative
    	response.sendError(HttpServletResponse.SC_NOT_FOUND,  transformationLevel2Negative(requestParameter));
    	
    	//Transformation level 3 negative
    	response.sendError(HttpServletResponse.SC_NOT_FOUND,  transformationLevel3Negative(requestParameter));
    	
    	
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
