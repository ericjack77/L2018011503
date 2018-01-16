package com.example.student.l2018011503;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.PreferenceManager;
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

    public void clickSet(View v)
    {
        Intent it = new Intent(MainActivity.this,SettingsActivity.class);
        startActivity(it);
    }

    public void clickRead2(View v)
    {
        //SharedPreferences sp = getSharedPreferences("com.example.student.l2018011503_preferences",MODE_PRIVATE);
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        //上面兩句意思一樣
        String str = sp.getString("example_text","");
        tv.setText(str);
    }
}
