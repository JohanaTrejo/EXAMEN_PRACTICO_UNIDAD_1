package com.example.acredita_no_acredita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private static SeekBar seekBar;
    private static TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar= (SeekBar)findViewById(R.id.seekBarID);
        textView = (TextView)findViewById(R.id.textView);

        editText = (EditText)findViewById(R.id.editText1) ;
        editText = (EditText)findViewById(R.id.editText2) ;

        TextView mostrar = (TextView) findViewById(R.id.textView2);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress_value;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progress_value=progress;
                textView.setText("Puntos para acreditar: " + seekBar.getProgress());





            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });





    }
}