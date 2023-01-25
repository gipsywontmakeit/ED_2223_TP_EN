package game_settings;

public class GameSettingsConnector extends GameSettings {
    
    private int cooldown;

    public GameSettingsConnector(int energy, int cooldown) {
        super(energy);
        this.cooldown = cooldown;
    }

    public int getCooldown() {
        return cooldown;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }
}