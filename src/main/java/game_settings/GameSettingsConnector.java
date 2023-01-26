package game_settings;

import interfaces.IGameSettingsConnector;

public class GameSettingsConnector extends GameSettings implements IGameSettingsConnector {

    private int cooldown;

    public GameSettingsConnector(int energy, int cooldown) {
        super(energy);
        this.cooldown = cooldown;
    }

    @Override
    public int getCooldown() {
        return this.cooldown;
    }

    @Override
    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }
}


