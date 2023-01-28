package game_settings;

import interfaces.Ownership;
import players.Players;

public class Ownerships implements Ownership {
    private Players owner;

    public Ownerships(Players owner) {
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
