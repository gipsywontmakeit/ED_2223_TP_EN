import enums.LocalType;
import interfaces.Portal;
import locals.Coordinates;

public class Main {
    public static void main(String[] args)  {

        Portal portal = new Portal(1, LocalType.Portal, new Coordinates(1, 1), new Coordinates(2, 2));

        System.out.println("Hello World!");

    }
}
