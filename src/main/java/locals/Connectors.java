package locals;

import enums.LocalType;
import game_settings.GameSettings;
import game_settings.GameSettingsConnector;
import graphs.Graph;
import interfaces.IConnectors;
import interfaces.IGameSettingsConnector;
import interfaces.ILocals;
import lists.ArrayUnorderedList;
import lists.LinkedList;

public class Connectors extends Locals implements IConnectors {

    private IGameSettingsConnector gameSettingsConnector;

    /**
     * constructor of the class
     *
     * @param id          id of the local
     * @param type        type of the local
     * @param coordinates coordinates of the local
     */
    public Connectors(int id, LocalType type, Coordinates coordinates) {
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
