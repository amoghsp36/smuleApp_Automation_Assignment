package common_utils;

import io.restassured.path.json.JsonPath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

public class ConfigLoader {
    public Map getCapabilities(){
        JsonPath jsonPath = null;
        try{
            String path = System.getProperty("user.dir")+ FilePaths.CAPABILITIES;
            jsonPath = new JsonPath(new FileInputStream(path));
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        return jsonPath.getMap(".");
    }

    public Map getJsonPath(String filePath){
        JsonPath jsonPath = null;
        try{
            String path = System.getProperty("user.dir")+filePath;
            jsonPath = new JsonPath(new FileInputStream(path));
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        return jsonPath.getMap(".");
    }
}
