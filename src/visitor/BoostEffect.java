package visitor;

import state.CharacterState;


public  class BoostEffect implements Effect {
    @Override
    public void applyBoost(CharacterState characterState) {
        System.out.println(characterState.getState() + " gets power boosting !!!");
    }

    @Override
    public void applyDamage(CharacterState characterState) {

    }

}
