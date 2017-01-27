package com.baquerosoft.platziram3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.baquerosoft.platziram3.view.ContainerActivity;
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

    protected void goContainer(View view){
        //Toast.makeText(getBaseContext(),"Ahora crearás tu cuenta!",Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);

    }

    protected void goWebSide(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://platzigram.com"));
        startActivity(intent);
    }
}
