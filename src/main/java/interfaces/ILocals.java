package interfaces;

import game_settings.GameSettings;
import locals.Coordinates;

public interface ILocals {
    int getId();

    void setId(int id);

    Coordinates getCoordinates();

    void setCoordinates(Coordinates coordinates);

}
