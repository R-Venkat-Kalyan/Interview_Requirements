import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample1 {

    public static void main(String[] args) {
        List<String> certifications = new ArrayList<>();
        certifications.add("AWS Certified Cloud Practitioner");
        certifications.add("Red Hat Certified Application Developer");
        certifications.add("AWS Certified Developers Associate");
        certifications.add("Google Cloud Associate Cloud Engineer");
        certifications.forEach(
            (c)-> System.out.println(c)
        );
    }
    
}
