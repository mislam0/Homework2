public class SourdoughBread extends Bread {
    private String sourdoughStarter;

    public SourdoughBread() {
        super("5 cups", "1.5 cups", "2.5 tsps", "0 tbsp", "0 tsp", "1 tsp", "Sourdough Bread", "not baked", "");
        this.sourdoughStarter = "1 cup";
        setRecipe();
    }

    public SourdoughBread(String flour, String water, String salt, String yeast, String sourdoughStarter) {
        super(flour, water, salt, "0 tbsp", "0 tsp", yeast, "Sourdough Bread", "not baked", "");
        this.sourdoughStarter = sourdoughStarter;
        setRecipe();
    }

    // Getters and setters
    public String getSourdoughStarter() {
        return sourdoughStarter;
    }

    public void setSourdoughStarter(String sourdoughStarter) {
        this.sourdoughStarter = sourdoughStarter;
    }

    private void setRecipe() {
        this.recipe = "1. Mix flour, water, salt, yeast, and ripe sourdough starter.\n" +
                "2. Make the dough\n" +
                "3. Bulk Rise\n" +
                "4. Stretch and fold the dough\n" +
                "5. Cut and shape the dough\n" +
                "6. Second rise\n" +
                "7. Preheat the oven to 450°F towards the tail end of the second rise.\n" +
                "8. Spray the loaf with luke warm water.\n" +
                "9. Bake the bread at 400°F for 20 minutes, until deep golden brown.\n" +
                "10. Remove the bread from the oven.\n" +
                "11. Let the bread cool until good to eat.";
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "\n" + sourdoughStarter + " of sourdough starter";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}