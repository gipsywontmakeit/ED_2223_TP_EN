package json;

import interfaces.IPlayerManager;
import lists.ArrayUnorderedList;
import lists.UnorderedListADT;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import players.PlayerManager;
import players.Players;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;


public class JsonFile {
    private File file;
    private PlayerManager playerManager;



    private final String fileName =  "data.json";

    public void createFile() throws IOException {
        file = new File(fileName);
        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println("File created: " + fileName);
            }
        } else {
            System.out.println("File already exists.");
        }
    }

    public void addPlayer(PlayerManager playerManager) {
        if (file.exists()) {
            try {
                FileWriter fileWriter = new FileWriter(file);
                JSONObject jsonObject = new JSONObject();
                JSONArray jsonArray = new JSONArray();
                ArrayUnorderedList<Players> dataplayer = playerManager.getPlayersList();
                for(Players player:dataplayer){
                    JSONObject playerObject = new JSONObject();
                    playerObject.put("name", player.getName());
                    playerObject.put("team", player.getTeam());
                    playerObject.put("level", player.getLevel());
                    playerObject.put("experiencePoints", player.getexperiencePoints());
                    playerObject.put("current_Energy", player.getCurrentEnergy());
                    jsonArray.add(playerObject);
                }
                jsonObject.put("players", jsonArray);
                fileWriter.write(jsonObject.toString());
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }








}

