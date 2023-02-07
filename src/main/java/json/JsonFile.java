package json;

import enums.Teams;
import lists.ArrayUnorderedList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import players.PlayerManager;
import players.Players;

import java.io.*;


public class JsonFile {
    private static final String FILE_NAME = "data.json";
    private JSONObject jsonObject;
    private final JSONParser jsonParser;
    private FileWriter fileWriter;
    private File data;
    private static Players players;


    public JsonFile() {
        jsonParser = new JSONParser();
        jsonObject = new JSONObject();
        createFile();
    }


    private boolean createFile() {
        data = new File(FILE_NAME);
        try {
            if (data.createNewFile()) {
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void addPlayer(PlayerManager playerManager) {
        if (data.exists()) {
            try {
                jsonObject = (JSONObject) jsonParser.parse(new FileReader(data.getPath()));
                JSONArray listaAdd = new JSONArray();
                JSONArray lista = (JSONArray) jsonObject.get("players");
                var playersList = playerManager.getPlayersList();
                for (Players player : playersList) {
                    JSONObject playerObject = new JSONObject();

                    playerObject.put("name", player.getName());
                    playerObject.put("team", player.getTeam().toString());
                    playerObject.put("level", player.getLevel());
                    playerObject.put("experiencePoints", player.getExperiencePoints());
                    playerObject.put("current_Energy", player.getCurrentEnergy());

                    listaAdd.add(playerObject);
                }
                jsonObject.put("players", listaAdd);
                lista.add(listaAdd);
                var addplayer = new JSONObject();
                addplayer.put("players", lista);

                fileWriter = new FileWriter(data.getPath());
                fileWriter.write(jsonObject.toJSONString());
                fileWriter.close();
            } catch (IOException | ParseException | NullPointerException e) {
                System.out.println("Erro");
            }
        }
    }

    public ArrayUnorderedList<Players> readPlayerData(PlayerManager playerManager) {
        ArrayUnorderedList<Players> playersList = new ArrayUnorderedList<>();
        try {
            jsonObject = (JSONObject) jsonParser.parse(new FileReader(data.getPath()));
            JSONArray playersArray = (JSONArray) jsonObject.get("players");
            for (Object playerObject : playersArray) {
                if (playerObject instanceof JSONObject) {
                    JSONObject playerJson = (JSONObject) playerObject;
                    String name = (String) playerJson.get("name");
                    String team = (String) playerJson.get("team");
                    int level = ((Long) playerJson.get("level")).intValue();
                    int experiencePoints = ((Long) playerJson.get("experiencePoints")).intValue();
                    int currentEnergy = ((Long) playerJson.get("current_Energy")).intValue();
                    Players player = new Players(name, getTeam(team), level, experiencePoints, currentEnergy);
                    playersList.addToRear(player);


                }

            }
            playerManager.setPlayersList(playersList);
        } catch (IOException | ParseException e) {
            System.out.println("Erro ao ler dados do jogador");
        }
        return playersList;
    }





    public static Teams getTeam(String team) {

        switch (team) {
            case "Giants":
                return (Teams.Giants);
            case "Sparks":
                return Teams.Sparks;
            default:
                return null;
        }
    }
}


