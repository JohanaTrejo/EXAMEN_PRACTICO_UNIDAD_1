package com.example.control_de_rotacion_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtVwsc,txtVwfecha,txtVwtexto,txtVwspace,txtVwsc1,txtVwfecha1,txtVwtexto1,txtVwspace1;
    ImageView imgVwnave,imgVwnave1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwsc=findViewById(R.id.txtVwsc);
        txtVwfecha=findViewById(R.id.txtVwfecha);
        txtVwtexto=findViewById(R.id.txtVwtexto);
        txtVwspace=findViewById(R.id.txtVwspace);
        imgVwnave=findViewById(R.id.imgVwnave);
        txtVwsc1=findViewById(R.id.txtVwsc1);
        txtVwfecha1=findViewById(R.id.txtVwfecha1);
        txtVwtexto1=findViewById(R.id.txtVwtexto);
        txtVwspace1=findViewById(R.id.txtVwspace1);
        imgVwnave1=findViewById(R.id.imgVwnave1);

    }

    @Override
    protected void onStart() {
        super.onStart();
        txtVwsc=findViewById(R.id.txtVwsc);
        txtVwfecha=findViewById(R.id.txtVwfecha);
        txtVwtexto=findViewById(R.id.txtVwtexto);
        txtVwspace=findViewById(R.id.txtVwspace);
        imgVwnave=findViewById(R.id.imgVwnave);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT).show();
        imgVwnave1=findViewById(R.id.imgVwnave);

    }
}