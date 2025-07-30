import burger.Burger;
import burger.factory.BeefBurgerFactory;
import burger.factory.FishBurgerFactory;
import burger.factory.VeggieBurgerFactory;

public class Main {
    public static void main(String[] args) {
        BeefBurgerFactory beefBurgerFactory = new BeefBurgerFactory();
        Burger beefBurger = beefBurgerFactory.createBurger();
        beefBurger.tasteBurger();

        VeggieBurgerFactory veggieBurgerFactory = new VeggieBurgerFactory();
        Burger veggieBurger = veggieBurgerFactory.createBurger();
        veggieBurger.tasteBurger();

        FishBurgerFactory fishBurgerFactory = new FishBurgerFactory();
        Burger fishBurger = fishBurgerFactory.createBurger();
        fishBurger.tasteBurger();
    }
}
