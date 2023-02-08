package interfaces;

public interface IGameSettingsPortal extends IGameSettings, IOwnership {
    public int getMaxEnergy();

    void setMaxEnergy(int maxEnergy);
}
