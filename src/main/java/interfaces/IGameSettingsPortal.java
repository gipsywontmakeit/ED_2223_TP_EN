package interfaces;

public interface IGameSettingsPortal extends IGameSettings, Ownership {
    public int getMaxEnergy();
    public void setMaxEnergy(int maxEnergy);

}
