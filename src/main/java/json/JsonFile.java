package json;




import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import players.PlayerManager;

import java.io.*;
import java.util.ArrayList;

public class JsonFile {
    private static final String FILE_NAME = "data.json";
    private JSONObject jsonObject;
    private final JSONParser jsonParser;
    private FileWriter fileWriter;
    private File data;

    public JsonFile() {
        jsonParser = new JSONParser();
        jsonObject = new JSONObject();
        createfile();
    }

    private boolean createfile() {
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
                var listaAdd = new ArrayList<>();
                var lista = (JSONArray) jsonObject.get("players");
                var playersList = playerManager.getPlayersList();
                for (var player : playersList) {
                    var playerObject = new JSONObject();

                    playerObject.put("name", player.getName());
                    playerObject.put("team", player.getTeam().toString());
                    playerObject.put("level", player.getLevel());
                    playerObject.put("experiencePoints", player.getExperiencePoints());
                    playerObject.put("current_Energy", player.getCurrentEnergy());

                    listaAdd.add(playerObject);
                }
                jsonObject.put("players", listaAdd);
                lista.add(listaAdd);
                var nemSeiOQueFaz = new JSONObject();
                nemSeiOQueFaz.put("players", lista);

                fileWriter = new FileWriter(data.getPath());
                fileWriter.write(nemSeiOQueFaz.toJSONString());
                fileWriter.close();
            } catch (IOException | ParseException | NullPointerException e) {
                System.out.println("Deu ruim");
            }
        }
    }
}