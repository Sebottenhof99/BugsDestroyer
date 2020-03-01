package dynamicCodeExecution_SourceLevel0_TransformationLevel0_n_TargetLevel0;

import org.apache.commons.text.StringEscapeUtils;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Source_Transformation_Target {

	private HttpServletRequest request;
	private HttpServletResponse response;
    /*
		Es sind 3 Fehlermeldungen zu erwarten.

     */
	
	
	protected void main()
			throws ServletException, IOException, ScriptException {
    	    	
    	    	String requestParameter = request.getParameter("name");
    	    	
    	    	String x = transformationLevel1Positiv(requestParameter);
    	    	
    	    	String y = transformationLevel2Positiv(requestParameter);
    	    	
    	    	String z = transformationLevel3Positiv(requestParameter);
    	    	
    	    	String xNeg = transformationLevel1Negative(requestParameter);

    	    	String yNeg = transformationLevel1Negative(requestParameter);
    	    	
    	    	String zNeg = transformationLevel1Negative(requestParameter);

		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");

		engine.eval(transformationLevel1Positiv(x));
		engine.eval(transformationLevel2Positiv(y));
		engine.eval(transformationLevel3Positiv(z));
		engine.eval(transformationLevel1Negative(xNeg));
		engine.eval(transformationLevel2Negative(yNeg));
		engine.eval(transformationLevel3Negative(zNeg));


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
			return StringEscapeUtils.escapeEcmaScript(s);
		}else {
			return StringEscapeUtils.escapeEcmaScript(s);
		}
	}
	
	// In unteren 3 Methoden werden keine Änderungen an dem übergebenem Parameter vorgenommen. 
	
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
