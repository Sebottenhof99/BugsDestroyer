import org.apache.commons.text.StringEscapeUtils;

public class test {


    public static void main(String[] args) {

        String s = "<script>alert('Achtung')</alert>";
        System.out.println(s);
        System.out.println(falsePositivTransformationLevel1(s));
        System.out.println(transformationLevel1Positiv(s));
        System.out.println(falsePositivTransformationLevel3(s));



    }

    private static String falsePositivTransformationLevel1(String requestParameter) {
        StringEscapeUtils.escapeEcmaScript(requestParameter);
        return requestParameter;
    }

    private static String transformationLevel1Positiv(String requestParameter) {
        return StringEscapeUtils.escapeEcmaScript(requestParameter);
    }
    private static String falsePositivTransformationLevel3(String requestParameter) {
        String s = StringEscapeUtils.escapeEcmaScript(requestParameter);
        if(s.isEmpty()) {
            StringEscapeUtils.escapeEcmaScript(s);
            s = requestParameter;
            return s;
        }else {
            StringEscapeUtils.escapeEcmaScript(s);
            s = requestParameter;
            return s ;
        }
    }

}
