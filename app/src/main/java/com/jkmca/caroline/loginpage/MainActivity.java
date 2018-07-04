package com.jkmca.caroline.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    EditText emailet, pwet;
    TextView tv1;
    Button loginbtn;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailet = (EditText) findViewById(R.id.et1);
        pwet = (EditText) findViewById(R.id.et2);
        loginbtn = (Button) findViewById(R.id.button1);


        loginbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String emailstr = emailet.getText().toString();
                String pwstr = pwet.getText().toString();
                if (emailstr.equals("caroline") && pwstr.equals("eke7777")) {
                    Toast.makeText(MainActivity.this, "login success", Toast.LENGTH_SHORT).show();
                } else {
                    toast=Toast.makeText(MainActivity.this, "Wrong ID / Pwd Combination", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }


        });
    }
}
