package game_settings;

public class GameSettingsPortal extends GameSettings {
    
    private int maxEnergy;

    public GameSettingsPortal(int energy, int maxEnergy) {
        super(energy);
        this.maxEnergy = maxEnergy;
    }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public void setMaxEnergy(int maxEnergy) {
        this.maxEnergy = maxEnergy;
    }
}
