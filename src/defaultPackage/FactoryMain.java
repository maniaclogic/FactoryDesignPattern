package defaultPackage;

import FactoryImpl.Drink;
import FactoryImpl.DrinkFactory;

public class FactoryMain {

    public static void main(String[] args) {
        DrinkFactory drinkGenerator = new DrinkFactory();

        Drink customer1Drink = drinkGenerator.chooseYourBeverage("Orange Juice");
        Drink customer2Drink = drinkGenerator.chooseYourBeverage("Tea");
        Drink customer3Drink = drinkGenerator.chooseYourBeverage("Whatever I don't care");

        customer1Drink.order();
        customer2Drink.order();
        customer3Drink.order();

    }

}
