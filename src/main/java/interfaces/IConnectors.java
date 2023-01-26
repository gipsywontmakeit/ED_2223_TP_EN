package interfaces;

import graphs.Graph;
import lists.LinkedList;
import locals.Coordinates;

public interface IConnectors extends ILocals {
    public IGameSettingsConnector getGameSettingsConnector();

    public void setGameSettingsConnector(IGameSettingsConnector gameSettingsConnector);

}
