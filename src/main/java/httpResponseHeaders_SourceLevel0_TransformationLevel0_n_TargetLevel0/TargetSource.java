package httpResponseHeaders_SourceLevel0_TransformationLevel0_n_TargetLevel0;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TargetSource {


    
	//target(source)
	public void responseSendError(HttpServletRequest request, HttpServletResponse response)
    	    throws ServletException, IOException {
    	    	response.addHeader("X-Header", request.getParameter("page") );
    	    }

}
