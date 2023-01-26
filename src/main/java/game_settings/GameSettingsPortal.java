package game_settings;

import interfaces.IGameSettingsPortal;

public class GameSettingsPortal extends GameSettings implements IGameSettingsPortal {

        private int maxEnergy;

        public GameSettingsPortal(int energy, int maxEnergy) {
            super(energy);
            this.maxEnergy = maxEnergy;
        }

        @Override
        public int getMaxEnergy() {
            return maxEnergy;
        }

        @Override
        public void setMaxEnergy(int maxEnergy) {
            this.maxEnergy = maxEnergy;
        }
}
