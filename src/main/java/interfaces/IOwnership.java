package interfaces;

import players.Players;

public interface IOwnership {
    public Players getOwner();
    public void setOwner(Players owner);
}
