package dynamicCodeExecution_SourceLevel0_TransformationLevel0_n_TargetLevel0;

import org.apache.commons.text.StringEscapeUtils;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Source_TargetTransformation {


	private HttpServletRequest request;
	private HttpServletResponse response;
	
	protected void responseSendError()
			throws ServletException, IOException, ScriptException {
	
		String input = request.getParameter("name");

		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");

		engine.eval(transformationLevel1Positiv(input));
		engine.eval(transformationLevel2Positiv(input));
		engine.eval(transformationLevel3Positiv(input));
		engine.eval(transformationLevel1Negative(input));
		engine.eval(transformationLevel2Negative(input));
		engine.eval(transformationLevel3Negative(input));
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
