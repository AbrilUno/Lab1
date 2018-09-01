package com.example.april.lab1;

import android.support.v7.app.AppCompatActivity;
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

        Button pressMeButton = (Button) findViewById(R.id.pressMe);
        pressMeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                final EditText inputEditText1 = (EditText) findViewById(R.id.EditText1);
                final EditText inputEditText2 = (EditText) findViewById(R.id.EditText2);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int firstNum = Integer.parseInt(inputEditText1.getText().toString());
                int secondNum = Integer.parseInt(inputEditText2.getText().toString());

                if (firstNum > secondNum) {
                    resultTextView.setText("First number is higher :)");
                }
                else if (firstNum < secondNum){
                    resultTextView.setText("Second number is higher :)");
                }
                else {
                    resultTextView.setText("Numbers are equal :)");
                }
            }
        });

        Button pressMeButton2 = (Button) findViewById(R.id.pressMe2);
        pressMeButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                int current=1,count=0;
                String result="";
                do{
                    if(current%2==0){
                        result+= " "+current;
                        count++;
                    }
                    current++;
                }while(count!=10);

                resultTextView.setText(result);
            }
        });
    }
}
