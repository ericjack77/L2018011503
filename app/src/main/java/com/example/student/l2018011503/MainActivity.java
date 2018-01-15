package com.example.student.l2018011503;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.editText);
        tv=findViewById(R.id.textView);
    }

    public  void clickWrite(View v)
    {
        SharedPreferences sp = getSharedPreferences("mydata",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("data1",et.getText().toString());
        editor.commit();
    }
    public void clickRead(View v)
    {
        SharedPreferences sp = getSharedPreferences("mydata",MODE_PRIVATE);
        String str = sp.getString("data1","");
        tv.setText(str);
    }
}
