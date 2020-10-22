package utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class DataProvider {

    public static Iterator<Object[]> validRequest(String path, Class<?> tClass) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(path), StandardCharsets.UTF_8))) {
            String json = "";
            String line = reader.readLine();
            while (line != null) {
                json += line;
                line = reader.readLine();
            }
            Gson gson = new Gson();
            Type listType = TypeToken.get(tClass).getType();
            List<?> request = Arrays.asList(gson.fromJson(json, listType));
            return request.stream().map((c) -> new Object[]{c}).collect(Collectors.toList()).iterator();
        }
    }
}
