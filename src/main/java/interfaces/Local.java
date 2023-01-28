package interfaces;

import locals.Coordinates;

public interface Local {
    int getId();

    void setId(int id);

    Coordinates getCoordinates();

    void setCoordinates(Coordinates coordinates);

}
