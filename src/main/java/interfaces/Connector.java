package interfaces;

public interface Connector extends Local {
    public IGameSettingsConnector getGameSettingsConnector();

    public void setGameSettingsConnector(IGameSettingsConnector gameSettingsConnector);

}
