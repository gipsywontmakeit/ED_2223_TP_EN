import java.io.IOException;

import java.time.LocalDateTime;

import interfaces.*;
import json.JsonFile;
import lists.ArrayUnorderedList;
import locals.*;
import players.*;

import exceptions.ListIsEmptyException;
import players.PlayerManager;

public class Main {
    public static void main(String[] args) throws IOException, ListIsEmptyException {


        menu menu = new menu();
        menu.startGame();


    }

}