import org.openjdk.btrace.core.annotations.OnMethod;

@SuppressWarnings("all")
public class ResizeTracker {
  @OnMethod(clazz = "java.util.HashMap", method = "resize")
  public static void tracker() {
    System.out.println("resize call");
  }
}
