package players;

import interfaces.Player;
import lists.ArrayOrderedList;

import java.time.LocalDateTime;

public class InteractionRecord {

    private Player player;
    private LocalDateTime time;

    public InteractionRecord(Player player, LocalDateTime time) {
        this.player = player;
        this.time = time;
    }

    public Player getPlayer() {
        return player;
    }

    public LocalDateTime getTime() {
        return time;
    }
}


