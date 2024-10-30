
import state.CharacterState;
import strategy.MagicStrategy;
import strategy.RangedStrategy;
import template.GameAction;
import template.HealAction;
import visitor.BoostEffect;
import visitor.Effect;

public class Main {
    public static void main(String[] args) {


        CharacterState army1 = new CharacterState();
        CharacterState army2 = new CharacterState();
        GameAction heal = new HealAction();

        System.out.println("Army 1 attacks:");
        army1.attack();

        army1.setStrategy(new RangedStrategy());
        System.out.println("Army 1 changes strategy to ranged:");
        army1.attack();


        army2.setStrategy(new MagicStrategy());
        System.out.println("Army 2 attacks:");
        army2.attack();

        System.out.println("Army 1 defends:");

        army1.defend();

        System.out.println("Army 1 is healing:");
        heal.executeAction(army1);


        Effect boost = new BoostEffect();

        System.out.println("Army1 gets boosted");
        boost.applyBoost(army1);


    }
}