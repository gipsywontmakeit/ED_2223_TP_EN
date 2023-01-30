package locals;

import enums.LocalType;
import game_settings.GameSettingsConnector;
import interfaces.Connector;
import interfaces.IGameSettingsConnector;

public class Connectors extends Locals implements Connector {

    private IGameSettingsConnector gameSettingsConnector;

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
    }

    @Override
    public IGameSettingsConnector getGameSettingsConnector() {
        return this.gameSettingsConnector;
    }

    @Override
    public void setGameSettingsConnector(IGameSettingsConnector gameSettingsConnector) {
        this.gameSettingsConnector = gameSettingsConnector;
    }
}
