package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText numero1 = findViewById(R.id.numero1);
                EditText numero2 = findViewById(R.id.numero2);
                EditText operacion = findViewById(R.id.operacion);
                TextView resultado = findViewById(R.id.textView);
                int num1 = (int) Integer.parseInt(numero1.getText().toString());
                int num2 = (int) Integer.parseInt(numero2.getText().toString());
                int res;

                switch (operacion.getText().toString()){
                    case "+":
                        res = num1 + num2;
                        resultado.setText(""+res);
                        break;
                    case "-":
                        res = num1 - num2;
                        resultado.setText(""+res);
                        break;
                    case "/":
                        res = num1 / num2;
                        resultado.setText(""+res);
                        break;
                    case "*":
                        res = num1 * num2;
                        resultado.setText(""+res);
                        break;
                    default:
                        resultado.setText("Pon un operador valido en la cajita");
                }
            }
        });
    }
}
