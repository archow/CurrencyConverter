package com.example.abedurchowdhury.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public double toEuro(double dollar) {
        return dollar*0.94;
    }
    public void convertFunction(View view) {
        EditText currencyText = (EditText) findViewById(R.id.currencyText);
        Log.i("Currency in dollars: ", currencyText.getText().toString());

        //calculate dollars to euros
        double euro = toEuro(Double.parseDouble(currencyText.getText().toString()));
        String euroFormat = String.format("%.2f", euro);

        //change image
        ImageView currencyView = (ImageView) findViewById(R.id.currencyView);
        currencyView.setImageResource(R.drawable.euro_notes);

        Toast.makeText(MainActivity.this, "You have "+euroFormat+" EU", Toast.LENGTH_SHORT).show();

    }
}
