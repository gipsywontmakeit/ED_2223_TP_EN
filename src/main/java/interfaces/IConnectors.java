package interfaces;

public interface IConnectors extends Local {
    public IGameSettingsConnector getGameSettingsConnector();

    public void setGameSettingsConnector(IGameSettingsConnector gameSettingsConnector);

}
