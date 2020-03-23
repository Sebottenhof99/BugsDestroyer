package serverSideRequest_SourceLevel0_TransformationLevel0_n_TargetLevel0;

import org.apache.commons.text.StringEscapeUtils;


import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;



/*
Insgesamt sind 3 Fehlermeldungen zu erwarten
 */

public class Source_TargetTransformation {


	private HttpServletRequest request;
	private HttpServletResponse response;
	
	protected void responseSendError()
    	    throws ServletException, IOException {
	
		String requestParameter = request.getParameter("name");


		URL url_1 = new URL( transformationLevel1Positiv(requestParameter));

		URL url_2 = new URL( transformationLevel2Positiv(requestParameter));
			
		URL url_3 = new URL( transformationLevel3Positiv(requestParameter));

		URL url_1_negativ = new URL( transformationLevel1Negative(requestParameter));
		
		URL url_2_negative = new URL( transformationLevel2Negative(requestParameter));
		
		URL url_3_negative = new URL( transformationLevel3Negative(requestParameter));
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
