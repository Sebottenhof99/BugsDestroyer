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

public class Source_TransformationTarget {
	private HttpServletRequest request;
	private HttpServletResponse response;
    
	protected void main()
    	    throws ServletException, IOException {
    	    	
    	    	String requestParameter = request.getParameter("name");
    	    	TransformationLevel1target(requestParameter);
    	    	TransformationLevel2target(requestParameter);
    	    	TransformationLevel3target(requestParameter);
    	    	TransformationLevel1targetNegative(requestParameter);
    	    	TransformationLevel2targetNegative(requestParameter);
    	    	TransformationLevel3targetNegative(requestParameter);
    	    }
	
	private void TransformationLevel1target(String requestParameter) throws IOException {
		Cookie cookie = new Cookie("name", StringEscapeUtils.escapeEcmaScript(requestParameter));
		response.addCookie(cookie);
	}
	
	private void TransformationLevel2target(String requestParameter) throws IOException {
		 String x = StringEscapeUtils.escapeEcmaScript(requestParameter);
		 Cookie cookie = new Cookie("name", x);
		 response.addCookie(cookie);
		 
	}

	private void TransformationLevel3target(String requestParameter) throws IOException {
		 String x = StringEscapeUtils.escapeEcmaScript(requestParameter);
		 String y = x; 
		 Cookie cookie = new Cookie("name", x);
		 response.addCookie(cookie);
		
	}
	
	private void TransformationLevel1targetNegative(String requestParameter) throws IOException {
		Cookie cookie = new Cookie("name", requestParameter);
		response.addCookie(cookie);
		
	}
	
	private void TransformationLevel2targetNegative(String requestParameter) throws IOException {
		 requestParameter.contains(requestParameter);
		 Cookie cookie = new Cookie("name", requestParameter);
		 response.addCookie(cookie);
	}
	
	private void TransformationLevel3targetNegative(String requestParameter) throws IOException {
		 requestParameter.contains(requestParameter);;
		 String y = requestParameter;
		 Cookie cookie = new Cookie("name", y);
		 response.addCookie(cookie);
	}
}
