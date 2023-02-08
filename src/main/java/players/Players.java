package players;

import enums.Teams;
import game_settings.GameSettingsPortal;
import interfaces.IPlayer;

import java.util.List;

public class Players implements IPlayer,Comparable<IPlayer> {
    private String name;
    private Teams team;
    private int level,experiencePoints,currentEnergy;

    private List<GameSettingsPortal> ownershipList;

    public Players(String name, Teams team) {
        this.name = name;
        this.team = team;
        this.level = 1;
        this.experiencePoints = 0;
        this.currentEnergy = 100;
    }

    public Players(String name, Teams team, int level) {
        this.name = name;
        this.team = team;
        this.level = level;
        this.experiencePoints = 0;
        this.currentEnergy = 100;
    }

    public Players(String name, Teams team, int level, int experiencePoints, int currentEnergy) {
        this.name = name;
        this.team = team;
        this.level = level;
        this.experiencePoints = experiencePoints;
        this.currentEnergy = currentEnergy;
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
    public int getExperiencePoints() {
        return experiencePoints;
    }


    /**
     * Defines the experience points from the player
     * @param experiencePoints
     */
    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
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
                ", experiencePoints=" + experiencePoints +
                ", currentEnergy=" + currentEnergy +
                '}';
    }


    @Override
    public int compareTo(IPlayer player) {
            return Integer.compare(this.level, player.getLevel());
        }

}

