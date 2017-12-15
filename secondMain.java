package com.example.vamsee.fgh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secondMain extends AppCompatActivity {
    Button btnExistingUser;
    Button  btnNewUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);
        btnExistingUser=(Button)findViewById(R.id.btnExistingUser);
        btnNewUser=(Button)findViewById(R.id.btnNewUser);
        btnExistingUser.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(secondMain.this,LoginActivity_ExistingUser.class);
                startActivity(i);
            }
        });
        btnNewUser.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(secondMain.this,RegisterActivity.class);
                startActivity(i);
            }
        });
    }
}
