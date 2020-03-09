package dynamicCodeExecution_SourceLevel0_TransformationLevel0_n_TargetLevel0;

import org.apache.commons.text.StringEscapeUtils;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/*
      Es sind 3 Fehlerweldungen zu erwarten.

   */
public class Source_TransformationTarget {
	private HttpServletRequest request;
	private HttpServletResponse response;
    
	protected void main()
			throws ServletException, IOException, ScriptException {
    	    	
    	    	String requestParameter = request.getParameter("name");
    	    	
    	    	TransformationLevel1target(requestParameter);
    	    	TransformationLevel2target(requestParameter);
    	    	TransformationLevel3target(requestParameter);
    	    	TransformationLevel1targetNegative(requestParameter);
    	    	TransformationLevel2targetNegative(requestParameter);
    	    	TransformationLevel3targetNegative(requestParameter);
    	    	
    	    }
	
	private void TransformationLevel1target(String requestParameter) throws IOException, ScriptException {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		engine.eval(StringEscapeUtils.escapeEcmaScript(requestParameter));
	}
	
	private void TransformationLevel2target(String requestParameter) throws IOException, ScriptException {
		 String x = StringEscapeUtils.escapeEcmaScript(requestParameter);
		 ScriptEngineManager manager = new ScriptEngineManager();
		 ScriptEngine engine = manager.getEngineByName("JavaScript");
		 engine.eval(x);
		 
	}

	private void TransformationLevel3target(String requestParameter) throws IOException, ScriptException {
		 String x = StringEscapeUtils.escapeEcmaScript(requestParameter);
		 String y = x;
		 ScriptEngineManager manager = new ScriptEngineManager();
		 ScriptEngine engine = manager.getEngineByName("JavaScript");
		 engine.eval(y);
		
	}
	
	private void TransformationLevel1targetNegative(String requestParameter) throws IOException, ScriptException {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		engine.eval(requestParameter);
		
	}
	
	private void TransformationLevel2targetNegative(String requestParameter) throws IOException, ScriptException {
		 String x = requestParameter;
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		engine.eval(x);
	}
	
	private void TransformationLevel3targetNegative(String requestParameter) throws IOException, ScriptException {
		String x = requestParameter;
		String y = x;
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		engine.eval(y);
	}
}
