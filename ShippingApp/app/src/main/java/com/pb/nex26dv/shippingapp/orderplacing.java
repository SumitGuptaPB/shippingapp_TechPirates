package com.pb.nex26dv.shippingapp;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.pb.nex26dv.shippingapp.JsonObjects.Shipment;
import com.pb.nex26dv.shippingapp.WebService.FileDownloader;
import com.pb.nex26dv.shippingapp.mapper.ShipmentMapper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.net.ssl.HttpsURLConnection;

import static com.pb.nex26dv.shippingapp.R.id.add_cart;
import static com.pb.nex26dv.shippingapp.R.id.order_cancel;
import static com.pb.nex26dv.shippingapp.R.id.order_submit;

public class orderplacing extends AppCompatActivity {
    private static Button submit_button;
    private static Button addtocart;
    private static Button cancel_order;
    private static Button back_button;
    private Button btnSelect;
   private String JSONString;
    EditText senderName;
    EditText senderMobile;
    EditText senderPostalAddress;
    EditText senderPostalCode;
    EditText senderCountryCode;
    EditText receiverName;
    EditText receiverMobile;
    EditText receiverPostalAddress;
    EditText receiverPostalCode;
    EditText weight;
    EditText receiverCountryCode;
    EditText length;
    EditText height;
    EditText width;
    private String userChoosenTask;
    private int REQUEST_CAMERA = 0, SELECT_FILE = 1;

    String firstResponse = null;
    String secondResponse = null;

    float l, b, h, tmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderplacing);
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        OnClickButtonListener_submit();
        OnClickButtonListener_addtocart();
        OnClickButtonListener_cancel_order();
//        OnClickButtonListener_back_button();
        btnSelect = (Button) findViewById(R.id.order_camer_button);
        btnSelect.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                selectImage();
            }
        });

 senderName = (EditText) findViewById(R.id.senderEditText);
        senderMobile = (EditText) findViewById(R.id.sMobileEditText);
        senderPostalAddress = (EditText) findViewById(R.id.sPostalAddressEditText);
        senderPostalCode = (EditText) findViewById(R.id.sPostalCodeEditText);
        senderCountryCode = (EditText) findViewById(R.id.sCountryCodeEditText);
        receiverName = (EditText) findViewById(R.id.rNameEditText);
        receiverMobile = (EditText) findViewById(R.id.rMobileEditText);
        receiverPostalAddress = (EditText) findViewById(R.id.rPostalAddressEditText);
        receiverPostalCode = (EditText) findViewById(R.id.rPostalCodeEditText);
        weight = (EditText) findViewById(R.id.weightEditText);
        receiverCountryCode = (EditText) findViewById(R.id.rCountryCodeEditText);
        length = (EditText) findViewById(R.id.lengthEditText);
        height = (EditText) findViewById(R.id.heightEditText);
        width = (EditText) findViewById(R.id.widthEditText);

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case Utility.MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    if (userChoosenTask.equals("Take Photo For Dimension"))
                        cameraIntent();
                    else if (userChoosenTask.equals("Choose from Library"))
                        galleryIntent();
                } else {
                    //code for deny
                }
                break;
        }
    }

    private void selectImage() {
        final CharSequence[] items = {"Take Photo", "Choose from Library",
                "Cancel"};

        AlertDialog.Builder builder = new AlertDialog.Builder(orderplacing.this);
        builder.setTitle("Add Photo!");
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                //boolean result=Utility.checkPermission(orderplacing.this);
                boolean result = true;

                if (items[item].equals("Take Photo")) {
                    userChoosenTask = "Take Photo";
                    if (result)
                        cameraIntent();

                } else if (items[item].equals("Choose from Library")) {
                    userChoosenTask = "Choose from Library";
                    if (result)
                        galleryIntent();

                } else if (items[item].equals("Cancel")) {
                    dialog.dismiss();
                }
            }
        });
        builder.show();
    }

    private void galleryIntent() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);//
        startActivityForResult(Intent.createChooser(intent, "Select File"), SELECT_FILE);
    }

    private void cameraIntent() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, REQUEST_CAMERA);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == SELECT_FILE)
                onSelectFromGalleryResult(data);
            else if (requestCode == REQUEST_CAMERA)
                onCaptureImageResult(data);
        }
    }

    private void onCaptureImageResult(Intent data) {
        Bitmap thumbnail = (Bitmap) data.getExtras().get("data");
        Bitmap scaled = Bitmap.createScaledBitmap(thumbnail, 600, 450, false);

        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        scaled.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
        String encoded = Base64.encodeToString(bytes.toByteArray(), Base64.DEFAULT);
        String response = makeDimPostCall(encoded);

        if (firstResponse == null) {
            firstResponse = response;
            cameraIntent();
            Toast.makeText(getApplicationContext(), "Please snap second picture for full dimention", Toast.LENGTH_LONG).show();

        } else {
            secondResponse = response;

        }

        List<Float> finDim = getFinalDimList();
        if (finDim != null && finDim.size() >= 3) {
            EditText editTexHeight = (EditText)findViewById(R.id.heightEditText);
            EditText editTexWid = (EditText)findViewById(R.id.widthEditText);
            EditText editTexLen = (EditText)findViewById(R.id.lengthEditText);
            editTexLen.setText(round(finDim.get(0),2), TextView.BufferType.EDITABLE);
            editTexWid.setText(round(finDim.get(1),2), TextView.BufferType.EDITABLE);
            editTexHeight.setText(round(finDim.get(2),2), TextView.BufferType.EDITABLE);
        }


    }

    public void OnClickButtonListener_submit() {

        submit_button = (Button) findViewById(order_submit);
        submit_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        JSONString = mapShipmentOnButtonClick();
                        HitWebservice hitWebservice = new HitWebservice();
                        hitWebservice.execute();

                        /*Intent intent = new Intent("com.pb.nex26dv.shippingapp.conformationpage");
                        startActivity(intent);*/
                    }
                }
        );
    }


    public void OnClickButtonListener_addtocart() {

        addtocart = (Button) findViewById(add_cart);
        addtocart.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.pb.nex26dv.shippingapp.wishlist");
                        startActivity(intent);
                    }
                }
        );
    }


    public void OnClickButtonListener_cancel_order() {

        cancel_order = (Button) findViewById(order_cancel);
        cancel_order.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.pb.nex26dv.shippingapp.loginActivity");
                        startActivity(intent);
                    }
                }
        );
    }


    /*public void OnClickButtonListener_back_button() {

        back_button = (Button) findViewById(backbutton);
        back_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.pb.nex26dv.shippingapp.loginActivity");
                        startActivity(intent);
                    }
                }
        );
    }*/


    @SuppressWarnings("deprecation")
    private void onSelectFromGalleryResult(Intent data) {

        Bitmap bm = null;
        if (data != null) {
            try {
                bm = MediaStore.Images.Media.getBitmap(getApplicationContext().getContentResolver(), data.getData());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //ivImage.setImageBitmap(bm);
    }

 public String mapShipmentOnButtonClick() {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        ShipmentMapper shipmentMapper = new ShipmentMapper();
        Shipment shipment = shipmentMapper.getShipment();
//Keep postalcode = L4W5K6 and country code = CA
        shipment.setFromAddress(shipmentMapper.setAddress("john.publica@pb.com", senderName.getText().toString(), "ON", "Missisuaga", "PitneyBowes", senderCountryCode.getText().toString(), senderMobile.getText().toString(), senderPostalCode.getText().toString(), "TaxID", senderPostalAddress.getText().toString()));
        shipment.setToAddress(shipmentMapper.setAddress("rs.canid@gmail.com", receiverName.getText().toString(), "ON", "Misssisuaga", "PitneyBowes", receiverCountryCode.getText().toString(), receiverMobile.getText().toString(), receiverPostalCode.getText().toString(), "TaxID", receiverPostalAddress.getText().toString()));
        shipment.setCarrierPayments(shipmentMapper.mapCarrierPayment());
        shipment.setCarrierAccounts(shipmentMapper.mapCarrierAccounts());
        shipment.setParcel(shipmentMapper.mapParcel(Double.valueOf(height.getText().toString()), 12.33, Double.valueOf(length.getText().toString()), Double.valueOf(width.getText().toString()), Double.valueOf(weight.getText().toString())));
        shipment.setShipmentOptions(shipmentMapper.mapShipmentOption(dateFormatter.format(date)));
        shipment.setDocuments(shipmentMapper.mapDocuments());
        shipment.setRates(shipmentMapper.mapRates("fedex", "GRD", "PKG", "COMMERCIAL", "06484"));

        return shipmentMapper.convertShipmentToJson(shipment);

    }

private class HitWebservice extends AsyncTask<Void, Void, String> {
        @Override
        protected String doInBackground(Void... params) {
            HttpURLConnection urlConnection;

            String url = "http://10.50.14.2:8181/services/v1/shipments/create";
            UUID uid = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");
            String randomUid = uid.randomUUID().toString();

            String data = JSONString;
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
            Intent intent = new Intent("com.pb.nex26dv.shippingapp.conformationpage");
            Gson gson = new Gson();
            Shipment shipment = gson.fromJson(s, Shipment.class);

            download(shipment.getDocuments().get(0).getContents());
            Log.i("JSON", s);
            Log.i("URL", shipment.getDocuments().get(0).getContents());
            intent.putExtra("labelurl", shipment.getDocuments().get(0).getContents());

        }
    }

    public void download(String URL) {
        new DownloadFile().execute(URL, "label.pdf");
    }

    public void view(View view) {
        File pdfFile = new File(Environment.getExternalStorageDirectory() + "/label/" + "label.pdf");  // -> filename = maven.pdf
        Uri path = Uri.fromFile(pdfFile);
        Intent pdfIntent = new Intent(Intent.ACTION_VIEW);
        pdfIntent.setDataAndType(path, "application/pdf");
        pdfIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        try {
            startActivity(pdfIntent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(orderplacing.this, "No Application available to view PDF", Toast.LENGTH_SHORT).show();
        }
    }

    private class DownloadFile extends AsyncTask<String, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            senderName.setEnabled(false);
            senderMobile.setEnabled(false);
            senderPostalAddress.setEnabled(false);
            senderPostalCode.setEnabled(false);
            senderCountryCode.setEnabled(false);
            receiverName.setEnabled(false);
            receiverMobile.setEnabled(false);
            receiverPostalAddress.setEnabled(false);
            receiverPostalCode.setEnabled(false);
            weight.setEnabled(false);
            receiverCountryCode.setEnabled(false);
            length.setEnabled(false);
            height.setEnabled(false);
            width.setEnabled(false);
        }

        @Override
        protected Void doInBackground(String... strings) {
            String fileUrl = strings[0];   // -> http://10.50.14.48/fedex/187143416/outbound/label/f9102b14a5c74c3f8d57ed41568d45d0.pdf
            String fileName = strings[1];  // -> label.pdf
            String extStorageDirectory = Environment.getExternalStorageDirectory().toString();
            File folder = new File(extStorageDirectory, "label");
            folder.mkdir();

            File pdfFile = new File(folder, fileName);

            try {
                pdfFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            FileDownloader.downloadFile(fileUrl, pdfFile);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            Toast.makeText(orderplacing.this, "Label downloaded successfully", Toast.LENGTH_SHORT).show();
        }
    }

    private String makeDimPostCall(String requestData) {
        HttpURLConnection httpcon;
        String url = "http://10.220.66.60:5000/getDim";
        String data = null;
        String result = null;
        try {
            //Connect
            httpcon = (HttpURLConnection) ((new URL (url).openConnection()));
            httpcon.setDoOutput(true);
            httpcon.setRequestProperty("Content-Type", "application/json");
            //httpcon.setRequestProperty("Accept", "application/json");
            httpcon.setRequestMethod("POST");
            httpcon.connect();

            //Write
            OutputStream os = httpcon.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
            writer.write(requestData);
            writer.close();
            os.close();

            //Read
            BufferedReader br = new BufferedReader(new InputStreamReader(httpcon.getInputStream(),"UTF-8"));

            String line = null;
            StringBuilder sb = new StringBuilder();

            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

            br.close();
            result = sb.toString();

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }



    public List<Float> getFinalDimList() {
        List<Float> dim = new ArrayList<>();
        if (secondResponse != null) {

            l = Float.parseFloat(firstResponse.substring(0, firstResponse.indexOf(',')));
            b = Float.parseFloat(firstResponse.substring(firstResponse.indexOf(',') + 1, firstResponse.length() - 1));

            h = Float.parseFloat(secondResponse.substring(0, secondResponse.indexOf(',')));
            tmp = Float.parseFloat(secondResponse.substring(secondResponse.indexOf(',') + 1, secondResponse.length() - 1));

            dim.add(l);
            dim.add(b);
            dim.add(h);
            dim.add(tmp);
            Float min = Float.MAX_VALUE;
            for (int i = 0; i < dim.size(); i++) {
                for (int j = i + 1; j < dim.size(); j++) {
                    if (Math.abs(dim.get(i) - dim.get(j)) < min)
                        min = Math.abs(dim.get(i) - dim.get(j));
                }
            }

            for (int i = 0; i < dim.size(); i++) {
                for (int j = i + 1; j < dim.size(); j++) {
                    if (min.equals(Math.abs(dim.get(i) - dim.get(j))))
                        dim.remove(j);
                }
            }

            firstResponse = secondResponse = null;
        }
        return dim;
    }

    public static String round(float d, int decimalPlace) {
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd.toString();
    }

}
