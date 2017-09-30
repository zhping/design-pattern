package builder;

import builder.burger.ChichenBurger;
import builder.burger.VegBurger;
import builder.colddrink.Coke;
import builder.colddrink.Pepsi;

/**
 * Created by Administrator on 2017/9/30.
 */
public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChichenBurger());
        meal.addItem(new Pepsi());
        return meal;

    }
}
