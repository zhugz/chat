package com.BlueMatrix.ble;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;



/**
 * Created by chzu131 on 2015/5/28.
 */
public class BlueAction {
    private Map<UUID, BluetoothGattCharacteristic> map = new HashMap<UUID, BluetoothGattCharacteristic>();
    private RBLService mBluetoothLeService;
    public  static int PATTERN_LEFT = 0;
    public  static int PATTERN_RIGHT = 1;
    public  static int PATTERN_HEART = 2;
    //private final int PATTERN_CUSTOM = 3;
    private byte CustomPattern[]={0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,
            0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0};

    public BlueAction(RBLService service)
    {
        mBluetoothLeService = service;
    }
    //传送自定义图案
    public void SendCustomPattern(byte data[])
    {
        BluetoothGattCharacteristic characteristic = map.get(RBLService.UUID_BLE_SHIELD_TX);
        if(characteristic != null)
        {
            for (int i = 0; i < data.length; i++) {
                CustomPattern[i] = ByteConvertToHex(data[i]);
            }
            characteristic.setValue(CustomPattern);
            mBluetoothLeService.writeCharacteristic(characteristic);
        }
    }
    public void getGattService(BluetoothGattService gattService)
    {
        BluetoothGattCharacteristic characteristic = gattService
                .getCharacteristic(RBLService.UUID_BLE_SHIELD_TX);
        map.put(characteristic.getUuid(), characteristic);

        characteristic = gattService.getCharacteristic(
                RBLService.UUID_BLE_SHIELD_REGULARCOMMAND);
        map.put(characteristic.getUuid(), characteristic);
    }

    //传送规则图案
    public void PatternRegularCommand(int pattern)
    {
        byte RegularPattern[]={0};
        RegularPattern[0]= (byte)pattern;
//        switch(pattern)
//        {
//            case PATTERN_LEFT:
//            {
//                RegularPattern
//            }
//            break;
//            case PATTERN_RIGHT:
//            {
//
//            }
//            break;
//            case PATTERN_HEART:
//            {
//
//            }
//            break;
//        }
        BluetoothGattCharacteristic characteristic = map.get(RBLService.UUID_BLE_SHIELD_REGULARCOMMAND);
        if(characteristic != null)
        {
            characteristic.setValue(RegularPattern);
            mBluetoothLeService.writeCharacteristic(characteristic);
        }
    }

    //十进制转为十六进制
    private byte  ByteConvertToHex(byte b)
    {
        byte ret = b;
        if(b >= '0' && b <= '9')
        {
            ret = (byte)(b - '0');

        }
        if(b >= 'a' && b <= 'f')
        {
            ret = (byte)(b - 'f' + 15);
        }
        if(b >= 'A' && b <= 'F')
        {
            ret = (byte)(b - 'F'+ 15);
        }
        return ret;
    }
}
