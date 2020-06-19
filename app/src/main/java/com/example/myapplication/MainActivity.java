package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox c1;
    private CheckBox c2;
    private CheckBox c3;
    private Button b1;
    public static RadioGroup r1;
    public static RadioButton rb_selected;
    public static Button b2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        addListenerToCheckBox();
        addListenerOnButtonR();
    }
    public void addListenerToCheckBox(){
        c1 = (CheckBox) findViewById(R.id.checkBox);
        c2 = (CheckBox) findViewById(R.id.checkBox2);
        c3 = (CheckBox) findViewById(R.id.checkBox3);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c1.isChecked()){
                    Toast.makeText(MainActivity.this, c1.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c2.isChecked()){
                    Toast.makeText(MainActivity.this, c2.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c3.isChecked()){
                    Toast.makeText(MainActivity.this, c3.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void addListenerOnButton(){
        c1 = (CheckBox) findViewById(R.id.checkBox);
        c2 = (CheckBox) findViewById(R.id.checkBox2);
        c3 = (CheckBox) findViewById(R.id.checkBox3);
        b1 =  (Button)  findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("Dog: ").append(c1.isChecked());
                result.append("\nCat: ").append(c2.isChecked());
                result.append("\nPig: ").append(c3.isChecked());

                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void addListenerOnButtonR(){
        r1 = (RadioGroup) findViewById(R.id.radioGroup3);
        b2 = (Button) findViewById(R.id.button2);

        b2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                 int selected_id = r1.getCheckedRadioButtonId(); // returns the id of the RadioButton(or -1 if no RadioButtons are checked)
                 rb_selected = (RadioButton) findViewById(selected_id);
                Log.d("R",Integer.toString(selected_id));
                 Toast.makeText(MainActivity.this,  rb_selected.getText() ,
                         Toast.LENGTH_LONG).show();
            }
        });
    }

}
