package serverSideRequest_SourceLevel0_TransformationLevel0_n_TargetLevel0;



import org.apache.commons.httpclient.util.HttpURLConnection;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;

public class Source_Target {
	
	/*
	 * In diesem Fall Target ist das das Objket "Cookie", das bei der Initialisierung ein Parameter bekommt. Der reingehender Parameter muss desinfiziert werden. 
	 */
	/*
Insgesamt sind 3 Fehlermeldungen zu erwarten
 */


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {


		 			String requestParameter = request.getParameter("name");

					URL url_1 = new URL( requestParameter );

					URL url_2 = new URL( "Parameter links" + requestParameter );
					URL url_3 = new URL( requestParameter + " Parameter Rechts" );
					URL url_4 = new URL( "Parameter links" + requestParameter + "Parameter Rechts" );

					HttpURLConnection conn_1 = (HttpURLConnection) url_1.openConnection();
					HttpURLConnection conn_2 = (HttpURLConnection) url_2.openConnection();
					HttpURLConnection conn_3 = (HttpURLConnection) url_3.openConnection();
					HttpURLConnection conn_4 = (HttpURLConnection) url_4.openConnection();


			    }

}
