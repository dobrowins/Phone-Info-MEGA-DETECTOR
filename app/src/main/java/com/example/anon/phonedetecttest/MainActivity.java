package com.example.anon.phonedetecttest;

import android.content.res.Resources;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // setting variables to work with
    private String productSt = Build.PRODUCT;
    private String manufacturerSt = Build.MANUFACTURER;
    private String deviceSt = Build.DEVICE;
    private String brandSt = Build.BRAND;
    private String modelSt = Build.MODEL;
    private TextView product;
    private TextView manufacturer;
    private TextView device;
    private TextView brand;
    private TextView model;

    // TODO: 1/21/2017 add Butterknife - https://github.com/JakeWharton/butterknife 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        product = (TextView)findViewById(R.id.product);
        manufacturer = (TextView)findViewById(R.id.manufacturer);
        device = (TextView)findViewById(R.id.device);
        brand = (TextView)findViewById(R.id.brand);
        model = (TextView)findViewById(R.id.model);
    }

    public void showPhoneInformation(View view) {

        Resources res = getResources();

        // getting strings with variables from strings.xml
        String productEndString = String.format(res.getString(R.string.product), productSt);
        String manufacturerEndSt = String.format(res.getString(R.string.manufacturer), manufacturerSt);
        String deviceEndSt = String.format(res.getString(R.string.device), deviceSt);
        String brandEndSt = String.format(res.getString(R.string.brand), brandSt);
        String modelEndSt = String.format(res.getString(R.string.model), modelSt);

        product.setText(productEndString);
        manufacturer.setText(manufacturerEndSt);
        device.setText(deviceEndSt);
        brand.setText(brandEndSt);
        model.setText(modelEndSt);

    }
}
