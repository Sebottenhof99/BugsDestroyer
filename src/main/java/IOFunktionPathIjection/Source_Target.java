package IOFunktionPathIjection;

import org.apache.commons.io.FileUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

public class Source_Target {

    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws IOException {
        String file = request.getParameter("file");

        File fileUnsafe = new File(file);
        try {
            FileUtils.forceDelete(fileUnsafe); // Noncompliant
        }
        catch(IOException ex){
            System.out.println (ex.toString());
        }
    }
}
