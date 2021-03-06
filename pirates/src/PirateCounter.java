import java.util.*;

public class PirateCounter{

  public static void main(String... args){
    ArrayList<Pirate> pirates = new ArrayList<>();

    // Given this list...

    pirates.add(new Pirate("Olaf", false, 12));
    pirates.add(new Pirate("Uwe", true, 9));
    pirates.add(new Pirate("Jack", true, 16));
    pirates.add(new Pirate("Morgan", false, 17));
    pirates.add(new Pirate("Hook", true, 20));

    // Write a function that takes any list that contains pirates as in the example,
    // And returns a list of names containing the pirates that
    // - have wooden leg and
    // - have more than 15 gold

    System.out.println(woodenLegRich(pirates).get(1));
  }

  public static List<String> woodenLegRich (List<Pirate> pirates) {
    List<String> woodenLegAndRich = new ArrayList<>();
    for(int i = 0; i < pirates.size(); i++) {
      if (pirates.get(i).hasWoodenLeg && pirates.get(i).gold > 15) {
        woodenLegAndRich.add(pirates.get(i).name);
      }
    }
    return woodenLegAndRich;
  }
}