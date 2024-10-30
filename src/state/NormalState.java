package state;

public class NormalState extends State {

    @Override
    public void attack() {
        System.out.println("Attacking with 50 soldiers !!!");
    }

    @Override
    public void defend() {
        System.out.println("Defending with 100 soldiers!!! ");
    }

    public String toString() {
        return "Normal State";
    }
}

