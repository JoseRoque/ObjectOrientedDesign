public class FactoryTest {
  public static void main(String[] args) {
    Animal animal = AnimalFactory.newInstance("Cat");
    animal.eat();
  }
}
