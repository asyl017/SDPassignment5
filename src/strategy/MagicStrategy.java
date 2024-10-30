package strategy;

public class MagicStrategy implements FightingStrategy{
    @Override
    public void fight() {
        System.out.println("Using dark magic ...");
    }
}
