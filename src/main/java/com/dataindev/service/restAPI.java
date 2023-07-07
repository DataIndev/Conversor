package com.dataindev.service;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class restAPI {


    public restAPI(String currency1, String currency2) throws IOException {

        URL url = new URL("https://v6.exchangerate-api.com/v6/4f06bb0bceb472b8f75964b4/latest/"+currency1);

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();

        //Convert to Json

        JsonElement root = JsonParser.parseReader(new InputStreamReader((InputStream) conn.getContent()));
        JsonObject obj = root.getAsJsonObject();

        String req_result = obj.get("conversion_rates").getAsJsonObject().get(currency2).getAsString();

        System.out.println(req_result);


















    }


}
