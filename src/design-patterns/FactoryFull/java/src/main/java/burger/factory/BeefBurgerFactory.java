package burger.factory;

import burger.BeefBurger;
import burger.Burger;

public class BeefBurgerFactory implements BurgerFactory {

    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }

    @Override
    public String getBurgerType() {
        return "Beef Burger";
    }
}
