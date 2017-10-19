public class NutritionFacts {
  private final int servingSize;
  private final int servings;
  private final int calories;
  private final int fat;
  private final int sodium;
  private final int carbohydrates;

  public static class Builder {
    // required fields
    private int servingSize;
    private int servings;

    // optional fields
    private int calories=0;
    private int fat=0;
    private int sodium=0;
    private int carbohydrates=0;

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

    public NutritionFacts build() {
      return new NutritionFacts(this);
    }
  }

  @Override
  public String toString() {
    return String.format(
      "serving size: " + servingSize +
      " servings: " + servings +
      " calories: " + calories +
      " fat: " + fat +
      " sodium: " + sodium +
      " carbohydrates: " + carbohydrates
    );
  }

  private NutritionFacts(Builder builder){
    servingSize = builder.servingSize;
    servings = builder.servings;
    calories = builder.calories;
    fat = builder.fat;
    sodium = builder.sodium;
    carbohydrates = builder.carbohydrates;
  }
}
