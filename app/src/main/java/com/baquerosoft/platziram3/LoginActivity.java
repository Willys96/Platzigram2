package com.baquerosoft.platziram3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.baquerosoft.platziram3.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    protected void goCreateAccount(View view){
        Toast.makeText(getBaseContext(),"Ahora crearás tu cuenta!",Toast.LENGTH_LONG).show();

            Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);

    }
}
