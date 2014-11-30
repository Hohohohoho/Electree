package com.example.test;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
	Button addAlert;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        addAlert = (Button)findViewById(R.id.loginBtn);
        addAlert.setOnClickListener(this);
    }

	@Override
	public void onClick(View view) {
		if (view == addAlert) {
			new AlertDialog.Builder(this)
			.setMessage("그룹을 추가/생성 하시겠습니까?")
			.setCancelable(true)
			.setPositiveButton("그룹 추가",
			new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			})
			.setNeutralButton("그룹 생성", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			})
			.create().show();
		}
		
	}
}
