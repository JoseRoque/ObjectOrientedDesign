public class BuilderTest {
  public static void main(String[] args) {
    NutritionFacts.Builder b = new NutritionFacts.Builder(1,4);
    b.withFat(10);
    b.withCalories(200);
    NutritionFacts nutritionFacts = b.build();
  }
}
