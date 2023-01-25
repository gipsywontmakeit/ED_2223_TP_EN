package game_settings;

import interfaces.IOwnership;
import players.Players;

public class Ownership implements IOwnership {
    private Players owner;

    public Ownership(Players owner) {
        this.owner = owner;
    }

    @Override
    public Players getOwner() {
        return owner;
    }

    @Override
    public void setOwner(Players owner) {
        this.owner = owner;
    }

}
