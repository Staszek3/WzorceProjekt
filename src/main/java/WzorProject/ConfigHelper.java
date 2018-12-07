package WzorProject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class ConfigHelper {

    private static ConfigHelper instance;

    private Map<String, String> config;

    private ConfigHelper() {
        config = new HashMap<>();

        try {
            Files.lines(Paths.get("config.txt"))
                    .forEach(line -> {
                        String[] split = line.split("=");
                        config.put(split[0], split[1]);
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ConfigHelper getInstance() {
        if (instance == null) {
            instance = new ConfigHelper();
        }
        return instance;
    }

    public String getConfigValue(String key) {
        return config.get(key);
    }
}
