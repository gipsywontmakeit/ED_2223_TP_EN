package json;

import interfaces.IPlayerManager;

import java.io.File;
import java.io.IOException;


public class JsonFile {
    private File file;
    private IPlayerManager playerManager;

    private String fileName =  "data";

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

    public void addPlayer() {



    }
}

