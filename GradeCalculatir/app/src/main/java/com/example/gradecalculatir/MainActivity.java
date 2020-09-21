package com.example.gradecalculatir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.util.TypedValue;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
final EditText x=findViewById(R.id.editTextNumber);
        final EditText o=findViewById(R.id.editTextNumber2);
        final EditText k=findViewById(R.id.editTextNumber3);
        final EditText p=findViewById(R.id.editTextNumber4);
      final TextView n =findViewById(R.id.textView5);
        Button add =findViewById(R.id.button);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             int f=  Integer.parseInt(x.getText().toString())   ;
                int b = Integer.parseInt(o.getText().toString())   ;
                int h= Integer.parseInt(k.getText().toString())   ;
                int l= Integer.parseInt(p.getText().toString())   ;
           int musafaa =f+b+h+l ;
           n.setText(musafaa+"");
                Toast.makeText(MainActivity.this, musafaa+"", Toast.LENGTH_SHORT).show();


            }
        });
        Button zero =findViewById(R.id.button5);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        













    }
}