package locals;

import enums.LocalType;
import game_settings.GameSettings;

public class Portals extends Locals {
    /**
     * constructor of the class
     *
     * @param id           id of the local
     * @param type         type of the local
     * @param name         name of the local
     * @param coordinates  coordinates of the local
     * @param gameSettings
     */
    public Portals(int id, LocalType type, String name, Coordinates coordinates, GameSettings gameSettings) {
        super(id, type, name, coordinates, gameSettings);
    }

}

