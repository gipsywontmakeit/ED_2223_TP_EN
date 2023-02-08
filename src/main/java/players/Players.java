package players;

import enums.Teams;

import interfaces.IConnector;
import interfaces.ILocal;
import interfaces.IPortal;
import lists.ArrayUnorderedList;

import interfaces.IPlayer;


public class Players implements IPlayer,Comparable<IPlayer> {
    private String name;
    private Teams team;
    private int level,experiencePoints,currentEnergy;
    public ILocal currentLocal;

    private ArrayUnorderedList<IPortal> ownershipList;

    public Players(){
        this.name = null;
        this.team = null;
        this.level = 1;
        this.experiencePoints = 0;
        this.currentEnergy = 100;
        this.ownershipList = new ArrayUnorderedList<IPortal>();
        this.currentLocal = null;
    }

    public Players(String name, Teams team, ILocal currentLocal) {
        this.name = name;
        this.team = team;
        this.level = 1;
        this.experiencePoints = 0;
        this.currentEnergy = 100;
        this.ownershipList = new ArrayUnorderedList<IPortal>();
        this.currentLocal = currentLocal;
    }

    public Players(String name, Teams team, int level) {
        this.name = name;
        this.team = team;
        this.level = level;
        this.experiencePoints = 0;
        this.currentEnergy = 100;
        this.ownershipList = new ArrayUnorderedList<IPortal>();
    }

    public Players(String name, Teams team) {
        this.name = name;
        this.team = team;
        this.level = 1;
        this.experiencePoints = 0;
        this.currentEnergy = 100;
        this.ownershipList = new ArrayUnorderedList<IPortal>();
    }

    public Players(String name, Teams team, int level, int experiencePoints, int currentEnergy, ILocal currentLocal) {
        this.name = name;
        this.team = team;
        this.level = level;
        this.experiencePoints = experiencePoints;
        this.currentEnergy = currentEnergy;
        this.ownershipList = new ArrayUnorderedList<IPortal>();
        this.currentLocal = null;
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

    public ILocal getCurrentLocal() {
        return currentLocal;
    }

    public void setCurrentLocal(ILocal currentLocal) {
        this.currentLocal = currentLocal;
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

    public void gainExperience(int level, int energy) {
        double x = 0.2;
        double y = 1.2;
        int experience = (int) (Math.pow((level/x), y) * energy);
        this.experiencePoints += experience;
    }

    public void rechargeEnergy(IConnector connector) {
        int maxEnergy = this.getCurrentEnergy();
        int energyStoredInConnector = connector.getGameSettingsConnector().getEnergy();
        if(this.currentEnergy + energyStoredInConnector > maxEnergy) {
            this.currentEnergy = maxEnergy;
        } else {
            this.currentEnergy += energyStoredInConnector;
        }
    }

    public boolean conquerPortal(IPortal portal, int energy) {
        int playerEnergy = this.getCurrentEnergy();
        if (playerEnergy < energy) {
            System.out.println("Not enough energy to conquer the portal.");
            return false;
        } else if (portal.getGameSettingsPortal().getEnergy() < energy) {
            playerEnergy -= energy;
            portal.getGameSettingsPortal().setEnergy(energy);
            portal.getGameSettingsPortal().setOwner(this);
            ownershipList.addToRear(portal);
            System.out.println("You successfully conquered the portal!");
            return true;
        } else {
            System.out.println("Not enough energy to conquer the portal.");
            return false;
        }
    }

    public void move(ILocal current, ILocal newCurrent) {
        this.setCurrentLocal(newCurrent);
    }





}

