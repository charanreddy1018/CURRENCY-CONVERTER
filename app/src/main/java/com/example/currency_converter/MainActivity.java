package com.example.currency_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.String;

import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    int a =10,b=10,z_one=1,z_two=1,i=0,j=0;
    double y=0;
    EditText edit2;
    TextView text1,text2;
    ImageView img1;
    Button btn1;
    Scanner sc = new Scanner(System.in);
    double arr[][] = new double[10][10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 =(Button) findViewById(R.id.button);
        text2 =(TextView) findViewById(R.id.textView2);
        edit2 = (EditText) findViewById(R.id.editText2);
        text1 = (TextView) findViewById(R.id.textView);
        img1 = (ImageView) findViewById(R.id.imageView);

        Spinner spinner = findViewById(R.id.spinner);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Indian rupee");
        arrayList.add("US dollar");
        arrayList.add("Pound");
        arrayList.add("Euro");
        arrayList.add("Swiss franc");
        arrayList.add("Canadian dollar");
        arrayList.add("Malaysian ringgit");
        arrayList.add("Japanese yen");
        arrayList.add("Australian dollar");
        arrayList.add("South african rand");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String currency = parent.getItemAtPosition(position).toString();
                a = position;
                z_one++;
                if(z_one>2) {
                    Toast.makeText(parent.getContext(), "Selected: " + currency, Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Log.d("CREATION","nothing");


            }

        });

        Spinner spinner2 = findViewById(R.id.spinner2);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Indian rupee");
        arrayList2.add("US dollar");
        arrayList2.add("Pound");
        arrayList2.add("Euro");
        arrayList2.add("Swiss franc");
        arrayList2.add("Canadian dollar");
        arrayList2.add("Malaysian ringgit");
        arrayList2.add("japanese yen");
        arrayList2.add("Australian dollar");
        arrayList2.add("South african rand");
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayList2);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(arrayAdapter2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view2, int position2, long id2) {
                String currency = parent.getItemAtPosition(position2).toString();
                b = position2;
                z_two++;
                if(z_two>2) {
                    Toast.makeText(parent.getContext(), "Selected: " + currency, Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Log.d("CREATION","nothing");


            }

        });

        arr[0][0] = 1;
        arr[1][0] = 76.227;
        arr[2][0] = 94.761;
        arr[3][0] = 82.651;
        arr[4][0] = 78.376;
        arr[5][0] = 54.241;
        arr[6][0] = 1.023;
        arr[7][0] = 0.711;
        arr[8][0] = 49.186;
        arr[9][0] = 4.049;

        for(i=0;i<=9;i++)
        {
            for(j=1;j<=9;j++)
            {
                if(i==j)
                {
                    arr[i][j] = 1;
                }
                arr[i][j] = (arr[i][0])/(arr[j][0]);
            }
        }





        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("CREATION","button clicked");
                text2.setText(String.valueOf(arr[a][b]*Integer.parseInt(edit2.getText().toString())));
                }

        });


    }
}
