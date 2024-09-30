public class Bread {
    protected String flour;
    protected String water;
    protected String salt;
    protected String sugar;
    protected String bakingPowder;
    protected String yeast;
    protected String breadName;
    protected String state;
    protected String recipe;

    // Default constructor
    public Bread() {
        this("2 cups", "1 cup", "1 tsp", "1 tbsp", "1 tsp", "1 tsp", "Generic Bread", "not baked", "Mix and bake");
    }

    // Constructor with all parameters
    public Bread(String flour, String water, String salt, String sugar, String bakingPowder, String yeast,
                 String breadName, String state, String recipe) {
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;
        this.breadName = breadName;
        this.state = state;
        this.recipe = recipe;
    }

    // Getters

    public void bake() {
        if (state.equals("not baked")) {
            state = "baked";
            System.out.println("The " + breadName + " is baked now.");
        } else {
            System.out.println("Can't bake, " + breadName + " is already baked.");
        }
    }

    public String getIngredients() {
        return "Ingredients of " + breadName + " are:\n" +
                flour + " of flour\n" +
                water + " of water\n" +
                salt + " of salt\n" +
                sugar + " of sugar\n" +
                bakingPowder + " of baking powder\n" +
                yeast + " of yeast";
    }

    public String getRecipe() {
        return recipe;
    }

    @Override
    public String toString() {
        return breadName + " - " + state;
    }
}