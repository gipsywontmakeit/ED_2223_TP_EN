package locals;

import interfaces.IGameSettingsPortal;
import players.Players;

public class GameSettingsPortal implements IGameSettingsPortal {
    private Players players;
    private int energy;
    private int maxEnergy;


    public GameSettingsPortal(int energy, int maxEnergy, Players players) {
        this.energy = energy;
        this.maxEnergy = maxEnergy;
        this.players = players;

    }

    @Override
    public int getEnergy() {
        return this.energy;
    }

    @Override
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    @Override
    public int getMaxEnergy() {
        return this.maxEnergy;
    }

    @Override
    public void setMaxEnergy(int maxEnergy) {this.maxEnergy = maxEnergy;}


        @Override
        public Players getOwner() {
            return this.players;
        }

        @Override
        public void setOwner(Players owner){
            this.players = players;
        }

}
