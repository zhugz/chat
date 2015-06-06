package com.BlueMatrix.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.app.Activity;

import com.BlueMatrix.ble.BlueAction;

public class CustomActivity extends Activity {
    private byte CustomPattern[]={
            0x0,0x0,0x0,0x0,                //µÚÒ»ÐÐ
            0x0,0x0,0x0,0x0,
            0x0,0x0,0x0,0x0,
            0x0,0x0,0x0,0x0,
            0x0,0x0,0x0,0x0,
            0x0,0x0,0x0,0x0,
            0x0,0x0,0x0,0x0,
            0x0,0x0,0x0,0x0,
            0x0,0x0,0x0,0x0,
            0x0,0x0,0x0,0x0,
            0x0,0x0,0x0,0x0,
            0x0,0x0,0x0,0x0,
            0x0,0x0,0x0,0x0,
            0x0,0x0,0x0,0x0,
            0x0,0x0,0x0,0x0,
            0x0,0x0,0x0,0x0
    };


    private CheckBox chBoxA1,chBoxA2,chBoxA3,chBoxA4,chBoxA5,chBoxA6,chBoxA7,chBoxA8,chBoxA9,chBoxA10,
            chBoxA11,chBoxA12,chBoxA13,chBoxA14,
			chBoxB1,chBoxB2,chBoxB3,chBoxB4,chBoxB5,chBoxB6,chBoxB7,chBoxB8,chBoxB9,chBoxB10,
            chBoxB11,chBoxB12,chBoxB13,chBoxB14,
			chBoxC1,chBoxC2,chBoxC3,chBoxC4,chBoxC5,chBoxC6,chBoxC7,chBoxC8,chBoxC9,chBoxC10,
            chBoxC11,chBoxC12,chBoxC13,chBoxC14,
			chBoxD1,chBoxD2,chBoxD3,chBoxD4,chBoxD5,chBoxD6,chBoxD7,chBoxD8,chBoxD9,chBoxD10,
            chBoxD11,chBoxD12,chBoxD13,chBoxD14,
			chBoxE1,chBoxE2,chBoxE3,chBoxE4,chBoxE5,chBoxE6,chBoxE7,chBoxE8,chBoxE9,chBoxE10,
            chBoxE11,chBoxE12,chBoxE13,chBoxE14,
			chBoxF1,chBoxF2,chBoxF3,chBoxF4,chBoxF5,chBoxF6,chBoxF7,chBoxF8,chBoxF9,chBoxF10,
            chBoxF11,chBoxF12,chBoxF13,chBoxF14,
			chBoxG1,chBoxG2,chBoxG3,chBoxG4,chBoxG5,chBoxG6,chBoxG7,chBoxG8,chBoxG9,chBoxG10,
            chBoxG11,chBoxG12,chBoxG13,chBoxG14,
			chBoxH1,chBoxH2,chBoxH3,chBoxH4,chBoxH5,chBoxH6,chBoxH7,chBoxH8,chBoxH9,chBoxH10,
            chBoxH11,chBoxH12,chBoxH13,chBoxH14,
			chBoxI1,chBoxI2,chBoxI3,chBoxI4,chBoxI5,chBoxI6,chBoxI7,chBoxI8,chBoxI9,chBoxI10,
            chBoxI11,chBoxI12,chBoxI13,chBoxI14,
			chBoxJ1,chBoxJ2,chBoxJ3,chBoxJ4,chBoxJ5,chBoxJ6,chBoxJ7,chBoxJ8,chBoxJ9,chBoxJ10,
            chBoxJ11,chBoxJ12,chBoxJ13,chBoxJ14,
			chBoxK1,chBoxK2,chBoxK3,chBoxK4,chBoxK5,chBoxK6,chBoxK7,chBoxK8,chBoxK9,chBoxK10,
            chBoxK11,chBoxK12,chBoxK13,chBoxK14,
			chBoxL1,chBoxL2,chBoxL3,chBoxL4,chBoxL5,chBoxL6,chBoxL7,chBoxL8,chBoxL9,chBoxL10,
            chBoxL11,chBoxL12,chBoxL13,chBoxL14
			;

    private Button mainBtn,resetBtn,backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);

        mainBtn = (Button)findViewById(R.id.mainBtn);
        resetBtn = (Button)findViewById(R.id.resetBtn);
        backBtn = (Button)findViewById(R.id.backBtn);

        chBoxA1 = (CheckBox)findViewById(R.id.chBoxA1);
        chBoxA2 = (CheckBox)findViewById(R.id.chBoxA2);
        chBoxA3 = (CheckBox)findViewById(R.id.chBoxA3);
        chBoxA4 = (CheckBox)findViewById(R.id.chBoxA4);
        chBoxA5 = (CheckBox)findViewById(R.id.chBoxA5);
        chBoxA6 = (CheckBox)findViewById(R.id.chBoxA6);
        chBoxA7 = (CheckBox)findViewById(R.id.chBoxA7);
        chBoxA8 = (CheckBox)findViewById(R.id.chBoxA8);
        chBoxA9 = (CheckBox)findViewById(R.id.chBoxA9);
        chBoxA10 = (CheckBox)findViewById(R.id.chBoxA10);
        chBoxA11 = (CheckBox)findViewById(R.id.chBoxA11);
        chBoxA12 = (CheckBox)findViewById(R.id.chBoxA12);
        chBoxA13 = (CheckBox)findViewById(R.id.chBoxA13);
        chBoxA14 = (CheckBox)findViewById(R.id.chBoxA14);

        chBoxB1 = (CheckBox)findViewById(R.id.chBoxB1);
        chBoxB2 = (CheckBox)findViewById(R.id.chBoxB2);
        chBoxB3 = (CheckBox)findViewById(R.id.chBoxB3);
        chBoxB4 = (CheckBox)findViewById(R.id.chBoxB4);
        chBoxB5 = (CheckBox)findViewById(R.id.chBoxB5);
        chBoxB6 = (CheckBox)findViewById(R.id.chBoxB6);
        chBoxB7 = (CheckBox)findViewById(R.id.chBoxB7);
        chBoxB8 = (CheckBox)findViewById(R.id.chBoxB8);
        chBoxB9 = (CheckBox)findViewById(R.id.chBoxB9);
        chBoxB10 = (CheckBox)findViewById(R.id.chBoxB10);
        chBoxB11 = (CheckBox)findViewById(R.id.chBoxB11);
        chBoxB12 = (CheckBox)findViewById(R.id.chBoxB12);
        chBoxB13 = (CheckBox)findViewById(R.id.chBoxB13);
        chBoxB14 = (CheckBox)findViewById(R.id.chBoxB14);

		
		chBoxC1 = (CheckBox)findViewById(R.id.chBoxC1);
        chBoxC2 = (CheckBox)findViewById(R.id.chBoxC2);
        chBoxC3 = (CheckBox)findViewById(R.id.chBoxC3);
        chBoxC4 = (CheckBox)findViewById(R.id.chBoxC4);
        chBoxC5 = (CheckBox)findViewById(R.id.chBoxC5);
        chBoxC6 = (CheckBox)findViewById(R.id.chBoxC6);
        chBoxC7 = (CheckBox)findViewById(R.id.chBoxC7);
        chBoxC8 = (CheckBox)findViewById(R.id.chBoxC8);
        chBoxC9 = (CheckBox)findViewById(R.id.chBoxC9);
        chBoxC10 = (CheckBox)findViewById(R.id.chBoxC10);
        chBoxC11 = (CheckBox)findViewById(R.id.chBoxC11);
        chBoxC12 = (CheckBox)findViewById(R.id.chBoxC12);
        chBoxC13 = (CheckBox)findViewById(R.id.chBoxC13);
        chBoxC14 = (CheckBox)findViewById(R.id.chBoxC14);

		
		chBoxD1 = (CheckBox)findViewById(R.id.chBoxD1);
        chBoxD2 = (CheckBox)findViewById(R.id.chBoxD2);
        chBoxD3 = (CheckBox)findViewById(R.id.chBoxD3);
        chBoxD4 = (CheckBox)findViewById(R.id.chBoxD4);
        chBoxD5 = (CheckBox)findViewById(R.id.chBoxD5);
        chBoxD6 = (CheckBox)findViewById(R.id.chBoxD6);
        chBoxD7 = (CheckBox)findViewById(R.id.chBoxD7);
        chBoxD8 = (CheckBox)findViewById(R.id.chBoxD8);
        chBoxD9 = (CheckBox)findViewById(R.id.chBoxD9);
        chBoxD10 = (CheckBox)findViewById(R.id.chBoxD10);
        chBoxD11 = (CheckBox)findViewById(R.id.chBoxD11);
        chBoxD12 = (CheckBox)findViewById(R.id.chBoxD12);
        chBoxD13 = (CheckBox)findViewById(R.id.chBoxD13);
        chBoxD14 = (CheckBox)findViewById(R.id.chBoxD14);

		
		chBoxE1 = (CheckBox)findViewById(R.id.chBoxE1);
        chBoxE2 = (CheckBox)findViewById(R.id.chBoxE2);
        chBoxE3 = (CheckBox)findViewById(R.id.chBoxE3);
        chBoxE4 = (CheckBox)findViewById(R.id.chBoxE4);
        chBoxE5 = (CheckBox)findViewById(R.id.chBoxE5);
        chBoxE6 = (CheckBox)findViewById(R.id.chBoxE6);
        chBoxE7 = (CheckBox)findViewById(R.id.chBoxE7);
        chBoxE8 = (CheckBox)findViewById(R.id.chBoxE8);
        chBoxE9 = (CheckBox)findViewById(R.id.chBoxE9);
        chBoxE10 = (CheckBox)findViewById(R.id.chBoxE10);
        chBoxE11 = (CheckBox)findViewById(R.id.chBoxE11);
        chBoxE12 = (CheckBox)findViewById(R.id.chBoxE12);
        chBoxE13 = (CheckBox)findViewById(R.id.chBoxE13);
        chBoxE14 = (CheckBox)findViewById(R.id.chBoxE14);

		
		chBoxF1 = (CheckBox)findViewById(R.id.chBoxF1);
        chBoxF2 = (CheckBox)findViewById(R.id.chBoxF2);
        chBoxF3 = (CheckBox)findViewById(R.id.chBoxF3);
        chBoxF4 = (CheckBox)findViewById(R.id.chBoxF4);
        chBoxF5 = (CheckBox)findViewById(R.id.chBoxF5);
        chBoxF6 = (CheckBox)findViewById(R.id.chBoxF6);
        chBoxF7 = (CheckBox)findViewById(R.id.chBoxF7);
        chBoxF8 = (CheckBox)findViewById(R.id.chBoxF8);
        chBoxF9 = (CheckBox)findViewById(R.id.chBoxF9);
        chBoxF10 = (CheckBox)findViewById(R.id.chBoxF10);
        chBoxF11 = (CheckBox)findViewById(R.id.chBoxF11);
        chBoxF12 = (CheckBox)findViewById(R.id.chBoxF12);
        chBoxF13 = (CheckBox)findViewById(R.id.chBoxF13);
        chBoxF14 = (CheckBox)findViewById(R.id.chBoxF14);

		
		chBoxG1 = (CheckBox)findViewById(R.id.chBoxG1);
        chBoxG2 = (CheckBox)findViewById(R.id.chBoxG2);
        chBoxG3 = (CheckBox)findViewById(R.id.chBoxG3);
        chBoxG4 = (CheckBox)findViewById(R.id.chBoxG4);
        chBoxG5 = (CheckBox)findViewById(R.id.chBoxG5);
        chBoxG6 = (CheckBox)findViewById(R.id.chBoxG6);
        chBoxG7 = (CheckBox)findViewById(R.id.chBoxG7);
        chBoxG8 = (CheckBox)findViewById(R.id.chBoxG8);
        chBoxG9 = (CheckBox)findViewById(R.id.chBoxG9);
        chBoxG10 = (CheckBox)findViewById(R.id.chBoxG10);
        chBoxG11 = (CheckBox)findViewById(R.id.chBoxG11);
        chBoxG12 = (CheckBox)findViewById(R.id.chBoxG12);
        chBoxG13 = (CheckBox)findViewById(R.id.chBoxG13);
        chBoxG14 = (CheckBox)findViewById(R.id.chBoxG14);

		
		chBoxH1 = (CheckBox)findViewById(R.id.chBoxH1);
        chBoxH2 = (CheckBox)findViewById(R.id.chBoxH2);
        chBoxH3 = (CheckBox)findViewById(R.id.chBoxH3);
        chBoxH4 = (CheckBox)findViewById(R.id.chBoxH4);
        chBoxH5 = (CheckBox)findViewById(R.id.chBoxH5);
        chBoxH6 = (CheckBox)findViewById(R.id.chBoxH6);
        chBoxH7 = (CheckBox)findViewById(R.id.chBoxH7);
        chBoxH8 = (CheckBox)findViewById(R.id.chBoxH8);
        chBoxH9 = (CheckBox)findViewById(R.id.chBoxH9);
        chBoxH10 = (CheckBox)findViewById(R.id.chBoxH10);
        chBoxH11 = (CheckBox)findViewById(R.id.chBoxH11);
        chBoxH12 = (CheckBox)findViewById(R.id.chBoxH12);
        chBoxH13 = (CheckBox)findViewById(R.id.chBoxH13);
        chBoxH14 = (CheckBox)findViewById(R.id.chBoxH14);

		
		chBoxI1 = (CheckBox)findViewById(R.id.chBoxI1);
        chBoxI2 = (CheckBox)findViewById(R.id.chBoxI2);
        chBoxI3 = (CheckBox)findViewById(R.id.chBoxI3);
        chBoxI4 = (CheckBox)findViewById(R.id.chBoxI4);
        chBoxI5 = (CheckBox)findViewById(R.id.chBoxI5);
        chBoxI6 = (CheckBox)findViewById(R.id.chBoxI6);
        chBoxI7 = (CheckBox)findViewById(R.id.chBoxI7);
        chBoxI8 = (CheckBox)findViewById(R.id.chBoxI8);
        chBoxI9 = (CheckBox)findViewById(R.id.chBoxI9);
        chBoxI10 = (CheckBox)findViewById(R.id.chBoxI10);
        chBoxI11 = (CheckBox)findViewById(R.id.chBoxI11);
        chBoxI12 = (CheckBox)findViewById(R.id.chBoxI12);
        chBoxI13 = (CheckBox)findViewById(R.id.chBoxI13);
        chBoxI14 = (CheckBox)findViewById(R.id.chBoxI14);

		
		chBoxJ1 = (CheckBox)findViewById(R.id.chBoxJ1);
        chBoxJ2 = (CheckBox)findViewById(R.id.chBoxJ2);
        chBoxJ3 = (CheckBox)findViewById(R.id.chBoxJ3);
        chBoxJ4 = (CheckBox)findViewById(R.id.chBoxJ4);
        chBoxJ5 = (CheckBox)findViewById(R.id.chBoxJ5);
        chBoxJ6 = (CheckBox)findViewById(R.id.chBoxJ6);
        chBoxJ7 = (CheckBox)findViewById(R.id.chBoxJ7);
        chBoxJ8 = (CheckBox)findViewById(R.id.chBoxJ8);
        chBoxJ9 = (CheckBox)findViewById(R.id.chBoxJ9);
        chBoxJ10 = (CheckBox)findViewById(R.id.chBoxJ10);
        chBoxJ11 = (CheckBox)findViewById(R.id.chBoxJ11);
        chBoxJ12 = (CheckBox)findViewById(R.id.chBoxJ12);
        chBoxJ13 = (CheckBox)findViewById(R.id.chBoxJ13);
        chBoxJ14 = (CheckBox)findViewById(R.id.chBoxJ14);

		
		chBoxK1 = (CheckBox)findViewById(R.id.chBoxK1);
        chBoxK2 = (CheckBox)findViewById(R.id.chBoxK2);
        chBoxK3 = (CheckBox)findViewById(R.id.chBoxK3);
        chBoxK4 = (CheckBox)findViewById(R.id.chBoxK4);
        chBoxK5 = (CheckBox)findViewById(R.id.chBoxK5);
        chBoxK6 = (CheckBox)findViewById(R.id.chBoxK6);
        chBoxK7 = (CheckBox)findViewById(R.id.chBoxK7);
        chBoxK8 = (CheckBox)findViewById(R.id.chBoxK8);
        chBoxK9 = (CheckBox)findViewById(R.id.chBoxK9);
        chBoxK10 = (CheckBox)findViewById(R.id.chBoxK10);
        chBoxK11 = (CheckBox)findViewById(R.id.chBoxK11);
        chBoxK12 = (CheckBox)findViewById(R.id.chBoxK12);
        chBoxK13 = (CheckBox)findViewById(R.id.chBoxK13);
        chBoxK14 = (CheckBox)findViewById(R.id.chBoxK14);

		
		chBoxL1 = (CheckBox)findViewById(R.id.chBoxL1);
        chBoxL2 = (CheckBox)findViewById(R.id.chBoxL2);
        chBoxL3 = (CheckBox)findViewById(R.id.chBoxL3);
        chBoxL4 = (CheckBox)findViewById(R.id.chBoxL4);
        chBoxL5 = (CheckBox)findViewById(R.id.chBoxL5);
        chBoxL6 = (CheckBox)findViewById(R.id.chBoxL6);
        chBoxL7 = (CheckBox)findViewById(R.id.chBoxL7);
        chBoxL8 = (CheckBox)findViewById(R.id.chBoxL8);
        chBoxL9 = (CheckBox)findViewById(R.id.chBoxL9);
        chBoxL10 = (CheckBox)findViewById(R.id.chBoxL10);
        chBoxL11 = (CheckBox)findViewById(R.id.chBoxL11);
        chBoxL12 = (CheckBox)findViewById(R.id.chBoxL12);
        chBoxL13 = (CheckBox)findViewById(R.id.chBoxL13);
        chBoxL14 = (CheckBox)findViewById(R.id.chBoxL14);


        backBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(CustomActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                chBoxA1.setChecked(false);
                chBoxA2.setChecked(false);
                chBoxA3.setChecked(false);
                chBoxA4.setChecked(false);
                chBoxA5.setChecked(false);
                chBoxA6.setChecked(false);
                chBoxA7.setChecked(false);
                chBoxA8.setChecked(false);
                chBoxA9.setChecked(false);
                chBoxA10.setChecked(false);
				chBoxA11.setChecked(false);
                chBoxA12.setChecked(false);
                chBoxA13.setChecked(false);
                chBoxA14.setChecked(false);

				
				chBoxB1.setChecked(false);
                chBoxB2.setChecked(false);
                chBoxB3.setChecked(false);
                chBoxB4.setChecked(false);
                chBoxB5.setChecked(false);
                chBoxB6.setChecked(false);
                chBoxB7.setChecked(false);
                chBoxB8.setChecked(false);
                chBoxB9.setChecked(false);
                chBoxB10.setChecked(false);
				chBoxB11.setChecked(false);
                chBoxB12.setChecked(false);
                chBoxB13.setChecked(false);
                chBoxB14.setChecked(false);

				
				chBoxC1.setChecked(false);
                chBoxC2.setChecked(false);
                chBoxC3.setChecked(false);
                chBoxC4.setChecked(false);
                chBoxC5.setChecked(false);
                chBoxC6.setChecked(false);
                chBoxC7.setChecked(false);
                chBoxC8.setChecked(false);
                chBoxC9.setChecked(false);
                chBoxC10.setChecked(false);
				chBoxC11.setChecked(false);
                chBoxC12.setChecked(false);
                chBoxC13.setChecked(false);
                chBoxC14.setChecked(false);

				
				chBoxD1.setChecked(false);
                chBoxD2.setChecked(false);
                chBoxD3.setChecked(false);
                chBoxD4.setChecked(false);
                chBoxD5.setChecked(false);
                chBoxD6.setChecked(false);
                chBoxD7.setChecked(false);
                chBoxD8.setChecked(false);
                chBoxD9.setChecked(false);
                chBoxD10.setChecked(false);
				chBoxD11.setChecked(false);
                chBoxD12.setChecked(false);
                chBoxD13.setChecked(false);
                chBoxD14.setChecked(false);

				
				chBoxE1.setChecked(false);
                chBoxE2.setChecked(false);
                chBoxE3.setChecked(false);
                chBoxE4.setChecked(false);
                chBoxE5.setChecked(false);
                chBoxE6.setChecked(false);
                chBoxE7.setChecked(false);
                chBoxE8.setChecked(false);
                chBoxE9.setChecked(false);
                chBoxE10.setChecked(false);
				chBoxE11.setChecked(false);
                chBoxE12.setChecked(false);
                chBoxE13.setChecked(false);
                chBoxE14.setChecked(false);

				
				chBoxF1.setChecked(false);
                chBoxF2.setChecked(false);
                chBoxF3.setChecked(false);
                chBoxF4.setChecked(false);
                chBoxF5.setChecked(false);
                chBoxF6.setChecked(false);
                chBoxF7.setChecked(false);
                chBoxF8.setChecked(false);
                chBoxF9.setChecked(false);
                chBoxF10.setChecked(false);
				chBoxF11.setChecked(false);
                chBoxF12.setChecked(false);
                chBoxF13.setChecked(false);
                chBoxF14.setChecked(false);

				
				chBoxG1.setChecked(false);
                chBoxG2.setChecked(false);
                chBoxG3.setChecked(false);
                chBoxG4.setChecked(false);
                chBoxG5.setChecked(false);
                chBoxG6.setChecked(false);
                chBoxG7.setChecked(false);
                chBoxG8.setChecked(false);
                chBoxG9.setChecked(false);
                chBoxG10.setChecked(false);
				chBoxG11.setChecked(false);
                chBoxG12.setChecked(false);
                chBoxG13.setChecked(false);
                chBoxG14.setChecked(false);

				
				chBoxH1.setChecked(false);
                chBoxH2.setChecked(false);
                chBoxH3.setChecked(false);
                chBoxH4.setChecked(false);
                chBoxH5.setChecked(false);
                chBoxH6.setChecked(false);
                chBoxH7.setChecked(false);
                chBoxH8.setChecked(false);
                chBoxH9.setChecked(false);
                chBoxH10.setChecked(false);
				chBoxH11.setChecked(false);
                chBoxH12.setChecked(false);
                chBoxH13.setChecked(false);
                chBoxH14.setChecked(false);

				
				chBoxI1.setChecked(false);
                chBoxI2.setChecked(false);
                chBoxI3.setChecked(false);
                chBoxI4.setChecked(false);
                chBoxI5.setChecked(false);
                chBoxI6.setChecked(false);
                chBoxI7.setChecked(false);
                chBoxI8.setChecked(false);
                chBoxI9.setChecked(false);
                chBoxI10.setChecked(false);
				chBoxI11.setChecked(false);
                chBoxI12.setChecked(false);
                chBoxI13.setChecked(false);
                chBoxI14.setChecked(false);

				
				chBoxJ1.setChecked(false);
                chBoxJ2.setChecked(false);
                chBoxJ3.setChecked(false);
                chBoxJ4.setChecked(false);
                chBoxJ5.setChecked(false);
                chBoxJ6.setChecked(false);
                chBoxJ7.setChecked(false);
                chBoxJ8.setChecked(false);
                chBoxJ9.setChecked(false);
                chBoxJ10.setChecked(false);
				chBoxJ11.setChecked(false);
                chBoxJ12.setChecked(false);
                chBoxJ13.setChecked(false);
                chBoxJ14.setChecked(false);

				
				chBoxK1.setChecked(false);
                chBoxK2.setChecked(false);
                chBoxK3.setChecked(false);
                chBoxK4.setChecked(false);
                chBoxK5.setChecked(false);
                chBoxK6.setChecked(false);
                chBoxK7.setChecked(false);
                chBoxK8.setChecked(false);
                chBoxK9.setChecked(false);
                chBoxK10.setChecked(false);
				chBoxK11.setChecked(false);
                chBoxK12.setChecked(false);
                chBoxK13.setChecked(false);
                chBoxK14.setChecked(false);

				
				chBoxL1.setChecked(false);
                chBoxL2.setChecked(false);
                chBoxL3.setChecked(false);
                chBoxL4.setChecked(false);
                chBoxL5.setChecked(false);
                chBoxL6.setChecked(false);
                chBoxL7.setChecked(false);
                chBoxL8.setChecked(false);
                chBoxL9.setChecked(false);
                chBoxL10.setChecked(false);
				chBoxL11.setChecked(false);
                chBoxL12.setChecked(false);
                chBoxL13.setChecked(false);
                chBoxL14.setChecked(false);

				
            }
        });

        mainBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                byte mydata[]={0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,
                        0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,
                        0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,
                        0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0};
                String checkVaule = "";
                int a00 = 0;
                int a01 = 0;
                int a02 = 0;
                int a03 = 0;
                int a04 = 0;
                int b00 = 0;
                int b01 = 0;
                int b02 = 0;
                int b03 = 0;
                int b04 = 0;
                int c00 = 0;
                int c01 = 0;
                int c02 = 0;
                int c03 = 0;
                int c04 = 0;
                int d00 = 0;
                int d01 = 0;
                int d02 = 0;
                int d03 = 0;
                int d04 = 0;
                int e00 = 0;
                int e01 = 0;
                int e02 = 0;
                int e03 = 0;
                int e04 = 0;
                int f00 = 0;
                int f01 = 0;
                int f02 = 0;
                int f03 = 0;
                int f04 = 0;
                int g00 = 0;
                int g01 = 0;
                int g02 = 0;
                int g03 = 0;
                int g04 = 0;
                int h00 = 0;
                int h01 = 0;
                int h02 = 0;
                int h03 = 0;
                int h04 = 0;
                int i00 = 0;
                int i01 = 0;
                int i02 = 0;
                int i03 = 0;
                int i04 = 0;
                int j00 = 0;
                int j01 = 0;
                int j02 = 0;
                int j03 = 0;
                int j04 = 0;
                int k00 = 0;
                int k01 = 0;
                int k02 = 0;
                int k03 = 0;
                int k04 = 0;
                int l00 = 0;
                int l01 = 0;
                int l02 = 0;
                int l03 = 0;
                int l04 = 0;
                int m00 = 0;
                int m01 = 0;
                int m02 = 0;
                int m03 = 0;
                int m04 = 0;
                int n00 = 0;
                int n01 = 0;
                int n02 = 0;
                int n03 = 0;
                int n04 = 0;
				int o00 = 0;
                int o01 = 0;
                int o02 = 0;
                int o03 = 0;
                int o04 = 0;
				int p00 = 0;
                int p01 = 0;
                int p02 = 0;
                int p03 = 0;
                int p04 = 0;
				int q00 = 0;
                int q01 = 0;
                int q02 = 0;
                int q03 = 0;
                int q04 = 0;
				int r00 = 0;
                int r01 = 0;
                int r02 = 0;
                int r03 = 0;
                int r04 = 0;
				int s00 = 0;
                int s01 = 0;
                int s02 = 0;
                int s03 = 0;
                int s04 = 0;
				int t00 = 0;
                int t01 = 0;
                int t02 = 0;
                int t03 = 0;
                int t04 = 0;
                int base1 = 8;
                int base2 = 4;
                int base4 = 2;
				int base8 = 1;
                if(chBoxA1.isChecked()){
                   a00 += base1;
                }
                if(chBoxA2.isChecked()){
                   a00 += base2;
                }
                if(chBoxA3.isChecked()){
                   a00 += base4;
                }
                if(chBoxA4.isChecked()){
                   a00 += base8;
                }
                if(chBoxA5.isChecked()){
                    a01 += base1;
                }
                if(chBoxA6.isChecked()){
                    a01 += base2;
                }
                if(chBoxA7.isChecked()){
                    a01 += base4;
                }
                if(chBoxA8.isChecked()){
                    a01 += base8;
                }
                if(chBoxA9.isChecked()){
                    a02 += base1;
                }
                if(chBoxA10.isChecked()){
                    a02 += base2;
                }
                if(chBoxA11.isChecked()){
                    a02 += base4;
                }
                if(chBoxA12.isChecked()){
                    a02 += base8;
                }
                if(chBoxA13.isChecked()){
                   a03 += base1;
                }
                if(chBoxA14.isChecked()){
                   a03 += base2;
                }

				
				if(chBoxB1.isChecked()){
                   b00 += base1;
                }
                if(chBoxB2.isChecked()){
                   b00 += base2;
                }
                if(chBoxB3.isChecked()){
                   b00 += base4;
                }
                if(chBoxB4.isChecked()){
                   b00 += base8;
                }
                if(chBoxB5.isChecked()){
                    b01 += base1;
                }
                if(chBoxB6.isChecked()){
                    b01 += base2;
                }
                if(chBoxB7.isChecked()){
                    b01 += base4;
                }
                if(chBoxB8.isChecked()){
                    b01 += base8;
                }
                if(chBoxB9.isChecked()){
                    b02 += base1;
                }
                if(chBoxB10.isChecked()){
                    b02 += base2;
                }
                if(chBoxB11.isChecked()){
                    b02 += base4;
                }
                if(chBoxB12.isChecked()){
                    b02 += base8;
                }
                if(chBoxB13.isChecked()){
                   b03 += base1;
                }
                if(chBoxB14.isChecked()){
                   b03 += base2;
                }

				
				if(chBoxC1.isChecked()){
                   c00 += base1;
                }
                if(chBoxC2.isChecked()){
                   c00 += base2;
                }
                if(chBoxC3.isChecked()){
                   c00 += base4;
                }
                if(chBoxC4.isChecked()){
                   c00 += base8;
                }
                if(chBoxC5.isChecked()){
                    c01 += base1;
                }
                if(chBoxC6.isChecked()){
                    c01 += base2;
                }
                if(chBoxC7.isChecked()){
                    c01 += base4;
                }
                if(chBoxC8.isChecked()){
                    c01 += base8;
                }
                if(chBoxC9.isChecked()){
                    c02 += base1;
                }
                if(chBoxC10.isChecked()){
                    c02 += base2;
                }
                if(chBoxC11.isChecked()){
                    c02 += base4;
                }
                if(chBoxC12.isChecked()){
                    c02 += base8;
                }
                if(chBoxC13.isChecked()){
                   c03 += base1;
                }
                if(chBoxC14.isChecked()){
                   c03 += base2;
                }

				
				if(chBoxD1.isChecked()){
                   d00 += base1;
                }
                if(chBoxD2.isChecked()){
                   d00 += base2;
                }
                if(chBoxD3.isChecked()){
                   d00 += base4;
                }
                if(chBoxD4.isChecked()){
                   d00 += base8;
                }
                if(chBoxD5.isChecked()){
                    d01 += base1;
                }
                if(chBoxD6.isChecked()){
                    d01 += base2;
                }
                if(chBoxD7.isChecked()){
                    d01 += base4;
                }
                if(chBoxD8.isChecked()){
                    d01 += base8;
                }
                if(chBoxD9.isChecked()){
                    d02 += base1;
                }
                if(chBoxD10.isChecked()){
                    d02 += base2;
                }
                if(chBoxD11.isChecked()){
                    d02 += base4;
                }
                if(chBoxD12.isChecked()){
                    d02 += base8;
                }
                if(chBoxD13.isChecked()){
                   d03 += base1;
                }
                if(chBoxD14.isChecked()){
                   d03 += base2;
                }

				
				if(chBoxE1.isChecked()){
                   e00 += base1;
                }
                if(chBoxE2.isChecked()){
                   e00 += base2;
                }
                if(chBoxE3.isChecked()){
                   e00 += base4;
                }
                if(chBoxE4.isChecked()){
                   e00 += base8;
                }
                if(chBoxE5.isChecked()){
                    e01 += base1;
                }
                if(chBoxE6.isChecked()){
                    e01 += base2;
                }
                if(chBoxE7.isChecked()){
                    e01 += base4;
                }
                if(chBoxE8.isChecked()){
                    e01 += base8;
                }
                if(chBoxE9.isChecked()){
                    e02 += base1;
                }
                if(chBoxE10.isChecked()){
                    e02 += base2;
                }
                if(chBoxE11.isChecked()){
                    e02 += base4;
                }
                if(chBoxE12.isChecked()){
                    e02 += base8;
                }
                if(chBoxE13.isChecked()){
                   e03 += base1;
                }
                if(chBoxE14.isChecked()){
                   e03 += base2;
                }

				if(chBoxF1.isChecked()){
                   f00 += base1;
                }
                if(chBoxF2.isChecked()){
                   f00 += base2;
                }
                if(chBoxF3.isChecked()){
                   f00 += base4;
                }
                if(chBoxF4.isChecked()){
                   f00 += base8;
                }
                if(chBoxF5.isChecked()){
                    f01 += base1;
                }
                if(chBoxF6.isChecked()){
                    f01 += base2;
                }
                if(chBoxF7.isChecked()){
                    f01 += base4;
                }
                if(chBoxF8.isChecked()){
                    f01 += base8;
                }
                if(chBoxF9.isChecked()){
                    f02 += base1;
                }
                if(chBoxF10.isChecked()){
                    f02 += base2;
                }
                if(chBoxF11.isChecked()){
                    f02 += base4;
                }
                if(chBoxF12.isChecked()){
                    f02 += base8;
                }
                if(chBoxF13.isChecked()){
                   f03 += base1;
                }
                if(chBoxF14.isChecked()){
                   f03 += base2;
                }

				
				if(chBoxG1.isChecked()){
                   g00 += base1;
                }
                if(chBoxG2.isChecked()){
                   g00 += base2;
                }
                if(chBoxG3.isChecked()){
                   g00 += base4;
                }
                if(chBoxG4.isChecked()){
                   g00 += base8;
                }
                if(chBoxG5.isChecked()){
                    g01 += base1;
                }
                if(chBoxG6.isChecked()){
                    g01 += base2;
                }
                if(chBoxG7.isChecked()){
                    g01 += base4;
                }
                if(chBoxG8.isChecked()){
                    g01 += base8;
                }
                if(chBoxG9.isChecked()){
                    g02 += base1;
                }
                if(chBoxG10.isChecked()){
                    g02 += base2;
                }
                if(chBoxG11.isChecked()){
                    g02 += base4;
                }
                if(chBoxG12.isChecked()){
                    g02 += base8;
                }
                if(chBoxG13.isChecked()){
                   g03 += base1;
                }
                if(chBoxG14.isChecked()){
                   g03 += base2;
                }

				
				if(chBoxH1.isChecked()){
                   h00 += base1;
                }
                if(chBoxH2.isChecked()){
                   h00 += base2;
                }
                if(chBoxH3.isChecked()){
                   h00 += base4;
                }
                if(chBoxH4.isChecked()){
                   h00 += base8;
                }
                if(chBoxH5.isChecked()){
                    h01 += base1;
                }
                if(chBoxH6.isChecked()){
                    h01 += base2;
                }
                if(chBoxH7.isChecked()){
                    h01 += base4;
                }
                if(chBoxH8.isChecked()){
                    h01 += base8;
                }
                if(chBoxH9.isChecked()){
                    h02 += base1;
                }
                if(chBoxH10.isChecked()){
                    h02 += base2;
                }
                if(chBoxH11.isChecked()){
                    h02 += base4;
                }
                if(chBoxH12.isChecked()){
                    h02 += base8;
                }
                if(chBoxH13.isChecked()){
                   h03 += base1;
                }
                if(chBoxH14.isChecked()){
                   h03 += base2;
                }

				if(chBoxI1.isChecked()){
                   i00 += base1;
                }
                if(chBoxI2.isChecked()){
                   i00 += base2;
                }
                if(chBoxI3.isChecked()){
                   i00 += base4;
                }
                if(chBoxI4.isChecked()){
                   i00 += base8;
                }
                if(chBoxI5.isChecked()){
                    i01 += base1;
                }
                if(chBoxI6.isChecked()){
                    i01 += base2;
                }
                if(chBoxI7.isChecked()){
                    i01 += base4;
                }
                if(chBoxI8.isChecked()){
                    i01 += base8;
                }
                if(chBoxI9.isChecked()){
                    i02 += base1;
                }
                if(chBoxI10.isChecked()){
                    i02 += base2;
                }
                if(chBoxI11.isChecked()){
                    i02 += base4;
                }
                if(chBoxI12.isChecked()){
                    i02 += base8;
                }
                if(chBoxI13.isChecked()){
                   i03 += base1;
                }
                if(chBoxI14.isChecked()){
                   i03 += base2;
                }

				
				if(chBoxJ1.isChecked()){
                   j00 += base1;
                }
                if(chBoxJ2.isChecked()){
                   j00 += base2;
                }
                if(chBoxJ3.isChecked()){
                   j00 += base4;
                }
                if(chBoxJ4.isChecked()){
                   j00 += base8;
                }
                if(chBoxJ5.isChecked()){
                    j01 += base1;
                }
                if(chBoxJ6.isChecked()){
                    j01 += base2;
                }
                if(chBoxJ7.isChecked()){
                    j01 += base4;
                }
                if(chBoxJ8.isChecked()){
                    j01 += base8;
                }
                if(chBoxJ9.isChecked()){
                    j02 += base1;
                }
                if(chBoxJ10.isChecked()){
                    j02 += base2;
                }
                if(chBoxJ11.isChecked()){
                    j02 += base4;
                }
                if(chBoxJ12.isChecked()){
                    j02 += base8;
                }
                if(chBoxJ13.isChecked()){
                   j03 += base1;
                }
                if(chBoxJ14.isChecked()){
                   j03 += base2;
                }

				
				if(chBoxK1.isChecked()){
                   k00 += base1;
                }
                if(chBoxK2.isChecked()){
                   k00 += base2;
                }
                if(chBoxK3.isChecked()){
                   k00 += base4;
                }
                if(chBoxK4.isChecked()){
                   k00 += base8;
                }
                if(chBoxK5.isChecked()){
                    k01 += base1;
                }
                if(chBoxK6.isChecked()){
                    k01 += base2;
                }
                if(chBoxK7.isChecked()){
                    k01 += base4;
                }
                if(chBoxK8.isChecked()){
                    k01 += base8;
                }
                if(chBoxK9.isChecked()){
                    k02 += base1;
                }
                if(chBoxK10.isChecked()){
                    k02 += base2;
                }
                if(chBoxK11.isChecked()){
                    k02 += base4;
                }
                if(chBoxK12.isChecked()){
                    k02 += base8;
                }
                if(chBoxK13.isChecked()){
                   k03 += base1;
                }
                if(chBoxK14.isChecked()){
                   k03 += base2;
                }

				
				if(chBoxL1.isChecked()){
                   l00 += base1;
                }
                if(chBoxL2.isChecked()){
                   l00 += base2;
                }
                if(chBoxL3.isChecked()){
                   l00 += base4;
                }
                if(chBoxL4.isChecked()){
                   l00 += base8;
                }
                if(chBoxL5.isChecked()){
                    l01 += base1;
                }
                if(chBoxL6.isChecked()){
                    l01 += base2;
                }
                if(chBoxL7.isChecked()){
                    l01 += base4;
                }
                if(chBoxL8.isChecked()){
                    l01 += base8;
                }
                if(chBoxL9.isChecked()){
                    l02 += base1;
                }
                if(chBoxL10.isChecked()){
                    l02 += base2;
                }
                if(chBoxL11.isChecked()){
                    l02 += base4;
                }
                if(chBoxL12.isChecked()){
                    l02 += base8;
                }
                if(chBoxL13.isChecked()){
                   l03 += base1;
                }
                if(chBoxL14.isChecked()){
                   l03 += base2;
                }


                String a = Integer.toHexString(a00+a01);
                //Toast.makeText(CustomActivity.this, checkVaule, Toast.LENGTH_LONG).show();
                Toast.makeText(CustomActivity.this, a, Toast.LENGTH_LONG).show();
                BlueAction blueAction= new BlueAction();
                blueAction.SendCustomPattern(CustomPattern);
            }
        });

    }




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

        return super.onOptionsItemSelected(item);
    }
}
