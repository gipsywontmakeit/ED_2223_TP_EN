package locals;

import enums.LocalType;
import exceptions.CooldownTimeException;
import game_settings.GameSettingsConnector;
import interfaces.IConnector;
import interfaces.IGameSettingsConnector;
import lists.ArrayOrderedList;
import lists.ArrayUnorderedList;
import players.InteractionRecord;
import players.Players;

import java.time.Duration;
import java.time.LocalDateTime;

public class Connectors extends Locals implements IConnector {

    private IGameSettingsConnector gameSettingsConnector;
    private ArrayUnorderedList<InteractionRecord> interactionRecords;

    private IConnector lastInteraction;

    /**
     * constructor of the classs
     *
     * @param id          id of the local
     * @param type        type of the local
     * @param coordinates coordinates of the local
     */
    public Connectors(int id, LocalType type, Coordinates coordinates, IGameSettingsConnector gameSettingsConnector) {
        super(id, type, coordinates);
        this.gameSettingsConnector = new GameSettingsConnector(0,0);
        this.interactionRecords = new ArrayUnorderedList<>();
    }

    @Override
    public IGameSettingsConnector getGameSettingsConnector() {
        return this.gameSettingsConnector;
    }

    @Override
    public void setGameSettingsConnector(IGameSettingsConnector gameSettingsConnector) {
        this.gameSettingsConnector = gameSettingsConnector;
    }

    public void addInteraction(Players player) throws CooldownTimeException {
        for (InteractionRecord interaction : this.interactionRecords) {
            if (interaction.getPlayer().equals(player)) {
                Duration duration = Duration.between(interaction.getTime(), LocalDateTime.now());
                if(duration.toMillis() < this.gameSettingsConnector.getCooldown()) {
                    throw new CooldownTimeException("You have to wait " + (this.gameSettingsConnector.getCooldown() - duration.toMillis()) + " milliseconds to interact again with this connector");
                }
                interactionRecords.remove(interaction);
                break;
            }
        }
        interactionRecords.addToRear(new InteractionRecord(player, LocalDateTime.now()));
    }

    @Override
    public String toString() {
        return "Connectors{" +
                "gameSettingsConnector=" + gameSettingsConnector +
                '}';
    }
}




