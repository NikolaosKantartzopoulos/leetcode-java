package burger.factory;

import burger.Burger;
import burger.VeggieBurger;

public class VeggieBurgerFactory implements BurgerFactory {

    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }

    @Override
    public String getBurgerType() {
        return "Veggie Burger";
    }
}
