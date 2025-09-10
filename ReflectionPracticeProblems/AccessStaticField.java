import java.lang.reflect.*;

class Configuration {
    private static String API_KEY = "OLD_KEY";
}

public class AccessStaticField {
    public static void main(String[] args) throws Exception {
        Field f = Configuration.class.getDeclaredField("API_KEY");
        f.setAccessible(true);
        f.set(null, "NEW_SECRET_KEY");
        System.out.println("Modified API_KEY: " + f.get(null));
    }
}