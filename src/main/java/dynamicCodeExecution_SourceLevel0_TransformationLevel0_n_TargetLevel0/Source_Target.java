package dynamicCodeExecution_SourceLevel0_TransformationLevel0_n_TargetLevel0;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Source_Target {
	private HttpServletRequest request;
	private HttpServletResponse response;
	/*
	 * In diesem Fall Target ist das das Objket "Cookie", das bei der Initialisierung ein Parameter bekommt. Der reingehender Parameter muss desinfiziert werden. 
	 */
// test
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
			 throws ServletException, IOException, ScriptException {


		 String input = request.getParameter("input");

		 ScriptEngineManager manager = new ScriptEngineManager();
		 ScriptEngine engine = manager.getEngineByName("JavaScript");
		 engine.eval(input); // Noncompliant

			        
 }
	
	
	
}
