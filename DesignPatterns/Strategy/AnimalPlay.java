public class AnimalPlay{
	// When to use strategy pattern:
	// https://www.youtube.com/watch?v=-NCgRD9-C6o&list=PLF206E906175C7E07&index=3 10:48

	public static void main(String[] args){

		Animal sparky = new Dog();
		Animal tweety = new Bird();

		System.out.println("Dog: " + sparky.tryToFly());

		System.out.println("Bird: " + tweety.tryToFly());

		// This allows dynamic changes for flyingType

		sparky.setFlyingAbility(new ItFlys());

		System.out.println("Dog: " + sparky.tryToFly());

	}

}
