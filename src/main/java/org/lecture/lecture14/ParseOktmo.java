package org.lecture.lecture14;

import java.io.*;

import com.google.gson.Gson;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ParseOktmo implements AutoCloseable {
    public void parse(String filePath) {
        try {
            Gson gson = new Gson();
            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(filePath));
            for (Object object : jsonArray) {
                JSONObject oktmo = (JSONObject) object;
                String strOktmo = oktmo.toJSONString();
                Oktmo oktmoObj = gson.fromJson(strOktmo, Oktmo.class);
                System.out.println(oktmoObj);
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }

    @Override
    public void close() throws Exception {
    }
}
