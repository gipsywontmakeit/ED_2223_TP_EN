package game_settings;

import interfaces.IGameSettingsPortal;
import interfaces.Ownership;
import players.Players;

public class GameSettingsPortal extends GameSettings implements IGameSettingsPortal {

        private int maxEnergy;
        private Players ownership;

        public GameSettingsPortal(int energy, int maxEnergy, Players ownership) {
            super(energy);
            this.maxEnergy = maxEnergy;
            this.ownership = ownership;
        }

        @Override
        public int getMaxEnergy() {
            return maxEnergy;
        }

        @Override
        public void setMaxEnergy(int maxEnergy) {
            this.maxEnergy = maxEnergy;
        }

        @Override
        public Players getOwner() {
            return this.ownership;
        }
        @Override
        public void setOwner(Players owner) {
          this.ownership = owner;
        }
}
