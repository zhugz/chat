package com.redbear.chat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {


    private Button choiceBtn = null;
    private RadioGroup choice = null;
    private RadioButton leftBtn = null;
    private RadioButton rightBtn = null;
    private RadioButton heartBtn = null;
    private RadioButton customBtn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        choiceBtn = (Button)findViewById(R.id.choiceBtn);
        choice = (RadioGroup)findViewById(R.id.choice);
        leftBtn = (RadioButton)findViewById(R.id.leftBtn);
        rightBtn = (RadioButton)findViewById(R.id.rightBtn);
        heartBtn = (RadioButton)findViewById(R.id.heartBtn);
        customBtn = (RadioButton)findViewById(R.id.customBtn);
        choiceBtn.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            int selected = choice.getCheckedRadioButtonId();
            if(customBtn.getId() == selected){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,CustomActivity.class);
                startActivity(intent);
            } else if(leftBtn.getId() == selected){
                Toast.makeText(MainActivity.this,"你选择了向左",Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(MainActivity.this,"请选择！",Toast.LENGTH_LONG).show();
            }
        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
