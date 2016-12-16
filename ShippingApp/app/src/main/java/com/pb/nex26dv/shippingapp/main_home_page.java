package com.pb.nex26dv.shippingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static com.pb.nex26dv.shippingapp.R.id.myorder_image_button;
import static com.pb.nex26dv.shippingapp.R.id.order_submit;
import static com.pb.nex26dv.shippingapp.R.id.savedorders_image_button;

public class main_home_page extends AppCompatActivity {

    private static ImageButton shipping_button;
    private static ImageButton myorder_button;
    private static ImageButton saved_button;
    private static ImageButton info_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home_page);
        OnClickButtonListener_shipping();
        OnClickButtonListener_myorder();
        OnClickButtonListener_saved();
//        OnClickButtonListener_info();

    }

    public void OnClickButtonListener_shipping()
    {

        shipping_button = (ImageButton)findViewById(R.id.shipping_image_button);
        shipping_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.pb.nex26dv.shippingapp.orderplacing");
                        startActivity(intent);
                    }
                }
        );
    }

    public void OnClickButtonListener_myorder()
    {

        myorder_button = (ImageButton)findViewById(R.id.myorder_image_button);
        myorder_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.pb.nex26dv.shippingapp.myorders");
                        startActivity(intent);
                    }
                }
        );
    }

    public void OnClickButtonListener_saved()
    {

        saved_button = (ImageButton)findViewById(R.id.savedorders_image_button);
        saved_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.pb.nex26dv.shippingapp.wishlist");
                        startActivity(intent);
                    }
                }
        );
    }



}
