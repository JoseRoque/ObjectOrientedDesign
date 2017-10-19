public class AnimalFactory {
  public static Animal getInstance(String animalType) {
    switch(animalType) {
      case "Dog": return new Dog();
      case "Cat": return new Cat();
      default: return null;
    }
  }
}
