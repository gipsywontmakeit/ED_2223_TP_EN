package interfaces;

public interface IGameSettingsPortal extends IGameSettings, Ownership {
    public int getMaxEnergy();

    void setMaxEnergy(int maxEnergy);
}
