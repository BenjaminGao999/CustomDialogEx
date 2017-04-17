package com.gaos.customdialogex;

import android.support.design.widget.BottomSheetDialog;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnBottomSheetDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        initListener();

        windowManagerEX();

    }


    private void initView() {
        btnBottomSheetDialog = (Button) findViewById(R.id.btn_bottomSheetDialog);
    }

    private void initListener() {
        btnBottomSheetDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_bottomSheetDialog:
                showBottomSheetDialog();
                break;
            default:
                break;
        }
    }

    //BottomSheetDialog兼容到api level 15
    private void showBottomSheetDialog() {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(R.layout.layout_bottomsheetdialog);
        bottomSheetDialog.show();
    }

    //Window|WindowManager
    private void windowManagerEX() {
        //获取WindowManager，方法①
        WindowManager windowManager = (WindowManager) getApplicationContext().getSystemService(WINDOW_SERVICE);
        //获取WindowManager，方法②
        WindowManager windowManager1 = getWindowManager();
        //获取WindowManager，方式③
        WindowManager windowManager2 = getWindow().getWindowManager();

        //WindowManager能干点什么呢？
        Display defaultDisplay = windowManager.getDefaultDisplay();

//        ImageView imageView = new ImageView(this);
//        imageView.setImageResource(R.drawable.soilder);
//        windowManager.addView(imageView, new WindowManager.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
    }
}
