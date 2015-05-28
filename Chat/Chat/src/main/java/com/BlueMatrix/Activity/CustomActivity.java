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

public class CustomActivity extends Activity {

    private CheckBox chBoxA1,chBoxA2,chBoxA3,chBoxA4,chBoxA5,chBoxA6,chBoxA7,chBoxA8,chBoxA9,chBoxA10,
            chBoxA11,chBoxA12,chBoxA13,chBoxA14,chBoxA15,chBoxA16,chBoxA17,chBoxA18,chBoxA19,chBoxA20,
			chBoxB1,chBoxB2,chBoxB3,chBoxB4,chBoxB5,chBoxB6,chBoxB7,chBoxB8,chBoxB9,chBoxB10,
            chBoxB11,chBoxB12,chBoxB13,chBoxB14,chBoxB15,chBoxB16,chBoxB17,chBoxB18,chBoxB19,chBoxB20,
			chBoxC1,chBoxC2,chBoxC3,chBoxC4,chBoxC5,chBoxC6,chBoxC7,chBoxC8,chBoxC9,chBoxC10,
            chBoxC11,chBoxC12,chBoxC13,chBoxC14,chBoxC15,chBoxC16,chBoxC17,chBoxC18,chBoxC19,chBoxC20,
			chBoxD1,chBoxD2,chBoxD3,chBoxD4,chBoxD5,chBoxD6,chBoxD7,chBoxD8,chBoxD9,chBoxD10,
            chBoxD11,chBoxD12,chBoxD13,chBoxD14,chBoxD15,chBoxD16,chBoxD17,chBoxD18,chBoxD19,chBoxD20,
			chBoxE1,chBoxE2,chBoxE3,chBoxE4,chBoxE5,chBoxE6,chBoxE7,chBoxE8,chBoxE9,chBoxE10,
            chBoxE11,chBoxE12,chBoxE13,chBoxE14,chBoxE15,chBoxE16,chBoxE17,chBoxE18,chBoxE19,chBoxE20,
			chBoxF1,chBoxF2,chBoxF3,chBoxF4,chBoxF5,chBoxF6,chBoxF7,chBoxF8,chBoxF9,chBoxF10,
            chBoxF11,chBoxF12,chBoxF13,chBoxF14,chBoxF15,chBoxF16,chBoxF17,chBoxF18,chBoxF19,chBoxF20,
			chBoxG1,chBoxG2,chBoxG3,chBoxG4,chBoxG5,chBoxG6,chBoxG7,chBoxG8,chBoxG9,chBoxG10,
            chBoxG11,chBoxG12,chBoxG13,chBoxG14,chBoxG15,chBoxG16,chBoxG17,chBoxG18,chBoxG19,chBoxG20,
			chBoxH1,chBoxH2,chBoxH3,chBoxH4,chBoxH5,chBoxH6,chBoxH7,chBoxH8,chBoxH9,chBoxH10,
            chBoxH11,chBoxH12,chBoxH13,chBoxH14,chBoxH15,chBoxH16,chBoxH17,chBoxH18,chBoxH19,chBoxH20,
			chBoxI1,chBoxI2,chBoxI3,chBoxI4,chBoxI5,chBoxI6,chBoxI7,chBoxI8,chBoxI9,chBoxI10,
            chBoxI11,chBoxI12,chBoxI13,chBoxI14,chBoxI15,chBoxI16,chBoxI17,chBoxI18,chBoxI19,chBoxI20,
			chBoxJ1,chBoxJ2,chBoxJ3,chBoxJ4,chBoxJ5,chBoxJ6,chBoxJ7,chBoxJ8,chBoxJ9,chBoxJ10,
            chBoxJ11,chBoxJ12,chBoxJ13,chBoxJ14,chBoxJ15,chBoxJ16,chBoxJ17,chBoxJ18,chBoxJ19,chBoxJ20,
			chBoxK1,chBoxK2,chBoxK3,chBoxK4,chBoxK5,chBoxK6,chBoxK7,chBoxK8,chBoxK9,chBoxK10,
            chBoxK11,chBoxK12,chBoxK13,chBoxK14,chBoxK15,chBoxK16,chBoxK17,chBoxK18,chBoxK19,chBoxK20,
			chBoxL1,chBoxL2,chBoxL3,chBoxL4,chBoxL5,chBoxL6,chBoxL7,chBoxL8,chBoxL9,chBoxL10,
            chBoxL11,chBoxL12,chBoxL13,chBoxL14,chBoxL15,chBoxL16,chBoxL17,chBoxL18,chBoxL19,chBoxL20,
			chBoxM1,chBoxM2,chBoxM3,chBoxM4,chBoxM5,chBoxM6,chBoxM7,chBoxM8,chBoxM9,chBoxM10,
            chBoxM11,chBoxM12,chBoxM13,chBoxM14,chBoxM15,chBoxM16,chBoxM17,chBoxM18,chBoxM19,chBoxM20,
			chBoxN1,chBoxN2,chBoxN3,chBoxN4,chBoxN5,chBoxN6,chBoxN7,chBoxN8,chBoxN9,chBoxN10,
            chBoxN11,chBoxN12,chBoxN13,chBoxN14,chBoxN15,chBoxN16,chBoxN17,chBoxN18,chBoxN19,chBoxN20,
			chBoxO1,chBoxO2,chBoxO3,chBoxO4,chBoxO5,chBoxO6,chBoxO7,chBoxO8,chBoxO9,chBoxO10,
            chBoxO11,chBoxO12,chBoxO13,chBoxO14,chBoxO15,chBoxO16,chBoxO17,chBoxO18,chBoxO19,chBoxO20,
			chBoxP1,chBoxP2,chBoxP3,chBoxP4,chBoxP5,chBoxP6,chBoxP7,chBoxP8,chBoxP9,chBoxP10,
            chBoxP11,chBoxP12,chBoxP13,chBoxP14,chBoxP15,chBoxP16,chBoxP17,chBoxP18,chBoxP19,chBoxP20,
			chBoxQ1,chBoxQ2,chBoxQ3,chBoxQ4,chBoxQ5,chBoxQ6,chBoxQ7,chBoxQ8,chBoxQ9,chBoxQ10,
            chBoxQ11,chBoxQ12,chBoxQ13,chBoxQ14,chBoxQ15,chBoxQ16,chBoxQ17,chBoxQ18,chBoxQ19,chBoxQ20,
			chBoxR1,chBoxR2,chBoxR3,chBoxR4,chBoxR5,chBoxR6,chBoxR7,chBoxR8,chBoxR9,chBoxR10,
            chBoxR11,chBoxR12,chBoxR13,chBoxR14,chBoxR15,chBoxR16,chBoxR17,chBoxR18,chBoxR19,chBoxR20,
			chBoxS1,chBoxS2,chBoxS3,chBoxS4,chBoxS5,chBoxS6,chBoxS7,chBoxS8,chBoxS9,chBoxS10,
            chBoxS11,chBoxS12,chBoxS13,chBoxS14,chBoxS15,chBoxS16,chBoxS17,chBoxS18,chBoxS19,chBoxS20,
			chBoxT1,chBoxT2,chBoxT3,chBoxT4,chBoxT5,chBoxT6,chBoxT7,chBoxT8,chBoxT9,chBoxT10,
            chBoxT11,chBoxT12,chBoxT13,chBoxT14,chBoxT15,chBoxT16,chBoxT17,chBoxT18,chBoxT19,chBoxT20;

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
        chBoxA15 = (CheckBox)findViewById(R.id.chBoxA15);
        chBoxA16 = (CheckBox)findViewById(R.id.chBoxA16);
        chBoxA17 = (CheckBox)findViewById(R.id.chBoxA17);
        chBoxA18 = (CheckBox)findViewById(R.id.chBoxA18);
        chBoxA19 = (CheckBox)findViewById(R.id.chBoxA19);
        chBoxA20 = (CheckBox)findViewById(R.id.chBoxA20);

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
        chBoxB15 = (CheckBox)findViewById(R.id.chBoxB15);
        chBoxB16 = (CheckBox)findViewById(R.id.chBoxB16);
        chBoxB17 = (CheckBox)findViewById(R.id.chBoxB17);
        chBoxB18 = (CheckBox)findViewById(R.id.chBoxB18);
        chBoxB19 = (CheckBox)findViewById(R.id.chBoxB19);
        chBoxB20 = (CheckBox)findViewById(R.id.chBoxB20);
		
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
        chBoxC15 = (CheckBox)findViewById(R.id.chBoxC15);
        chBoxC16 = (CheckBox)findViewById(R.id.chBoxC16);
        chBoxC17 = (CheckBox)findViewById(R.id.chBoxC17);
        chBoxC18 = (CheckBox)findViewById(R.id.chBoxC18);
        chBoxC19 = (CheckBox)findViewById(R.id.chBoxC19);
        chBoxC20 = (CheckBox)findViewById(R.id.chBoxC20);
		
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
        chBoxD15 = (CheckBox)findViewById(R.id.chBoxD15);
        chBoxD16 = (CheckBox)findViewById(R.id.chBoxD16);
        chBoxD17 = (CheckBox)findViewById(R.id.chBoxD17);
        chBoxD18 = (CheckBox)findViewById(R.id.chBoxD18);
        chBoxD19 = (CheckBox)findViewById(R.id.chBoxD19);
        chBoxD20 = (CheckBox)findViewById(R.id.chBoxD20);
		
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
        chBoxE15 = (CheckBox)findViewById(R.id.chBoxE15);
        chBoxE16 = (CheckBox)findViewById(R.id.chBoxE16);
        chBoxE17 = (CheckBox)findViewById(R.id.chBoxE17);
        chBoxE18 = (CheckBox)findViewById(R.id.chBoxE18);
        chBoxE19 = (CheckBox)findViewById(R.id.chBoxE19);
        chBoxE20 = (CheckBox)findViewById(R.id.chBoxE20);
		
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
        chBoxF15 = (CheckBox)findViewById(R.id.chBoxF15);
        chBoxF16 = (CheckBox)findViewById(R.id.chBoxF16);
        chBoxF17 = (CheckBox)findViewById(R.id.chBoxF17);
        chBoxF18 = (CheckBox)findViewById(R.id.chBoxF18);
        chBoxF19 = (CheckBox)findViewById(R.id.chBoxF19);
        chBoxF20 = (CheckBox)findViewById(R.id.chBoxF20);
		
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
        chBoxG15 = (CheckBox)findViewById(R.id.chBoxG15);
        chBoxG16 = (CheckBox)findViewById(R.id.chBoxG16);
        chBoxG17 = (CheckBox)findViewById(R.id.chBoxG17);
        chBoxG18 = (CheckBox)findViewById(R.id.chBoxG18);
        chBoxG19 = (CheckBox)findViewById(R.id.chBoxG19);
        chBoxG20 = (CheckBox)findViewById(R.id.chBoxG20);
		
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
        chBoxH15 = (CheckBox)findViewById(R.id.chBoxH15);
        chBoxH16 = (CheckBox)findViewById(R.id.chBoxH16);
        chBoxH17 = (CheckBox)findViewById(R.id.chBoxH17);
        chBoxH18 = (CheckBox)findViewById(R.id.chBoxH18);
        chBoxH19 = (CheckBox)findViewById(R.id.chBoxH19);
        chBoxH20 = (CheckBox)findViewById(R.id.chBoxH20);
		
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
        chBoxI15 = (CheckBox)findViewById(R.id.chBoxI15);
        chBoxI16 = (CheckBox)findViewById(R.id.chBoxI16);
        chBoxI17 = (CheckBox)findViewById(R.id.chBoxI17);
        chBoxI18 = (CheckBox)findViewById(R.id.chBoxI18);
        chBoxI19 = (CheckBox)findViewById(R.id.chBoxI19);
        chBoxI20 = (CheckBox)findViewById(R.id.chBoxI20);
		
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
        chBoxJ15 = (CheckBox)findViewById(R.id.chBoxJ15);
        chBoxJ16 = (CheckBox)findViewById(R.id.chBoxJ16);
        chBoxJ17 = (CheckBox)findViewById(R.id.chBoxJ17);
        chBoxJ18 = (CheckBox)findViewById(R.id.chBoxJ18);
        chBoxJ19 = (CheckBox)findViewById(R.id.chBoxJ19);
        chBoxJ20 = (CheckBox)findViewById(R.id.chBoxJ20);
		
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
        chBoxK15 = (CheckBox)findViewById(R.id.chBoxK15);
        chBoxK16 = (CheckBox)findViewById(R.id.chBoxK16);
        chBoxK17 = (CheckBox)findViewById(R.id.chBoxK17);
        chBoxK18 = (CheckBox)findViewById(R.id.chBoxK18);
        chBoxK19 = (CheckBox)findViewById(R.id.chBoxK19);
        chBoxK20 = (CheckBox)findViewById(R.id.chBoxK20);
		
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
        chBoxL15 = (CheckBox)findViewById(R.id.chBoxL15);
        chBoxL16 = (CheckBox)findViewById(R.id.chBoxL16);
        chBoxL17 = (CheckBox)findViewById(R.id.chBoxL17);
        chBoxL18 = (CheckBox)findViewById(R.id.chBoxL18);
        chBoxL19 = (CheckBox)findViewById(R.id.chBoxL19);
        chBoxL20 = (CheckBox)findViewById(R.id.chBoxL20);
		
		chBoxM1 = (CheckBox)findViewById(R.id.chBoxM1);
        chBoxM2 = (CheckBox)findViewById(R.id.chBoxM2);
        chBoxM3 = (CheckBox)findViewById(R.id.chBoxM3);
        chBoxM4 = (CheckBox)findViewById(R.id.chBoxM4);
        chBoxM5 = (CheckBox)findViewById(R.id.chBoxM5);
        chBoxM6 = (CheckBox)findViewById(R.id.chBoxM6);
        chBoxM7 = (CheckBox)findViewById(R.id.chBoxM7);
        chBoxM8 = (CheckBox)findViewById(R.id.chBoxM8);
        chBoxM9 = (CheckBox)findViewById(R.id.chBoxM9);
        chBoxM10 = (CheckBox)findViewById(R.id.chBoxM10);
        chBoxM11 = (CheckBox)findViewById(R.id.chBoxM11);
        chBoxM12 = (CheckBox)findViewById(R.id.chBoxM12);
        chBoxM13 = (CheckBox)findViewById(R.id.chBoxM13);
        chBoxM14 = (CheckBox)findViewById(R.id.chBoxM14);
        chBoxM15 = (CheckBox)findViewById(R.id.chBoxM15);
        chBoxM16 = (CheckBox)findViewById(R.id.chBoxM16);
        chBoxM17 = (CheckBox)findViewById(R.id.chBoxM17);
        chBoxM18 = (CheckBox)findViewById(R.id.chBoxM18);
        chBoxM19 = (CheckBox)findViewById(R.id.chBoxM19);
        chBoxM20 = (CheckBox)findViewById(R.id.chBoxM20);
		
		chBoxN1 = (CheckBox)findViewById(R.id.chBoxN1);
        chBoxN2 = (CheckBox)findViewById(R.id.chBoxN2);
        chBoxN3 = (CheckBox)findViewById(R.id.chBoxN3);
        chBoxN4 = (CheckBox)findViewById(R.id.chBoxN4);
        chBoxN5 = (CheckBox)findViewById(R.id.chBoxN5);
        chBoxN6 = (CheckBox)findViewById(R.id.chBoxN6);
        chBoxN7 = (CheckBox)findViewById(R.id.chBoxN7);
        chBoxN8 = (CheckBox)findViewById(R.id.chBoxN8);
        chBoxN9 = (CheckBox)findViewById(R.id.chBoxN9);
        chBoxN10 = (CheckBox)findViewById(R.id.chBoxN10);
        chBoxN11 = (CheckBox)findViewById(R.id.chBoxN11);
        chBoxN12 = (CheckBox)findViewById(R.id.chBoxN12);
        chBoxN13 = (CheckBox)findViewById(R.id.chBoxN13);
        chBoxN14 = (CheckBox)findViewById(R.id.chBoxN14);
        chBoxN15 = (CheckBox)findViewById(R.id.chBoxN15);
        chBoxN16 = (CheckBox)findViewById(R.id.chBoxN16);
        chBoxN17 = (CheckBox)findViewById(R.id.chBoxN17);
        chBoxN18 = (CheckBox)findViewById(R.id.chBoxN18);
        chBoxN19 = (CheckBox)findViewById(R.id.chBoxN19);
        chBoxN20 = (CheckBox)findViewById(R.id.chBoxN20);
		
		chBoxO1 = (CheckBox)findViewById(R.id.chBoxO1);
        chBoxO2 = (CheckBox)findViewById(R.id.chBoxO2);
        chBoxO3 = (CheckBox)findViewById(R.id.chBoxO3);
        chBoxO4 = (CheckBox)findViewById(R.id.chBoxO4);
        chBoxO5 = (CheckBox)findViewById(R.id.chBoxO5);
        chBoxO6 = (CheckBox)findViewById(R.id.chBoxO6);
        chBoxO7 = (CheckBox)findViewById(R.id.chBoxO7);
        chBoxO8 = (CheckBox)findViewById(R.id.chBoxO8);
        chBoxO9 = (CheckBox)findViewById(R.id.chBoxO9);
        chBoxO10 = (CheckBox)findViewById(R.id.chBoxO10);
        chBoxO11 = (CheckBox)findViewById(R.id.chBoxO11);
        chBoxO12 = (CheckBox)findViewById(R.id.chBoxO12);
        chBoxO13 = (CheckBox)findViewById(R.id.chBoxO13);
        chBoxO14 = (CheckBox)findViewById(R.id.chBoxO14);
        chBoxO15 = (CheckBox)findViewById(R.id.chBoxO15);
        chBoxO16 = (CheckBox)findViewById(R.id.chBoxO16);
        chBoxO17 = (CheckBox)findViewById(R.id.chBoxO17);
        chBoxO18 = (CheckBox)findViewById(R.id.chBoxO18);
        chBoxO19 = (CheckBox)findViewById(R.id.chBoxO19);
        chBoxO20 = (CheckBox)findViewById(R.id.chBoxO20);
		
		chBoxP1 = (CheckBox)findViewById(R.id.chBoxP1);
        chBoxP2 = (CheckBox)findViewById(R.id.chBoxP2);
        chBoxP3 = (CheckBox)findViewById(R.id.chBoxP3);
        chBoxP4 = (CheckBox)findViewById(R.id.chBoxP4);
        chBoxP5 = (CheckBox)findViewById(R.id.chBoxP5);
        chBoxP6 = (CheckBox)findViewById(R.id.chBoxP6);
        chBoxP7 = (CheckBox)findViewById(R.id.chBoxP7);
        chBoxP8 = (CheckBox)findViewById(R.id.chBoxP8);
        chBoxP9 = (CheckBox)findViewById(R.id.chBoxP9);
        chBoxP10 = (CheckBox)findViewById(R.id.chBoxP10);
        chBoxP11 = (CheckBox)findViewById(R.id.chBoxP11);
        chBoxP12 = (CheckBox)findViewById(R.id.chBoxP12);
        chBoxP13 = (CheckBox)findViewById(R.id.chBoxP13);
        chBoxP14 = (CheckBox)findViewById(R.id.chBoxP14);
        chBoxP15 = (CheckBox)findViewById(R.id.chBoxP15);
        chBoxP16 = (CheckBox)findViewById(R.id.chBoxP16);
        chBoxP17 = (CheckBox)findViewById(R.id.chBoxP17);
        chBoxP18 = (CheckBox)findViewById(R.id.chBoxP18);
        chBoxP19 = (CheckBox)findViewById(R.id.chBoxP19);
        chBoxP20 = (CheckBox)findViewById(R.id.chBoxP20);
		
		chBoxQ1 = (CheckBox)findViewById(R.id.chBoxQ1);
        chBoxQ2 = (CheckBox)findViewById(R.id.chBoxQ2);
        chBoxQ3 = (CheckBox)findViewById(R.id.chBoxQ3);
        chBoxQ4 = (CheckBox)findViewById(R.id.chBoxQ4);
        chBoxQ5 = (CheckBox)findViewById(R.id.chBoxQ5);
        chBoxQ6 = (CheckBox)findViewById(R.id.chBoxQ6);
        chBoxQ7 = (CheckBox)findViewById(R.id.chBoxQ7);
        chBoxQ8 = (CheckBox)findViewById(R.id.chBoxQ8);
        chBoxQ9 = (CheckBox)findViewById(R.id.chBoxQ9);
        chBoxQ10 = (CheckBox)findViewById(R.id.chBoxQ10);
        chBoxQ11 = (CheckBox)findViewById(R.id.chBoxQ11);
        chBoxQ12 = (CheckBox)findViewById(R.id.chBoxQ12);
        chBoxQ13 = (CheckBox)findViewById(R.id.chBoxQ13);
        chBoxQ14 = (CheckBox)findViewById(R.id.chBoxQ14);
        chBoxQ15 = (CheckBox)findViewById(R.id.chBoxQ15);
        chBoxQ16 = (CheckBox)findViewById(R.id.chBoxQ16);
        chBoxQ17 = (CheckBox)findViewById(R.id.chBoxQ17);
        chBoxQ18 = (CheckBox)findViewById(R.id.chBoxQ18);
        chBoxQ19 = (CheckBox)findViewById(R.id.chBoxQ19);
        chBoxQ20 = (CheckBox)findViewById(R.id.chBoxQ20);
		
		chBoxR1 = (CheckBox)findViewById(R.id.chBoxR1);
        chBoxR2 = (CheckBox)findViewById(R.id.chBoxR2);
        chBoxR3 = (CheckBox)findViewById(R.id.chBoxR3);
        chBoxR4 = (CheckBox)findViewById(R.id.chBoxR4);
        chBoxR5 = (CheckBox)findViewById(R.id.chBoxR5);
        chBoxR6 = (CheckBox)findViewById(R.id.chBoxR6);
        chBoxR7 = (CheckBox)findViewById(R.id.chBoxR7);
        chBoxR8 = (CheckBox)findViewById(R.id.chBoxR8);
        chBoxR9 = (CheckBox)findViewById(R.id.chBoxR9);
        chBoxR10 = (CheckBox)findViewById(R.id.chBoxR10);
        chBoxR11 = (CheckBox)findViewById(R.id.chBoxR11);
        chBoxR12 = (CheckBox)findViewById(R.id.chBoxR12);
        chBoxR13 = (CheckBox)findViewById(R.id.chBoxR13);
        chBoxR14 = (CheckBox)findViewById(R.id.chBoxR14);
        chBoxR15 = (CheckBox)findViewById(R.id.chBoxR15);
        chBoxR16 = (CheckBox)findViewById(R.id.chBoxR16);
        chBoxR17 = (CheckBox)findViewById(R.id.chBoxR17);
        chBoxR18 = (CheckBox)findViewById(R.id.chBoxR18);
        chBoxR19 = (CheckBox)findViewById(R.id.chBoxR19);
        chBoxR20 = (CheckBox)findViewById(R.id.chBoxR20);
		
		chBoxS1 = (CheckBox)findViewById(R.id.chBoxS1);
        chBoxS2 = (CheckBox)findViewById(R.id.chBoxS2);
        chBoxS3 = (CheckBox)findViewById(R.id.chBoxS3);
        chBoxS4 = (CheckBox)findViewById(R.id.chBoxS4);
        chBoxS5 = (CheckBox)findViewById(R.id.chBoxS5);
        chBoxS6 = (CheckBox)findViewById(R.id.chBoxS6);
        chBoxS7 = (CheckBox)findViewById(R.id.chBoxS7);
        chBoxS8 = (CheckBox)findViewById(R.id.chBoxS8);
        chBoxS9 = (CheckBox)findViewById(R.id.chBoxS9);
        chBoxS10 = (CheckBox)findViewById(R.id.chBoxS10);
        chBoxS11 = (CheckBox)findViewById(R.id.chBoxS11);
        chBoxS12 = (CheckBox)findViewById(R.id.chBoxS12);
        chBoxS13 = (CheckBox)findViewById(R.id.chBoxS13);
        chBoxS14 = (CheckBox)findViewById(R.id.chBoxS14);
        chBoxS15 = (CheckBox)findViewById(R.id.chBoxS15);
        chBoxS16 = (CheckBox)findViewById(R.id.chBoxS16);
        chBoxS17 = (CheckBox)findViewById(R.id.chBoxS17);
        chBoxS18 = (CheckBox)findViewById(R.id.chBoxS18);
        chBoxS19 = (CheckBox)findViewById(R.id.chBoxS19);
        chBoxS20 = (CheckBox)findViewById(R.id.chBoxS20);
		
		chBoxT1 = (CheckBox)findViewById(R.id.chBoxT1);
        chBoxT2 = (CheckBox)findViewById(R.id.chBoxT2);
        chBoxT3 = (CheckBox)findViewById(R.id.chBoxT3);
        chBoxT4 = (CheckBox)findViewById(R.id.chBoxT4);
        chBoxT5 = (CheckBox)findViewById(R.id.chBoxT5);
        chBoxT6 = (CheckBox)findViewById(R.id.chBoxT6);
        chBoxT7 = (CheckBox)findViewById(R.id.chBoxT7);
        chBoxT8 = (CheckBox)findViewById(R.id.chBoxT8);
        chBoxT9 = (CheckBox)findViewById(R.id.chBoxT9);
        chBoxT10 = (CheckBox)findViewById(R.id.chBoxT10);
        chBoxT11 = (CheckBox)findViewById(R.id.chBoxT11);
        chBoxT12 = (CheckBox)findViewById(R.id.chBoxT12);
        chBoxT13 = (CheckBox)findViewById(R.id.chBoxT13);
        chBoxT14 = (CheckBox)findViewById(R.id.chBoxT14);
        chBoxT15 = (CheckBox)findViewById(R.id.chBoxT15);
        chBoxT16 = (CheckBox)findViewById(R.id.chBoxT16);
        chBoxT17 = (CheckBox)findViewById(R.id.chBoxT17);
        chBoxT18 = (CheckBox)findViewById(R.id.chBoxT18);
        chBoxT19 = (CheckBox)findViewById(R.id.chBoxT19);
        chBoxT20 = (CheckBox)findViewById(R.id.chBoxT20);

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
                chBoxA15.setChecked(false);
                chBoxA16.setChecked(false);
                chBoxA17.setChecked(false);
                chBoxA18.setChecked(false);
                chBoxA19.setChecked(false);
                chBoxA20.setChecked(false);
				
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
                chBoxB15.setChecked(false);
                chBoxB16.setChecked(false);
                chBoxB17.setChecked(false);
                chBoxB18.setChecked(false);
                chBoxB19.setChecked(false);
                chBoxB20.setChecked(false);
				
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
                chBoxC15.setChecked(false);
                chBoxC16.setChecked(false);
                chBoxC17.setChecked(false);
                chBoxC18.setChecked(false);
                chBoxC19.setChecked(false);
                chBoxC20.setChecked(false);
				
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
                chBoxD15.setChecked(false);
                chBoxD16.setChecked(false);
                chBoxD17.setChecked(false);
                chBoxD18.setChecked(false);
                chBoxD19.setChecked(false);
                chBoxD20.setChecked(false);
				
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
                chBoxE15.setChecked(false);
                chBoxE16.setChecked(false);
                chBoxE17.setChecked(false);
                chBoxE18.setChecked(false);
                chBoxE19.setChecked(false);
                chBoxE20.setChecked(false);
				
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
                chBoxF15.setChecked(false);
                chBoxF16.setChecked(false);
                chBoxF17.setChecked(false);
                chBoxF18.setChecked(false);
                chBoxF19.setChecked(false);
                chBoxF20.setChecked(false);
				
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
                chBoxG15.setChecked(false);
                chBoxG16.setChecked(false);
                chBoxG17.setChecked(false);
                chBoxG18.setChecked(false);
                chBoxG19.setChecked(false);
                chBoxG20.setChecked(false);
				
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
                chBoxH15.setChecked(false);
                chBoxH16.setChecked(false);
                chBoxH17.setChecked(false);
                chBoxH18.setChecked(false);
                chBoxH19.setChecked(false);
                chBoxH20.setChecked(false);
				
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
                chBoxI15.setChecked(false);
                chBoxI16.setChecked(false);
                chBoxI17.setChecked(false);
                chBoxI18.setChecked(false);
                chBoxI19.setChecked(false);
                chBoxI20.setChecked(false);
				
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
                chBoxJ15.setChecked(false);
                chBoxJ16.setChecked(false);
                chBoxJ17.setChecked(false);
                chBoxJ18.setChecked(false);
                chBoxJ19.setChecked(false);
                chBoxJ20.setChecked(false);
				
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
                chBoxK15.setChecked(false);
                chBoxK16.setChecked(false);
                chBoxK17.setChecked(false);
                chBoxK18.setChecked(false);
                chBoxK19.setChecked(false);
                chBoxK20.setChecked(false);
				
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
                chBoxL15.setChecked(false);
                chBoxL16.setChecked(false);
                chBoxL17.setChecked(false);
                chBoxL18.setChecked(false);
                chBoxL19.setChecked(false);
                chBoxL20.setChecked(false);
				
				chBoxM1.setChecked(false);
                chBoxM2.setChecked(false);
                chBoxM3.setChecked(false);
                chBoxM4.setChecked(false);
                chBoxM5.setChecked(false);
                chBoxM6.setChecked(false);
                chBoxM7.setChecked(false);
                chBoxM8.setChecked(false);
                chBoxM9.setChecked(false);
                chBoxM10.setChecked(false);
				chBoxM11.setChecked(false);
                chBoxM12.setChecked(false);
                chBoxM13.setChecked(false);
                chBoxM14.setChecked(false);
                chBoxM15.setChecked(false);
                chBoxM16.setChecked(false);
                chBoxM17.setChecked(false);
                chBoxM18.setChecked(false);
                chBoxM19.setChecked(false);
                chBoxM20.setChecked(false);
				
				chBoxN1.setChecked(false);
                chBoxN2.setChecked(false);
                chBoxN3.setChecked(false);
                chBoxN4.setChecked(false);
                chBoxN5.setChecked(false);
                chBoxN6.setChecked(false);
                chBoxN7.setChecked(false);
                chBoxN8.setChecked(false);
                chBoxN9.setChecked(false);
                chBoxN10.setChecked(false);
				chBoxN11.setChecked(false);
                chBoxN12.setChecked(false);
                chBoxN13.setChecked(false);
                chBoxN14.setChecked(false);
                chBoxN15.setChecked(false);
                chBoxN16.setChecked(false);
                chBoxN17.setChecked(false);
                chBoxN18.setChecked(false);
                chBoxN19.setChecked(false);
                chBoxN20.setChecked(false);
				
				chBoxO1.setChecked(false);
                chBoxO2.setChecked(false);
                chBoxO3.setChecked(false);
                chBoxO4.setChecked(false);
                chBoxO5.setChecked(false);
                chBoxO6.setChecked(false);
                chBoxO7.setChecked(false);
                chBoxO8.setChecked(false);
                chBoxO9.setChecked(false);
                chBoxO10.setChecked(false);
				chBoxO11.setChecked(false);
                chBoxO12.setChecked(false);
                chBoxO13.setChecked(false);
                chBoxO14.setChecked(false);
                chBoxO15.setChecked(false);
                chBoxO16.setChecked(false);
                chBoxO17.setChecked(false);
                chBoxO18.setChecked(false);
                chBoxO19.setChecked(false);
                chBoxO20.setChecked(false);
				
				chBoxP1.setChecked(false);
                chBoxP2.setChecked(false);
                chBoxP3.setChecked(false);
                chBoxP4.setChecked(false);
                chBoxP5.setChecked(false);
                chBoxP6.setChecked(false);
                chBoxP7.setChecked(false);
                chBoxP8.setChecked(false);
                chBoxP9.setChecked(false);
                chBoxP10.setChecked(false);
				chBoxP11.setChecked(false);
                chBoxP12.setChecked(false);
                chBoxP13.setChecked(false);
                chBoxP14.setChecked(false);
                chBoxP15.setChecked(false);
                chBoxP16.setChecked(false);
                chBoxP17.setChecked(false);
                chBoxP18.setChecked(false);
                chBoxP19.setChecked(false);
                chBoxP20.setChecked(false);
				
				chBoxQ1.setChecked(false);
                chBoxQ2.setChecked(false);
                chBoxQ3.setChecked(false);
                chBoxQ4.setChecked(false);
                chBoxQ5.setChecked(false);
                chBoxQ6.setChecked(false);
                chBoxQ7.setChecked(false);
                chBoxQ8.setChecked(false);
                chBoxQ9.setChecked(false);
                chBoxQ10.setChecked(false);
				chBoxQ11.setChecked(false);
                chBoxQ12.setChecked(false);
                chBoxQ13.setChecked(false);
                chBoxQ14.setChecked(false);
                chBoxQ15.setChecked(false);
                chBoxQ16.setChecked(false);
                chBoxQ17.setChecked(false);
                chBoxQ18.setChecked(false);
                chBoxQ19.setChecked(false);
                chBoxQ20.setChecked(false);
				
				chBoxR1.setChecked(false);
                chBoxR2.setChecked(false);
                chBoxR3.setChecked(false);
                chBoxR4.setChecked(false);
                chBoxR5.setChecked(false);
                chBoxR6.setChecked(false);
                chBoxR7.setChecked(false);
                chBoxR8.setChecked(false);
                chBoxR9.setChecked(false);
                chBoxR10.setChecked(false);
				chBoxR11.setChecked(false);
                chBoxR12.setChecked(false);
                chBoxR13.setChecked(false);
                chBoxR14.setChecked(false);
                chBoxR15.setChecked(false);
                chBoxR16.setChecked(false);
                chBoxR17.setChecked(false);
                chBoxR18.setChecked(false);
                chBoxR19.setChecked(false);
                chBoxR20.setChecked(false);
				
				chBoxS1.setChecked(false);
                chBoxS2.setChecked(false);
                chBoxS3.setChecked(false);
                chBoxS4.setChecked(false);
                chBoxS5.setChecked(false);
                chBoxS6.setChecked(false);
                chBoxS7.setChecked(false);
                chBoxS8.setChecked(false);
                chBoxS9.setChecked(false);
                chBoxS10.setChecked(false);
				chBoxS11.setChecked(false);
                chBoxS12.setChecked(false);
                chBoxS13.setChecked(false);
                chBoxS14.setChecked(false);
                chBoxS15.setChecked(false);
                chBoxS16.setChecked(false);
                chBoxS17.setChecked(false);
                chBoxS18.setChecked(false);
                chBoxS19.setChecked(false);
                chBoxS20.setChecked(false);
				
				chBoxT1.setChecked(false);
                chBoxT2.setChecked(false);
                chBoxT3.setChecked(false);
                chBoxT4.setChecked(false);
                chBoxT5.setChecked(false);
                chBoxT6.setChecked(false);
                chBoxT7.setChecked(false);
                chBoxT8.setChecked(false);
                chBoxT9.setChecked(false);
                chBoxT10.setChecked(false);
				chBoxT11.setChecked(false);
                chBoxT12.setChecked(false);
                chBoxT13.setChecked(false);
                chBoxT14.setChecked(false);
                chBoxT15.setChecked(false);
                chBoxT16.setChecked(false);
                chBoxT17.setChecked(false);
                chBoxT18.setChecked(false);
                chBoxT19.setChecked(false);
                chBoxT20.setChecked(false);
				
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
                int base1 = 1;
                int base2 = 2;
                int base4 = 4;
				int base8 = 8;
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
                if(chBoxA15.isChecked()){
                   a03 += base4;
                }
                if(chBoxA16.isChecked()){
                   a03 += base8;
                }
                if(chBoxA17.isChecked()){
                    a04 += base1;
                }
                if(chBoxA18.isChecked()){
                    a04 += base2;
                }
                if(chBoxA19.isChecked()){
                    a04 += base4;
                }
                if(chBoxA20.isChecked()){
                    a04 += base8;
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
                if(chBoxB15.isChecked()){
                   b03 += base4;
                }
                if(chBoxB16.isChecked()){
                   b03 += base8;
                }
                if(chBoxB17.isChecked()){
                    b04 += base1;
                }
                if(chBoxB18.isChecked()){
                    b04 += base2;
                }
                if(chBoxB19.isChecked()){
                    b04 += base4;
                }
                if(chBoxB20.isChecked()){
                    b04 += base8;
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
                if(chBoxC15.isChecked()){
                   c03 += base4;
                }
                if(chBoxC16.isChecked()){
                   c03 += base8;
                }
                if(chBoxC17.isChecked()){
                    c04 += base1;
                }
                if(chBoxC18.isChecked()){
                    c04 += base2;
                }
                if(chBoxC19.isChecked()){
                    c04 += base4;
                }
                if(chBoxC20.isChecked()){
                    c04 += base8;
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
                if(chBoxD15.isChecked()){
                   d03 += base4;
                }
                if(chBoxD16.isChecked()){
                   d03 += base8;
                }
                if(chBoxD17.isChecked()){
                    d04 += base1;
                }
                if(chBoxD18.isChecked()){
                    d04 += base2;
                }
                if(chBoxD19.isChecked()){
                    d04 += base4;
                }
                if(chBoxD20.isChecked()){
                    d04 += base8;
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
                if(chBoxE15.isChecked()){
                   e03 += base4;
                }
                if(chBoxE16.isChecked()){
                   e03 += base8;
                }
                if(chBoxE17.isChecked()){
                    e04 += base1;
                }
                if(chBoxE18.isChecked()){
                    e04 += base2;
                }
                if(chBoxE19.isChecked()){
                    e04 += base4;
                }
                if(chBoxE20.isChecked()){
                    e04 += base8;
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
                if(chBoxF15.isChecked()){
                   f03 += base4;
                }
                if(chBoxF16.isChecked()){
                   f03 += base8;
                }
                if(chBoxF17.isChecked()){
                    f04 += base1;
                }
                if(chBoxF18.isChecked()){
                    f04 += base2;
                }
                if(chBoxF19.isChecked()){
                    f04 += base4;
                }
                if(chBoxF20.isChecked()){
                    f04 += base8;
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
                if(chBoxG15.isChecked()){
                   g03 += base4;
                }
                if(chBoxG16.isChecked()){
                   g03 += base8;
                }
                if(chBoxG17.isChecked()){
                    g04 += base1;
                }
                if(chBoxG18.isChecked()){
                    g04 += base2;
                }
                if(chBoxG19.isChecked()){
                    g04 += base4;
                }
                if(chBoxG20.isChecked()){
                    g04 += base8;
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
                if(chBoxH15.isChecked()){
                   h03 += base4;
                }
                if(chBoxH16.isChecked()){
                   h03 += base8;
                }
                if(chBoxH17.isChecked()){
                    h04 += base1;
                }
                if(chBoxH18.isChecked()){
                    h04 += base2;
                }
                if(chBoxH19.isChecked()){
                    h04 += base4;
                }
                if(chBoxH20.isChecked()){
                    h04 += base8;
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
                if(chBoxI15.isChecked()){
                   i03 += base4;
                }
                if(chBoxI16.isChecked()){
                   i03 += base8;
                }
                if(chBoxI17.isChecked()){
                    i04 += base1;
                }
                if(chBoxI18.isChecked()){
                    i04 += base2;
                }
                if(chBoxI19.isChecked()){
                    i04 += base4;
                }
                if(chBoxI20.isChecked()){
                    i04 += base8;
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
                if(chBoxJ15.isChecked()){
                   j03 += base4;
                }
                if(chBoxJ16.isChecked()){
                   j03 += base8;
                }
                if(chBoxJ17.isChecked()){
                    j04 += base1;
                }
                if(chBoxJ18.isChecked()){
                    j04 += base2;
                }
                if(chBoxJ19.isChecked()){
                    j04 += base4;
                }
                if(chBoxJ20.isChecked()){
                    j04 += base8;
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
                if(chBoxK15.isChecked()){
                   k03 += base4;
                }
                if(chBoxK16.isChecked()){
                   k03 += base8;
                }
                if(chBoxK17.isChecked()){
                    k04 += base1;
                }
                if(chBoxK18.isChecked()){
                    k04 += base2;
                }
                if(chBoxK19.isChecked()){
                    k04 += base4;
                }
                if(chBoxK20.isChecked()){
                    k04 += base8;
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
                if(chBoxL15.isChecked()){
                   l03 += base4;
                }
                if(chBoxL16.isChecked()){
                   l03 += base8;
                }
                if(chBoxL17.isChecked()){
                    l04 += base1;
                }
                if(chBoxL18.isChecked()){
                    l04 += base2;
                }
                if(chBoxL19.isChecked()){
                    l04 += base4;
                }
                if(chBoxL20.isChecked()){
                    l04 += base8;
                }
				
				if(chBoxM1.isChecked()){
                   m00 += base1;
                }
                if(chBoxM2.isChecked()){
                   m00 += base2;
                }
                if(chBoxM3.isChecked()){
                   m00 += base4;
                }
                if(chBoxM4.isChecked()){
                   m00 += base8;
                }
                if(chBoxM5.isChecked()){
                    m01 += base1;
                }
                if(chBoxM6.isChecked()){
                    m01 += base2;
                }
                if(chBoxM7.isChecked()){
                    m01 += base4;
                }
                if(chBoxM8.isChecked()){
                    m01 += base8;
                }
                if(chBoxM9.isChecked()){
                    m02 += base1;
                }
                if(chBoxM10.isChecked()){
                    m02 += base2;
                }
                if(chBoxM11.isChecked()){
                    m02 += base4;
                }
                if(chBoxM12.isChecked()){
                    m02 += base8;
                }
                if(chBoxM13.isChecked()){
                   m03 += base1;
                }
                if(chBoxM14.isChecked()){
                   m03 += base2;
                }
                if(chBoxM15.isChecked()){
                   m03 += base4;
                }
                if(chBoxM16.isChecked()){
                   m03 += base8;
                }
                if(chBoxM17.isChecked()){
                    m04 += base1;
                }
                if(chBoxM18.isChecked()){
                    m04 += base2;
                }
                if(chBoxM19.isChecked()){
                    m04 += base4;
                }
                if(chBoxM20.isChecked()){
                    m04 += base8;
                }
				
				if(chBoxN1.isChecked()){
                   n00 += base1;
                }
                if(chBoxN2.isChecked()){
                   n00 += base2;
                }
                if(chBoxN3.isChecked()){
                   n00 += base4;
                }
                if(chBoxN4.isChecked()){
                   n00 += base8;
                }
                if(chBoxN5.isChecked()){
                    n01 += base1;
                }
                if(chBoxN6.isChecked()){
                    n01 += base2;
                }
                if(chBoxN7.isChecked()){
                    n01 += base4;
                }
                if(chBoxN8.isChecked()){
                    n01 += base8;
                }
                if(chBoxN9.isChecked()){
                    n02 += base1;
                }
                if(chBoxN10.isChecked()){
                    n02 += base2;
                }
                if(chBoxN11.isChecked()){
                    n02 += base4;
                }
                if(chBoxN12.isChecked()){
                    n02 += base8;
                }
                if(chBoxN13.isChecked()){
                   n03 += base1;
                }
                if(chBoxN14.isChecked()){
                   n03 += base2;
                }
                if(chBoxN15.isChecked()){
                   n03 += base4;
                }
                if(chBoxN16.isChecked()){
                   n03 += base8;
                }
                if(chBoxN17.isChecked()){
                    n04 += base1;
                }
                if(chBoxN18.isChecked()){
                    n04 += base2;
                }
                if(chBoxN19.isChecked()){
                    n04 += base4;
                }
                if(chBoxN20.isChecked()){
                    n04 += base8;
                }
				
				if(chBoxO1.isChecked()){
                   o00 += base1;
                }
                if(chBoxO2.isChecked()){
                   o00 += base2;
                }
                if(chBoxO3.isChecked()){
                   o00 += base4;
                }
                if(chBoxO4.isChecked()){
                   o00 += base8;
                }
                if(chBoxO5.isChecked()){
                    o01 += base1;
                }
                if(chBoxO6.isChecked()){
                    o01 += base2;
                }
                if(chBoxO7.isChecked()){
                    o01 += base4;
                }
                if(chBoxO8.isChecked()){
                    o01 += base8;
                }
                if(chBoxO9.isChecked()){
                    o02 += base1;
                }
                if(chBoxO10.isChecked()){
                    o02 += base2;
                }
                if(chBoxO11.isChecked()){
                    o02 += base4;
                }
                if(chBoxO12.isChecked()){
                    o02 += base8;
                }
                if(chBoxO13.isChecked()){
                   o03 += base1;
                }
                if(chBoxO14.isChecked()){
                   o03 += base2;
                }
                if(chBoxO15.isChecked()){
                   o03 += base4;
                }
                if(chBoxO16.isChecked()){
                   o03 += base8;
                }
                if(chBoxO17.isChecked()){
                    o04 += base1;
                }
                if(chBoxO18.isChecked()){
                    o04 += base2;
                }
                if(chBoxO19.isChecked()){
                    o04 += base4;
                }
                if(chBoxO20.isChecked()){
                    o04 += base8;
                }
				
				if(chBoxP1.isChecked()){
                   p00 += base1;
                }
                if(chBoxP2.isChecked()){
                   p00 += base2;
                }
                if(chBoxP3.isChecked()){
                   p00 += base4;
                }
                if(chBoxP4.isChecked()){
                   p00 += base8;
                }
                if(chBoxP5.isChecked()){
                    p01 += base1;
                }
                if(chBoxP6.isChecked()){
                    p01 += base2;
                }
                if(chBoxP7.isChecked()){
                    p01 += base4;
                }
                if(chBoxP8.isChecked()){
                    p01 += base8;
                }
                if(chBoxP9.isChecked()){
                    p02 += base1;
                }
                if(chBoxP10.isChecked()){
                    p02 += base2;
                }
                if(chBoxP11.isChecked()){
                    p02 += base4;
                }
                if(chBoxP12.isChecked()){
                    p02 += base8;
                }
                if(chBoxP13.isChecked()){
                   p03 += base1;
                }
                if(chBoxP14.isChecked()){
                   p03 += base2;
                }
                if(chBoxP15.isChecked()){
                   p03 += base4;
                }
                if(chBoxP16.isChecked()){
                   p03 += base8;
                }
                if(chBoxP17.isChecked()){
                    p04 += base1;
                }
                if(chBoxP18.isChecked()){
                    p04 += base2;
                }
                if(chBoxP19.isChecked()){
                    p04 += base4;
                }
                if(chBoxP20.isChecked()){
                    p04 += base8;
                }
				
				if(chBoxQ1.isChecked()){
                   q00 += base1;
                }
                if(chBoxQ2.isChecked()){
                   q00 += base2;
                }
                if(chBoxQ3.isChecked()){
                   q00 += base4;
                }
                if(chBoxQ4.isChecked()){
                   q00 += base8;
                }
                if(chBoxQ5.isChecked()){
                    q01 += base1;
                }
                if(chBoxQ6.isChecked()){
                    q01 += base2;
                }
                if(chBoxQ7.isChecked()){
                    q01 += base4;
                }
                if(chBoxQ8.isChecked()){
                    q01 += base8;
                }
                if(chBoxQ9.isChecked()){
                    q02 += base1;
                }
                if(chBoxQ10.isChecked()){
                    q02 += base2;
                }
                if(chBoxQ11.isChecked()){
                    q02 += base4;
                }
                if(chBoxQ12.isChecked()){
                    q02 += base8;
                }
                if(chBoxQ13.isChecked()){
                   q03 += base1;
                }
                if(chBoxQ14.isChecked()){
                   q03 += base2;
                }
                if(chBoxQ15.isChecked()){
                   q03 += base4;
                }
                if(chBoxQ16.isChecked()){
                   q03 += base8;
                }
                if(chBoxQ17.isChecked()){
                    q04 += base1;
                }
                if(chBoxQ18.isChecked()){
                    q04 += base2;
                }
                if(chBoxQ19.isChecked()){
                    q04 += base4;
                }
                if(chBoxQ20.isChecked()){
                    q04 += base8;
                }
				
				if(chBoxR1.isChecked()){
                   r00 += base1;
                }
                if(chBoxR2.isChecked()){
                   r00 += base2;
                }
                if(chBoxR3.isChecked()){
                   r00 += base4;
                }
                if(chBoxR4.isChecked()){
                   r00 += base8;
                }
                if(chBoxR5.isChecked()){
                    r01 += base1;
                }
                if(chBoxR6.isChecked()){
                    r01 += base2;
                }
                if(chBoxR7.isChecked()){
                    r01 += base4;
                }
                if(chBoxR8.isChecked()){
                    r01 += base8;
                }
                if(chBoxR9.isChecked()){
                    r02 += base1;
                }
                if(chBoxR10.isChecked()){
                    r02 += base2;
                }
                if(chBoxR11.isChecked()){
                    r02 += base4;
                }
                if(chBoxR12.isChecked()){
                    r02 += base8;
                }
                if(chBoxR13.isChecked()){
                   r03 += base1;
                }
                if(chBoxR14.isChecked()){
                   r03 += base2;
                }
                if(chBoxR15.isChecked()){
                   r03 += base4;
                }
                if(chBoxR16.isChecked()){
                   r03 += base8;
                }
                if(chBoxR17.isChecked()){
                    r04 += base1;
                }
                if(chBoxR18.isChecked()){
                    r04 += base2;
                }
                if(chBoxR19.isChecked()){
                    r04 += base4;
                }
                if(chBoxR20.isChecked()){
                    r04 += base8;
                }
				
				if(chBoxS1.isChecked()){
                   s00 += base1;
                }
                if(chBoxS2.isChecked()){
                   s00 += base2;
                }
                if(chBoxS3.isChecked()){
                   s00 += base4;
                }
                if(chBoxS4.isChecked()){
                   s00 += base8;
                }
                if(chBoxS5.isChecked()){
                    s01 += base1;
                }
                if(chBoxS6.isChecked()){
                    s01 += base2;
                }
                if(chBoxS7.isChecked()){
                    s01 += base4;
                }
                if(chBoxS8.isChecked()){
                    s01 += base8;
                }
                if(chBoxS9.isChecked()){
                    s02 += base1;
                }
                if(chBoxS10.isChecked()){
                    s02 += base2;
                }
                if(chBoxS11.isChecked()){
                    s02 += base4;
                }
                if(chBoxS12.isChecked()){
                    s02 += base8;
                }
                if(chBoxS13.isChecked()){
                   s03 += base1;
                }
                if(chBoxS14.isChecked()){
                   s03 += base2;
                }
                if(chBoxS15.isChecked()){
                   s03 += base4;
                }
                if(chBoxS16.isChecked()){
                   s03 += base8;
                }
                if(chBoxS17.isChecked()){
                    s04 += base1;
                }
                if(chBoxS18.isChecked()){
                    s04 += base2;
                }
                if(chBoxS19.isChecked()){
                    s04 += base4;
                }
                if(chBoxS20.isChecked()){
                    s04 += base8;
                }
				
				if(chBoxT1.isChecked()){
                   t00 += base1;
                }
                if(chBoxT2.isChecked()){
                   t00 += base2;
                }
                if(chBoxT3.isChecked()){
                   t00 += base4;
                }
                if(chBoxT4.isChecked()){
                   t00 += base8;
                }
                if(chBoxT5.isChecked()){
                    t01 += base1;
                }
                if(chBoxT6.isChecked()){
                    t01 += base2;
                }
                if(chBoxT7.isChecked()){
                    t01 += base4;
                }
                if(chBoxT8.isChecked()){
                    t01 += base8;
                }
                if(chBoxT9.isChecked()){
                    t02 += base1;
                }
                if(chBoxT10.isChecked()){
                    t02 += base2;
                }
                if(chBoxT11.isChecked()){
                    t02 += base4;
                }
                if(chBoxT12.isChecked()){
                    t02 += base8;
                }
                if(chBoxT13.isChecked()){
                   t03 += base1;
                }
                if(chBoxT14.isChecked()){
                   t03 += base2;
                }
                if(chBoxT15.isChecked()){
                   t03 += base4;
                }
                if(chBoxT16.isChecked()){
                   t03 += base8;
                }
                if(chBoxT17.isChecked()){
                    t04 += base1;
                }
                if(chBoxT18.isChecked()){
                    t04 += base2;
                }
                if(chBoxT19.isChecked()){
                    t04 += base4;
                }
                if(chBoxT20.isChecked()){
                    t04 += base8;
                }

                String a = Integer.toHexString(a00+a01);
                //Toast.makeText(CustomActivity.this, checkVaule, Toast.LENGTH_LONG).show();
                Toast.makeText(CustomActivity.this, a, Toast.LENGTH_LONG).show();

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
