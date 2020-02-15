package responseSendError_SourceLevel0_TrasformationLevel0_n_TargetLevel0;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





/*
 * 	In diesem Fall gibt es keine Transformation und die Quelle und Ziel befinden sich innerhalb einer methode.  
 * 
 * 
 * 
 */

public class Source_Target {
	
	
    protected void responseSendError(HttpServletRequest request, HttpServletResponse response)
    	    throws ServletException, IOException {
    	        
    	    	//Case 1: Request Parameter wird in ein String geschrieben und vor der Verwendung desinfiziert.
    	    	String requestParameter = request.getParameter("page");
    	    	
    	    	response.sendError(HttpServletResponse.SC_NOT_FOUND, requestParameter );
    	    
    	        //Case 2: Request Parameter wird unmittelbar in der Methode sendError() des Objektes Response übergeben und rechts mit einem zusätzlichen String konkateniert.
    	        response.sendError(HttpServletResponse.SC_NOT_FOUND, requestParameter + "was not found.");

    	        //Case 3: Request Parameter wird unmittelbar in der Methode sendError() des Objektes Response übergeben und links mit einem zusätzlichen String konkateniert.
    	        response.sendError(HttpServletResponse.SC_NOT_FOUND, "Was not found: " + requestParameter );

    	        //Case 4: Request Parameter wird unmittelbar in der Methode sendError() des Objektes Response übergeben und links und rechts mit einem zusätzlichen String konkateniert.
    	        response.sendError(HttpServletResponse.SC_NOT_FOUND, "Page " +requestParameter + " was not found!" );
    	        
    	    }

    
}
