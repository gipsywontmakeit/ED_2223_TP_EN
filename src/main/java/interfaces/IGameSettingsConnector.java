package interfaces;

public interface IGameSettingsConnector extends IGameSettings {
    public int getCooldown();
    public void setCooldown(int cooldown);
}
