package interfaces;

public interface IConnector extends ILocal {
    public IGameSettingsConnector getGameSettingsConnector();

    public void setGameSettingsConnector(IGameSettingsConnector gameSettingsConnector);

}
