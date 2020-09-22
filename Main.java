import java.util.Random;
class Main {
  Random r = new Random();
  int randomInt = r.nextInt(50) + 1;
  public static void main(String[] args) {
  System.out.println("The random number is: " randomInt);

  }
}