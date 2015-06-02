package com.BlueMatrix.Activity;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.app.Activity;

import com.BlueMatrix.ble.RBLService;
import com.BlueMatrix.ble.BlueAction;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MainActivity extends Activity {
    private final static String TAG = MainActivity.class.getSimpleName();
    private Map<UUID, BluetoothGattCharacteristic> map = new HashMap<UUID, BluetoothGattCharacteristic>();
    private Button choiceBtn = null;
    private RadioGroup choice = null;
    private RadioButton leftBtn = null;
    private RadioButton rightBtn = null;
    private RadioButton heartBtn = null;
    private RadioButton customBtn = null;

    private String mDeviceName;
    private String mDeviceAddress;
    private RBLService mBluetoothLeService;
    private BlueAction blueAction;  //提供蓝牙操作
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

        Intent intent = getIntent();
        mDeviceAddress = intent.getStringExtra(DeviceActivity.EXTRA_DEVICE_ADDRESS);
        mDeviceName = intent.getStringExtra(DeviceActivity.EXTRA_DEVICE_NAME);
        getActionBar().setTitle(mDeviceName);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        Intent gattServiceIntent = new Intent(this, RBLService.class);
        bindService(gattServiceIntent, mServiceConnection, BIND_AUTO_CREATE);


    }

    @Override
    protected void onResume() {
        super.onResume();

        registerReceiver(mGattUpdateReceiver, makeGattUpdateIntentFilter());
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(mGattUpdateReceiver);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //断开连接
        mBluetoothLeService.disconnect();
        mBluetoothLeService.close();
    }

    private static IntentFilter makeGattUpdateIntentFilter() {
        final IntentFilter intentFilter = new IntentFilter();

        intentFilter.addAction(RBLService.ACTION_GATT_CONNECTED);
        intentFilter.addAction(RBLService.ACTION_GATT_DISCONNECTED);
        intentFilter.addAction(RBLService.ACTION_GATT_SERVICES_DISCOVERED);
        intentFilter.addAction(RBLService.ACTION_DATA_AVAILABLE);

        return intentFilter;
    }

    private final ServiceConnection mServiceConnection = new ServiceConnection() {

        @Override
        public void onServiceConnected(ComponentName componentName,
                                       IBinder service) {
            mBluetoothLeService = ((RBLService.LocalBinder) service)
                    .getService();
            if (!mBluetoothLeService.initialize()) {
                Log.e(TAG, "Unable to initialize Bluetooth");
                finish();
            }
            // Automatically connects to the device upon successful start-up
            // initialization.
            mBluetoothLeService.connect(mDeviceAddress);
            //初始化蓝牙操作类
            blueAction = new BlueAction(mBluetoothLeService);
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            mBluetoothLeService = null;
        }
    };

    private final BroadcastReceiver mGattUpdateReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            final String action = intent.getAction();

            if (RBLService.ACTION_GATT_DISCONNECTED.equals(action))
            {
                //连接断开，返回
                Intent intent2 = new Intent(MainActivity.this, ScanDeviceActivity.class);
                startActivity(intent2);
                finish();
            }
            else if (RBLService.ACTION_GATT_SERVICES_DISCOVERED.equals(action))
            {
                getGattService(mBluetoothLeService.getSupportedGattService());
            }
            else if (RBLService.ACTION_DATA_AVAILABLE.equals(action))
            {
               // displayData(intent.getByteArrayExtra(RBLService.EXTRA_DATA));
            }
        }
    };

    private void getGattService(BluetoothGattService gattService) {
        if (gattService == null)
            return;

        blueAction.getGattService(gattService);
    }

    private View.OnClickListener listener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            int selected = choice.getCheckedRadioButtonId();
            if(customBtn.getId() == selected){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,CustomActivity.class);
                startActivity(intent);
            }
            else if(leftBtn.getId() == selected){
                Toast.makeText(MainActivity.this,"你选择了向左",Toast.LENGTH_LONG).show();
                blueAction.PatternRegularCommand(BlueAction.PATTERN_LEFT);
            }
             else if(rightBtn.getId() == selected){
                Toast.makeText(MainActivity.this,"你选择了向右",Toast.LENGTH_LONG).show();
                blueAction.PatternRegularCommand(BlueAction.PATTERN_RIGHT);
            }
             else if(heartBtn.getId() == selected){
                Toast.makeText(MainActivity.this,"你选择了心图案",Toast.LENGTH_LONG).show();
                blueAction.PatternRegularCommand(BlueAction.PATTERN_HEART);
            }
            else {
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
