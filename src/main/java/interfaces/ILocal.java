package interfaces;

import locals.Coordinates;

public interface ILocal {
    int getId();

    void setId(int id);

    Coordinates getCoordinates();

    void setCoordinates(Coordinates coordinates);

}
