
import java.util.Arrays;

public class code_2 {
  public static void main(String[] args) {
    int[] cars = {5, 7, 9, 7, 8, 90, 7};
    Arrays.sort(cars);
   
    for (int i : cars) {
      System.out.println(i);
    }
  }
}