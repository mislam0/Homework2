public class BananaBread extends Bread {
    private String bananas;
    private String vanillaExtract;

    public BananaBread() {
        super("2 cups", "1/4 cup", "1/2 tsp", "3/4 cup", "1 tsp", "0 tsp", "Banana Bread", "not baked", "");
        this.bananas = "3 ripe";
        this.vanillaExtract = "1 tsp";
        setRecipe();
    }

    public BananaBread(String flour, String water, String salt, String sugar, String bakingPowder, String bananas, String vanillaExtract) {
        super(flour, water, salt, sugar, bakingPowder, "0 tsp", "Banana Bread", "not baked", "");
        this.bananas = bananas;
        this.vanillaExtract = vanillaExtract;
        setRecipe();
    }

    // Getters and setters

    private void setRecipe() {
        this.recipe = "1. Preheat oven to 350°F (175°C).\n" +
                "2. Mash bananas in a large bowl.\n" +
                "3. Mix in melted butter, sugar, egg, and vanilla extract.\n" +
                "4. Mix in baking soda and salt.\n" +
                "5. Stir in flour.\n" +
                "6. Pour batter into greased loaf pan.\n" +
                "7. Bake for 50-60 minutes.\n" +
                "8. Let cool before slicing.";
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "\n" + bananas + " bananas\n" + vanillaExtract + " of vanilla extract";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}