package responseSplitting_SourceLevel0_TransformationLevel0_n_TargetLevel0;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Source_Target {
	
	/*
	 * In diesem Fall Target ist das das Objket "Cookie", das bei der Initialisierung ein Parameter bekommt. Der reingehender Parameter muss desinfiziert werden. 
	 */

	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
	
		 
		 			String requestParameter = request.getParameter("name");
		 
		 			Cookie cookie_1 = new Cookie("name", "Erg�nzung links"+ requestParameter);

		 			Cookie cookie_2 = new Cookie("name", requestParameter + "Erg�nzung rechts");
		 			
		 			Cookie cookie_3 = new Cookie("name", "Erg�nzung von" + requestParameter + "beiden Seiten" );
		 			
			        
			        response.addCookie(cookie_1);
			        response.addCookie(cookie_2);
			        response.addCookie(cookie_3);
			        
			    }
	
	
	
}
