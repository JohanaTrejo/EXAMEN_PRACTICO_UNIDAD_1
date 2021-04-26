package com.example.control_de_rotacion_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView txtVwApp,txtVwEx,txtVwEva,txtVwApp1,txtVwEx1,txtVwEva1;
    ImageView imgVwm,imgVwm1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwApp=findViewById(R.id.txtVwApp);
        txtVwEx=findViewById(R.id.txtVwEx);
        txtVwEva=findViewById(R.id.txtVwEva);
       imgVwm=findViewById(R.id.imgVwm);
        txtVwApp1=findViewById(R.id.txtVwApp1);
        txtVwEx1=findViewById(R.id.txtVwEx1);
        txtVwEva1=findViewById(R.id.txtVwEva1);
        imgVwm1=findViewById(R.id.imgVwm1);
    }

    @Override
    protected void onStart() {
        super.onStart();
        txtVwApp=findViewById(R.id.txtVwApp);
        txtVwEx=findViewById(R.id.txtVwEx);
        txtVwEva=findViewById(R.id.txtVwEva);
        imgVwm=findViewById(R.id.imgVwm);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT).show();
        imgVwm1=findViewById(R.id.imgVwm1);
    }
}