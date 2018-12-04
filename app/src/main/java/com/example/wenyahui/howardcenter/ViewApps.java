package com.example.wenyahui.howardcenter;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import java.util.List;
/*
* com.t2.vhb
* boundless.moodgym
* com.facebook.katana
* */

public class ViewApps extends AppCompatActivity {
    private static final String APPNAME = "NAME";
    private static final String APPPAC = "PACKAGE";
    private LinearLayout mMediSafe;
    private LinearLayout mVirtualH_BOX;
    private LinearLayout mMoodSpace;
    private LinearLayout mMoney;
    private LinearLayout mDBT911;
    private LinearLayout mFacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_main);
        mMediSafe = (LinearLayout) findViewById(R.id.MEDIASAFE);
        mMediSafe.setClickable(true);
        mVirtualH_BOX = (LinearLayout) findViewById(R.id.VIRT_HBOX);
        mMoodSpace = (LinearLayout) findViewById(R.id.MOODSPACE);
        mMoney = (LinearLayout) findViewById(R.id.MONEY);
        mDBT911 = (LinearLayout) findViewById(R.id.DBT911);
        mFacebook = (LinearLayout) findViewById(R.id.FB);
        mMediSafe.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                redirectApp("com.medisafe.android.client");
            }
        });
        mVirtualH_BOX.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                redirectApp("com.t2.vhb");
            }
        });
        mDBT911.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                redirectApp("se.annadroid.Dbt112");
            }
        });
        mMoodSpace.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                redirectApp("boundless.moodgym");
            }
        });
        mMoney.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                redirectApp("com.realbyteapps.moneymanagerfree");
            }
        });
        mFacebook.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                redirectApp("com.facebook.katana");
            }
        });
    }


    public void redirectApp(String packageName) {

        //If not downloaded send to play store
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(
                "https://play.google.com/store/apps/details?id=" + packageName));
        intent.setPackage("com.android.vending");
        //MEDISAFE is DOWNLOADED send to MediSafe
        PackageManager pm = this.getPackageManager();
        if (isPackageInstalled(packageName, pm)) {
            Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage(packageName);
            startActivity(LaunchIntent);
        }else{
            startActivity(intent);
        }
    }


    private boolean isPackageInstalled(String packageName, PackageManager packageManager) {

        boolean found = true;

        try {

            packageManager.getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException e) {

            found = false;
        }

        return found;
    }

    public void installApps() {
        List<PackageInfo> packageList = getPackageManager().getInstalledPackages(0);
        for (int i = 0; i < packageList.size(); i++) {
            PackageInfo packageInfo = packageList.get(i);
            String appName = packageInfo.applicationInfo.loadLabel(getPackageManager()).toString();
            String pacName = packageInfo.packageName;
            Log.d(APPNAME,"App Name " + appName);
            Log.d(APPPAC,"Package " + pacName);
        }
    }
}




