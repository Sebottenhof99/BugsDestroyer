package Interprocedural.serverSideRequest_SourceLevel0_TransformationLevel0_n_TargetLevel0;



import Utilities.Obj;
import org.apache.commons.httpclient.util.HttpURLConnection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;

public class Source_Target {
	
	/*
	 * In diesem Fall Target ist das das Objket "Cookie", das bei der Initialisierung ein Parameter bekommt. Der reingehender Parameter muss desinfiziert werden. 
	 */
	/*
Insgesamt sind 3 Fehlermeldungen zu erwarten
 */


	protected void doGet1(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {


		 			String requestParameter = request.getParameter("name");

					Socket socket = new Socket(requestParameter,20);
					socket.getOutputStream();

					URL url_1 = new URL( requestParameter );

					URL url_2 = new URL( "Parameter links" + requestParameter );
					URL url_3 = new URL( requestParameter + " Parameter Rechts" );
					URL url_4 = new URL( "Parameter links" + requestParameter + "Parameter Rechts" );

					HttpURLConnection conn_1 = (HttpURLConnection) url_1.openConnection();
					HttpURLConnection conn_2 = (HttpURLConnection) url_2.openConnection();
					HttpURLConnection conn_3 = (HttpURLConnection) url_3.openConnection();
					HttpURLConnection conn_4 = (HttpURLConnection) url_4.openConnection();


			    }


	protected void doGet2(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Obj a = new Obj();
		a.requestParameter = request.getParameter("page");

		Obj b = new Obj();
		b.requestParameter =  "requestParameter";

		String requestParameter = request.getParameter("name");

		URL url_1 = new URL( requestParameter );
		URL url_a = new URL( a.requestParameter );
		URL url_b = new URL( b.requestParameter );


		URL url_2 = new URL( "Parameter links" + requestParameter );
		URL url_3 = new URL( requestParameter + " Parameter Rechts" );
		URL url_4 = new URL( "Parameter links" + requestParameter + "Parameter Rechts" );

		HttpURLConnection conn_1 = (HttpURLConnection) url_1.openConnection();
		HttpURLConnection conn_2 = (HttpURLConnection) url_2.openConnection();
		HttpURLConnection conn_3 = (HttpURLConnection) url_3.openConnection();
		HttpURLConnection conn_4 = (HttpURLConnection) url_4.openConnection();

		HttpURLConnection conn_a = (HttpURLConnection) url_a.openConnection();
		HttpURLConnection conn_b = (HttpURLConnection) url_b.openConnection();


	}
	HttpServletRequest req;
	HttpServletResponse resp;

	protected void doGet() throws IOException {
		URL url = new URL(req.getParameter("url"));
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String urlWhiteListed = "https://example.com/";
		String str = req.getParameter("url");
		if (!str.startsWith(urlWhiteListed))
			throw new IOException();

		URL url2 = new URL(str);
		HttpURLConnection conn2 = (HttpURLConnection) url2.openConnection(); // compliant
	}

}
