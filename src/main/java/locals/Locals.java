package locals;

import enums.LocalType;
import game_settings.GameSettings;
import interfaces.ILocals;

public abstract class Locals implements ILocals {

    private int id;
    private LocalType type;
    private Coordinates coordinates;

    /**
     * constructor of the class
     *
     * @param id           id of the local
     * @param type         type of the local
     * @param coordinates  coordinates of the local
     */
    public Locals(int id, LocalType type, Coordinates coordinates) {
        this.id = id;
        this.type = type;
        this.coordinates = coordinates;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public Coordinates getCoordinates() {
        return this.coordinates;
    }

    @Override
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

}
