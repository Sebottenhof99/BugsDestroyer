package responseSendError_SourceLevel0_TrasformationLevel0_n_TargetLevel0;

import java.io.IOException;


import org.apache.commons.text.StringEscapeUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
Insgesamt sind 3 Fehlermeldungen zu erwarten
 */

public class SourceTransformation_Target {
	private HttpServletRequest request;
	private HttpServletResponse response;
    protected void responseSendError()
    	    throws ServletException, IOException {
    	        
    	    	//Source(Transformation) Diesen Fall kann man auf das Problem SourceTarget reduzieren Source(Transoformation) = new Source
    	    	String requestParameter = StringEscapeUtils.escapeEcmaScript(request.getParameter("page"));
    	    	response.sendError(HttpServletResponse.SC_NOT_FOUND, requestParameter );
    	    	
    	    	String requestParameter1 = transformationLevel1Positiv(request.getParameter("page"));
    	    	response.sendError(HttpServletResponse.SC_NOT_FOUND, requestParameter1 );
    	    	
    	    	String requestParameter2 = transformationLevel2Positiv(request.getParameter("page"));
    	    	response.sendError(HttpServletResponse.SC_NOT_FOUND, requestParameter2 );
    	    	
    	    	String requestParameter3 = transformationLevel3Positiv(request.getParameter("page"));
    	    	response.sendError(HttpServletResponse.SC_NOT_FOUND, requestParameter3 );
    	    	
    	    	
    	    	String requestParameter11 = transformationLevel1Negative(request.getParameter("page"));
    	    	response.sendError(HttpServletResponse.SC_NOT_FOUND, requestParameter11 );
    	    	
    	    	String requestParameter22 = transformationLevel2Negative(request.getParameter("page"));
    	    	response.sendError(HttpServletResponse.SC_NOT_FOUND, requestParameter22 );
    	    	
    	    	String requestParameter33 = transformationLevel3Negative(request.getParameter("page"));
    	    	response.sendError(HttpServletResponse.SC_NOT_FOUND, requestParameter33 );
    	    	
    	    	

    	            	        
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
				return StringEscapeUtils.escapeEcmaScript(requestParameter);
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
