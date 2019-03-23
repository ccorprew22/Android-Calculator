package com.example.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Somewhat works at launch for addition and subtraction
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
    //static int result = 0;
    static String symbol = "";
    static Integer val1 = 0;
    static Integer val2 = 0;
    static String num = "";
    static Integer res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();



        zeroBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(resultTextView.getText().toString() == "0") {
                    resultTextView.setText(resultTextView.getText().toString());
                }else{
                    resultTextView.setText(resultTextView.getText().toString() + "0");
                }
            }
        });
        oneBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(resultTextView.getText().toString() == "0"){
                    resultTextView.setText("1");
                }else{
                    resultTextView.setText(resultTextView.getText().toString() + "1");
                }
                num += "1";
            }
        });
        twoBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (resultTextView.getText().toString() == "0") {
                    resultTextView.setText("2");
                } else {
                    resultTextView.setText(resultTextView.getText().toString() + "2");
                }
                num += "2";
            }
        });
        threeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(resultTextView.getText().toString() == "0"){
                    resultTextView.setText("3");
                }else {
                    resultTextView.setText(resultTextView.getText().toString() + "3");
                }
                num += "3";
            }
        });
        fourBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(resultTextView.getText().toString() == "0"){
                    resultTextView.setText("4");
                }else {
                    resultTextView.setText(resultTextView.getText().toString() + "4");
                }
                num += "4";
            }
        });
        fiveBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(resultTextView.getText().toString() == "0"){
                    resultTextView.setText("5");
                }else {
                    resultTextView.setText(resultTextView.getText().toString() + "5");
                }
                num += "5";
            }
        });
        sixBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(resultTextView.getText().toString() == "0"){
                    resultTextView.setText("6");
                }else {
                    resultTextView.setText(resultTextView.getText().toString() + "6");
                }
                num += "6";
            }
        });
        sevenBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(resultTextView.getText().toString() == "0"){
                    resultTextView.setText("7");
                }else {
                    resultTextView.setText(resultTextView.getText().toString() + "7");
                }
                num += "7";
            }
        });
        eightBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(resultTextView.getText().toString() == "0"){
                    resultTextView.setText("8");
                }else {
                    resultTextView.setText(resultTextView.getText().toString() + "8");
                }
                num += "8";
            }
        });
        nineBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(resultTextView.getText().toString() == "0"){
                    resultTextView.setText("9");
                }else {
                    resultTextView.setText(resultTextView.getText().toString() + "9");
                }
                num += "9";
            }
        });


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (symbol == "") {
                    val1 = Integer.parseInt(num);
                    symbol = "+";
                    num = "";
                }else if(symbol != ""){
                    val2 = Integer.parseInt(num);
                    val1 = compute(val1, symbol, val2);
                    num = "";
                }
                resultTextView.setText(resultTextView.getText().toString() + " + ");
            }
        });
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (symbol == "") {
                    val1 = Integer.parseInt(num);
                    symbol = "-";
                    num = "";
                }else if(symbol != ""){
                    val2 = Integer.parseInt(num);
                    val1 = compute(val1, symbol, val2);
                    num = "";
                }
                resultTextView.setText(resultTextView.getText().toString() + " - ");
            }
        });
        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int val = Integer.parseInt(resultTextView.getText().toString());
                String symbol = "*";

                Integer res = compute(val1, symbol, val2);
                resultTextView.setText("0");
            }
        });
        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int val1 = Integer.parseInt(resultTextView.getText().toString());
                String symbol = "/";

                res = compute(val1, symbol, val2);
                resultTextView.setText("0");
            }
        });
        equalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                val2 = Integer.parseInt(num);
                val1 = compute(val1, symbol, val2);
                symbol = "";
                resultTextView.setText(val1.toString());
            }
        });
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                val1 = 0;
                val2 = 0;
                symbol = "";
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

    public static int compute(int v1, String sym, int v2){
        int result = 0;
        if(sym == "+"){
            result = v1 + v2;
        }else if(sym == "-"){
            result = v1 - v2;
        }else if(sym == "/"){
            result = v1 / v2;
        }else if(sym == "*"){
            result = v1 * v2;
        }
        return result;
    }

}
