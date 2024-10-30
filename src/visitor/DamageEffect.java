package visitor;

import state.CharacterState;

public  class DamageEffect implements Effect {
    @Override
    public void applyBoost(CharacterState characterState) {

    }

    @Override
    public void applyDamage(CharacterState characterState) {
        System.out.println(characterState.getState() + " getting Damage !!!");
    }
}
