package com.gaos.customdialogex;

import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnBottomSheetDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        initListener();
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

    //BottomSheetDialog兼容到api level 16
    private void showBottomSheetDialog() {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(R.layout.layout_bottomsheetdialog);
        bottomSheetDialog.show();
    }
}
