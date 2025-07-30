package burger.factory;

import burger.Burger;
import burger.FishBurger;

public class FishBurgerFactory implements BurgerFactory {

    @Override
    public Burger createBurger() {
        return new FishBurger();
    }

    @Override
    public String getBurgerType() {
        return "Fish Burger";
    }
}
