package com.pb.nex26dv.shippingapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class registration extends AppCompatActivity {

    DBHelper helper = new DBHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void onSignupClick(View view) {
        if (view.getId() == R.id.signupbutton) {
            EditText name = (EditText) findViewById(R.id.editTextName);
            EditText email = (EditText) findViewById(R.id.editTextEmail);
            EditText mobile = (EditText) findViewById(R.id.editTextMobile);
            EditText pass1 = (EditText) findViewById(R.id.editTextPass1);
            EditText pass2 = (EditText) findViewById(R.id.editTextPass2);

            String nameStr = name.getText().toString();
            String emailStr = email.getText().toString();
            String mobileStr = mobile.getText().toString();
            String pass1Str = pass1.getText().toString();
            String pass2Str = pass2.getText().toString();


            if (nameStr.trim().isEmpty()) {
                name.setError("Name is required!");
            } else if (emailStr.trim().equals("")) {
                email.setError("Email is required!");
            } else if (mobileStr.trim().equals("")) {
                mobile.setError("Name is required!");
            } else if (pass1Str.trim().equals("")) {
                pass1.setError("Name is required!");
            } else if (pass2Str.trim().equals("")) {
                pass2.setError("Name is required!");
            } else {
                if (!pass1Str.equals(pass2Str)) {
                    Toast pass = Toast.makeText(this, "Passwords don't match!", Toast.LENGTH_SHORT);
                    pass.show();
                } else if (!Utility.validate(emailStr)) {
                    Toast mail = Toast.makeText(this, "Email Format is Wrong", Toast.LENGTH_SHORT);
                    mail.show();
                } else {
                    Contact contact = new Contact();
                    contact.setName(nameStr);
                    contact.setEmail(emailStr);
                    contact.setPass(pass1Str);
                    contact.setMobile(mobileStr);

                    helper.insertContact(contact);

                    Intent loginIntent = new Intent(registration.this, loginActivity.class);
                    loginIntent.putExtra("email", emailStr);
                    startActivity(loginIntent);
                }
            }
        }
    }
}
