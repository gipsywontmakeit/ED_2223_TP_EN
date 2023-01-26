package locals;

import enums.LocalType;
import game_settings.GameSettings;

public abstract class  Locals extends GameSettings {
    /**
     * id of the local
     */
    private int id;

    /**
     * type of the local
     */
    private LocalType type;

    /**
     * name of the local
     */
    private String name;

    /**
     * coordinates of the local
     */
    private Coordinates coordinates;

    private GameSettings gameSettings;

    /**
     * constructor of the class
     * @param id id of the local
     * @param type type of the local
     * @param name name of the local
     * @param coordinates coordinates of the local
     */
    public Locals(int id, LocalType type, String name, Coordinates coordinates, GameSettings gameSettings) {
        super(0);
        this.id = id;
        this.type = type;
        this.name = name;
        this.coordinates = coordinates;
        this.gameSettings = gameSettings;
    }


    /**
     * method to get the id from the local
     * @return the id from the local
     */
    public int getId() {
        return id;
    }

    /**
     * method to set the id for the local
     * @param id to set to the local
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * method to get the type for the local
     * @return type of the local
     */
    public LocalType getType() {
        return type;
    }

    /**
     * method to set the type of the local
     * @param type set the type of the local
     */
    public void setType(LocalType type) {
        this.type = type;
    }

    /**
     * method to get the name of the local
     * @return the name of the local
     */
    public String getName() {
        return name;
    }

    /**
     * method that sets the name of the local
     * @param name set the name of the local
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * method that gets the coordinates from the local
     * @return the local's coordinates
     */
    public Coordinates getCoordinates() {
        return coordinates;
    }

    /**
     * method that sets the coordinates from a local
     * @param coordinates sets the local's coordinates
     */
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
}
