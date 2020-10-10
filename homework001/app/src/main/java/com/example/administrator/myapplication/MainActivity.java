package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.TextView;

import com.example.administrator.myapplication.util.DIsplayuUtil;
import com.example.administrator.myapplication.util.Utils;

public class MainActivity extends AppCompatActivity {
  private  TextView text_screen;
            TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView text1;
        text_screen = (TextView)findViewById(R.id.text_screen);
        int dip_10 = Utils.dip2px( this, 10L);
        text_screen.setPadding(dip_10,dip_10,dip_10,dip_10);
        text_screen.setBackgroundColor(0xff00ffff);
        text_screen.setTextColor(0xff333333);
        showScreenInfo();

    }

    private void showScreenInfo() {
        int width = DIsplayuUtil.getScreenWidth(this);
        int height= DIsplayuUtil.getScreenHeight(this);
        float sensity = DIsplayuUtil.getScreenDensity(this);
        String info = String.format("当前屏幕的款%dpx，高%dpx，像素%f",width,height,sensity);
        text_screen.setText(info);
    }
}
