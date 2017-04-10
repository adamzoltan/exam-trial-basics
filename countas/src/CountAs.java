import com.sun.deploy.util.StringUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2017. 04. 10..
 */
public class CountAs {

  public static void main(String[] args) {
    // Create a function that takes a filename as string parameter,
    // counts the occurances of the letter "a", and returns it as a number.
    // If the file does not exist, the function should return 0 and not break.

    // example: on the input "afile.txt" the function should return 28 - print this result
    // example: on the input "not-a-file" the function should return 0 - print this result
    String filen = "afile.txt";
    countA(filen);
  }

  public static int countA (String fileName) {
    Path path = Paths.get(fileName);
    List <String> fromFile;
    int counter = 0;
    try {
      fromFile = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
      return 0;
    }
    for (int i = 0; i < fromFile.size(); i++) {
      for (int j = 0; j < fromFile.get(i).length(); j++) {
        if (fromFile.get(i).charAt(j) == 'a' || fromFile.get(i).charAt(j) == 'A') {
          counter++;
        }
      }
    }
    System.out.println(counter);
    return counter;
  }
}
