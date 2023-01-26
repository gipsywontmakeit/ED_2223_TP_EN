package interfaces;

public interface IGameSettingsPortal extends IGameSettings, IOwnership {
    public int getMaxEnergy();
    public void setMaxEnergy(int maxEnergy);

}
