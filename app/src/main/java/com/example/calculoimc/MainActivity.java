package com.example.calculoimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Altura;
    EditText Peso;
    TextView IMCoutp;
    TextView Cat;
    Button btnCalc;
    double Alt, PesoKG, IMC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Altura = (EditText)findViewById(R.id.inputM);
        Peso = (EditText)findViewById(R.id.inputKG);
        IMCoutp =  (TextView)findViewById(R.id.resultadoIMC);
        Cat = (TextView)findViewById(R.id.categoria);
    }
    public void Calculate(View view)
    {
        Alt = Double.parseDouble(Altura.getText().toString());
        PesoKG = Double.parseDouble(Peso.getText().toString());
        IMC = PesoKG / Math.pow(Alt, 2);
        if(IMC <= 18.5) Cat.setText(R.string.category_0);
        else if(IMC < 25) Cat.setText(R.string.category_1);
        else if(IMC < 30) Cat.setText(R.string.category_2);
        else if(IMC < 35) Cat.setText(R.string.category_3);
        else if(IMC < 40) Cat.setText(R.string.category_4);
        else Cat.setText(R.string.category_5);
        IMCoutp.setText(Double.toString(IMC));
    }
}
