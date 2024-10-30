package state;

import strategy.FightingStrategy;
import strategy.MeleeStrategy;

public class CharacterState {
    public State state;
    public FightingStrategy strategy;

    public CharacterState() {
        this.state = new NormalState();
        this.strategy = new MeleeStrategy();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setStrategy(FightingStrategy strategy) {
        this.strategy = strategy;
    }

    public void attack() {
        if (strategy != null) {
            strategy.fight();
        } else {
            System.out.println("No fighting strategy set.");
        }
    }

    public void defend() {
        if (state != null) {
            state.defend();
        } else {
            System.out.println("No state set for defense.");
        }
    }
}
