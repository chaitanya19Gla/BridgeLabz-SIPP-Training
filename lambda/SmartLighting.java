import java.util.function.Consumer;

class Light {
    void activate(String pattern) {
        System.out.println("Light pattern: " + pattern);
    }
}

public class SmartLighting {
    public static void main(String[] args) {
        Light light = new Light();

        Consumer<Light> motionTrigger = l -> l.activate("Motion Detected: Bright");
        Consumer<Light> nightTrigger = l -> l.activate("Night: Dim");
        Consumer<Light> voiceTrigger = l -> l.activate("Voice Command: Colorful");

        motionTrigger.accept(light);
        nightTrigger.accept(light);
        voiceTrigger.accept(light);
    }
}