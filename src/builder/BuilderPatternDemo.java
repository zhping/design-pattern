package builder;

/**
 * Created by Administrator on 2017/9/30.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();

        System.out.println("\nVegMeal:");
        vegMeal.showItems();
        System.out.println("Total Cost: "+vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();

        System.out.println("\nNonVegMeal:");
        nonVegMeal.showItems();
        System.out.println("Total Cost: "+nonVegMeal.getCost());

    }
}
