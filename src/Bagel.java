public class Bagel extends Bread {
    private String malt;
    private String toppings;

    public Bagel() {
        super("4 cups", "1.25 cups", "1 tbsp", "2 tbsp", "0 tsp", "1 tbsp", "Bagel", "not baked", "");
        this.malt = "1 tbsp";
        this.toppings = "sesame seeds";
        setRecipe();
    }

    public Bagel(String flour, String water, String salt, String sugar, String yeast, String malt, String toppings) {
        super(flour, water, salt, sugar, "0 tsp", yeast, "Bagel", "not baked", "");
        this.malt = malt;
        this.toppings = toppings;
        setRecipe();
    }

    // Getters and setters
    public String getMalt() {
        return malt;
    }

    public void setMalt(String malt) {
        this.malt = malt;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    private void setRecipe() {
        this.recipe = "1. Mix flour, salt, sugar, yeast, and malt in a large bowl.\n" +
                "2. Add water and mix until a stiff dough forms.\n" +
                "3. Knead the dough for about 10 minutes until smooth and elastic.\n" +
                "4. Let the dough rise in a covered bowl for 1 hour.\n" +
                "5. Divide the dough into equal portions and shape into bagels.\n" +
                "6. Let the shaped bagels rest for 30 minutes.\n" +
                "7. Boil the bagels in water for 1-2 minutes per side.\n" +
                "8. Add toppings if desired.\n" +
                "9. Bake at 425°F (220°C) for about 20-25 minutes until golden brown.\n" +
                "10. Cool on a wire rack before serving.";
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "\n" + malt + " of malt\n" + toppings + " for topping";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}