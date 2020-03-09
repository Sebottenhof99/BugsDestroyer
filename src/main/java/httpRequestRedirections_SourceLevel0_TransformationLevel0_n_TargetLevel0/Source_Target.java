package httpRequestRedirections_SourceLevel0_TransformationLevel0_n_TargetLevel0;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;





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
    	    	String requestParameter = request.getParameter("URL");
    	    	
    	    	response.sendRedirect(requestParameter );
    	    
    	        //Case 2: Request Parameter wird unmittelbar in der Methode sendError() des Objektes Response übergeben und rechts mit einem zusätzlichen String konkateniert.
    	        response.sendRedirect( requestParameter + "was not found.");

    	        //Case 3: Request Parameter wird unmittelbar in der Methode sendError() des Objektes Response übergeben und links mit einem zusätzlichen String konkateniert.
    	        response.sendRedirect( "Was not found: " + requestParameter );

    	        //Case 4: Request Parameter wird unmittelbar in der Methode sendError() des Objektes Response übergeben und links und rechts mit einem zusätzlichen String konkateniert.
    	        response.sendRedirect( "Page " +requestParameter + " was not found!" );
    	        
    	    }

}
