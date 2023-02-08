package locals;

import enums.LocalType;
import interfaces.IGameSettingsPortal;
import interfaces.IPortal;

public class Portals extends Locals implements IPortal {

    private String name;

    private IGameSettingsPortal gameSettingsPortal;

    /**
     * constructor of the class
     *
     * @param id          id of the local
     * @param type        type of the local
     * @param coordinates coordinates of the local
     */
    public Portals(int id, LocalType type, Coordinates coordinates, String name, IGameSettingsPortal gameSettingsPortal) {
        super(id, type, coordinates);
        this.name = name;
        this.gameSettingsPortal = gameSettingsPortal;
    }


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public IGameSettingsPortal getGameSettingsPortal() {
        return this.gameSettingsPortal;
    }

    @Override
    public void setGameSettingsPortal(IGameSettingsPortal gameSettingsPortal) {
        this.gameSettingsPortal = gameSettingsPortal;
    }

    @Override
    public String toString() {
        return "Portals{" +
                "name='" + name + '\'' +
                ", gameSettingsPortal=" + gameSettingsPortal +
                '}';
    }
}

