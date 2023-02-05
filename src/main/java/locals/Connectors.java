package locals;

import enums.LocalType;
import game_settings.GameSettingsConnector;
import interfaces.Connector;
import interfaces.IGameSettingsConnector;
import lists.ArrayOrderedList;
import players.InteractionRecord;
import players.Players;

import java.time.LocalDateTime;

public class Connectors extends Locals implements Connector {

    private IGameSettingsConnector gameSettingsConnector;
    private ArrayOrderedList<InteractionRecord> interactionRecords;

    private Connector lastInteraction;

    /**
     * constructor of the class
     *
     * @param id          id of the local
     * @param type        type of the local
     * @param coordinates coordinates of the local
     */
    public Connectors(int id, LocalType type, Coordinates coordinates, IGameSettingsConnector gameSettingsConnector) {
        super(id, type, coordinates);
        this.gameSettingsConnector = new GameSettingsConnector(0,0);
        this.interactionRecords = new ArrayOrderedList<>();
    }

    @Override
    public IGameSettingsConnector getGameSettingsConnector() {
        return this.gameSettingsConnector;
    }

    @Override
    public void setGameSettingsConnector(IGameSettingsConnector gameSettingsConnector) {
        this.gameSettingsConnector = gameSettingsConnector;
    }

    public void addInteractionRecord(Players player) {
        this.interactionRecords.add(new InteractionRecord(player, LocalDateTime.now()));
    }

    public ArrayOrderedList<InteractionRecord> getInteractionRecords() {
        return this.interactionRecords;
    }

    public void removeInteractionRecord(InteractionRecord interactionRecord) {
        this.interactionRecords.remove(interactionRecord);
    }

    public InteractionRecord getLastInteraction(Players player) {
       InteractionRecord lastInteraction = null;
        for (InteractionRecord interaction : this.interactionRecords) {
            if (interaction.getPlayer().equals(player)) {
                lastInteraction = interaction;
            }
        }
        return lastInteraction;
    }

}




