package FactoryImpl;

public class DrinkFactory {

    public Drink chooseYourBeverage(String typeOfBeverage) {
        if (typeOfBeverage.equalsIgnoreCase("Orange Juice")) {
            return new OrangeJuice();
        } else if (typeOfBeverage.equalsIgnoreCase("Tea")) {
            return new Tea();
        } else { return new Water(); }
    }
}
