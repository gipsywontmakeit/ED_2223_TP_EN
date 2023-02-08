package players;

import interfaces.IPlayer;

import java.time.LocalDateTime;

public class InteractionRecord {

    private IPlayer player;
    private LocalDateTime time;

    public InteractionRecord(IPlayer player, LocalDateTime time) {
        this.player = player;
        this.time = time;
    }

    public IPlayer getPlayer() {
        return player;
    }

    public LocalDateTime getTime() {
        return time;
    }
}


