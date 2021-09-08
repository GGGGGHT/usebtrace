import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

@SuppressWarnings("all")
public class ReHash {
  public static void main(String[] args) throws InterruptedException, IOException {
    System.in.read();
    HashMap<Integer, Integer> map = new HashMap<>(16);

    for (int i = 0; i < 1_000_000; i++) {
      System.out.println(i);
      map.put(i, i);
      Thread.sleep(1000L);
    }
  }
}
