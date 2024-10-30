package state;

public class PoweredUpState extends State {

    @Override
    public void attack() {
        System.out.println("Attacking with 75 soldiers!!!");
    }

    @Override
    public void defend() {
        System.out.println("Defending with 125 soldiers");
    }

    public String toString() {
        return "Powered State";
    }
}
