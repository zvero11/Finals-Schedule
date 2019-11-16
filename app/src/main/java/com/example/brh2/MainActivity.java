package com.example.brh2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import static java.util.stream.Stream.builder;


public class MainActivity extends AppCompatActivity {

    public static Stack<String> sched = new Stack<>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void enter (View view){
        EditText et = (EditText) findViewById(R.id.editText);
        TextView tv = (TextView) findViewById(R.id.txtAdded);

        tv.setText(et.getText().toString() + " has been added!");
        sched.add(et.getText().toString());
        et.setText("");

    }

    public void newPage (View view) {
        Intent i = new Intent(this, Schedule.class);
        startActivity(i);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
       // startActivity(new Intent(this, Schedule.class));
        //overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    public static Stack<String> getSched() {
        return sched;
    }
}
