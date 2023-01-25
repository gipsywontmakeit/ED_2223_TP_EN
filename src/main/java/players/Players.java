package players;

import enums.Teams;
import game_settings.Ownership;

import java.util.List;

public class Players {
    private String name;
    private Teams team;
    private int level,expereciencePoints,currentEnergy;

    private List<Ownership> ownershipList;

    public Players(String name, Teams team) {
        this.name = name;
        this.team = team;
        this.level = 1;
        this.expereciencePoints = 0;
        this.currentEnergy = 100;
    }


    /**
     * Return the name of the player
     * @return name of the player
     */
    public String getName() {
        return name;
    }


    /**
     * Set the name of the player
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** Return the name of the team
     *
     * @return team
     */
    public Teams getTeam() {
        return team;
    }

    /** Defines the name of the team
     *
     * @param team
     */
    public void setTeam(Teams team) {
        this.team = team;
    }

    /** Return the level of the player
     *
     * @return level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Defines the level of the player
     * @param level
     */

    public void setLevel(int level) {
        this.level = level;
    }


    /**
     * Return the experience of the clients
     * @return
     */
    public int getExpereciencePoints() {
        return expereciencePoints;
    }


    /**
     * Defines the experience points from the player
     * @param expereciencePoints
     */
    public void setExpereciencePoints(int expereciencePoints) {
        this.expereciencePoints = expereciencePoints;
    }

    /**
     * Return the Energy from the player
     * @return
     */
    public int getCurrentEnergy() {
        return currentEnergy;
    }

    /**
     * Defines the Current energy of the player
     * @param currentEnergy
     */

    public void setCurrentEnergy(int currentEnergy) {
        this.currentEnergy = currentEnergy;
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", team=" + team +
                ", level=" + level +
                ", expereciencePoints=" + expereciencePoints +
                ", currentEnergy=" + currentEnergy +
                '}';
    }
}
