package com.example.vsykes.santashelper;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ResultsTwo extends AsyncTask<Void,Void,Void> {
    String data = " ";
    String dataParsed = " ";
    String singleParsed = " ";
    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url = new URL("http://api.walmartlabs.com/v1/items/541357139?format=json&apiKey=8ebhjrfucd3vygsr9cyk55hs");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while(line != null) {
                line = bufferedReader.readLine();
                data = data + line;
            }
            JSONArray JA = new JSONArray(data);
            for (int i = 0; i < JA.length(); i++) {
                JSONObject JO = (JSONObject) JA.get(i);
                singleParsed = "Name:" + JO.get("name") + "\n";
                dataParsed = dataParsed + singleParsed + "\n";
            }
            System.out.println("catch1");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

       ScrollingActivity.data.setText(this.dataParsed);
    }
}
