public class Baguette extends Bread {
    private String oliveoil;

    public Baguette() {
        super("4 cups", "1.5 cups", "2 tsp", "1 tsp", "0 tsp", "2 tsp", "Baguette", "not baked", "");
        this.oliveoil = "1 tbsp";
        setRecipe();
    }

    public Baguette(String flour, String water, String salt, String sugar, String yeast, String oliveoil) {
        super(flour, water, salt, sugar, "0 tsp", yeast, "Baguette", "not baked", "");
        this.oliveoil = oliveoil;
        setRecipe();
    }

    // Getters and setters
    public String getOliveoil() {
        return oliveoil;
    }

    public void setOliveoil(String oliveoil) {
        this.oliveoil = oliveoil;
    }

    private void setRecipe() {
        this.recipe = "1. Mix flour, salt, sugar, and yeast in a large bowl.\n" +
                "2. Add water and olive oil, mix until a shaggy dough forms.\n" +
                "3. Knead the dough for about 10 minutes until smooth and elastic.\n" +
                "4. Let the dough rise in a covered bowl for 1-2 hours.\n" +
                "5. Shape the dough into long, thin loaves.\n" +
                "6. Let the shaped loaves rise for another 30-45 minutes.\n" +
                "7. Preheat the oven to 450°F (230°C).\n" +
                "8. Score the loaves diagonally with a sharp knife.\n" +
                "9. Bake for 20-25 minutes, spraying with water a few times during baking.\n" +
                "10. Cool on a wire rack before slicing.";
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "\n" + oliveoil + " of olive oil";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}