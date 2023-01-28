import json.JsonFile;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
          JsonFile json = new JsonFile() ;

        System.out.println("Hello World!");

        json.createFile();

    }
}
