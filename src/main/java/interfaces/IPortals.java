package interfaces;

public interface IPortals extends ILocals {

    public String getName();

    public void setName(String name);
    public IGameSettingsPortal getGameSettingsPortal();

    public void setGameSettingsPortal(IGameSettingsPortal gameSettingsPortal);

}
