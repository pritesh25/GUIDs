package com.example.user.guids;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @TargetApi(Build.VERSION_CODES.O)
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //nonPermissiondata();
        Permissiondata();//https://developer.android.com/reference/android/Manifest.permission#READ_PHONE_STATE
    }

    private void nonPermissiondata() {
        //a56f7e3e7674c4e0//owner
        //20c5a5f2d736fa86//guest

        //need permission
        //Build.getSerial()

        Log.d(TAG,"\n\n\n");
        Log.d(TAG,"android ID           = " + Settings.Secure.getString(getApplicationContext().getContentResolver(), Settings.Secure.ANDROID_ID));
        Log.d(TAG,"RADIO VERSION        = " + Build.getRadioVersion());
        Log.d(TAG,"BOARD                = " + Build.BOARD);
        Log.d(TAG,"BOOTLOADER           = " + Build.BOOTLOADER);
        Log.d(TAG,"BRAND                = " + Build.BRAND);
        Log.d(TAG,"DEVICE               = " + Build.DEVICE);
        Log.d(TAG,"DISPLAY              = " + Build.DISPLAY);
        Log.d(TAG,"FINGERPRINT          = " + Build.FINGERPRINT);
        Log.d(TAG,"HARDWARE             = " + Build.HARDWARE);
        Log.d(TAG,"HOST                 = " + Build.HOST);
        Log.d(TAG,"ID                   = " + Build.ID);
        Log.d(TAG,"MANUFACTURER         = " + Build.MANUFACTURER);
        Log.d(TAG,"MODEL                = " + Build.MODEL);
        Log.d(TAG,"PRODUCT              = " + Build.PRODUCT);
        Log.d(TAG,"TAGS                 = " + Build.TAGS);
        Log.d(TAG,"TYPE                 = " + Build.TYPE);
        Log.d(TAG,"UNKNOWN              = " + Build.UNKNOWN);
        Log.d(TAG,"USER                 = " + Build.USER);
        Log.d(TAG,"TIME                 = " + Build.TIME);
        Log.d(TAG,"BASE_OS              = " + Build.VERSION.BASE_OS);
        Log.d(TAG,"CODENAME             = " + Build.VERSION.CODENAME);
        Log.d(TAG,"INCREMENTAL          = " + Build.VERSION.INCREMENTAL);
        Log.d(TAG,"RELEASE              = " + Build.VERSION.RELEASE);
        Log.d(TAG,"SECURITY_PATCH       = " + Build.VERSION.SECURITY_PATCH);
        Log.d(TAG,"PREVIEW_SDK_INT      = " + Build.VERSION.PREVIEW_SDK_INT);
        Log.d(TAG,"SDK_INT              = " + Build.VERSION.SDK_INT);
        Log.d(TAG,"\n\n\n");
        Log.d(TAG,"colorMode            = "+getResources().getConfiguration().colorMode);
        Log.d(TAG,"densityDpi           = "+getResources().getConfiguration().densityDpi);
        Log.d(TAG,"fontScale            = "+getResources().getConfiguration().fontScale);
        Log.d(TAG,"hardKeyboardHidden   = "+getResources().getConfiguration().hardKeyboardHidden);
        Log.d(TAG,"keyboard             = "+getResources().getConfiguration().keyboard);
        Log.d(TAG,"keyboardHidden       = "+getResources().getConfiguration().keyboardHidden);
        Log.d(TAG,"mcc                  = "+getResources().getConfiguration().mcc);
        Log.d(TAG,"mnc                  = "+getResources().getConfiguration().mnc);
        Log.d(TAG,"navigation           = "+getResources().getConfiguration().navigation);
        Log.d(TAG,"navigationHidden     = "+getResources().getConfiguration().navigationHidden);
        Log.d(TAG,"orientation          = "+getResources().getConfiguration().orientation);
        Log.d(TAG,"screenHeightDp           = "+getResources().getConfiguration().screenHeightDp);
        Log.d(TAG,"screenLayout             = "+getResources().getConfiguration().screenLayout);
        Log.d(TAG,"screenWidthDp            = "+getResources().getConfiguration().screenWidthDp);
        Log.d(TAG,"smallestScreenWidthDp    = "+getResources().getConfiguration().smallestScreenWidthDp);
        Log.d(TAG,"touchscreen              = "+getResources().getConfiguration().touchscreen);
        Log.d(TAG,"uiMode                   = "+getResources().getConfiguration().uiMode);
        Log.d(TAG,"fontScale                = "+getResources().getConfiguration().fontScale);
        Log.d(TAG,"densityDpi               = "+getResources().getConfiguration().densityDpi);
        Log.d(TAG,"describeContents         = "+getResources().getConfiguration().describeContents());
        Log.d(TAG,"getLocales               = "+getResources().getConfiguration().getLocales());
        Log.d(TAG,"isScreenHdr              = "+getResources().getConfiguration().isScreenHdr());
        Log.d(TAG,"isScreenWideColorGamut   = "+getResources().getConfiguration().isScreenWideColorGamut());
        Log.d(TAG,"getProperty              = "+System.getProperty("os.version"));
    }

    private void Permissiondata() {

    }

}
