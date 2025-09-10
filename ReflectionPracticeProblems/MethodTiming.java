import java.lang.reflect.*;

class Task {
    public void doTask() {
        for (int i = 0; i < 1000000; i++); // dummy work
    }
}

public class MethodTiming {
    public static void main(String[] args) throws Exception {
        Task t = new Task();
        Method m = Task.class.getMethod("doTask");
        long start = System.nanoTime();
        m.invoke(t);
        long end = System.nanoTime();
        System.out.println("Execution Time: " + (end - start) + " ns");
    }
}