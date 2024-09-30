public class Pastry extends Bread {
    private String butter;
    private String eggs;

    public Pastry() {
        super("2 cups", "1/4 cup", "1/4 tsp", "2 tbsp", "1 tsp", "0 tsp", "Pastry", "not baked", "");
        this.butter = "1/2 cup";
        this.eggs = "1";
        setRecipe();
    }

    public Pastry(String flour, String water, String salt, String sugar, String bakingPowder, String butter, String eggs) {
        super(flour, water, salt, sugar, bakingPowder, "0 tsp", "Pastry", "not baked", "");
        this.butter = butter;
        this.eggs = eggs;
        setRecipe();
    }

    // Getters and setters

    private void setRecipe() {
        this.recipe = "1. Mix flour, salt, and sugar in a bowl.\n" +
                "2. Cut cold butter into small pieces and mix with the dry ingredients.\n" +
                "3. Add cold water and egg, mix until dough forms.\n" +
                "4. Chill the dough for at least 1 hour.\n" +
                "5. Roll out the dough and shape as desired.\n" +
                "6. Bake at 375°F for 20-25 minutes or until golden brown.";
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "\n" + butter + " of butter\n" + eggs + " egg(s)";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}