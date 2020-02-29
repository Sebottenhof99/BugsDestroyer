package dynamicCodeExecution_SourceLevel0_TransformationLevel0_n_TargetLevel0;

import org.apache.commons.text.StringEscapeUtils;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TargetTransformationSource {


	private HttpServletRequest request;
	private HttpServletResponse response;
	
	protected void main()
			throws ServletException, IOException, ScriptException {


		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		engine.eval(StringEscapeUtils.escapeEcmaScript(request.getParameter("name"))); // Noncompliant
		//Transformation level 0 



		//Transformation level 1
		engine.eval(transformationLevel1Positiv(request.getParameter("name")));


		//Transformation level 2
		engine.eval(transformationLevel2Positiv(request.getParameter("name")));

		
				
		//Transformation level 3
		engine.eval( transformationLevel3Positiv(request.getParameter("name")));

		
		
		//Transformation level 1 Negative
		engine.eval( transformationLevel1Negative(request.getParameter("name")));
	
	
		//Transformation level 2 Negative
		engine.eval( transformationLevel2Negative(request.getParameter("name")));
		
		
		//Transformation level 3 Negative
		engine.eval( transformationLevel3Negative(request.getParameter("name")));
				
	}
	
	
	// Transformation Level 1
	private String transformationLevel1Positiv(String requestParameter) {
		return StringEscapeUtils.escapeEcmaScript(requestParameter);
	}
	
	
	// Transformation Level 2
	private String transformationLevel2Positiv(String requestParameter) {
		String escapedString = StringEscapeUtils.escapeEcmaScript(requestParameter);
		return escapedString;
	}
	
	
	// Transformation Level 3
	private String transformationLevel3Positiv(String requestParameter) {
		String s = StringEscapeUtils.escapeEcmaScript(requestParameter);
		if(s.isEmpty()) {
			return StringEscapeUtils.escapeEcmaScript(requestParameter);
		}else {
			return StringEscapeUtils.escapeEcmaScript(requestParameter);
		}
		
	}
	

	// Transformation Level 1 
	private String transformationLevel1Negative(String requestParameter) {
			return StringEscapeUtils.escapeEcmaScript(requestParameter);
	}
	
	// Transformation Level 2
	private String transformationLevel2Negative(String requestParameter) {
		String x = requestParameter;	
	return x;
		}
	
	// Transformation Level 3
	private String transformationLevel3Negative(String requestParameter) {
		String s = requestParameter;
		if(s.isEmpty()) {
			return s;
		}else {
			return s;
		}
	}
	
}
