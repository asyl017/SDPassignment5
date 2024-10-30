package template;

import state.CharacterState;

public class HealAction extends GameAction{

    @Override
    protected void performAction(CharacterState characterState) {
        System.out.println("Healing...");
    }
}
