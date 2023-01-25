package game_settings;

import players.Players;

public class Ownership {
    private Players owner;

    public Ownership(Players owner) {
        this.owner = owner;
    }

    public Players getOwner() {
        return owner;
    }

    public void setOwner(Players owner) {
        this.owner = owner;
    }

}
