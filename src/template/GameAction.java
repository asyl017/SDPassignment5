package template;

import state.CharacterState;

public abstract class GameAction {
    public final void executeAction(CharacterState character) {
        preAction();
        performAction(character);
        postAction();
    }

    private void preAction() {
        System.out.println("Preparing to execute action...");
    }


    protected abstract void performAction(CharacterState characterState);

    protected void postAction() {
        System.out.println("Action executed successfully.");
    }
}

