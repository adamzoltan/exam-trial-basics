import java.util.ArrayList;

/**
 * Created by Adam on 2017. 04. 10..
 */
public class seconds {
  public static void main(String[] args) {
    // Create a function that takes a list as a parameter,
    // and returns a new list with every second element from the orignal list
    // example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result
  }
  public static ArrayList<Integer> secondElements (ArrayList<Integer> numbers) {
    ArrayList<Integer> secondNumbers = new ArrayList<>();
    int n;
    for (int i = 0; i < numbers.size(); i++) {
      if (i % 2 == 0) {
        n = numbers.get(i);
        secondNumbers.add(n);
      }
    }
    return secondNumbers;
  }
}
