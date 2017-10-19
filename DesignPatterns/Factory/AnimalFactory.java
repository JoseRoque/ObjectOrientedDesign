public class AnimalFactory {
  public static Animal newInstance(String animalType) {
    switch(animalType) {
      case "Dog": return new Dog();
      case "Cat": return new Cat();
      default: return null;
    }
  }
}
