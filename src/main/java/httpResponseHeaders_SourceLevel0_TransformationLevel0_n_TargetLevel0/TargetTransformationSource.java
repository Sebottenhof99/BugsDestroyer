package httpResponseHeaders_SourceLevel0_TransformationLevel0_n_TargetLevel0;

import org.apache.commons.text.StringEscapeUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TargetTransformationSource {

	
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	protected void main()
    	    throws ServletException, IOException {
		//Transformation level 0 
		response.addHeader("X-Header",StringEscapeUtils.escapeEcmaScript(request.getParameter("page")) );

		//Transformation level 1
		response.addHeader("X-Header",transformationLevel1Positiv(request.getParameter("page")) );
		
		//Transformation level 2
		response.addHeader("X-Header",transformationLevel2Positiv(request.getParameter("page")) );
				
		//Transformation level 3
		response.addHeader("X-Header",transformationLevel3Positiv(request.getParameter("page")) );
		
		//Transformation level 1 Negative
		response.addHeader("X-Header",transformationLevel1Negative(request.getParameter("page")) );
	
		//Transformation level 2 Negative
		response.addHeader("X-Header",transformationLevel2Negative(request.getParameter("page")) );
		
		//Transformation level 3 Negative
		response.addHeader("X-Header",transformationLevel3Negative(request.getParameter("page")) );

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
