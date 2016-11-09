package generics.sorting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class WordMap {
    private Path resourceDir = Paths.get("src/main/resources");
    private String fileName = "simple_file.txt";

    public Map<String, Long> createWordMap() {
        Map<String, Long> map = new HashMap<>();
        try {
            String text = new String(Files.readAllBytes(
                    resourceDir.resolve(fileName)), "UTF-8");
            String[] words = text.split("\\W+");
            map = Arrays.stream(words)
                    .map(String::toLowerCase)
                    .collect(groupingBy(w -> w, counting()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
