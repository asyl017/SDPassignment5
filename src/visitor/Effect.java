package visitor;

import state.CharacterState;

public interface Effect {
    void applyBoost(CharacterState characterState);

    void applyDamage(CharacterState characterState);

}
