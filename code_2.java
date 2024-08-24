
import java.util.Arrays;

public class code_2 {
  public static void main(String[] args) {
    int[] cars = {1, 2, 3, 8, 5, 6, 7};
    Arrays.sort(cars);
   
    for (int i : cars) {
      System.out.println(i);
    }
  }
}