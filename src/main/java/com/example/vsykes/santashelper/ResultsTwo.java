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

import static com.example.vsykes.santashelper.ScrollingActivity.art;
import static com.example.vsykes.santashelper.ScrollingActivity.cooking;
import static com.example.vsykes.santashelper.ScrollingActivity.electronics;
import static com.example.vsykes.santashelper.ScrollingActivity.gardening;
import static com.example.vsykes.santashelper.ScrollingActivity.makeup;
import static com.example.vsykes.santashelper.ScrollingActivity.music;
import static com.example.vsykes.santashelper.ScrollingActivity.shopping;
import static com.example.vsykes.santashelper.ScrollingActivity.sport;
import static com.example.vsykes.santashelper.ScrollingActivity.videoGames;

public class ResultsTwo extends AsyncTask<Void,Void,Void> {
    String data = " ";
    String dataParsed = " ";
    String singleParsed = " ";
    @Override
    protected Void doInBackground(Void... voids) {
        //done
        if (!sport) {
            newURL("https://api.myjson.com/bins/ffzh0");
        }
        //done
        if (!music) {
            newURL("https://api.myjson.com/bins/71ruc");
        }
        //done
        if (!electronics) {
            newURL("https://api.myjson.com/bins/d291w");
        }
        //done
        if (!art) {
            newURL("https://api.myjson.com/bins/dcyus");
        }
        //done
        if (!cooking) {
            newURL("https://api.myjson.com/bins/1gppxw");

        }
        //done
        if (!makeup) {
            newURL("https://api.myjson.com/bins/qr7ys");
        }
        //done
        if (!shopping) {
            newURL("https://api.myjson.com/bins/wneus");
        }
        //done
        if (!gardening) {
            newURL("https://api.myjson.com/bins/nuetg");
        }
        //done
        if (!videoGames) {
            newURL("https://api.myjson.com/bins/1hdapg");
        }
        return null;
    }
    private void newURL(String input) {
        try {
            URL url = new URL(input);
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
                singleParsed = "Name:" + JO.get("name") + "\n" + "\n" +
                                "URL:" + JO.get("url") + "\t" + "\n" + "\n" + "\n" +
                                "Name:" + JO.get("name1")+ "\n" + "\n" +
                                "URL:" + JO.get("url1") + "\t" + "\n" + "\n" + "\n" +
                                "Name:" + JO.get("name2")+ "\n" + "\n" +
                                "URL:" + JO.get("url2") + "\t" + "\n" + "\n" + "\n"+
                                "Name:" + JO.get("name3")+ "\n" + "\n" +
                                "URL:" + JO.get("url3") + "\t" + "\n" + "\n" + "\n" +
                                "Name:" + JO.get("name4")+ "\n" + "\n" +
                                "URL:" + JO.get("url4") + "\t" + "\n" + "\n" + "\n";
                dataParsed = dataParsed + singleParsed + "\n";
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
//    private void newMakeup (String input) {
//        try {
//            URL url = new URL(input);
//            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//            InputStream inputStream = httpURLConnection.getInputStream();
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//            String line = "";
//            while(line != null) {
//                line = bufferedReader.readLine();
//                data = data + line;
//            }
//            JSONArray JA = new JSONArray(data);
//            for (int i = 0; i < JA.length(); i++) {
//                JSONObject JO = (JSONObject) JA.get(i);
//                singleParsed = "Name:" + JO.get("name") + "\n" + "\n" +
//                        "URL:" + JO.get("url") + "\n";
//                dataParsed = dataParsed + singleParsed + "\n";
//            }
//
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

       ScrollingActivity.data.setText(this.dataParsed);
    }
}
