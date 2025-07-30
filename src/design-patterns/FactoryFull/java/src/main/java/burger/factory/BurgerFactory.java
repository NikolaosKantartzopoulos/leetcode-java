package burger.factory;

import burger.BeefBurger;
import burger.Burger;
import burger.VeggieBurger;

public interface BurgerFactory {

    Burger createBurger();

    String getBurgerType();

    // static Burger createBurger(String type) {
    //     return switch (type) {
    //         case "beef" -> new BeefBurger();
    //         case "veggie" -> new VeggieBurger();
    //         default -> throw new IllegalArgumentException("Unknown burger type: " + type);
    //     };
    // }
}
