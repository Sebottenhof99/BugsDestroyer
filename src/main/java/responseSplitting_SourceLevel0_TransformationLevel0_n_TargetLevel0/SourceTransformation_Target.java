package responseSplitting_SourceLevel0_TransformationLevel0_n_TargetLevel0;

import org.apache.commons.text.StringEscapeUtils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SourceTransformation_Target {
	
	
	private HttpServletRequest request;
	private HttpServletResponse response;


	protected void responseSendError()
    	    throws ServletException, IOException {
    	        
    	    	//Source(Transformation) Diesen Fall kann man auf das Problem SourceTarget reduzieren Source(Transoformation) = new Source
    	    	String requestParameter = StringEscapeUtils.escapeEcmaScript(request.getParameter("name"));
    	    	Cookie cookie = new Cookie("name", requestParameter);
    			response.addCookie(cookie);
    	    	
    	    	String requestParameter1 = transformationLevel1Positiv(request.getParameter("name"));
    	    	Cookie cookie_1 = new Cookie("name", requestParameter1);
    			response.addCookie(cookie_1);
    	    
    	    	
    	    	String requestParameter2 = transformationLevel2Positiv(request.getParameter("name"));
    	    	Cookie cookie_2 = new Cookie("name", requestParameter2);
    			response.addCookie(cookie_2);
    	    	
    	    	String requestParameter3 = transformationLevel3Positiv(request.getParameter("name"));
    	    	Cookie cookie_3 = new Cookie("name", requestParameter3);
    			response.addCookie(cookie_3);
    	    	
    	    	
    	    	String requestParameter11 = transformationLevel1Negative(request.getParameter("name"));
    	    	Cookie cookie_11 = new Cookie("name", requestParameter11);
    			response.addCookie(cookie_11);
    	    	
    	    	String requestParameter22 = transformationLevel2Negative(request.getParameter("name"));
    	    	Cookie cookie_22 = new Cookie("name", requestParameter22);
    			response.addCookie(cookie_22);
    	    	
    	    	String requestParameter33 = transformationLevel3Negative(request.getParameter("name"));
    	    	Cookie cookie_33 = new Cookie("name", requestParameter33);
    			response.addCookie(cookie_33);

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
