package responseSendError_SourceLevel0_TrasformationLevel0_n_TargetLevel0;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.text.StringEscapeUtils;

public class TargetSource {


    
	//target(source)
	public void responseSendError(HttpServletRequest request,HttpServletResponse response)
    	    throws ServletException, IOException {
    	    	response.sendError(HttpServletResponse.SC_NOT_FOUND, request.getParameter("page") );
    	    }

}