package com.example.sodaadvisor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner sp;
    TextView tv;
    sodaExpert expert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickBtn(View v) {
        //code for the onclick
        ArrayList<String> List = new ArrayList<String>();
        sp = (Spinner)findViewById(R.id.spinner);
        tv = (TextView)findViewById(R.id.textView);
        String soda_type = String.valueOf(sp.getSelectedItem());
        expert = new sodaExpert();
        List = expert.getFlavour(soda_type);
        String result = "";
        for(String value: List) {
            
        }
    }
}
