public class Main {
    public static void main(String[] args) {
        // Create instances of all the yummy breads we will make
        Bread genericBread = new Bread();
        SourdoughBread sourdoughBread = new SourdoughBread();
        Pastry pastry = new Pastry();
        BananaBread bananaBread = new BananaBread();
        Baguette baguette = new Baguette();
        Bagel bagel = new Bagel();

        // Test each breads
        testBread("Generic Bread", genericBread);
        testBread("Sourdough Bread", sourdoughBread);
        testBread("Pastry", pastry);
        testBread("Banana Bread", bananaBread);
        testBread("Baguette", baguette);
        testBread("Bagel", bagel);
    }

    private static void testBread(String breadType, Bread bread) {
        System.out.println(breadType + " class testing\n");
        System.out.println(bread.getIngredients());
        System.out.println("\nA recipe of " + breadType + ":");
        System.out.println(bread.getRecipe());
        System.out.println("\nBaking process:");
        System.out.println("Initial state: " + bread);
        bread.bake();
        System.out.println("After first bake: " + bread);
        bread.bake(); // Try to bake again sicne it's not baked yet
        System.out.println("After second bake attempt: " + bread);
    }
}