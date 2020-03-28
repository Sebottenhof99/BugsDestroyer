package serverSideRequest_SourceLevel0_TransformationLevel0_n_TargetLevel0;



import org.apache.commons.httpclient.util.HttpURLConnection;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;

/*
Insgesamt ist 1 Fehlermeldung zu erwarten
 */

public class TargetSource {

	
	//target(source)
		public void responseSendError(HttpServletRequest request, HttpServletResponse response)
	    	    throws ServletException, IOException {
			 		URL url = new URL( request.getParameter("name") );
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	    	    }
	
	
}
