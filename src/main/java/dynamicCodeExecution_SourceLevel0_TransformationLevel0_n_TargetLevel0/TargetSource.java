package dynamicCodeExecution_SourceLevel0_TransformationLevel0_n_TargetLevel0;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
      Es ist 1 Fehlermeldung zu erwarten.

   */
public class TargetSource {

	
	//target(source)
		public void responseSendError(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException, ScriptException {

			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("JavaScript");
			engine.eval( request.getParameter("page"));
		}
}
