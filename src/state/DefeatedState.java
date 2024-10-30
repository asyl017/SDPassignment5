package state;

public class DefeatedState extends State {
    @Override
    public void attack() {
        System.out.println("YOU ARE DEFEATED");
    }

    @Override
    public void defend() {
        System.out.println("YOU ARE DEFEATED");
    }

    public String toString() {
        return "Defeated State";
    }
}
