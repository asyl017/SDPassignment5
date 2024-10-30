package template;


import state.CharacterState;

public class AttackAction extends GameAction {

    @Override
    protected void performAction(CharacterState characterState) {
        System.out.println("Attacking!");
    }
}

