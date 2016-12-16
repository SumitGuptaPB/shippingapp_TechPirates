/*
package com.pb.nex26dv.shippingapp.WebService;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;
import com.pb.nex26dv.shippingapp.JsonObjects.Shipment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.UUID;

import javax.net.ssl.HttpsURLConnection;

*/
/**
 * Created by NEX9ZKA on 12/14/2016.
 *//*


public class HitWebservice extends AsyncTask<Void, Void, String> {

    private String requestJson;

    public void setRequestJson(String requestJson) {
        this.requestJson = requestJson;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    private Shipment shipment;

    @Override
    protected String doInBackground(Void... params) {
        HttpURLConnection urlConnection;

        String url = "http://10.50.14.2:8181/services/v1/shipments/create";
        UUID uid = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");
        String randomUid = uid.randomUUID().toString();
//            String url = "http://10.220.66.60:5000/getDim";
//            String url = "http://10.50.14.2:8181/services/v1/shipments/create";
        // String data = SyncStateContract.Constants.jsonobj;
        String data = requestJson;
        String result = null;
        try {
            //Connect
            urlConnection = (HttpURLConnection) ((new URL(url).openConnection()));
            urlConnection.setDoOutput(true);
            urlConnection.setRequestProperty("Content-Type", "application/json");
            urlConnection.setRequestProperty("Accept", "application/json");
            urlConnection.setRequestProperty("Accept-Language", "en-US");
            urlConnection.setRequestProperty("X-PB-TransactionId", randomUid);

            urlConnection.setRequestProperty("Authorization", "Basic Z3BwOmdwcA==");
            urlConnection.setRequestMethod("POST");

            urlConnection.setConnectTimeout(1000);
            urlConnection.connect();

              */
/*  Gson gson = new Gson();

                        *//*
*/
/*request.header("X-PB-TransactionId", uid.randomUUID());
                        request.header("Accept-Language", "en-US");
                        request.header("Authorization", "Basic Z3BwOmdwcA==");*//*
*/
/*
                clientResponse = request.post();
                responseStr = (String) clientResponse.getEntity(String.class);*//*


            //Write
            OutputStream outputStream = urlConnection.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            writer.write(data);
            writer.close();
            outputStream.close();

            int responseCode = urlConnection.getResponseCode();
            if (responseCode == HttpsURLConnection.HTTP_OK || responseCode == HttpsURLConnection.HTTP_CREATED) {
                System.err.println("EVERYTHING IS OK");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "UTF-8"));

                String line = null;
                StringBuilder sb = new StringBuilder();

                while ((line = bufferedReader.readLine()) != null) {
                    sb.append(line);
                }

                bufferedReader.close();
                result = sb.toString();
            }

            //Read


        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        Gson gson = new Gson();
        shipment = gson.fromJson(s, Shipment.class);
        System.out.println(shipment);
        */
/*p
        output.setText(s);*//*

//        requestJson = s;
//        Log.i("JSON", s);
    }

}
*/
