package com.example.anon.phonedetecttest;

import android.content.res.Resources;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** setting variables to work with */
        final String productSt = Build.PRODUCT;
        final String manufacturerSt = Build.MANUFACTURER;
        final String deviceSt = Build.DEVICE;
        final String brandSt = Build.BRAND;

        final TextView product = (TextView)findViewById(R.id.product);
        final TextView manufacturer = (TextView)findViewById(R.id.manufacturer);
        final TextView device = (TextView)findViewById(R.id.device);
        final TextView brand = (TextView)findViewById(R.id.brand);

        /** MEGA-DETECTOR MEGA-BUTTON */
        Button detectBtn = (Button)findViewById(R.id.detectBtn);
        detectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /**
                 * android official receipt -
                 * https://developer.android.com/guide/topics/resources/string-resource.html#FormattingAndStyling
                 */

                /** test hardware device output */
//                product.setText(R.string.product + productSt); //LT30p
//                manufacturer.setText("Your manufacturer is " + manufacturerSt); //Sony
//                device.setText("Your device ID is " + deviceSt); //mint
//                brand.setText("Your brand is " + brandSt); //Sony

                Resources res = getResources();

                /** getting strings with variables from strings.xml */
                String productEndString = String.format(res.getString(R.string.product), productSt);
                String manufacturerEndSt = String.format(res.getString(R.string.manufacturer), manufacturerSt);
                String deviceEndSt = String.format(res.getString(R.string.device), deviceSt);
                String brandEndSt = String.format(res.getString(R.string.brand), brandSt);

                product.setText(productEndString);
                manufacturer.setText(manufacturerEndSt);
                device.setText(deviceEndSt);
                brand.setText(brandEndSt);

            }
        }); //end of onClickListener code
    }
}