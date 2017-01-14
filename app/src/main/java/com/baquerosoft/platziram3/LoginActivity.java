package com.baquerosoft.platziram3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    protected void goCreateAccount(View view){
        Toast.makeText(getBaseContext(),"Ahora crearás tu cuenta!",Toast.LENGTH_LONG).show();

    }
}
