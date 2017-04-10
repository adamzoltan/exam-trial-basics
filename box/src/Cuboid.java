/**
 * Created by Adam on 2017. 04. 10..
 */
public class Cuboid {
  // Create a class that represents a cuboid:
  // It should take its three dimensions as constructor parameters (numbers)
  // It should have a method called `getSurface` that returns the cuboid's surface
  // It should have a method called `getVolume` that returns the cuboid's volume

  private int a;
  private int b;
  private int c;

  public Cuboid (int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
  public void getSurface () {
    int surface = 2 * (a * b + b * c + c * a);
    System.out.println(surface);
  }

  public void getVolume () {
    int volume = a * b *c;
    System.out.println(volume);
  }
  
}
