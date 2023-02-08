package interfaces;

public interface IPortal extends ILocal {

    public String getName();

    public void setName(String name);
    public IGameSettingsPortal getGameSettingsPortal();

    public void setGameSettingsPortal(IGameSettingsPortal gameSettingsPortal);

}
