public class NutritionFacts {
  private final int servingSize;
  private final int servings;
  private final int calories;
  private final int fat;
  private final int sodium;
  private final int carbohydrates;

  public static class Builder {
    // required fields
    private final int servingSize;
    private final int servings;

    // optional fields
    private final int calories=0;
    private final int fat=0;
    private final int sodium=0;
    private final int carbohydrates=0;

    public Builder(int servingSize, int servings) {
      this.servingSize= servingSize;
      this.servings= servings;
    }

    public Builder withCalories(int calories) {
      this.calories= calories;
      return this;
    }

    public Builder withFat(int fat) {
      this.fat= fat;
      return this;
    }
    public Builder withSodium(int sodium) {
      this.sodium= sodium;
      return this;
    }

    public Builder withCarbohydrates(int carbohydrates) {
      this.carbohydrates= carbohydrates;
      return this;
    }

    public void build() {
      return new NutritionFacts(this);
    }
  }

  private NutritionFacts(Builder builder){
    this.servingSize = builder.servingSize;
    this.servings = builder.servings;
    this.calories = builder.calories;
    this.fat = builder.fat;
    this.sodium = builder.sodium;
    this.carbohydrates = builder.carbohydrates;
  }
}
