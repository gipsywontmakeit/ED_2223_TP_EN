package interfaces;

public interface Portal extends Local {

    public String getName();

    public void setName(String name);
    public IGameSettingsPortal getGameSettingsPortal();

    public void setGameSettingsPortal(IGameSettingsPortal gameSettingsPortal);

}
