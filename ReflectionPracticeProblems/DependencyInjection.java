import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}

class Service {
    public void serve() { System.out.println("Service is running..."); }
}

class Client {
    @Inject
    private Service service;

    public void doWork() { service.serve(); }
}

public class DependencyInjection {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        for (Field f : Client.class.getDeclaredFields()) {
            if (f.isAnnotationPresent(Inject.class)) {
                f.setAccessible(true);
                f.set(client, f.getType().getDeclaredConstructor().newInstance());
            }
        }
        client.doWork();
    }
}