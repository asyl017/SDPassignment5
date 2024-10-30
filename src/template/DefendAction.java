package template;

import state.CharacterState;

public class DefendAction extends GameAction {

    @Override
    protected void performAction(CharacterState characterState) {
        System.out.println("Defending!!!");
    }
}
