package interfaces;

import enums.Teams;

public interface Player {
    public String getName();
    public void setName(String name);
    public Teams getTeam();
    public void setTeam(Teams team);
    public int getLevel();
    public void setLevel(int level);
    public int getExperiencePoints();
    public void setExperiencePoints(int experiencePoints);
    public int getCurrentEnergy();
    public void setCurrentEnergy(int currentEnergy);
}