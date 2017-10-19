public class FactoryTest {
  public static void main(String[] args) {
    Animal animal = AnimalFactory.getInstance("Cat");
    animal.eat();
  }
}
