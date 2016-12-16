package com.pb.nex26dv.shippingapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class main_display_page extends Fragment {
    private View v;
    private static ImageButton shipping_button;
    private static ImageButton saved_item_button;
    private static ImageButton myorder_button;
    private static Button try_button;


    public main_display_page() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v =  inflater.inflate(R.layout.fragment_main_display_page, container, false);
        OnClickButtonListener_shipping_button();
        OnClickButtonListener_saved_item_button();
        OnClickButtonListener_myorder_button();
//        OnClickButtonListener_try_button();
        return v;

    }



    public void OnClickButtonListener_shipping_button()
    {

        shipping_button = (ImageButton) v.findViewById(R.id.shipping_home_image_button);
        shipping_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(), shipping_order_page.class);
                        startActivity(intent);
                    }
                }
        );
    }

//    public void OnClickButtonListener_try_button()
//    {
//
//        try_button = (Button) v.findViewById(R.id.trybutton);
//        try_button.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Intent intent = new Intent("com.pb.nex26dv.shippingapp.shipping_order_page");
//                        startActivity(intent);
//                    }
//                }
//        );
//    }

    public void OnClickButtonListener_saved_item_button()
    {

        saved_item_button = (ImageButton) v.findViewById(R.id.saved_items_home_image_button);
        saved_item_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.pb.nex26dv.shippingapp.wishlist");
                        startActivity(intent);
                    }
                }
        );
    }

    public void OnClickButtonListener_myorder_button()
    {

        myorder_button = (ImageButton) v.findViewById(R.id.myorder_home_image_button);
        myorder_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.pb.nex26dv.shippingapp.myorder_frag");
                        startActivity(intent);
                    }
                }
        );
    }


}
