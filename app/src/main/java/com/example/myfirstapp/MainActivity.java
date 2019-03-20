package com.example.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Broken
    private Button addBtn;
    private Button subBtn;
    private Button mulBtn;
    private Button divBtn;
    private Button oneBtn;
    private Button twoBtn;
    private Button threeBtn;
    private Button fourBtn;
    private Button fiveBtn;
    private Button sixBtn;
    private Button sevenBtn;
    private Button eightBtn;
    private Button nineBtn;
    private Button zeroBtn;
    //private Button signBtn;
    //private Button percentBtn;
    private Button equalBtn;
    private Button clearBtn;
    private TextView resultTextView;
    static int result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();
        //String val = "";
        //String val2 = "";


        zeroBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(resultTextView.getText().toString() == "0") {
                    resultTextView.setText(resultTextView.getText().toString());
                }else{
                    resultTextView.setText("resultTextView.getText().toString()" + "0");
                }
            }
        });
        oneBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(resultTextView.getText().toString() == "0"){
                    resultTextView.setText("1");
                }else {
                    resultTextView.setText(resultTextView.getText().toString() + "1");
                }
            }
        });
        twoBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (resultTextView.getText().toString() == "0") {
                    resultTextView.setText("2");
                } else {
                    resultTextView.setText(resultTextView.getText().toString() + "2");
                }
            }
        });
        threeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                    if(resultTextView.getText().toString() == "0"){
                        resultTextView.setText("3");
                    }else {
                        resultTextView.setText(resultTextView.getText().toString() + "3");
                    }
            }
        });
        fourBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                    if(resultTextView.getText().toString() == "0"){
                        resultTextView.setText("4");
                    }else {
                        resultTextView.setText(resultTextView.getText().toString() + "4");
                    }
            }
        });
        fiveBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                    if(resultTextView.getText().toString() == "0"){
                        resultTextView.setText("5");
                    }else {
                        resultTextView.setText(resultTextView.getText().toString() + "5");
                    }
            }
        });
        sixBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                    if(resultTextView.getText().toString() == "0"){
                        resultTextView.setText("6");
                    }else {
                        resultTextView.setText(resultTextView.getText().toString() + "6");
                    }
            }
        });
        sevenBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                    if(resultTextView.getText().toString() == "0"){
                        resultTextView.setText("7");
                    }else {
                        resultTextView.setText(resultTextView.getText().toString() + "7");
                    }
            }
        });
        eightBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(resultTextView.getText().toString() == "0"){
                    resultTextView.setText("8");
                }else {
                    resultTextView.setText(resultTextView.getText().toString() + "8");
                }
            }
        });
        nineBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(resultTextView.getText().toString() == "0"){
                    resultTextView.setText("9");
                }else {
                    resultTextView.setText(resultTextView.getText().toString() + "9");
                }
            }
        });


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int val = Integer.parseInt(resultTextView.getText().toString());

                result = result + val;
                resultTextView.setText("");
            }
        });
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int val = Integer.parseInt(resultTextView.getText().toString());

                result = result - val;
                resultTextView.setText("");
            }
        });
        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int val = Integer.parseInt(resultTextView.getText().toString());

                result = result * val;
                resultTextView.setText("");
            }
        });
        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int val = Integer.parseInt(resultTextView.getText().toString());

                result = result / val;
                resultTextView.setText("");
            }
        });
        equalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                resultTextView.setText(Integer.toString(result));
            }
        });
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result = 0;
                resultTextView.setText("0");
            }
        });

    }
    private void setupUIViews(){

        addBtn = (Button) findViewById(R.id.addBtn);
        subBtn = (Button) findViewById(R.id.subBtn);
        mulBtn = (Button) findViewById(R.id.mulBtn);
        divBtn = (Button) findViewById(R.id.divBtn);
        oneBtn = (Button) findViewById(R.id.oneBtn);
        twoBtn = (Button) findViewById(R.id.twoBtn);
        threeBtn = (Button) findViewById(R.id.threeBtn);
        fourBtn = (Button) findViewById(R.id.fourBtn);
        fiveBtn = (Button) findViewById(R.id.fiveBtn);
        sixBtn = (Button) findViewById(R.id.sixBtn);
        sevenBtn = (Button) findViewById(R.id.sevenBtn);
        eightBtn = (Button) findViewById(R.id.eightBtn);
        nineBtn = (Button) findViewById(R.id.nineBtn);
        zeroBtn = (Button) findViewById(R.id.zeroBtn);
        //signBtn = (Button) findViewById(R.id.signBtn);
        //percentBtn = (Button) findViewById(R.id.percentBtn);
        equalBtn = (Button) findViewById(R.id.equalBtn);
        clearBtn = (Button) findViewById(R.id.clearBtn);
        resultTextView = (TextView) findViewById(R.id.resultTextView);
    }

}
