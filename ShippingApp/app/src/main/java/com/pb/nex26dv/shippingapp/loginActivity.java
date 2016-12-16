package com.pb.nex26dv.shippingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {
    private static Button login_button;
    DBHelper helper = new DBHelper(this);
//    private static Button register_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        String userID = getIntent().getStringExtra("email");

        EditText editText = (EditText) findViewById(R.id.login_Email);
        editText.setText(userID);
        //OnClickButtonListener_member();
    }


   /* public void OnClickButtonListener_member() {

        login_button = (Button) findViewById(R.id.Login_button);
        login_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.pb.nex26dv.shippingapp.nva_drawer");
                        startActivity(intent);
                    }
                }
        );
    }*/

    public void onSignUpButtonClick(View view) {
        if (view.getId() == R.id.signupbutton) {
            Intent intent = new Intent(loginActivity.this, registration.class);
            startActivity(intent);
        }
    }

    public void onLoginButtonClick(View view) {
        if (view.getId() == R.id.Login_button) {
            EditText loginMail = (EditText) findViewById(R.id.login_Email);
            EditText loginPassword = (EditText) findViewById(R.id.login_Pass);

            String emailID = loginMail.getText().toString();
            String password = loginPassword.getText().toString();

            String DBPassword = helper.searchPass(emailID);

            if (DBPassword.equals(password)) {
                Intent intent = new Intent(loginActivity.this, main_home_page.class);
                startActivity(intent);
            } else {
                Toast wrongPass = Toast.makeText(this, "Username and password don't match", Toast.LENGTH_SHORT);
                wrongPass.show();
            }
        }
    }
}
